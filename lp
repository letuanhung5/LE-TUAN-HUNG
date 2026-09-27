/* Reset căn bản */
body {
    background-color: #f8f9fa;
    color: #333;
    font-family: system-ui, -apple-system, sans-serif;
}

/* ==========================================
   1. NAVBAR - FLEXBOX IMPLEMENTATION (1D)
   ========================================== */
.app-navbar {
    display: flex;
    justify-content: space-between;
    align-items: center;
    flex-wrap: wrap; /* Tự xuống dòng mượt mà trên Mobile */
    gap: 15px;
    background-color: #212529;
    color: #fff;
    padding: 1rem 2rem;
}

.app-navbar .logo {
    font-weight: bold;
    font-size: 1.25rem;
}

.app-navbar .nav-links {
    display: flex;
    align-items: center;
    gap: 20px;
    flex-wrap: wrap;
}

.app-navbar .nav-links a {
    color: #adb5bd;
    text-decoration: none;
    transition: color 0.2s ease;
}

.app-navbar .nav-links a:hover {
    color: #ffffff;
}

/* ==========================================
   2. DASHBOARD - CSS GRID IMPLEMENTATION (2D)
   ========================================== */
.bento-dashboard {
    display: grid;
    /* Mặc định 3 cột đều nhau */
    grid-template-columns: repeat(3, 1fr);
    grid-auto-rows: minmax(140px, auto);
    gap: 16px;
}

.widget {
    background: #ffffff;
    border: 1px solid #e0e0e0;
    border-radius: 8px;
    padding: 20px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.02);
    
    /* Dùng Flexbox bên trong Widget để căn giữa nội dung (Kết hợp Grid + Flexbox) */
    display: flex;
    flex-direction: column;
    justify-content: center;
}

/* Widget lớn chiếm 2 cột và 2 hàng (Bento Style) */
.widget-large {
    grid-column: span 2;
    grid-row: span 2;
    background: #eef2ff;
    border-color: #c7d2fe;
}

/* Responsive cho CSS Grid Dashboard */
@media (max-width: 992px) {
    .bento-dashboard {
        grid-template-columns: repeat(2, 1fr); /* Giảm xuống 2 cột trên Tablet */
    }
}

@media (max-width: 576px) {
    .bento-dashboard {
        grid-template-columns: 1fr; /* 1 cột duy nhất trên Mobile */
    }
    .widget-large {
        grid-column: span 1;
        grid-row: span 1;
    }
}
