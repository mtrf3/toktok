package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _AudienceRoomTasksResponse_ProtoDecoder implements InterfaceC31105CIr<AudienceRoomTasksResponse> {
    @Override // X.InterfaceC31105CIr
    public final AudienceRoomTasksResponse LIZ(Q9H q9h) {
        AudienceRoomTasksResponse audienceRoomTasksResponse = new AudienceRoomTasksResponse();
        audienceRoomTasksResponse.gameTasks = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 3) {
                        if (LJI != 4) {
                            if (LJI != 5) {
                                Q9J.LIZJ(q9h);
                            } else {
                                audienceRoomTasksResponse.downloadedCount = q9h.LJIIJJI();
                            }
                        } else {
                            audienceRoomTasksResponse.dropsId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        audienceRoomTasksResponse.info = _UserInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    audienceRoomTasksResponse.gameTasks.add(_BriefGameTask_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return audienceRoomTasksResponse;
            }
        }
    }
}
