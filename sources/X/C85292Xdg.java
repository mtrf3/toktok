package X;

import android.os.Build;
import com.bytedance.bdlocation.BDLocationSpi;
import com.bytedance.keva.Keva;
import com.ss.android.agilelogger.ALog;

/* renamed from: X.Xdg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85292Xdg extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C85292Xdg LJLIL = new C85292Xdg();

    public C85292Xdg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LocationService", "init block touch");
        if (((RBX) HG3.LJIILL()).isLogin() && C35908E7k.LIZ() <= 0) {
            Keva LIZIZ = C35908E7k.LIZIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("app_first_launch_time_");
            LIZIZ.storeLong(UPJ.LJ((RBX) HG3.LJIILL(), LIZ, LIZ), System.currentTimeMillis());
        }
        if (C85295Xdj.LIZJ == EnumC85294Xdi.SCENE_BOOT) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("shouldInitLocationSDK - isInAllowLocationMode: ");
            LIZ2.append(C85295Xdj.LIZJ());
            LIZ2.append(",isScenesEmpty: ");
            C85296Xdk.LIZ.getClass();
            LIZ2.append(C85296Xdk.LJFF());
            LIZ2.append(", permission: ");
            LIZ2.append(C35908E7k.LIZIZ().getBoolean("has_consented_location_permission", false));
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LocationService", X1D.LIZIZ(LIZ2));
            if (!C85295Xdj.LIZJ() || C85296Xdk.LJFF() || (Build.VERSION.SDK_INT < 23 && !C35908E7k.LIZIZ().getBoolean("has_consented_location_permission", false))) {
                C85295Xdj.LIZIZ();
            } else {
                BDLocationSpi.installLocationPlugin(EF7.LIZIZ(), new C85248Xcy());
            }
        } else if (C85295Xdj.LIZJ == EnumC85294Xdi.SCENE_LOGIN && C85295Xdj.LIZLLL) {
            C85295Xdj.LJI();
        }
        return C76800UCe.LIZ;
    }
}
