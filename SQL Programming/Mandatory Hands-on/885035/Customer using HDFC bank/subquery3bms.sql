select distinct u.name, u.address from users u
join bookingdetails b on u.user_id = b.user_id
where u.user_id not in (select distinct user_id from bookingdetails
where name = 'HDFC')
order by u.name;
