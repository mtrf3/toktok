package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EIv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36205EIv {
    public static void LIZ(String str, EnumC36206EIw source) {
        int type;
        o.LJIIIZ(source, "source");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("tab", (String) C36207EIx.LIZIZ.getValue());
        c188727au.LJIIIZ("intercept_reason", str);
        if (source == EnumC36206EIw.SWITCH_ACCOUNT) {
            type = EnumC36206EIw.LOGIN_SUCCESS.getType();
        } else {
            type = source.getType();
        }
        c188727au.LIZLLL(type, "source");
        FMX.LJIIL("social_tab_notice_request_intercept", c188727au.LIZ);
    }
}
