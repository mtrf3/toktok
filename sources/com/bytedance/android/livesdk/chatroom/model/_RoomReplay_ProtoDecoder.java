package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.replay.proto._SpriteImageItem_ProtoDecoder;
import com.bytedance.android.livesdk.replay.proto._VideoMetaInfo_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _RoomReplay_ProtoDecoder implements InterfaceC31105CIr<RoomReplay> {
    public static RoomReplay LIZIZ(Q9H q9h) {
        RoomReplay roomReplay = new RoomReplay();
        roomReplay.moments = new ArrayList();
        roomReplay.spriteList = new ArrayList();
        roomReplay.fragmentCountWithType = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        roomReplay.id = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        roomReplay.createTime = q9h.LJIIJJI();
                        break;
                    case 3:
                        roomReplay.finishTime = q9h.LJIIJJI();
                        break;
                    case 4:
                        roomReplay.momentGenStats = q9h.LJIIJJI();
                        break;
                    case 5:
                        roomReplay.pushStatus = q9h.LJIIJJI();
                        break;
                    case 6:
                        roomReplay.moments.add(_RoomReplayMoment_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 7:
                        roomReplay.available = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        roomReplay.cover = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        roomReplay.title = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        roomReplay.fragmentId = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        roomReplay.liveMode = q9h.LJIIJ();
                        break;
                    case 12:
                        roomReplay.playUrl = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        roomReplay.downloadUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 14:
                        roomReplay.fanTicket = q9h.LJIIJJI();
                        break;
                    case 15:
                        roomReplay.totalUser = q9h.LJIIJJI();
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        roomReplay.punishType = q9h.LJIIJJI();
                        break;
                    case 17:
                        roomReplay.fragmentCount = q9h.LJIIJJI();
                        break;
                    case 18:
                        roomReplay.markCount = q9h.LJIIJJI();
                        break;
                    case 19:
                        roomReplay.playUrlVcodec = Q9J.LIZIZ(q9h);
                        break;
                    case 20:
                        roomReplay.startTime = q9h.LJIIJJI();
                        break;
                    case 21:
                        roomReplay.failedReason = Q9J.LIZIZ(q9h);
                        break;
                    case 22:
                        roomReplay.generateDuration = q9h.LJIIJJI();
                        break;
                    case 23:
                        roomReplay.replayPrompt = q9h.LJIIJ();
                        break;
                    case 24:
                        roomReplay.status = q9h.LJIIJ();
                        break;
                    case 25:
                        roomReplay.m3u8Url = Q9J.LIZIZ(q9h);
                        break;
                    case 26:
                        roomReplay.videoInfo = _VideoInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 27:
                        roomReplay.watchStatus = q9h.LJIIJ();
                        break;
                    case 28:
                        roomReplay.vid = Q9J.LIZIZ(q9h);
                        break;
                    case 29:
                        roomReplay.fragmentCountWithType.add(_FragmentTypeCount_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 30:
                        roomReplay.mp4VideoMetaInfo = _VideoMetaInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 31:
                        roomReplay.spriteList.add(_SpriteImageItem_ProtoDecoder.LIZIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return roomReplay;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomReplay LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
