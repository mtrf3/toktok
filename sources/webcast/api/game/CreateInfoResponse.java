package webcast.api.game;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class CreateInfoResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("cli_tns_collect_interval_ms")
        public long cliTnsCollectIntervalMs;

        @InterfaceC65349Pkn("has_live_studio_login")
        public boolean hasLiveStudioLogin;

        @InterfaceC65349Pkn("have_mutil_guest_permission")
        public boolean haveMutilGuestPermission;

        @InterfaceC65349Pkn("open_ls_notify")
        public OpenLsNotifyInfo openLsNotify;

        @InterfaceC65349Pkn("server_timestamp")
        public long serverTimestamp;

        @InterfaceC65349Pkn("tns_report_interval_ms")
        public long tnsReportIntervalMs;
    }
}
