package com.bytedance.android.livesdk.model;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _KaraokeSong_ProtoDecoder implements InterfaceC31105CIr<KaraokeSong> {
    public static KaraokeSong LIZIZ(Q9H q9h) {
        KaraokeSong karaokeSong = new KaraokeSong();
        karaokeSong.coverUrls = new ArrayList();
        karaokeSong.labelIds = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        karaokeSong.id = q9h.LJIIJJI();
                        break;
                    case 2:
                        karaokeSong.title = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        karaokeSong.displayArtist = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        karaokeSong.album = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        karaokeSong.duration = q9h.LJIIJ();
                        break;
                    case 6:
                        karaokeSong.prelude = q9h.LJIIJ();
                        break;
                    case 7:
                        karaokeSong.postlude = q9h.LJIIJ();
                        break;
                    case 8:
                        karaokeSong.coverVid = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        karaokeSong.coverUrls.add(Q9J.LIZIZ(q9h));
                        break;
                    case 10:
                        karaokeSong.audioInfo = _AudioStruct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        karaokeSong.accompanimentInfo = _AccompanimentStruct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        karaokeSong.lyricInfo = _LyricStruct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        karaokeSong.songStatus = q9h.LJIIJ();
                        break;
                    case 14:
                        C29991Fr.LIZ(q9h, karaokeSong.labelIds);
                        break;
                    case 15:
                        karaokeSong.isFavorite = Q9J.LIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        karaokeSong.isAdded = Q9J.LIZ(q9h);
                        break;
                    case 17:
                        karaokeSong.isRequest = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return karaokeSong;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final KaraokeSong LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
