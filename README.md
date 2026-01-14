-WebNuocHoa là một project Java Web xây dựng bằng Servlet, JSP và JDBC, HTML, CSS, javaScrip mô phỏng website bán nước hoa cơ bản.
Project tập trung vào các chức năng backend như quản lý dữ liệu, xử lý logic và kết nối cơ sở dữ liệu MySQL.

🛠 Công nghệ & Công cụ sử dụng

Ngôn ngữ: Java.

Backend: Java Servlet, JSP, JDBC.

Database: MySQL.

IDE: Eclipse.

Server: Apache Tomcat 9.

Database Tool: XAMPP.

Frontend: HTML, CSS, JavaScript (cơ bản)

⚙️ Yêu cầu môi trường

Trước khi chạy project, cần cài đặt:

JDK 17 trở lên.Em dùng JDK 21.

Eclipse IDE for Enterprise Java

Apache Tomcat version 9

XAMPP (MySQL)

🚀 Hướng dẫn chạy project
🔹 Bước 1: Khởi động XAMPP

Mở XAMPP Control Panel

Start:

✅ Apache

✅ MySQL

🔹 Bước 2: Import project vào Eclipse

Mở Eclipse

Chọn File → Import

Chọn Existing Projects into Workspace

Chọn thư mục project WebNuocHoa

Finish

🔹 Bước 3: Cấu hình Tomcat 9

Vào tab Servers

Add Apache Tomcat 9

Gán project WebNuocHoa vào server

Start Tomcat

🔹 Bước 4: Chạy project

Trong Eclipse:

Chuột phải vào file trangchu.jsp

Chọn Run As → Run on Server

Hoặc truy cập:

http://localhost:8080/WebNuocHoa/trangchu.jsp

🗄️ Cơ sở dữ liệu

Database sử dụng: MySQL

Được quản lý thông qua phpMyAdmin (XAMPP)

Kết nối database bằng JDBC

⚠️ Lưu ý:

Kiểm tra lại username, password MySQL trong file kết nối database

Đảm bảo database đã được import đầy đủ trước khi chạy

✨ Chức năng chính

Hiển thị danh sách sản phẩm nước hoa

Thao tác CRUD với dữ liệu

Tìm kiếm và sắp xếp

Kết nối frontend JSP với backend Servlet

Quản lý dữ liệu bằng MySQL
