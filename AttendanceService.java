public class AttendanceService {
    public void logAttendance(Employee employee) {
        LocalTime now = LocalTime.now();
        
        if (now.isAfter(LocalTime.of(9, 0)) && now.isBefore(LocalTime.of(17, 0))) {
            employee.setCheckInTime(now);
        } else if (now.isAfter(LocalTime.of(18, 0))) {
            employee.setOvertime(true);
        }

        System.out.println("Attendance logged for: " + employee.getName());
    }
}

    
}
