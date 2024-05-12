package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JRD extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, C76800UCe> {
    public static final JRD LJLIL = new JRD();

    public JRD() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ViewGroup viewGroup) {
        ViewGroup scrollToOpenLayout = viewGroup;
        o.LJIIIZ(scrollToOpenLayout, "scrollToOpenLayout");
        scrollToOpenLayout.requestDisallowInterceptTouchEvent(true);
        return C76800UCe.LIZ;
    }
}
