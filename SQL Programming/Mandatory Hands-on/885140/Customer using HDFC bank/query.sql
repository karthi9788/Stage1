select distinct u.name,u.address from users u join bookingdetails b ON u.user_id = b.user_id where u.user_id not in
(select u.user_id from bookingdetails b join users u on b.user_id = u.user_id where b.name = "HDFC")
order by name;
