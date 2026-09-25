<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sử dụng CSS</title>
    <style>
        /* Định dạng cho toàn bộ thẻ h1 */
        h1 {
            color: blue;
            font-family: Tahoma, sans-serif;
            font-size: 200%;
        }

        /* Định dạng chung cho tất cả các thẻ p */
        p {
            color: red;
            font-family: Arial, sans-serif;
            font-size: 120%;
            border: 1px solid grey;
            padding: 10px;
        }

        /* Định dạng riêng cho phần tử có id="element1" (ghi đè màu chữ thành xanh dương) */
        #element1 {
            color: blue;
        }
    </style>
</head>
<body>

    <h1>Đây là đề mục</h1>

    <p>Đây là đoạn văn bản.</p>
    <p>Đây là đoạn văn bản.</p>
    <p>Đây là đoạn văn bản.</p>
    <p id="element1">Đoạn văn bản có thuộc tính id</p>

</body>
</html>
