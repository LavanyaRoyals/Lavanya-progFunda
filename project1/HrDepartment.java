package project1;




	public class HrDepartment extends SuperDepartment {
        @Override
        public String departmentName() {
            return "Welcome to HR Department";
        }
        public String doActivity() {
            return "Team Lunch";
        }
        @Override
        public String getTodaysWork() {
            return "Fill today’s timesheet and mark your attendance";
        }

        @Override
        public String getWorkDeadline() {
            return "Complete by EOD";
        }

        public String isTodayAHoliday() {
            return "Today is not a holiday";
        }
    }

