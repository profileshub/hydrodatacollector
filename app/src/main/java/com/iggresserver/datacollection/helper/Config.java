package com.iggresserver.datacollection.helper;

import com.iggresserver.datacollection.BuildConfig;

public class Config {

    public static final String BASE_URL = BuildConfig.BASE_URL;

    public static final String get_all_markers=BASE_URL+"/";
    public static final String get_facility_details_navigate = BASE_URL+"/";
    public static final String get_facility_list=BASE_URL+"/";
    public static final String get_facility_list_details=BASE_URL+"/";
    public static final String get_county_facilities=BASE_URL+"/";
    public static final String get_sub_county=BASE_URL+"/";
    public static final String get_ward=BASE_URL+"/";
    public static final String update_facility_coordinates=BASE_URL+"/";
    public static final String get_facility_category_markers=BASE_URL+"/";
    public static final String get_spinner_facility_type=BASE_URL+"/";
    public static final String get_spinner_incident_type=BASE_URL+"/get_spinner_data_type.php";
    public static final String get_spinner_status=BASE_URL+"/get_spinner_status.php";
    public static final String save_information=BASE_URL+"/";
    public static final String send_information=BASE_URL+"/send_data.php";
    public static final String get_report_list=BASE_URL+"/";
    public static final String get_report_list_details=BASE_URL+"/";
    public static final String delete_message_user=BASE_URL+"/";
    public static final String login_user=BASE_URL+"/login_user.php";
    public static final String register_user=BASE_URL+"/register_user.php";

    public static final String TAG_FACILITIES = "name";
    public static final String JSON_ARRAY_FACILITIES = "result_facilities";

    public static final String TAG_SUB_COUNTY = "subcounty_name";
    public static final String JSON_ARRAY_SUB_COUNTY = "result_sub_county";

    public static final String TAG_FACILITY_TYPE = "name";
    public static final String JSON_ARRAY_FACILITY_TYPE = "result_facility_type";

    public static final String TAG_INCIDENT_TYPE = "name";
    public static final String JSON_ARRAY_INCIDENT_TYPE = "result_incident_type";

    public static final String TAG_STATUS= "status_name";
    public static final String JSON_ARRAY_STATUS = "result_status";

    public static final String TAG_WARD = "ward_name";
    public static final String JSON_ARRAY_WARD = "result_ward";
}
