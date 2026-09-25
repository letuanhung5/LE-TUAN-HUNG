<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trang Đọc Truyện Ngắn - Dế Mèn Phiêu Lưu Ký</title>
    <style>
        /* Reset cơ bản và cấu hình font chữ */
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            font-family: 'Georgia', 'Times New Roman', serif;
            line-height: 1.8;
            background-color: #f9f6f0;
            color: #2c2c2c;
            padding: 20px;
        }

        /* Khung chứa toàn bộ trang đọc truyện */
        .story-container {
            max-width: 800px;
            margin: 0 auto;
            background-color: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.08);
            border: 1px solid #e0dace;
        }

        /* Bước 4: Ảnh truyện đặt ở đầu trang */
        .story-banner {
            width: 100%;
            max-height: 350px;
            object-fit: cover;
            border-radius: 6px;
            margin-bottom: 20px;
        }

        /* Tiêu đề truyện */
        .story-title {
            text-align: center;
            font-size: 32px;
            color: #8b4513;
            margin-bottom: 5px;
            text-transform: uppercase;
        }

        .story-author {
            text-align: center;
            font-style: italic;
            color: #666;
            margin-bottom: 30px;
            border-bottom: 2px dashed #8b4513;
            padding-bottom: 10px;
        }

        /* Bước 1: Khu vực Mục lục truyện */
        .table-of-contents {
            background-color: #f3efe6;
            padding: 20px;
            border-radius: 6px;
            margin-bottom: 35px;
            border-left: 4px solid #8b4513;
        }

        .toc-title {
            font-size: 18px;
            color: #8b4513;
            margin-bottom: 12px;
            text-transform: uppercase;
        }

        .toc-list {
            list-style-type: none;
        }

        .toc-list li {
            margin-bottom: 8px;
        }

        /* Bước 3 & 5: Sử dụng thẻ h5 cho mục lục và làm liên kết click chuyển đến nội dung */
        .toc-list h5 {
            font-size: 16px;
            font-weight: normal;
        }

        .toc-list a {
            color: #1a0dab;
            text-decoration: none;
            transition: color 0.2s;
        }

        .toc-list a:hover {
            color: #8b4513;
            text-decoration: underline;
        }

        /* Bước 2: Khu vực Nội dung các chương */
        .chapter {
            margin-bottom: 40px;
            padding-top: 10px;
            border-bottom: 1px solid #eee;
            padding-bottom: 20px;
        }

        .chapter-title {
            font-size: 22px;
            color: #8b4513;
            margin-bottom: 15px;
        }

        .chapter p {
            text-indent: 30px; /* Thụt lùi đầu dòng */
            text-align: justify; /* Căn đều 2 bên */
            margin-bottom: 15px;
            font-size: 17px;
        }

        /* Nút quay lại mục lục */
        .back-to-top {
            display: inline-block;
            margin-top: 10px;
            font-size: 14px;
            color: #666;
            text-decoration: none;
            font-style: italic;
        }

        .back-to-top:hover {
            color: #8b4513;
        }
    </style>
