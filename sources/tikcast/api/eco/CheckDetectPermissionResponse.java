package tikcast.api.eco;

import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class CheckDetectPermissionResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("detector_info")
        public DetectorInfo detectorInfo;

        @InterfaceC65349Pkn("status")
        public boolean status;

        /* loaded from: classes17.dex */
        public static final class DetectorInfo {

            @InterfaceC65349Pkn("detector_email")
            public String detectorEmail = "";

            @InterfaceC65349Pkn("detector_id")
            public long detectorId;
        }
    }
}
