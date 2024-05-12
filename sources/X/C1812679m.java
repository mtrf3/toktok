package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem;
import com.ss.android.ugc.now.interaction.assem.InteractionSyncVM;
import kotlin.jvm.internal.o;

/* renamed from: X.79m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1812679m extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractionBubbleListAssem, C43I<? extends Long>, C76800UCe> {
    public static final C1812679m LJLIL = new C1812679m();

    public C1812679m() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InteractionBubbleListAssem interactionBubbleListAssem, C43I<? extends Long> c43i) {
        String str;
        boolean z;
        Aweme aweme;
        Aweme aweme2;
        C7ML c7ml;
        Aweme aweme3;
        InteractionBubbleListAssem selectSubscribe = interactionBubbleListAssem;
        C43I<? extends Long> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            long longValue = ((Number) c43i2.LIZ).longValue();
            if (longValue == 0 && (c7ml = (C7ML) C51029K0z.LJIILLIIL(selectSubscribe)) != null && (aweme3 = c7ml.getAweme()) != null && aweme3.isLike()) {
                longValue = 1;
            }
            InteractionSyncVM q4 = selectSubscribe.q4();
            C7ML c7ml2 = (C7ML) C51029K0z.LJIILLIIL(selectSubscribe);
            if (c7ml2 == null || (aweme2 = c7ml2.getAweme()) == null || (str = aweme2.getAid()) == null) {
                str = "";
            }
            C7ML c7ml3 = (C7ML) C51029K0z.LJIILLIIL(selectSubscribe);
            if (c7ml3 != null && (aweme = c7ml3.getAweme()) != null) {
                z = aweme.isLike();
            } else {
                z = false;
            }
            q4.Ss0(longValue, z, true, str);
        }
        return C76800UCe.LIZ;
    }
}
