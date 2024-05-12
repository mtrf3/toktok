package tikcast.linkmic.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkMicAdContent_ProtoDecoder implements InterfaceC31105CIr<LinkMicAdContent> {
    public static LinkMicAdContent LIZIZ(Q9H q9h) {
        LinkMicAdContent linkMicAdContent = new LinkMicAdContent();
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
                                    linkMicAdContent.url = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                linkMicAdContent.playTimes = q9h.LJIIJJI();
                            }
                        } else {
                            linkMicAdContent.duration = q9h.LJIIJJI();
                        }
                    } else {
                        linkMicAdContent.adId = q9h.LJIIJJI();
                    }
                } else {
                    linkMicAdContent.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicAdContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkMicAdContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
