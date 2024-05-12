package com.bytedance.android.livesdk.rank.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _RankEntranceV3Response_EntranceGroup_Data_ProtoDecoder implements InterfaceC31105CIr<RankEntranceV3Response.EntranceGroup.Data> {
    public static RankEntranceV3Response.EntranceGroup.Data LIZIZ(Q9H q9h) {
        RankEntranceV3Response.EntranceGroup.Data data = new RankEntranceV3Response.EntranceGroup.Data();
        data.tabs = new ArrayList();
        data.entrances = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        data.tabs.add(_RankTabInfo_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    data.entrances.add(_RankEntrance_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankEntranceV3Response.EntranceGroup.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
