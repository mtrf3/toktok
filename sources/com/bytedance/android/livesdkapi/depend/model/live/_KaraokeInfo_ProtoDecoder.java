package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._KaraokeSong_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _KaraokeInfo_ProtoDecoder implements InterfaceC31105CIr<KaraokeInfo> {
    public static KaraokeInfo LIZIZ(Q9H q9h) {
        KaraokeInfo karaokeInfo = new KaraokeInfo();
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
                                karaokeInfo.displayKaraoke = Q9J.LIZ(q9h);
                            }
                        } else {
                            karaokeInfo.karaokeLyricStatus = Q9J.LIZ(q9h);
                        }
                    } else {
                        karaokeInfo.karaokeStatus = Q9J.LIZ(q9h);
                    }
                } else {
                    karaokeInfo.song = _KaraokeSong_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return karaokeInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final KaraokeInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
