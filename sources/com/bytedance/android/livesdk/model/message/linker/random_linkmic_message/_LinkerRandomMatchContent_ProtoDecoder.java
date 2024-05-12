package com.bytedance.android.livesdk.model.message.linker.random_linkmic_message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LinkerRandomMatchContent_ProtoDecoder implements InterfaceC31105CIr<LinkerRandomMatchContent> {
    public static LinkerRandomMatchContent LIZIZ(Q9H q9h) {
        LinkerRandomMatchContent linkerRandomMatchContent = new LinkerRandomMatchContent();
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
                                    linkerRandomMatchContent.innerChannelId = q9h.LJIIJJI();
                                }
                            } else {
                                linkerRandomMatchContent.matchId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            linkerRandomMatchContent.inviteType = Long.valueOf(q9h.LJIIJJI());
                        }
                    } else {
                        linkerRandomMatchContent.roomId = q9h.LJIIJJI();
                    }
                } else {
                    linkerRandomMatchContent.user = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerRandomMatchContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerRandomMatchContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
