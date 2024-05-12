package com.ss.android.ugc.aweme.setting.serverpush.service;

import X.C10K;
import X.C58096Mr6;
import X.C75792yF;
import X.E9W;
import X.OSZ;
import X.RBY;
import X.X1D;
import Y.ACallableS8S2100000_6;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUI;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PushSettingServiceImpl implements IPushSettingService {
    public OSZ<String, PushSettingDynamicUI> LIZ;

    public static IPushSettingService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IPushSettingService.class, false);
        if (LIZ != null) {
            return (IPushSettingService) LIZ;
        }
        if (C58096Mr6.v6 == null) {
            synchronized (IPushSettingService.class) {
                if (C58096Mr6.v6 == null) {
                    C58096Mr6.v6 = new PushSettingServiceImpl();
                }
            }
        }
        return C58096Mr6.v6;
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService
    public final PushSettingDynamicUI LIZIZ() {
        OSZ<String, PushSettingDynamicUI> osz = this.LIZ;
        if (osz != null && o.LJ(osz.getFirst(), BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID())) {
            return osz.getSecond();
        }
        String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        Keva LIZ = E9W.LIZ();
        if (LIZ == null) {
            return null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("current_settings_dynamic_ui__");
        LIZ2.append(currentUserID);
        String string = LIZ.getString(X1D.LIZIZ(LIZ2), "");
        if (string.isEmpty()) {
            return null;
        }
        return (PushSettingDynamicUI) C75792yF.LIZ(string, PushSettingDynamicUI.class);
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService
    public final PushSettings LIZJ() {
        PushSettings LJFF = PushSettingsApiManager.LJFF();
        o.LJIIIIZZ(LJFF, "fetchUserSettings()");
        return LJFF;
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService
    public final void LIZ(PushSettingDynamicUI pushSettingDynamicUI) {
        String userId = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        if (userId == null || ujb.o.LJJJJJL(userId)) {
            return;
        }
        o.LJIIIIZZ(userId, "userId");
        this.LIZ = new OSZ<>(userId, pushSettingDynamicUI);
        RBY LJFF = AccountService.LJIJ().LJFF();
        if (!LJFF.isLogin()) {
            return;
        }
        String curUserId = LJFF.getCurUserId();
        Keva LIZ = E9W.LIZ();
        if (LIZ == null) {
            return;
        }
        C10K.LIZJ(new ACallableS8S2100000_6(LIZ, curUserId, C75792yF.LIZJ(pushSettingDynamicUI), 2));
    }
}
