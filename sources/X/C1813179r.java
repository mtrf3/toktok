package X;

import com.ss.android.ugc.now.interaction.api.CommentPublishState;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.79r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1813179r extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractionBubbleListAssem, CommentPublishState, C76800UCe> {
    public static final C1813179r LJLIL = new C1813179r();

    public C1813179r() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InteractionBubbleListAssem interactionBubbleListAssem, CommentPublishState commentPublishState) {
        InteractionBubbleListAssem selectSubscribe = interactionBubbleListAssem;
        CommentPublishState commentPublishState2 = commentPublishState;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (commentPublishState2 != null) {
            C79146V4k.LJIJJLI(commentPublishState2, ((C7ML) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid(), new AqS150S0200000_3(commentPublishState2, selectSubscribe, 79));
        }
        return C76800UCe.LIZ;
    }
}
