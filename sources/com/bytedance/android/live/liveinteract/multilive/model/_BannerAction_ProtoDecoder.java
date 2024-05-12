package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BannerAction_ProtoDecoder implements InterfaceC31105CIr<BannerAction> {
    public static BannerAction LIZIZ(Q9H q9h) {
        BannerAction bannerAction = new BannerAction();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        bannerAction.bannerActionType = q9h.LJIIJJI();
                        break;
                    case 2:
                        bannerAction.bannerRedirectionType = q9h.LJIIJJI();
                        break;
                    case 3:
                        bannerAction.pageType = q9h.LJIIJJI();
                        break;
                    case 4:
                        bannerAction.link = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        bannerAction.userId = q9h.LJIIJJI();
                        break;
                    case 6:
                        bannerAction.hideNavigationBar = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        bannerAction.customSchema = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        bannerAction.roomId = q9h.LJIIJJI();
                        break;
                    case 9:
                        bannerAction.schema = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        bannerAction.bannerTabColor = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return bannerAction;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BannerAction LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
