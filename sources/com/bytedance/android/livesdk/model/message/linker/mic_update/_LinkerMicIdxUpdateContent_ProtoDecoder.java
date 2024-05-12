package com.bytedance.android.livesdk.model.message.linker.mic_update;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkerMicIdxUpdateContent_ProtoDecoder implements InterfaceC31105CIr<LinkerMicIdxUpdateContent> {
    public static LinkerMicIdxUpdateContent LIZIZ(Q9H q9h) {
        LinkerMicIdxUpdateContent linkerMicIdxUpdateContent = new LinkerMicIdxUpdateContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    linkerMicIdxUpdateContent.micIndexUpdateInfo = _LinkerMicIdxUpdateInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerMicIdxUpdateContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerMicIdxUpdateContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
