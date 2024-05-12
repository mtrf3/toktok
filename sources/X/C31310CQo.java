package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.CommentQualityScore;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CQo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31310CQo extends AbstractC31313CQr<ChatMessage> {
    public static final C31310CQo LIZJ = new C31310CQo();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        ChatMessage t = (ChatMessage) obj;
        o.LJIIIZ(t, "t");
        return t.userInfo;
    }

    @Override // X.AbstractC31313CQr
    public final boolean LIZLLL(CQQ publicScreenContext, CR6 t) {
        o.LJIIIZ(t, "t");
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        return !LJ(t, publicScreenContext.LJII);
    }

    @Override // X.AbstractC31313CQr
    public final boolean LJIIIZ(CR6 t, boolean z) {
        o.LJIIIZ(t, "t");
        if (t.isHistoryMessage) {
            return false;
        }
        return super.LJIIIZ(t, z);
    }

    @Override // X.AbstractC31313CQr
    public final boolean LIZJ(User user, boolean z, ChatMessage chatMessage) {
        ChatMessage t = chatMessage;
        o.LJIIIZ(t, "t");
        if (CMU.LIZ.contains(Long.valueOf(t.chatId))) {
            return true;
        }
        if (t.isHistoryMessage) {
            return false;
        }
        return super.LIZJ(user, z, t);
    }

    @Override // X.AbstractC31313CQr
    public final long LIZIZ(ChatMessage chatMessage, boolean z, boolean z2, CommonMessageData commonMessageData) {
        List list;
        List<CommentQualityScore> list2;
        CommentQualityScore commentQualityScore;
        ChatMessage message = chatMessage;
        o.LJIIIZ(message, "message");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || (list = room.rankCommentGroups) == null) {
            list = C61878OQg.INSTANCE;
        }
        if (z && !z2 && (!list.isEmpty()) && (list2 = message.commentQualityScores) != null) {
            if (!list2.isEmpty()) {
                HashMap hashMap = new HashMap();
                List<CommentQualityScore> list3 = message.commentQualityScores;
                if (list3 != null) {
                    int size = list3.size();
                    for (int i = 0; i < size; i++) {
                        CommentQualityScore commentQualityScore2 = (CommentQualityScore) ListProtector.get(list3, i);
                        hashMap.put(commentQualityScore2.version, commentQualityScore2);
                    }
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i2 = size2 - 1;
                            Object obj = ListProtector.get(list, size2);
                            if (hashMap.containsKey(obj) && (commentQualityScore = (CommentQualityScore) hashMap.get(obj)) != null) {
                                return commentQualityScore.score;
                            }
                            if (i2 < 0) {
                                break;
                            }
                            size2 = i2;
                        }
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        return super.LIZIZ(message, z, z2, commonMessageData);
    }
}
