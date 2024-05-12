package com.bytedance.android.live.base.model.user;

import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* loaded from: classes.dex */
public final class _SubscribeBadge_ProtoEncoder implements InterfaceC64604PXc<SubscribeBadge> {
    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, SubscribeBadge subscribeBadge) {
        SubscribeBadge subscribeBadge2 = subscribeBadge;
        _ImageModel_ProtoEncoder.LIZJ(cd6, 3, subscribeBadge2.originImage);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 4, subscribeBadge2.previewImage);
    }
}
