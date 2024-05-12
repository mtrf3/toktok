package com.ss.android.ugc.aweme.effectcreator.services;

import X.ESB;
import X.FFL;
import com.bytedance.effectcreatormobile.ckeapi.api.ConfigProvider;

/* loaded from: classes34.dex */
public final class TikTokConfigProviderImpl implements ConfigProvider {
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ConfigProvider
    public boolean enableDefaultCamera() {
        FFL.LJIIIZ().getClass();
        return FFL.LJ(31744, "ame_default_camera_preview", true, false);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ConfigProvider
    public boolean shouldDropSubmitPage() {
        return ESB.LIZ();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ConfigProvider
    public boolean showGifFirstInObjectPanel() {
        FFL.LJIIIZ().getClass();
        return FFL.LJ(31744, "ame_object_panel_default_tab_giphy", true, false);
    }
}
