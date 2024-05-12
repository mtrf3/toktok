package X;

/* renamed from: X.C9m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC30866C9m {
    START_SPEED_TEST_TIME("t0_start_speedtest"),
    START_REQUEST_URL_TIME("t1_client_start_call_server"),
    START_REQUEST_URL_RESULT("r1_client_start_call_server_result"),
    SPEED_TEST_RESPONSE_TIME("t2_client_receive_server_info"),
    SPEED_TEST_RESPONSE_RESULT("r2_client_receive_server_info_result"),
    LIVECORE_SPEED_TEST_TIME("t3_client_start_call_liveCore"),
    LIVECORE_SPEED_TEST_TIME_RESULT("r3_client_start_call_liveCore_result"),
    LIVECORE_START_TIME("t4_liveCore_receive_client_request"),
    LIVECORE_CPP_START_TIME("t5_1_liveCore_cpp_start"),
    LIVECORE_NODE_TEST_TIME("t5_liveCore_start_node_optimize"),
    LIVECORE_DNS_TEST_TIME("t6_liveCore_dns_resolution"),
    LIVECORE_SOCKET_TEST_TIME("t7_liveCore_socket_connect"),
    LIVECORE_RTMP_TEST_TIME("t8_liveCore_rtmp_connect"),
    LIVECORE_PACK_TEST_TIME("t9_liveCore_start_sending_package"),
    SPEED_TEST_END_TIME("t10_client_receive_liveCore_info"),
    SPEED_TEST_END_STATUS_RESULT("r10_client_receive_liveCore_info_result");

    public final String LJLIL;

    public static EnumC30866C9m valueOf(String str) {
        return (EnumC30866C9m) V0N.LJJJ(EnumC30866C9m.class, str);
    }

    public final String getKey() {
        return this.LJLIL;
    }

    EnumC30866C9m(String str) {
        this.LJLIL = str;
    }
}
