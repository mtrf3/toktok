package X;

import android.os.SystemClock;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.NAf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58913NAf {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Integer num, String str, String platform, String sceneType, long j, boolean z, boolean z2, int i) {
        EnumC58912NAe enumC58912NAe;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            z2 = false;
        }
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(sceneType, "sceneType");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C188727au c188727au = new C188727au();
        c188727au.LJ(elapsedRealtime - j, "duration");
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "getDefault()");
        String lowerCase = platform.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        c188727au.LJI("platform", lowerCase);
        if (s.LJJJLZIJ(sceneType, "pop", true)) {
            enumC58912NAe = EnumC58912NAe.POPUP;
        } else {
            enumC58912NAe = EnumC58912NAe.CARD;
        }
        c188727au.LJI("scene_type", enumC58912NAe.getValue());
        c188727au.LJFF(Boolean.valueOf(z2), "isAfterAuth");
        c188727au.LJFF(Boolean.valueOf(z), "isPlatformOnly");
        if (num == null) {
            c188727au.LJI("result", EnumC58914NAg.FAIL.getValue());
            c188727au.LJI("reason", str);
        } else if (num.intValue() == 0) {
            c188727au.LJI("result", EnumC58914NAg.EMPTY.getValue());
        } else {
            c188727au.LJI("result", EnumC58914NAg.SUCCESS.getValue());
        }
        FMX.LJIIL("recommend_after_permission_monitor", c188727au.LIZ);
    }
}
