package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _RankListV2Response_BulletinLoop_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.BulletinLoop> {
    public static RankListV2Response.BulletinLoop LIZIZ(Q9H q9h) {
        RankListV2Response.BulletinLoop bulletinLoop = new RankListV2Response.BulletinLoop();
        bulletinLoop.bulletins = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bulletinLoop.bulletins.add(_RankListV2Response_Bulletin_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return bulletinLoop;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.BulletinLoop LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
