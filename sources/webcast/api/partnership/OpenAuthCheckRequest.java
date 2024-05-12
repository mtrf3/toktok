package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import X.WM7;

/* loaded from: classes17.dex */
public final class OpenAuthCheckRequest {

    @InterfaceC65349Pkn("drops_param")
    public DropsParam dropsParam;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public int scene;

    /* loaded from: classes17.dex */
    public static final class DropsParam {

        @InterfaceC65349Pkn("drops_id")
        public String dropsId = "";

        @InterfaceC65349Pkn("need_auth_msg")
        public boolean needAuthMsg;

        @InterfaceC65349Pkn("need_unauth_msg")
        public boolean needUnauthMsg;
    }
}
