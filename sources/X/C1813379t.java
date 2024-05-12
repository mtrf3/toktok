package X;

import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.79t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1813379t extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractionBubbleListAssem, Boolean, C76800UCe> {
    public static final C1813379t LJLIL = new C1813379t();

    public C1813379t() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InteractionBubbleListAssem interactionBubbleListAssem, Boolean bool) {
        InteractionBubbleListAssem selectSubscribe = interactionBubbleListAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            selectSubscribe.z4();
        } else {
            selectSubscribe.p4().LJLLLLLL();
        }
        return C76800UCe.LIZ;
    }
}