</head>
<body>

    <div class="story-container">
        <!-- Bước 4: Ảnh truyện đặt ở đầu trang -->
        <img class="story-banner" src="https://images.unsplash.com/photo-1544716278-ca5e3f4abd8c?q=80&w=1000&auto=format&fit=crop" alt="Ảnh bìa truyện ngắn">

        <h1 class="story-title">Dế Mèn Phiêu Lưu Ký</h1>
        <p class="story-author">Tác giả: Tô Hoài</p>

        <!-- Bước 1 & 5: Các mục lục truyện sử dụng thẻ <h5> -->
        <div class="table-of-contents" id="muc-luc">
            <h3 class="toc-title">Mục Lục Truyện</h3>
            <ul class="toc-list">
                <li>
                    <!-- Bước 3: Liên kết click chuyển tới chương tương ứng bằng ID anchors -->
                    <a href="#chuong-1">
                        <h5>Chương 1: Tôi sống độc lập từ bé - Bài học đường đời đầu tiên</h5>
                    </a>
                </li>
                <li>
                    <a href="#chuong-2">
                        <h5>Chương 2: Cuộc phiêu lưu bất ngờ và chuyến đi xa đầu tiên</h5>
                    </a>
                </li>
                <li>
                    <a href="#chuong-3">
                        <h5>Chương 3: Tình bạn với Dế Trũi và những trải nghiệm mới</h5>
                    </a>
                </li>
            </ul>
        </div>

        <!-- Bước 2: Tạo nội dung ứng với từng mục lục -->
        <div class="story-content">
            <!-- Chương 1 -->
            <div class="chapter" id="chuong-1">
                <h2 class="chapter-title">Chương 1: Tôi sống độc lập từ bé - Bài học đường đời đầu tiên</h2>
                <p>Tôi sống độc lập từ bé. Đó là tục lệ lâu đời ở họ nhà dế chúng tôi. Tới tuổi trưởng thành, mẹ cho chúng tôi ra ở riêng. Tôi được chia một cái hang đất nhỏ dưới gốc cây cỏ mật.</p>
                <p>Bởi ăn uống độ lượng và làm việc có chừng mực nên tôi chóng lớn lắm. Chẳng bao lâu, tôi đã trở thành một gã dế mèn thanh niên cường tráng. Đôi càng tôi mẫm bóng. Những cái vuốt ở chân, ở khoeo cứ cứng dần và nhọn hoắt. Thỉnh thoảng, muốn thử sự lợi hại của những chiếc vuốt, tôi co cẳng lên, đạp phanh phách vào các cỏ. Những ngọn cỏ gãy rạp, y như có nhát dao vừa liềm qua.</p>
                <a href="#muc-luc" class="back-to-top">↑ Quay lại mục lục</a>
            </div>

            <!-- Chương 2 -->
            <div class="chapter" id="chuong-2">
                <h2 class="chapter-title">Chương 2: Cuộc phiêu lưu bất ngờ và chuyến đi xa đầu tiên</h2>
                <p>Sau bài học đường đời đầu tiên đầy ân hận, tôi bắt đầu suy nghĩ nhiều hơn về cuộc sống chung quanh. Thế giới bên ngoài cái đầm lầy nhỏ bé này còn biết bao nhiêu điều rộng lớn mà tôi chưa từng được biết đến.</p>
                <p>Tôi quyết định rời bỏ căn hang quen thuộc để dấn thân vào những vùng đất mới. Dọc đường đi, tôi gặp biết bao loài vật kỳ lạ, có những kẻ kiêu ngạo như Xi Bác Ba, cũng có những người bạn tốt bụng sẵn sàng chia sẻ từng giọt sương đêm.</p>
                <a href="#muc-luc" class="back-to-top">↑ Quay lại mục lục</a>
            </div>

            <!-- Chương 3 -->
            <div class="chapter" id="chuong-3">
                <h2 class="chapter-title">Chương 3: Tình bạn với Dế Trũi và những trải nghiệm mới</h2>
                <p>Trên con đường bạt mạng, tôi kết duyên huynh đệ với Dế Trũi — một anh bạn thô ráp nhưng giàu lòng tự trọng và chí khí. Chúng tôi cùng nhau thề nguyện đi khắp thiên hạ để kết bạn giao hòa, xóa bỏ những hận thù nhỏ nhặt giữa các loài vật.</p>
                <p>Những ngày tháng rong ruổi trên cỏ cây, ngắm nhìn bình minh và vượt qua muôn vàn gian khó đã giúp chúng tôi hiểu được giá trị thực sự của tình bạn và tự do.</p>
                <a href="#muc-luc" class="back-to-top">↑ Quay lại mục lục</a>
            </div>
        </div>
    </div>

</body>
</html>
