package com.ss.android.ugc.aweme.settingsrequest;

import X.AbstractC36786EcA;
import X.C00F;
import X.C100023wE;
import X.C36805EcT;
import X.C36806EcU;
import X.C47261Igj;
import X.EE1;
import X.EU5;
import X.InterfaceC37286EkE;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import java.util.List;

/* loaded from: classes7.dex */
public final class SettingsLegacyImpl implements ISettingsLegacyApi {
    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final List<InterfaceC37286EkE> LIZ() {
        return C47261Igj.LJJIJIIJI(new C36805EcT(), new C36806EcU());
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final C100023wE LIZIZ() {
        if (AbstractC36786EcA.LJLILLLLZI == null) {
            synchronized (AbstractC36786EcA.class) {
                if (AbstractC36786EcA.LJLILLLLZI == null) {
                    AbstractC36786EcA.LJLILLLLZI = new EU5();
                }
            }
        }
        C100023wE c100023wE = AbstractC36786EcA.LJLILLLLZI.LJLIL;
        if (c100023wE == null) {
            return SettingsRequestServiceImpl.LJIILLIIL().LJ();
        }
        return c100023wE;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final int LIZLLL() {
        return C00F.LIZ(31744, 0, "ins_share_type", true);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final EE1 getRegisterStorageTask() {
        return new RegisterStorageTask();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final boolean shouldUseRecyclerPartialUpdate() {
        return SettingsRequestServiceImpl.LJIILLIIL().shouldUseRecyclerPartialUpdate();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final void preloadPushSettingsManager() {
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final PopupSetting LIZJ(String str) {
        return PopupSettingManager.inst().getPopupSetting(str);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final void LJ(WeakHandler weakHandler, int i, int i2) {
        if (weakHandler == null) {
            return;
        }
        PopupSettingManager.inst().requestPopupConfigAsync(weakHandler, i, i2);
    }
}
