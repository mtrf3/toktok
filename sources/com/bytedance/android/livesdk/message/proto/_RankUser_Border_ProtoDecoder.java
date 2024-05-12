package com.bytedance.android.livesdk.message.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._PrivilegeLogExtra_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto.RankUser;

/* loaded from: classes17.dex */
public final class _RankUser_Border_ProtoDecoder implements InterfaceC31105CIr<RankUser.Border> {
    public static RankUser.Border LIZIZ(Q9H q9h) {
        RankUser.Border border = new RankUser.Border();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        border.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        border.level = q9h.LJIIJJI();
                        break;
                    case 3:
                        border.source = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        border.profileDecorationRibbon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        border.borderPrivilegeLogExtra = _PrivilegeLogExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        border.profilePrivilegeLogExtra = _PrivilegeLogExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return border;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankUser.Border LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
