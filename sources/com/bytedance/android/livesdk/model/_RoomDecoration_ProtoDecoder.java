package com.bytedance.android.livesdk.model;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _RoomDecoration_ProtoDecoder implements InterfaceC31105CIr<RoomDecoration> {
    public static RoomDecoration LIZIZ(Q9H q9h) {
        RoomDecoration roomDecoration = new RoomDecoration();
        roomDecoration.inputRect = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        roomDecoration.id = q9h.LJIIJJI();
                        break;
                    case 2:
                        roomDecoration.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        roomDecoration.type = (int) q9h.LJIIJJI();
                        break;
                    case 4:
                        C29991Fr.LIZ(q9h, roomDecoration.inputRect);
                        break;
                    case 5:
                        roomDecoration.textSize = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        roomDecoration.textColor = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        roomDecoration.content = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        roomDecoration.maxLength = q9h.LJIIJJI();
                        break;
                    case 9:
                        roomDecoration.status = q9h.LJIIJJI();
                        break;
                    case 10:
                        roomDecoration.screenHeight = (int) q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        roomDecoration.x = (int) q9h.LJIIJJI();
                        break;
                    case 12:
                        roomDecoration.screenWidth = (int) q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        roomDecoration.y = (int) q9h.LJIIJJI();
                        break;
                    case 14:
                        roomDecoration.kind = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return roomDecoration;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomDecoration LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
