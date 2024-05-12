package com.ss.android.ugc.aweme.relation.auth.lego;

import X.AV1;
import X.AnonymousClass030;
import X.C188727au;
import X.C221018lt;
import X.C2NU;
import X.C77266UUc;
import X.EF7;
import X.EFM;
import X.EFN;
import X.EMA;
import X.EMZ;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.EnumC77147UPn;
import X.FMX;
import X.HG3;
import X.RBX;
import X.UTK;
import X.X1D;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import defpackage.m0;
import java.util.List;

/* loaded from: classes14.dex */
public final class PermissionRequestAndUploadLegoTask implements EFM {
    @Override // X.EEY
    public final String key() {
        return "PermissionRequestAndUploadLegoTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "request_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return AnonymousClass030.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return AnonymousClass030.LIZIZ(this);
    }

    static {
        C221018lt.LIZ("xiezhen.0816", "registerConfigurationCallbacks");
        SettingsManager.LIZLLL().LJIIIZ(EMZ.LJLIL);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final EFN type() {
        return EFN.BOOT_FINISH;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        String str;
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null) {
            return;
        }
        if (z && ((RBX) HG3.LJIILL()).isLogin() && !AV1.LJIIJJI()) {
            EF7.LIZIZ();
            try {
                if (C2NU.LIZ.LIZIZ()) {
                    C77266UUc c77266UUc = C77266UUc.LIZIZ;
                    boolean LJ = c77266UUc.LJIIJ().LJ();
                    long LJIIJ = c77266UUc.LJIIJ().LJIIJ(curUserId);
                    String str2 = "on";
                    if (c77266UUc.LJIIJ().LIZIZ()) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    boolean LJ2 = c77266UUc.LJIILLIIL().LJ();
                    if (!c77266UUc.LJIILLIIL().LIZIZ()) {
                        str2 = "off";
                    }
                    UTK utk = UTK.LIZIZ;
                    EnumC77147UPn enumC77147UPn = EnumC77147UPn.MLBB;
                    Integer LIZLLL = utk.LIZLLL(enumC77147UPn).LIZLLL();
                    boolean LIZIZ = utk.LIZLLL(enumC77147UPn).LIZIZ();
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("user_id", curUserId);
                    c188727au.LIZLLL(LJ ? 1 : 0, "has_fb_token");
                    c188727au.LJ(LJIIJ, "token_expire_time");
                    c188727au.LJIIIZ("facebook_switch", str);
                    c188727au.LIZLLL(LJ2 ? 1 : 0, "has_contact_permission");
                    c188727au.LJIIIZ("contact_switch", str2);
                    c188727au.LJFF(c77266UUc.LJIIJ().LIZLLL(), "server_fb_token");
                    c188727au.LJFF(LIZLLL, "has_mlbb_permission");
                    c188727au.LIZLLL(LIZIZ ? 1 : 0, "mlbb_switch");
                    FMX.LJIIL("authorize_status_update", c188727au.LIZ);
                }
            } catch (Exception unused) {
            }
        }
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        C77266UUc c77266UUc2 = C77266UUc.LIZIZ;
        boolean LJ3 = c77266UUc2.LJIILLIIL().LJ();
        boolean LIZIZ2 = c77266UUc2.LJIILLIIL().LIZIZ();
        boolean LIZLLL2 = m0.LIZLLL("contact_sync_on_failure", curUserId, EMA.LIZ(), false);
        if (isLogin && z && LJ3 && !LIZIZ2 && LIZLLL2) {
            c77266UUc2.LJJIIJZLJL(true);
        }
        Keva LIZ = EMA.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("contact_sync_on_failure");
        LIZ2.append(curUserId);
        LIZ.erase(X1D.LIZIZ(LIZ2));
        boolean LJ4 = c77266UUc2.LJIIJ().LJ();
        boolean LIZIZ3 = c77266UUc2.LJIIJ().LIZIZ();
        boolean LIZLLL3 = m0.LIZLLL("facebook_sync_on_failure", curUserId, EMA.LIZ(), false);
        if (isLogin && z && LJ4 && !LIZIZ3 && LIZLLL3) {
            c77266UUc2.LJIILL();
        }
        Keva LIZ3 = EMA.LIZ();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("facebook_sync_on_failure");
        LIZ4.append(curUserId);
        LIZ3.erase(X1D.LIZIZ(LIZ4));
        boolean LJ5 = c77266UUc2.LJIILLIIL().LJ();
        boolean LIZIZ4 = c77266UUc2.LJIILLIIL().LIZIZ();
        boolean LIZLLL4 = m0.LIZLLL("click_contact_open_setting", curUserId, EMA.LIZ(), false);
        if (((RBX) HG3.LJIILL()).isLogin() && z && LJ5 && !LIZIZ4 && LIZLLL4) {
            c77266UUc2.LJJIIJZLJL(false);
        }
        Keva LIZ5 = EMA.LIZ();
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("click_contact_open_setting");
        LIZ6.append(curUserId);
        LIZ5.erase(X1D.LIZIZ(LIZ6));
    }
}
