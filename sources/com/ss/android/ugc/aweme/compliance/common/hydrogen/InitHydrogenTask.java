package com.ss.android.ugc.aweme.compliance.common.hydrogen;

import X.C0RN;
import X.C35495DwR;
import X.C47261Igj;
import X.C58096Mr6;
import X.C88548Yp6;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC253409x2;
import X.OPO;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.api.services.hydrogen.IHydrogenService;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.HydrogenSettings;
import com.ss.android.ugc.aweme.compliance.common.serviceimpl.HydrogenServiceImpl;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class InitHydrogenTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitHydrogenTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        IHydrogenService iHydrogenService;
        Object LIZ = C58096Mr6.LIZ(IHydrogenService.class, false);
        if (LIZ != null) {
            iHydrogenService = (IHydrogenService) LIZ;
        } else {
            if (C58096Mr6.LLZZLLIL == null) {
                synchronized (IHydrogenService.class) {
                    if (C58096Mr6.LLZZLLIL == null) {
                        C58096Mr6.LLZZLLIL = new HydrogenServiceImpl();
                    }
                }
            }
            iHydrogenService = C58096Mr6.LLZZLLIL;
        }
        iHydrogenService.LIZ(C47261Igj.LJJIJIIJI(new C88548Yp6(), new C35495DwR(), new OPO(), new InterfaceC253409x2() { // from class: X.9x0
            public static final HashMap<String, String> LIZ = C113554cx.LJJJLZIJ(new OSZ("account_deleted", "aweme://lynxview?channel=fe_privacy_lynx&bundle=delete-account-alert/template.js&dynamic=1&hide_nav_bar=1&use_spark=1&block_back_press=1"), new OSZ("delete_video", "aweme://lynxview?channel=fe_privacy_lynx&bundle=delete-video-alert/template.js&dynamic=1&hide_nav_bar=1&use_spark=1&block_back_press=1"), new OSZ("delete_video_us", "aweme://lynxview?channel=fe_privacy_lynx&bundle=remove-videos-alert/template.js&dynamic=1&hide_nav_bar=1&use_spark=1&block_back_press=1"), new OSZ("account_banned", "aweme://account/deleted"), new OSZ("mixed_age_user_consent", "aweme://lynxview?channel=fe_privacy_lynx&bundle=mixed-age-user-consent/template.js&dynamic=1&hide_nav_bar=1&use_spark=1&block_back_press=1"), new OSZ("age_confirmation", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ftpp%2Finapp%2Fage-verification%2Fverify-state.html%3Fuse_spark%3D1%26hide_nav_bar%3D1%26show_loading%3D1%26should_full_screen%3D1%26object_type%3D68"), new OSZ("registration_age_confirmation", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ftpp%2Finapp%2Fage-verification%2Fverify-state.html%3Fuse_spark%3D1%26hide_nav_bar%3D1%26show_loading%3D1%26should_full_screen%3D1%26object_type%3D68%26ar_mode%3D3%26block_back_press%3D1"));

            @Override // X.InterfaceC253409x2
            public final java.util.Map<String, String> getConfig() {
                HashMap<String, String> hashMap = LIZ;
                SettingsManager LIZLLL = SettingsManager.LIZLLL();
                HydrogenSettings.HydrogenSettingModel hydrogenSettingModel = HydrogenSettings.LIZ;
                HydrogenSettings.HydrogenSettingModel hydrogenSettingModel2 = (HydrogenSettings.HydrogenSettingModel) LIZLLL.LJIIIIZZ("hydrogen_setting", HydrogenSettings.HydrogenSettingModel.class, hydrogenSettingModel);
                if (hydrogenSettingModel2 != null) {
                    hydrogenSettingModel = hydrogenSettingModel2;
                }
                hashMap.putAll(hydrogenSettingModel.actionMap);
                return hashMap;
            }
        }));
    }
}
