package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class _AnchorReplayInfoData_ProtoDecoder implements InterfaceC31105CIr<AnchorReplayInfoData> {
    public static AnchorReplayInfoData LIZIZ(Q9H q9h) {
        AnchorReplayInfoData anchorReplayInfoData = new AnchorReplayInfoData();
        anchorReplayInfoData.replays = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                anchorReplayInfoData.nextOffset = q9h.LJIIJJI();
                            }
                        } else {
                            anchorReplayInfoData.hasMore = Q9J.LIZ(q9h);
                        }
                    } else {
                        anchorReplayInfoData.style = q9h.LJIIJ();
                    }
                } else {
                    anchorReplayInfoData.replays.add(_RoomReplay_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorReplayInfoData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorReplayInfoData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
