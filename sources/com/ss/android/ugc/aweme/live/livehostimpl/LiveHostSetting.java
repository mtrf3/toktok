package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C16880lQ;
import X.C221108m2;
import X.C38701FGv;
import X.C38703FGx;
import X.C48537J3d;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C62848OlY;
import X.EAB;
import X.FH1;
import X.FIK;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.experiment.PreloadWidgetsData;
import com.ss.android.ugc.aweme.services.external.IDonationVendorService;
import com.ss.android.ugc.aweme.services.external.IGetPostVideoThresholdService;
import com.ss.android.ugc.aweme.shortvideo.AllowVideoThresholdUtils;
import com.ss.android.ugc.gamora.editor.sticker.donation.DonationUtils;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LiveHostSetting implements IHostSetting {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C38703FGx.LJLIL);

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final long IF() {
        IGetPostVideoThresholdService iGetPostVideoThresholdService;
        Object LIZ = C58096Mr6.LIZ(IGetPostVideoThresholdService.class, false);
        if (LIZ != null) {
            iGetPostVideoThresholdService = (IGetPostVideoThresholdService) LIZ;
        } else {
            if (C58096Mr6.S6 == null) {
                synchronized (IGetPostVideoThresholdService.class) {
                    if (C58096Mr6.S6 == null) {
                        C58096Mr6.S6 = new AllowVideoThresholdUtils();
                    }
                }
            }
            iGetPostVideoThresholdService = C58096Mr6.S6;
        }
        if (iGetPostVideoThresholdService == null) {
            return 600000L;
        }
        return iGetPostVideoThresholdService.getPostVideoThresholdService();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final JSONObject qi() {
        JSONObject optJSONObject;
        try {
            Keva repo = Keva.getRepo("TTSettingData");
            if (repo != null && (optJSONObject = new JSONObject(repo.getString("settingData", "")).optJSONObject("data")) != null) {
                return optJSONObject.optJSONObject("app");
            }
            return null;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return new JSONObject();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean Zi() {
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings != null && C62848OlY.LIZLLL(privacyUserSettings)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean db() {
        int LJ = C48537J3d.LIZ().LJ(-1, "livesdk_live_play_label");
        FIK.LIZ.getClass();
        if (LJ >= ((PreloadWidgetsData) FIK.LIZJ.getValue()).liveHotLevel) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final boolean enableDonationPercentService() {
        IDonationVendorService LIZ = DonationUtils.LIZ();
        if (LIZ == null) {
            return false;
        }
        return LIZ.enableDonationPercentService();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final void deleteUselessExposedVids(String vids) {
        o.LJIIIZ(vids, "vids");
        C38701FGv c38701FGv = (C38701FGv) this.LJLIL.getValue();
        c38701FGv.getClass();
        List<String> LIZJ = C38701FGv.LIZJ(vids);
        if (LIZJ != null) {
            ((EAB) c38701FGv.LIZJ.getValue()).LJ(LIZJ);
            EAB LIZIZ = c38701FGv.LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.LJ(LIZJ);
            }
            FH1.LJI.getClass();
            FH1.LIZLLL();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0035, code lost:
    
        continue;
     */
    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSJ<java.lang.Boolean, java.lang.Boolean, java.lang.Integer> eY(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "schema"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.util.List<java.lang.String> r0 = X.C38568FBs.LIZ
            java.util.Iterator r2 = r0.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            r5 = 0
            r3 = 0
            if (r0 == 0) goto L2f
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = ujb.s.LJJJLZIJ(r8, r0, r5)
            if (r0 == 0) goto Lb
            if (r1 == 0) goto L2f
            X.OSJ r3 = new X.OSJ
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.<init>(r1, r1, r0)
        L2e:
            return r3
        L2f:
            java.util.List<X.FBi> r0 = X.C38568FBs.LIZIZ
            java.util.Iterator r6 = r0.iterator()
        L35:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r6.next()
            X.FBi r0 = (X.InterfaceC38558FBi) r0
            com.ss.android.ugc.aweme.hybridkit.forest.ForestSettings r4 = r0.LIZ()
            if (r4 == 0) goto L35
            java.util.List<java.lang.String> r0 = r4.patternList
            if (r0 == 0) goto L35
            java.util.Iterator r2 = r0.iterator()
        L4f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = ujb.s.LJJJLZIJ(r8, r0, r5)
            if (r0 == 0) goto L4f
            if (r1 == 0) goto L35
            X.OSJ r3 = new X.OSJ
            int r0 = r4.useMemoryCache
            r1 = 1
            if (r0 != r1) goto L83
            r0 = 1
        L6c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            int r0 = r4.parallelFetchResource
            if (r0 != r1) goto L75
            r5 = 1
        L75:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            int r0 = r4.useDynamic
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.<init>(r2, r1, r0)
            goto L2e
        L83:
            r0 = 0
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.LiveHostSetting.eY(java.lang.String):X.OSJ");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final void setExposedVids(String vids) {
        o.LJIIIZ(vids, "vids");
        ((C38701FGv) this.LJLIL.getValue()).LIZ(vids, false);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSetting
    public final void setExposedVidsByUid(String vids) {
        o.LJIIIZ(vids, "vids");
        ((C38701FGv) this.LJLIL.getValue()).LIZ(vids, true);
    }
}
