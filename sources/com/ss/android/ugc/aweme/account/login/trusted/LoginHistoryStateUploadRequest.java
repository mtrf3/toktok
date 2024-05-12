package com.ss.android.ugc.aweme.account.login.trusted;

import X.AnonymousClass030;
import X.C68517Qun;
import X.C68540QvA;
import X.C68700Qxk;
import X.C68701Qxl;
import X.C68702Qxm;
import X.DNL;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.R41;
import X.RBW;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.services.LoginMethodService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class LoginHistoryStateUploadRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "LoginHistoryStateUploadRequest";
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

    @Override // X.EFM
    public final EFN type() {
        if (DNL.LIZ()) {
            return EFN.BOOT_FINISH;
        }
        return EFN.NORMAL;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        if (!C68517Qun.LIZ.LJII()) {
            Keva repo = Keva.getRepo("aweme_trusted_users_repo");
            o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
            if (repo.getLong("last_success_fetch", 0L) <= 0) {
                if (TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
                    DeviceRegisterManager.addOnDeviceConfigUpdateListener(new C68701Qxl());
                } else {
                    TrustedEnvApi.LIZ(C68702Qxm.LJLIL);
                }
            }
        }
        RBW rbw = RBW.LJLLI;
        if (!rbw.LJI()) {
            return;
        }
        LoginMethodService LJIIIZ = R41.LIZIZ.LJIIIZ();
        o.LJIIIIZZ(LJIIIZ, "getService().loginMethodService()");
        int LIZIZ = C68540QvA.LIZIZ(rbw.LIZJ());
        if (LIZIZ != 0 && LIZIZ != -1) {
            return;
        }
        LJIIIZ.fetchLoginHistoryState(null, C68700Qxk.LJLIL);
    }
}
