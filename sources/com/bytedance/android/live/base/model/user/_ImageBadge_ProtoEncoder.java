package com.bytedance.android.live.base.model.user;

import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* loaded from: classes.dex */
public final class _ImageBadge_ProtoEncoder implements InterfaceC64604PXc<ImageBadge> {
    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, ImageBadge imageBadge) {
        ImageBadge imageBadge2 = imageBadge;
        int i = imageBadge2.badgeDisplayType;
        cd6.LIZLLL(1, 0);
        cd6.LIZJ(i);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 2, imageBadge2.imageModel);
    }
}
