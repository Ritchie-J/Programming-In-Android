package entity;

public class news {
		private int icon_id;
		private String title;
		private String msg;
		private String time;
		
		public news() {
			super();
			// TODO Auto-generated constructor stub
		}
		public news(int icon_id, String title, String msg, String time) {
			super();
			this.icon_id = icon_id;
			this.title = title;
			this.msg = msg;
			this.time = time;
		}
		public int getIcon_id() {
			return icon_id;
		}
		public void setIcon_id(int icon_id) {
			this.icon_id = icon_id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		
	}



