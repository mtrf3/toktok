package com.bytedance.android.live.base.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes.dex */
public final class _ImageModel_Content_ProtoEncoder implements InterfaceC64604PXc<ImageModel.Content> {
    public static int LIZIZ(ImageModel.Content content) {
        return C30957CCz.LJIIIZ(3, content.level) + C30957CCz.LJIIL(2, content.fontColor) + C30957CCz.LJIIL(1, content.name);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, ImageModel.Content content) {
        ImageModel.Content content2 = content;
        C30957CCz.LIZLLL(cd6, 1, content2.name);
        C30957CCz.LIZLLL(cd6, 2, content2.fontColor);
        long j = content2.level;
        cd6.LIZLLL(3, 0);
        cd6.LJFF(j);
    }
}
