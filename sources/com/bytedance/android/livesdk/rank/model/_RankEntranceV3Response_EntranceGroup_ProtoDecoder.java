package com.bytedance.android.livesdk.rank.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;

/* loaded from: classes6.dex */
public final class _RankEntranceV3Response_EntranceGroup_ProtoDecoder implements InterfaceC31105CIr<RankEntranceV3Response.EntranceGroup> {
    public static RankEntranceV3Response.EntranceGroup LIZIZ(Q9H q9h) {
        RankEntranceV3Response.EntranceGroup entranceGroup = new RankEntranceV3Response.EntranceGroup();
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
                                    entranceGroup.animationLoopForOff = Q9J.LIZ(q9h);
                                }
                            } else {
                                entranceGroup.loop = Q9J.LIZ(q9h);
                            }
                        } else {
                            entranceGroup.priority = q9h.LJIIJJI();
                        }
                    } else {
                        entranceGroup.data = _RankEntranceV3Response_EntranceGroup_Data_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    entranceGroup.groupType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return entranceGroup;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankEntranceV3Response.EntranceGroup LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
