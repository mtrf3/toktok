package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _CommunityDetail_ProtoDecoder implements InterfaceC31105CIr<CommunityDetail> {
    public static CommunityDetail LIZIZ(Q9H q9h) {
        CommunityDetail communityDetail = new CommunityDetail();
        communityDetail.communityContentList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        communityDetail.auditStatus = q9h.LJIIJ();
                    }
                } else {
                    communityDetail.communityContentList.add(_CommunityContent_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return communityDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CommunityDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
