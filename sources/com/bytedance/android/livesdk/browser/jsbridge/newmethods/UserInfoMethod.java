package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38127Exn;
import X.B83;
import X.C38131Exr;
import X.InterfaceC05190Ih;
import X.InterfaceC29405BgP;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class UserInfoMethod extends AbstractC38127Exn<Object, Result> {
    public static boolean LJLIL;

    /* loaded from: classes6.dex */
    public static final class Result {

        @InterfaceC65349Pkn("is_login")
        public boolean is_login;

        @InterfaceC65349Pkn("is_silent")
        public int is_silent;

        @InterfaceC65349Pkn("sec_user_id")
        public String sec_user_id;

        @InterfaceC65349Pkn("user_id")
        public String user_id = "";

        @InterfaceC65349Pkn("short_id")
        public long short_id = -1;
    }

    @Override // X.AbstractC38127Exn
    public final Result invoke(Object obj, C38131Exr c38131Exr) {
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        InterfaceC05190Ih currentUser = LIZIZ.getCurrentUser();
        Result result = new Result();
        boolean isLogin = LIZIZ.isLogin();
        result.is_login = isLogin;
        if (isLogin) {
            result.user_id = String.valueOf(currentUser.getId());
            result.sec_user_id = currentUser.getSecUid();
        }
        result.is_silent = LJLIL ? 1 : 0;
        return result;
    }
}
