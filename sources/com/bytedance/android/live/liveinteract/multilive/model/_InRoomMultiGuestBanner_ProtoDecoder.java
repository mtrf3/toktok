package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _InRoomMultiGuestBanner_ProtoDecoder implements InterfaceC31105CIr<InRoomMultiGuestBanner> {
    public static InRoomMultiGuestBanner LIZIZ(Q9H q9h) {
        InRoomMultiGuestBanner inRoomMultiGuestBanner = new InRoomMultiGuestBanner();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        inRoomMultiGuestBanner.id = q9h.LJIIJJI();
                        break;
                    case 2:
                        inRoomMultiGuestBanner.name = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        inRoomMultiGuestBanner.startTime = q9h.LJIIJJI();
                        break;
                    case 4:
                        inRoomMultiGuestBanner.endTime = q9h.LJIIJJI();
                        break;
                    case 5:
                        inRoomMultiGuestBanner.content = _BannerContentMultiGuest_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        inRoomMultiGuestBanner.action = _BannerAction_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return inRoomMultiGuestBanner;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final InRoomMultiGuestBanner LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
