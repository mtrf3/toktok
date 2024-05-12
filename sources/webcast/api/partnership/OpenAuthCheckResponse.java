package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class OpenAuthCheckResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("is_auth")
        public boolean isAuth;

        @InterfaceC65349Pkn("open_id")
        public String openId = "";

        @InterfaceC65349Pkn("scopes")
        public List<String> scopes = new ArrayList();
    }
}
