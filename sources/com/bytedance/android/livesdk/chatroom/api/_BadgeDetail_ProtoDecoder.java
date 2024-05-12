package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _BadgeDetail_ProtoDecoder implements InterfaceC31105CIr<BadgeDetail> {
    public static BadgeDetail LIZIZ(Q9H q9h) {
        BadgeDetail badgeDetail = new BadgeDetail();
        badgeDetail.previewList = new ArrayList();
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
                                    badgeDetail.exist = Q9J.LIZ(q9h);
                                }
                            } else {
                                badgeDetail.badgeDescAuditStatus = q9h.LJIIJ();
                            }
                        } else {
                            badgeDetail.badgeAbbrAuditStatus = q9h.LJIIJ();
                        }
                    } else {
                        badgeDetail.previewList.add(_BadgePreview_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    badgeDetail.badge = _Badge_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return badgeDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BadgeDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
