package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _AccompanimentStruct_ProtoDecoder implements InterfaceC31105CIr<AccompanimentStruct> {
    public static AccompanimentStruct LIZIZ(Q9H q9h) {
        AccompanimentStruct accompanimentStruct = new AccompanimentStruct();
        accompanimentStruct.accompanimentUrls = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    accompanimentStruct.volumeAmplitudePeak = Double.longBitsToDouble(q9h.LJIIIZ());
                                }
                            } else {
                                accompanimentStruct.volumeLoudnessLufs = Double.longBitsToDouble(q9h.LJIIIZ());
                            }
                        } else {
                            accompanimentStruct.id = q9h.LJIIJJI();
                        }
                    } else {
                        accompanimentStruct.accompanimentUrls.add(Q9J.LIZIZ(q9h));
                    }
                } else {
                    accompanimentStruct.vid = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return accompanimentStruct;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AccompanimentStruct LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
