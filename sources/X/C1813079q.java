package X;

import com.ss.android.ugc.now.interaction.api.LikeState;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.79q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1813079q extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractionBubbleListAssem, LikeState, C76800UCe> {
    public static final C1813079q LJLIL = new C1813079q();

    public C1813079q() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InteractionBubbleListAssem interactionBubbleListAssem, LikeState likeState) {
        InteractionBubbleListAssem selectSubscribe = interactionBubbleListAssem;
        LikeState likeState2 = likeState;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (likeState2 != null && !likeState2.isRefresh()) {
            C79146V4k.LJIJJLI(likeState2, ((C7ML) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid(), new AqS150S0200000_3(selectSubscribe, likeState2, 78));
        }
        return C76800UCe.LIZ;
    }
}
