package X;

import Y.AfS23S1200000_15;
import Y.AfS28S1100000_15;
import android.app.Activity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.account.login.trusted.SaveInfoDialogInterval;
import com.ss.android.ugc.aweme.account.settings.SaveLoginInfoPopupFrequencyModel;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.XhU, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85528XhU {
    public static boolean LIZ;

    public static boolean LIZIZ() {
        Activity LJIIIIZZ;
        ActivityC45651qj LJJIFFI;
        JSONObject jSONObject;
        Long valueOf;
        if (AV1.LJIILLIIL() || C53262KvK.LIZ() == 0 || (LJIIIIZZ = C84763XOl.LJIIIIZZ()) == null || (LJJIFFI = C45804HyK.LJJIFFI(LJIIIIZZ)) == null || LJJIFFI.isFinishing() || C68517Qun.LIZ.LJIIJ()) {
            return false;
        }
        long j = -1;
        long j2 = Keva.getRepo("save_info_keva_repo").getLong("key_last_show_time", -1L);
        if (j2 > 0) {
            j2 = TimeUnit.MILLISECONDS.toDays(j2);
        }
        int i = Keva.getRepo("save_info_keva_repo").getInt("key_show_count", 0);
        QTX LIZJ = C36244EKi.LIZJ();
        if (LIZJ != null && (jSONObject = LIZJ.LJIIL) != null && (valueOf = Long.valueOf(jSONObject.optInt("user_create_time", -1))) != null) {
            j = valueOf.longValue();
            if (j > 0) {
                j = TimeUnit.SECONDS.toDays(j);
            }
        }
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        SaveLoginInfoPopupFrequencyModel saveLoginInfoPopupFrequencyModel = C84533XFp.LIZ;
        SaveLoginInfoPopupFrequencyModel saveLoginInfoPopupFrequencyModel2 = (SaveLoginInfoPopupFrequencyModel) LIZLLL.LJIIIIZZ("save_login_info_popup_frequency", SaveLoginInfoPopupFrequencyModel.class, saveLoginInfoPopupFrequencyModel);
        if (saveLoginInfoPopupFrequencyModel2 != null) {
            saveLoginInfoPopupFrequencyModel = saveLoginInfoPopupFrequencyModel2;
        }
        long days = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis());
        if (j > 0 && days - j <= saveLoginInfoPopupFrequencyModel.new_user_exemption) {
            return false;
        }
        if (j2 > 0 && days - j2 < saveLoginInfoPopupFrequencyModel.interval) {
            LIZ("block_by_interval", null);
            return false;
        }
        if (i >= saveLoginInfoPopupFrequencyModel.max_count) {
            return false;
        }
        return true;
    }

    public static void LIZ(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("reason", str);
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("extra", str2);
        FMX.LJIIL("not_show_save_info_dialog_after_login", c188727au.LIZ);
    }

    public static void LIZJ(String str, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        AbstractC73635Sv9.LJ(new R9V("/passport/shark/safe_verify/", C45243HpH.LIZ(WM7.SCENE_SERVICE, "", "target", "enable_cloud_token_login"))).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIIZILJ(new AfS23S1200000_15(str, interfaceC65784Pro, interfaceC65784Pro2, 1), new AfS28S1100000_15(interfaceC65784Pro2, str, 5));
    }

    public static void LIZLLL(String enterFrom, InterfaceC65784Pro onDialogShowDissCallback, InterfaceC65784Pro noShowDialog) {
        boolean z;
        SaveInfoDialogInterval saveInfoDialogInterval;
        SaveInfoDialogInterval saveInfoDialogInterval2;
        JSONObject jSONObject;
        Long valueOf;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(onDialogShowDissCallback, "onDialogShowDissCallback");
        o.LJIIIZ(noShowDialog, "noShowDialog");
        if (AV1.LJIILLIIL()) {
            noShowDialog.invoke();
            return;
        }
        int i = 0;
        if (C53262KvK.LIZ() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!LIZ) {
                LIZ = true;
                if (LIZIZ()) {
                    QTX LIZJ = C36244EKi.LIZJ();
                    if (LIZJ == null || (jSONObject = LIZJ.LJIIL) == null || (valueOf = Long.valueOf(jSONObject.optInt("user_create_time", -1))) == null || valueOf.longValue() < 0) {
                        new R7H(C58725N2z.LIZ).LJJIII("normal", new C85527XhT(enterFrom, noShowDialog, onDialogShowDissCallback));
                        return;
                    } else {
                        LIZJ(enterFrom, onDialogShowDissCallback, noShowDialog);
                        return;
                    }
                }
                LIZ = false;
                noShowDialog.invoke();
                return;
            }
            return;
        }
        try {
            FFL.LJIIIZ().getClass();
            if (FFL.LJIIJ(31744, 0, "trusted_env_login_on_new_install", true) == 2) {
                long currentTimeMillis = System.currentTimeMillis() - Keva.getRepo("repo_new_version_journey").getLong("key_first_launch_time", 0L);
                try {
                    SettingsManager.LIZLLL().getClass();
                    saveInfoDialogInterval = (SaveInfoDialogInterval) SettingsManager.LJII("save_info_dialog_interval", SaveInfoDialogInterval.class);
                    if (saveInfoDialogInterval == null) {
                        saveInfoDialogInterval = new SaveInfoDialogInterval();
                    }
                } catch (Throwable unused) {
                    saveInfoDialogInterval = new SaveInfoDialogInterval();
                }
                if (currentTimeMillis < saveInfoDialogInterval.newUserDelayDay) {
                    LIZ("new_version_journey", null);
                    noShowDialog.invoke();
                    return;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - Keva.getRepo("save_info_keva_repo").getLong("key_last_show_time", 0L);
                try {
                    SettingsManager.LIZLLL().getClass();
                    saveInfoDialogInterval2 = (SaveInfoDialogInterval) SettingsManager.LJII("save_info_dialog_interval", SaveInfoDialogInterval.class);
                    if (saveInfoDialogInterval2 == null) {
                        saveInfoDialogInterval2 = new SaveInfoDialogInterval();
                    }
                } catch (Throwable unused2) {
                    saveInfoDialogInterval2 = new SaveInfoDialogInterval();
                }
                if (currentTimeMillis2 < saveInfoDialogInterval2.showDialogInterval) {
                    LIZ("block_by_interval", null);
                    noShowDialog.invoke();
                    return;
                }
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ == null) {
                    LIZ("get_activity_error", "activity is null");
                    noShowDialog.invoke();
                    return;
                }
                if (LJIIIIZZ.isFinishing()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LJIIIIZZ);
                    LIZ2.append(" is finishing");
                    LIZ("get_activity_error", X1D.LIZIZ(LIZ2));
                    noShowDialog.invoke();
                    return;
                }
                if (R41.LIZIZ.LJIIIZ().getSaveLoginStatus()) {
                    LIZ("is_open", null);
                    noShowDialog.invoke();
                    return;
                } else if (!R41.LIZIZ.LJIIIZ().isOneKeyLoginExperimentEnabled()) {
                    LIZ("jp_user", null);
                    noShowDialog.invoke();
                    return;
                } else {
                    PopupManager.LJIIL(new C85526XhS((ActivityC45651qj) LJIIIIZZ, enterFrom, onDialogShowDissCallback));
                    return;
                }
            }
        } catch (Throwable unused3) {
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("experiment group = ");
        try {
            FFL.LJIIIZ().getClass();
            i = FFL.LJIIJ(31744, 0, "trusted_env_login_on_new_install", true);
        } catch (Throwable unused4) {
        }
        LIZ3.append(i);
        LIZ("experiment_disable", X1D.LIZIZ(LIZ3));
        noShowDialog.invoke();
    }
}
