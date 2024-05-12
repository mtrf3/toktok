package com.ss.android.ugc.aweme.account.experiment;

import X.C19N;
import X.C46451IKx;
import X.C52259Kf9;
import X.C52445Ki9;
import X.C52927Kpv;
import X.C53260KvI;
import X.C53262KvK;
import X.C53265KvN;
import X.C56978MXu;
import X.C56979MXv;
import X.C58096Mr6;
import X.FFL;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountFeatureFlagService;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AccountFeatureFlagService implements IAccountFeatureFlagService {
    @Override // com.ss.android.ugc.aweme.IAccountFeatureFlagService
    public final void LIZIZ() {
        FFL.LJIIIZ().LJIIJJI(ClientExpManager.google_onetap_nonce_fix_2(), "google_onetap_nonce_fix_2");
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LIZ("google_onetap_nonce_fix_feature_flag_2", false);
        C53262KvK.LIZIZ();
        if (((Number) C53260KvI.LIZ.getValue()).intValue() != 0) {
        }
        C52927Kpv.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.IAccountFeatureFlagService
    public final void LIZLLL() {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        boolean z = true;
        if (C52259Kf9.LIZ != 1) {
            z = false;
        }
        repo.storeBoolean("upsell_2sv_profile_hva", z);
        Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeInt("upsell_2sv_profile_wallet", C52445Ki9.LIZ);
    }

    public static IAccountFeatureFlagService LJI() {
        Object LIZ = C58096Mr6.LIZ(IAccountFeatureFlagService.class, false);
        if (LIZ != null) {
            return (IAccountFeatureFlagService) LIZ;
        }
        if (C58096Mr6.LJJZZIII == null) {
            synchronized (IAccountFeatureFlagService.class) {
                if (C58096Mr6.LJJZZIII == null) {
                    C58096Mr6.LJJZZIII = new AccountFeatureFlagService();
                }
            }
        }
        return C58096Mr6.LJJZZIII;
    }

    @Override // com.ss.android.ugc.aweme.IAccountFeatureFlagService
    public final boolean LIZ() {
        if (((C56978MXu.LIZ.contains(C56978MXu.LIZIZ) || !C19N.LJ("simplify_pasword_feature_flag", false) || FFL.LJIIIZ().LJIIJJI(ClientExpManager.simplifying_password(), "simplifying_password") != 2) && !C56979MXv.LIZ.contains(C56979MXv.LIZIZ.getValue())) || !C46451IKx.LIZJ) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IAccountFeatureFlagService
    public final Map<String, String> LIZJ() {
        Map<String, String> map = (Map) C53265KvN.LIZIZ.getValue();
        o.LJIIIIZZ(map, "AccountSecShareLimitPkgConfigSetting.value");
        return map;
    }

    @Override // com.ss.android.ugc.aweme.IAccountFeatureFlagService
    public final boolean LJFF() {
        if (C56978MXu.LIZ.contains(C56978MXu.LIZIZ)) {
            return false;
        }
        int LJIIJJI = FFL.LJIIIZ().LJIIJJI(ClientExpManager.simplifying_password(), "simplifying_password");
        if (!C19N.LJ("simplify_pasword_feature_flag", false)) {
            return false;
        }
        if (LJIIJJI != 1 && LJIIJJI != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IAccountFeatureFlagService
    public final boolean LJ() {
        if (C53262KvK.LIZ() != 0) {
            return true;
        }
        return false;
    }
}
