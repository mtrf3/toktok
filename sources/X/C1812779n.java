package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem;
import com.ss.android.ugc.now.interaction.assem.InteractionSyncVM;
import kotlin.jvm.internal.o;

/* renamed from: X.79n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1812779n extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractionBubbleListAssem, C43I<? extends Long>, C76800UCe> {
    public static final C1812779n LJLIL = new C1812779n();

    public C1812779n() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InteractionBubbleListAssem interactionBubbleListAssem, C43I<? extends Long> c43i) {
        String str;
        Aweme aweme;
        InteractionBubbleListAssem selectSubscribe = interactionBubbleListAssem;
        C43I<? extends Long> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            long longValue = ((Number) c43i2.LIZ).longValue();
            InteractionSyncVM q4 = selectSubscribe.q4();
            C7ML c7ml = (C7ML) C51029K0z.LJIILLIIL(selectSubscribe);
            if (c7ml == null || (aweme = c7ml.getAweme()) == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            q4.d6(longValue, str);
        }
        return C76800UCe.LIZ;
    }
}
