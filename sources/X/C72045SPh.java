package X;

import Y.AfS20S0001000_12;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.ss.android.ugc.tiktok.tpsc.data.usersettings.PrivacyUserSettingsApi;
import kotlin.jvm.internal.o;

/* renamed from: X.SPh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72045SPh {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C72055SPr.LJLIL);
    public static long LIZIZ;
    public static long LIZJ;

    public static void LIZ(boolean z) {
        if (!z && (System.currentTimeMillis() - LIZIZ < LivePreviewNetworkSpeedThresholdSetting.DEFAULT || System.currentTimeMillis() - LIZJ < 1000)) {
            return;
        }
        LIZJ = System.currentTimeMillis();
        C63081OpJ.LJJLIIIJ(((PrivacyUserSettingsApi) LIZ.getValue()).getPrivacyUserSettings(), "/tiktok/privacy/user/settings/v2").LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(C72050SPm.LJLIL).LJJJJZ();
    }

    public static C73422Sri LIZIZ(String field, int i) {
        o.LJIIIZ(field, "field");
        return C63081OpJ.LJJLIIIJ(((PrivacyUserSettingsApi) LIZ.getValue()).setPrivacySetting(field, i), "/tiktok/privacy/user/settings/update/v1").LJIJJLI(new C72038SPa(field, i));
    }

    public static C73805Sxt LIZJ(int i, int i2) {
        return C63081OpJ.LJJLIIIJ(((PrivacyUserSettingsApi) LIZ.getValue()).setPrivateAccount("private_account", i, i2), "/tiktok/privacy/user/settings/update/v1").LJIJJLI(new AfS20S0001000_12(i, 1)).LJJIJL(C62643OiF.LJLIL);
    }
}
