package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N7X extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup.LayoutParams, C76800UCe> {
    public static final N7X LJLIL = new N7X();

    public N7X() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams updateLayoutParams = layoutParams;
        o.LJIIIZ(updateLayoutParams, "$this$updateLayoutParams");
        updateLayoutParams.width = (int) C78886Uxe.LJIIZILJ(160);
        updateLayoutParams.height = (int) C78886Uxe.LJIIZILJ(36);
        return C76800UCe.LIZ;
    }
}
