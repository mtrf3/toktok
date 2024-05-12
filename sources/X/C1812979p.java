package X;

import com.ss.android.ugc.now.interaction.api.CommentDeleteState;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.79p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1812979p extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractionBubbleListAssem, CommentDeleteState, C76800UCe> {
    public static final C1812979p LJLIL = new C1812979p();

    public C1812979p() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InteractionBubbleListAssem interactionBubbleListAssem, CommentDeleteState commentDeleteState) {
        InteractionBubbleListAssem selectSubscribe = interactionBubbleListAssem;
        CommentDeleteState commentDeleteState2 = commentDeleteState;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (commentDeleteState2 != null) {
            C79146V4k.LJIJJLI(commentDeleteState2, ((C7ML) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid(), new AqS150S0200000_3(commentDeleteState2, selectSubscribe, 80));
        }
        return C76800UCe.LIZ;
    }
}
