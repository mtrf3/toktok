package com.bytedance.android.live.base.model.user;

import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* loaded from: classes.dex */
public final class _IconConfig_ProtoEncoder implements InterfaceC64604PXc<IconConfig> {
    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, IconConfig iconConfig) {
        IconConfig iconConfig2 = iconConfig;
        _ImageModel_ProtoEncoder.LIZJ(cd6, 1, iconConfig2.icon);
        _CombineBadgeBackground_ProtoEncoder.LIZIZ(cd6, 2, iconConfig2.background);
    }
}
