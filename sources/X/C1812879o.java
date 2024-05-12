package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.api.PostActiveState;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.79o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1812879o extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractionBubbleListAssem, PostActiveState, C76800UCe> {
    public static final C1812879o LJLIL = new C1812879o();

    public C1812879o() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InteractionBubbleListAssem interactionBubbleListAssem, PostActiveState postActiveState) {
        String str;
        Aweme aweme;
        InteractionBubbleListAssem selectSubscribe = interactionBubbleListAssem;
        PostActiveState postActiveState2 = postActiveState;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (selectSubscribe.getContainerView().isShown() && postActiveState2 != null) {
            C7ML c7ml = (C7ML) C51029K0z.LJIILLIIL(selectSubscribe);
            if (c7ml != null && (aweme = c7ml.getAweme()) != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            C79146V4k.LJIJJLI(postActiveState2, str, new AqS150S0200000_3(selectSubscribe, postActiveState2, 76));
        }
        return C76800UCe.LIZ;
    }
}
