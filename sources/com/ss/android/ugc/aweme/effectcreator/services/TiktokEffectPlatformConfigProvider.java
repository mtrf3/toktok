package com.ss.android.ugc.aweme.effectcreator.services;

import X.C221108m2;
import X.C5H3;
import X.C93842aXO;
import X.C94559aix;
import com.bytedance.effectcreatormobile.ckeapi.api.resource.IEffectPlatformConfigProvider;

/* loaded from: classes34.dex */
public final class TiktokEffectPlatformConfigProvider implements IEffectPlatformConfigProvider {
    public final C5H3 config$delegate = C221108m2.LIZIZ(C94559aix.LJLIL);

    private final C93842aXO getConfig() {
        return (C93842aXO) this.config$delegate.getValue();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.resource.IEffectPlatformConfigProvider
    public C93842aXO getEffectPlatformConfig() {
        return getConfig();
    }
}
