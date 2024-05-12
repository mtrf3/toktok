package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LC6 implements Runnable {
    public final /* synthetic */ TuxTextView LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ TuxTextView LJLJLJ;
    public final /* synthetic */ ViewGroup LJLJLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public LC6(TuxTextView tuxTextView, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, float f, float f2, int i, int i2, boolean z, TuxTextView tuxTextView2, ViewGroup viewGroup) {
        this.LJLIL = tuxTextView;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = f;
        this.LJLJJI = f2;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
        this.LJLJL = z;
        this.LJLJLJ = tuxTextView2;
        this.LJLJLLL = viewGroup;
    }

    public final void LIZ() {
        Object parent = this.LJLIL.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        int width = ((View) parent).getWidth();
        if (width <= 0) {
            InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(0);
                return;
            }
            return;
        }
        C56K c56k = new C56K();
        c56k.element = this.LJLJI;
        C56K c56k2 = new C56K();
        float f = this.LJLJJI;
        c56k2.element = f;
        float f2 = this.LJLJI;
        int i = this.LJLJJL;
        if (f2 + f + i + this.LJLJJLL > width) {
            if (this.LJLJL) {
                c56k.element = Math.min(Math.max(((width - i) - r1) - f, LC5.LIZ), this.LJLJI);
                TuxTextView tuxTextView = this.LJLIL;
                ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                layoutParams.width = (int) c56k.element;
                tuxTextView.setLayoutParams(layoutParams);
                c56k2.element = ((width - this.LJLJJLL) - this.LJLJJL) - c56k.element;
                TuxTextView tuxTextView2 = this.LJLJLJ;
                ViewGroup.LayoutParams layoutParams2 = tuxTextView2.getLayoutParams();
                layoutParams2.width = (int) c56k2.element;
                tuxTextView2.setLayoutParams(layoutParams2);
            } else {
                c56k2.element = Math.min(Math.max(((width - r1) - i) - f2, LC5.LIZ), this.LJLJJI);
                TuxTextView tuxTextView3 = this.LJLJLJ;
                ViewGroup.LayoutParams layoutParams3 = tuxTextView3.getLayoutParams();
                layoutParams3.width = (int) c56k2.element;
                tuxTextView3.setLayoutParams(layoutParams3);
                c56k.element = ((width - this.LJLJJLL) - this.LJLJJL) - c56k2.element;
                TuxTextView tuxTextView4 = this.LJLIL;
                ViewGroup.LayoutParams layoutParams4 = tuxTextView4.getLayoutParams();
                layoutParams4.width = (int) c56k.element;
                tuxTextView4.setLayoutParams(layoutParams4);
            }
        }
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null) {
            viewGroup.post(new LC7(this.LJLILLLLZI, c56k, c56k2, this.LJLJJL, this.LJLJJLL));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
