package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _AudioStruct_ProtoDecoder implements InterfaceC31105CIr<AudioStruct> {
    public static AudioStruct LIZIZ(Q9H q9h) {
        AudioStruct audioStruct = new AudioStruct();
        audioStruct.audioUrls = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        audioStruct.id = q9h.LJIIJJI();
                        break;
                    case 2:
                        audioStruct.duration = q9h.LJIIJ();
                        break;
                    case 3:
                        audioStruct.audioFormat = q9h.LJIIJ();
                        break;
                    case 4:
                        audioStruct.vid = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        audioStruct.audioUrls.add(Q9J.LIZIZ(q9h));
                        break;
                    case 6:
                        audioStruct.volumeLoudnessLufs = Double.longBitsToDouble(q9h.LJIIIZ());
                        break;
                    case 7:
                        audioStruct.volumeAmplitudePeak = Double.longBitsToDouble(q9h.LJIIIZ());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return audioStruct;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AudioStruct LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
