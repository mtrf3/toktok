package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.79l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1812579l extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractionBubbleListAssem, Boolean, C76800UCe> {
    public static final C1812579l LJLIL = new C1812579l();

    public C1812579l() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InteractionBubbleListAssem interactionBubbleListAssem, Boolean bool) {
        Aweme aweme;
        Aweme aweme2;
        InteractionBubbleListAssem selectSubscribe = interactionBubbleListAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        String str = null;
        if (booleanValue) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("visible ");
            C7ML c7ml = (C7ML) C51029K0z.LJIILLIIL(selectSubscribe);
            if (c7ml != null && (aweme2 = c7ml.getAweme()) != null) {
                str = aweme2.getAid();
            }
            LIZ.append(str);
            C71Y.LIZ("interactionBubble", X1D.LIZIZ(LIZ));
            selectSubscribe.z4();
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("invisible ");
            C7ML c7ml2 = (C7ML) C51029K0z.LJIILLIIL(selectSubscribe);
            if (c7ml2 != null && (aweme = c7ml2.getAweme()) != null) {
                str = aweme.getAid();
            }
            LIZ2.append(str);
            C71Y.LIZ("interactionBubble", X1D.LIZIZ(LIZ2));
            selectSubscribe.p4().LJLLLLLL();
        }
        return C76800UCe.LIZ;
    }
}
