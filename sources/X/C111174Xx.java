package X;

import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.o;

/* renamed from: X.4Xx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111174Xx extends AbstractC65781Prl implements InterfaceC88472Yns<C111154Xv, C76800UCe> {
    public static final C111174Xx LJLIL = new C111174Xx();

    public C111174Xx() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C111154Xv c111154Xv) {
        C018905p c018905p;
        C111154Xv viewScope = c111154Xv;
        o.LJIIIZ(viewScope, "$this$viewScope");
        TuxIconView tuxIconView = viewScope.LIZJ;
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        C018905p c018905p2 = null;
        if ((layoutParams instanceof C018905p) && (c018905p = (C018905p) layoutParams) != null) {
            c018905p.startToStart = -1;
            c018905p.endToEnd = 0;
            c018905p.topToTop = -1;
            c018905p.bottomToBottom = 0;
            ((ViewGroup.MarginLayoutParams) c018905p).width = C7MY.LIZIZ(24);
            ((ViewGroup.MarginLayoutParams) c018905p).height = C7MY.LIZIZ(24);
            c018905p2 = c018905p;
        }
        tuxIconView.setLayoutParams(c018905p2);
        C26338AVi.LJI(tuxIconView, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), AnonymousClass391.LIZJ(11), false, 19);
        return C76800UCe.LIZ;
    }
}
