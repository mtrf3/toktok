package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _LyricStruct_ProtoDecoder implements InterfaceC31105CIr<LyricStruct> {
    public static LyricStruct LIZIZ(Q9H q9h) {
        LyricStruct lyricStruct = new LyricStruct();
        lyricStruct.klyricUrls = new ArrayList();
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
                                    lyricStruct.lyricStatus = q9h.LJIIJ();
                                }
                            } else {
                                lyricStruct.klyricUrls.add(Q9J.LIZIZ(q9h));
                            }
                        } else {
                            lyricStruct.vid = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        lyricStruct.lyricType = q9h.LJIIJ();
                    }
                } else {
                    lyricStruct.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return lyricStruct;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LyricStruct LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
