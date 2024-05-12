package X;

import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleCommonCell;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDmReplyCell;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.model.StoryInteraction;
import com.ss.android.ugc.aweme.story.model.StoryInteractionUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.79Y, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C79Y extends C79Q {
    public final C62822Ol8 LJLJJLL;

    @Override // X.C79Q
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.C79Q
    public final boolean LJI() {
        return false;
    }

    @Override // X.C79Q
    public final void LJFF() {
        this.LJLIL.LLLF.LJZL(ReactionBubbleCommonCell.class, ReactionBubbleDmReplyCell.class);
    }

    @Override // X.C79Q
    public final void LJ(InterfaceC67352kd<? super A2G<C1809378f>> continuation) {
        o.LJIIIZ(continuation, "continuation");
        XKX.LIZLLL((InterfaceC70422pa) this.LJLJJLL.getValue(), null, null, new C181887Bw(this, continuation, new C1809378f(4, new PaginationCursor(0L, 0L)), null), 3);
    }

    public final List<InterfaceC57784Mm4> LJIIIIZZ(List<StoryInteractionUser> list) {
        StoryInteraction storyInteraction;
        InterfaceC57784Mm4 c1811078w;
        ArrayList arrayList = new ArrayList();
        for (StoryInteractionUser storyInteractionUser : list) {
            User user = storyInteractionUser.getUser();
            if (user != null && (storyInteraction = storyInteractionUser.getStoryInteraction()) != null) {
                int type = storyInteraction.getType();
                if (type != 1) {
                    if (type != 2) {
                        if (type == 3) {
                            c1811078w = new C1811078w(user, C61878OQg.INSTANCE, storyInteraction.getEmojiContent(), "emoji", this.LJLIL.getMMobEventParam());
                        }
                    } else {
                        c1811078w = new C1811078w(user, C47261Igj.LJJIJ(1001), "like", this.LJLIL.getMMobEventParam());
                    }
                } else {
                    String messageContent = storyInteraction.getMessageContent();
                    String conversationId = storyInteraction.getConversationId();
                    long messageId = storyInteraction.getMessageId();
                    if (C78857UxB.LJJJIL(messageContent)) {
                        c1811078w = new C79X(user, conversationId, messageId, messageContent, this.LJLIL.getMMobEventParam());
                    } else {
                        c1811078w = new C1811078w(user, C47261Igj.LJJIJ(1003), "reply", this.LJLIL.getMMobEventParam());
                    }
                }
                arrayList.add(c1811078w);
            }
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79Y(C79V commentBubbleList, C79S params) {
        super(commentBubbleList);
        o.LJIIIZ(commentBubbleList, "commentBubbleList");
        o.LJIIIZ(params, "params");
        this.LJLJJLL = C221108m2.LIZIZ(C181617Av.LJLIL);
    }

    @Override // X.C79Q
    public final void LIZLLL(InterfaceC67352kd<? super A2G<C1809378f>> continuation, C1809378f params) {
        o.LJIIIZ(continuation, "continuation");
        o.LJIIIZ(params, "params");
        XKX.LIZLLL((InterfaceC70422pa) this.LJLJJLL.getValue(), null, null, new C181887Bw(this, continuation, params, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8 A[Catch: all -> 0x0107, TryCatch #0 {all -> 0x0107, blocks: (B:11:0x00ae, B:12:0x00b1, B:13:0x00c2, B:15:0x00c8, B:17:0x00d4, B:21:0x00df, B:23:0x00f0, B:25:0x0102), top: B:10:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.util.List<com.ss.android.ugc.aweme.story.model.StoryInteractionUser> r22, X.InterfaceC67352kd<? super java.util.List<com.ss.android.ugc.aweme.story.model.StoryInteractionUser>> r23) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79Y.LJII(java.util.List, X.2kd):java.lang.Object");
    }
}
