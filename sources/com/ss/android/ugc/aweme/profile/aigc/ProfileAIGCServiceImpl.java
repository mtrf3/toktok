package com.ss.android.ugc.aweme.profile.aigc;

import X.APK;
import X.APM;
import X.APN;
import X.C221018lt;
import X.C244419iX;
import X.C58096Mr6;
import X.C72121SSf;
import X.C9TY;
import X.FMX;
import X.HG3;
import X.RBX;
import X.ST9;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAIGCServiceImpl implements IProfileAIGCService {
    public static IProfileAIGCService LJFF() {
        Object LIZ = C58096Mr6.LIZ(IProfileAIGCService.class, false);
        if (LIZ != null) {
            return (IProfileAIGCService) LIZ;
        }
        return new ProfileAIGCServiceImpl();
    }

    public static void LJ() {
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            C221018lt.LIZ("ProfileAIGCServiceImpl", "user not logged in, no ops");
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService
    public final void LIZ() {
        C244419iX.LIZIZ().storeBoolean(C9TY.LIZ("has_generated_aigc_avatar"), true);
        FMX.onEventV3("ai_avatar_save_success");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService
    public final void LIZIZ(Context context, APM entrance, APN enterFrom, APK apk) {
        String str;
        String str2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(entrance, "entrance");
        o.LJIIIZ(enterFrom, "enterFrom");
        LJ();
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//aivatar/intro/v2");
        String str3 = entrance.toString();
        String str4 = ST9.IDLE.toString();
        Boolean bool = Boolean.TRUE;
        String str5 = enterFrom.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = str5.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (apk != null && (str2 = apk.toString()) != null) {
            str = str2.toLowerCase(locale);
            o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str = null;
        }
        buildRoute.withNavArg(new ProfileAIGCMainArg(str3, str4, bool, lowerCase, str, null, 32, 0 == true ? 1 : 0));
        buildRoute.open();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService
    public final void LIZLLL(Context context, APM entrance, APN enterFrom, APK apk, C72121SSf c72121SSf) {
        String str;
        String str2;
        o.LJIIIZ(entrance, "entrance");
        o.LJIIIZ(enterFrom, "enterFrom");
        LJ();
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//aivatar/avatar");
        String str3 = entrance.toString();
        String str4 = ST9.SUCCESSFUL.toString();
        Boolean bool = null;
        Object[] objArr = 0;
        String str5 = enterFrom.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = str5.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (apk != null && (str2 = apk.toString()) != null) {
            str = str2.toLowerCase(locale);
            o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str = null;
        }
        buildRoute.withNavArg(new ProfileAIGCMainArg(str3, str4, bool, lowerCase, str, c72121SSf, 4, objArr == true ? 1 : 0));
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService
    public final void LIZJ(Context context, APM entrance, APN enterFrom, APK apk, ST9 st9, C72121SSf c72121SSf) {
        String str;
        String str2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(entrance, "entrance");
        o.LJIIIZ(enterFrom, "enterFrom");
        LJ();
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//aivatar");
        String str3 = entrance.toString();
        String str4 = null;
        if (st9 != null) {
            str = st9.toString();
        } else {
            str = null;
        }
        Boolean bool = Boolean.TRUE;
        String str5 = enterFrom.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = str5.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (apk != null && (str2 = apk.toString()) != null) {
            str4 = str2.toLowerCase(locale);
            o.LJIIIIZZ(str4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        buildRoute.withNavArg(new ProfileAIGCMainArg(str3, str, bool, lowerCase, str4, c72121SSf));
        buildRoute.open();
    }
}
