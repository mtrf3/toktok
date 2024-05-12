package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.TextEffect;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _TextEffect_Detail_ProtoDecoder implements InterfaceC31105CIr<TextEffect.Detail> {
    public static TextEffect.Detail LIZIZ(Q9H q9h) {
        TextEffect.Detail detail = new TextEffect.Detail();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        detail.text = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        detail.textFontSize = q9h.LJIIJ();
                        break;
                    case 3:
                        detail.background = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        detail.start = q9h.LJIIJ();
                        break;
                    case 5:
                        detail.duration = q9h.LJIIJ();
                        break;
                    case 6:
                        detail.x = q9h.LJIIJ();
                        break;
                    case 7:
                        detail.y = q9h.LJIIJ();
                        break;
                    case 8:
                        detail.width = q9h.LJIIJ();
                        break;
                    case 9:
                        detail.height = q9h.LJIIJ();
                        break;
                    case 10:
                        detail.shadowDx = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        detail.shadowDy = q9h.LJIIJ();
                        break;
                    case 12:
                        detail.shadowRadius = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        detail.shadowColor = Q9J.LIZIZ(q9h);
                        break;
                    case 14:
                        detail.strokeColor = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        detail.strokeWidth = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return detail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TextEffect.Detail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
