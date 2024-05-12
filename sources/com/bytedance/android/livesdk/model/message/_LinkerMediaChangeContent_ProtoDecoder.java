package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkerMediaChangeContent_ProtoDecoder implements InterfaceC31105CIr<LinkerMediaChangeContent> {
    public static LinkerMediaChangeContent LIZIZ(Q9H q9h) {
        LinkerMediaChangeContent linkerMediaChangeContent = new LinkerMediaChangeContent();
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
                                    linkerMediaChangeContent.changeScene = q9h.LJIIJ();
                                }
                            } else {
                                linkerMediaChangeContent.roomId = Long.valueOf(q9h.LJIIJJI());
                            }
                        } else {
                            linkerMediaChangeContent.anchorId = Long.valueOf(q9h.LJIIJJI());
                        }
                    } else {
                        linkerMediaChangeContent.toUserId = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    linkerMediaChangeContent.op = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerMediaChangeContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerMediaChangeContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
