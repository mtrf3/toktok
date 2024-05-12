package com.bytedance.android.livesdk.gift.assets;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _FaceRecognitionMeta_ProtoDecoder implements InterfaceC31105CIr<FaceRecognitionMeta> {
    public static FaceRecognitionMeta LIZIZ(Q9H q9h) {
        FaceRecognitionMeta faceRecognitionMeta = new FaceRecognitionMeta();
        faceRecognitionMeta.requirements = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                faceRecognitionMeta.sdkExtra = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            faceRecognitionMeta.modelNames = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        faceRecognitionMeta.requirements.add(Q9J.LIZIZ(q9h));
                    }
                } else {
                    faceRecognitionMeta.version = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return faceRecognitionMeta;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FaceRecognitionMeta LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
