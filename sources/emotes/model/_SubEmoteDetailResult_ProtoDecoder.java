package emotes.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.emoji._EmoteConfig_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._PrivateEmoteDetail_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _SubEmoteDetailResult_ProtoDecoder implements InterfaceC31105CIr<SubEmoteDetailResult> {
    public static SubEmoteDetailResult LIZIZ(Q9H q9h) {
        SubEmoteDetailResult subEmoteDetailResult = new SubEmoteDetailResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        subEmoteDetailResult.stableEmoteDetail = _EmoteListResult_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        subEmoteDetailResult.currentEmoteDetail = _EmoteListResult_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        subEmoteDetailResult.emoteConfig = _EmoteConfig_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        subEmoteDetailResult.currentState = q9h.LJIIJ();
                        break;
                    case 5:
                        subEmoteDetailResult.emotesShowStyle = q9h.LJIIJ();
                        break;
                    case 6:
                        subEmoteDetailResult.privateEmoteDetail = _PrivateEmoteDetail_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return subEmoteDetailResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubEmoteDetailResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
