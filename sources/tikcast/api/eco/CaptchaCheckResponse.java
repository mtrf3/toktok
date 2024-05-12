package tikcast.api.eco;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class CaptchaCheckResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    @InterfaceC65349Pkn("extra")
    public ResponseExtra extra;

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("captcha_decision")
        public String captchaDecision = "";

        @InterfaceC65349Pkn("captcha_record_id")
        public long captchaRecordId;

        @InterfaceC65349Pkn("check_approved")
        public boolean checkApproved;
    }

    /* loaded from: classes6.dex */
    public static final class ResponseExtra {

        @InterfaceC65349Pkn("now")
        public long now;
    }
}
