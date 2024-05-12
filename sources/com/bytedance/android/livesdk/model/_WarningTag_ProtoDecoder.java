package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _WarningTag_ProtoDecoder implements InterfaceC31105CIr<WarningTag> {
    public static WarningTag LIZIZ(Q9H q9h) {
        WarningTag warningTag = new WarningTag();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        warningTag.text = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        warningTag.duration = q9h.LJIIJJI();
                        break;
                    case 3:
                        warningTag.tagSource = q9h.LJIIJ();
                        break;
                    case 4:
                        warningTag.punishInfo = _PunishEventInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        warningTag.style = q9h.LJIIJ();
                        break;
                    case 6:
                        warningTag.detailUrl = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return warningTag;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final WarningTag LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}