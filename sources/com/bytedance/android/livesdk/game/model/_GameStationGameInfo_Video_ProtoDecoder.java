package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;

/* loaded from: classes16.dex */
public final class _GameStationGameInfo_Video_ProtoDecoder implements InterfaceC31105CIr<GameStationGameInfo.Video> {
    public static GameStationGameInfo.Video LIZIZ(Q9H q9h) {
        GameStationGameInfo.Video video = new GameStationGameInfo.Video();
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
                                video.duration = Double.longBitsToDouble(q9h.LJIIIZ());
                            }
                        } else {
                            video.cover = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        video.url = Q9J.LIZIZ(q9h);
                    }
                } else {
                    video.vid = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return video;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameStationGameInfo.Video LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}