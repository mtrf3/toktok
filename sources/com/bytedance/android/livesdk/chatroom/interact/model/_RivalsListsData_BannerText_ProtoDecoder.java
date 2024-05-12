package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;

/* loaded from: classes14.dex */
public final class _RivalsListsData_BannerText_ProtoDecoder implements InterfaceC31105CIr<RivalsListsData.BannerText> {
    public static RivalsListsData.BannerText LIZIZ(Q9H q9h) {
        RivalsListsData.BannerText bannerText = new RivalsListsData.BannerText();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        bannerText.title = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        bannerText.subTitle = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        bannerText.buttonText = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        bannerText.isMatchValid = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        bannerText.isInUiExp = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        bannerText.bannerStyle = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return bannerText;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RivalsListsData.BannerText LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
