package com.bytedance.android.live.base.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class _ImageModel_ProtoDecoder implements InterfaceC31105CIr<ImageModel> {
    public static ImageModel LIZIZ(Q9H q9h) {
        ImageModel imageModel = new ImageModel();
        imageModel.mUrls = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        imageModel.mUrls.add(Q9J.LIZIZ(q9h));
                        break;
                    case 2:
                        imageModel.mUri = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        imageModel.height = (int) q9h.LJIIJJI();
                        break;
                    case 4:
                        imageModel.width = (int) q9h.LJIIJJI();
                        break;
                    case 5:
                        imageModel.avgColor = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        imageModel.imageType = q9h.LJIIJ();
                        break;
                    case 7:
                        imageModel.schema = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        imageModel.content = _ImageModel_Content_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        imageModel.isAnimated = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return imageModel;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ImageModel LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
