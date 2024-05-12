package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._StarCommentMessage_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _StarCommentItem_ProtoDecoder implements InterfaceC31105CIr<StarCommentItem> {
    public static StarCommentItem LIZIZ(Q9H q9h) {
        StarCommentItem starCommentItem = new StarCommentItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        starCommentItem.starComment = _StarCommentMessage_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        starCommentItem.coins = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        starCommentItem.roomUserCount = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        starCommentItem.forceInsert = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        starCommentItem.startCommentStatus = q9h.LJIIJ();
                        break;
                    case 6:
                        starCommentItem.serverToShowTimestampMs = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return starCommentItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StarCommentItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
