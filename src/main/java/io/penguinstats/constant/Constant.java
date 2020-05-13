package io.penguinstats.constant;

public class Constant {

	public static final Long[] ADD_TIME_POINTS =
			new Long[] {0L, 1558989300000L, 1560045456000L, 1577145600000L, 1581105600000L};

	public static final int MAX_SECTION_NUM = 90;
	public static final int MAX_QUERY_NUM = 5;

	public static final String API_V2 = "/api/v2";

	public static class LastUpdateMapKeyName {
		public static final String MATRIX_RESULT = "matrix_result";
		public static final String TREND_RESULT = "trend_result";
		public static final String ITEM_LIST = "item_list";
		public static final String ZONE_LIST = "zone_list";
		public static final String STAGE_LIST = "stage_list";
		public static final String DROP_INFO_LIST = "drop_info_list";
		public static final String NOTICE_LIST = "notice_list";
	}

	public static class CustomHeader {
		public static final String X_PENGUIN_UPGRAGE = "X-Penguin-Upgrade";
	}

}
