package com.bytedance.android.livesdk.model.message.linker.invite_message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model._Hashtag_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes14.dex */
public final class _InviterRivalExtra_ProtoDecoder implements InterfaceC31105CIr<InviterRivalExtra> {
    public static InviterRivalExtra LIZIZ(Q9H q9h) {
        InviterRivalExtra inviterRivalExtra = new InviterRivalExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        inviterRivalExtra.textType = (int) q9h.LJIIJJI();
                        break;
                    case 2:
                        inviterRivalExtra.text = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        inviterRivalExtra.label = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        inviterRivalExtra.userCount = (int) q9h.LJIIJJI();
                        break;
                    case 5:
                        inviterRivalExtra.avatarThumb = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        inviterRivalExtra.displayId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        inviterRivalExtra.authenticationInfo = _AuthenticationInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        inviterRivalExtra.nickname = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        inviterRivalExtra.followStatus = q9h.LJIIJJI();
                        break;
                    case 10:
                        inviterRivalExtra.mHashtag = _Hashtag_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 12:
                        inviterRivalExtra.userId = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        inviterRivalExtra.isBestTeammate = Q9J.LIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return inviterRivalExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final InviterRivalExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
