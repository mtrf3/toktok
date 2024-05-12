package com.bytedance.android.live.base.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes.dex */
public final class _ImageModel_ProtoEncoder implements InterfaceC64604PXc<ImageModel> {
    public static int LIZLLL(ImageModel imageModel) {
        int i;
        int i2 = 0;
        if (imageModel == null) {
            return 0;
        }
        List<String> list = imageModel.mUrls;
        if (list != null && !list.isEmpty()) {
            i = 0;
            for (int i3 = 0; i3 < imageModel.mUrls.size(); i3++) {
                i += C30957CCz.LJIIL(1, (String) ListProtector.get(imageModel.mUrls, i3));
            }
        } else {
            i = 0;
        }
        int LJIIL = C30957CCz.LJIIL(7, imageModel.schema) + C30957CCz.LJI(6, imageModel.imageType) + C30957CCz.LJIIL(5, imageModel.avgColor) + C30957CCz.LJIIIZ(4, imageModel.width) + C30957CCz.LJIIIZ(3, imageModel.height) + C30957CCz.LJIIL(2, imageModel.mUri) + i;
        ImageModel.Content content = imageModel.content;
        if (content != null) {
            int LIZIZ = _ImageModel_Content_ProtoEncoder.LIZIZ(content);
            i2 = CD6.LIZIZ(LIZIZ) + LIZIZ + CD6.LIZ(8);
        }
        return C30957CCz.LJ(9) + LJIIL + i2;
    }

    public static void LIZIZ(CD6 cd6, ImageModel imageModel) {
        List<String> list = imageModel.mUrls;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < imageModel.mUrls.size(); i++) {
                C30957CCz.LIZLLL(cd6, 1, (String) ListProtector.get(imageModel.mUrls, i));
            }
        }
        C30957CCz.LIZLLL(cd6, 2, imageModel.mUri);
        long j = imageModel.height;
        cd6.LIZLLL(3, 0);
        cd6.LJFF(j);
        long j2 = imageModel.width;
        cd6.LIZLLL(4, 0);
        cd6.LJFF(j2);
        C30957CCz.LIZLLL(cd6, 5, imageModel.avgColor);
        int i2 = imageModel.imageType;
        cd6.LIZLLL(6, 0);
        cd6.LIZJ(i2);
        C30957CCz.LIZLLL(cd6, 7, imageModel.schema);
        ImageModel.Content content = imageModel.content;
        if (content != null) {
            cd6.LIZLLL(8, 2);
            cd6.LJ(_ImageModel_Content_ProtoEncoder.LIZIZ(content));
            C30957CCz.LIZLLL(cd6, 1, content.name);
            C30957CCz.LIZLLL(cd6, 2, content.fontColor);
            long j3 = content.level;
            cd6.LIZLLL(3, 0);
            cd6.LJFF(j3);
        }
        boolean z = imageModel.isAnimated;
        cd6.LIZLLL(9, 0);
        cd6.LJ(z ? 1 : 0);
    }

    public static int LJ(int i, ImageModel imageModel) {
        if (imageModel == null) {
            return 0;
        }
        int LIZLLL = LIZLLL(imageModel);
        return CD6.LIZ(i) + CD6.LIZIZ(LIZLLL) + LIZLLL;
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, ImageModel imageModel) {
        LIZIZ(cd6, imageModel);
    }

    public static void LIZJ(CD6 cd6, int i, ImageModel imageModel) {
        if (imageModel == null) {
            return;
        }
        cd6.LIZLLL(i, 2);
        cd6.LJ(LIZLLL(imageModel));
        LIZIZ(cd6, imageModel);
    }
}
