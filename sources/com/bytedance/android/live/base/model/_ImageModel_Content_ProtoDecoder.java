package com.bytedance.android.live.base.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes.dex */
public final class _ImageModel_Content_ProtoDecoder implements InterfaceC31105CIr<ImageModel.Content> {
    public static ImageModel.Content LIZIZ(Q9H q9h) {
        ImageModel.Content content = new ImageModel.Content();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            content.level = q9h.LJIIJJI();
                        }
                    } else {
                        content.fontColor = Q9J.LIZIZ(q9h);
                    }
                } else {
                    content.name = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return content;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ImageModel.Content LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
