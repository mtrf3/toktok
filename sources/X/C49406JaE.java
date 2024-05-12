package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.JaE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49406JaE extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, C76800UCe> {
    public static final C49406JaE LJLIL = new C49406JaE();

    public C49406JaE() {
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
