package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.JPy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49130JPy extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, C76800UCe> {
    public static final C49130JPy LJLIL = new C49130JPy();

    public C49130JPy() {
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
