package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._PrivilegeLogExtra_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _BorderInfo_ProtoDecoder implements InterfaceC31105CIr<BorderInfo> {
    public static BorderInfo LIZIZ(Q9H q9h) {
        BorderInfo borderInfo = new BorderInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        borderInfo.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        borderInfo.level = q9h.LJIIJJI();
                        break;
                    case 3:
                        borderInfo.source = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        borderInfo.profileDecorationRibbon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        borderInfo.borderLogExtra = _PrivilegeLogExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        borderInfo.ribbonLogExtra = _PrivilegeLogExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        borderInfo.avatarBackgroundColor = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        borderInfo.avatarBackgroundBorderColor = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return borderInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BorderInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
