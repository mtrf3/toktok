package X;

import Y.ACListenerS34S0100000_14;
import Y.AfS66S0100000_14;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WPy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82254WPy implements WQA {
    public View.OnClickListener LIZ;
    public View LIZIZ;
    public final Object LIZJ;
    public final C73318Sq2 LIZLLL;
    public final Context LJ;
    public final WQ1 LJFF;

    @Override // X.WQA
    public final void LIZ() {
        FrameLayout frameLayout = new FrameLayout(this.LJ);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJ), R.layout.k8, this.LJFF.LJFF(), false);
        o.LJI(LLLLIILL);
        frameLayout.addView(LLLLIILL, new FrameLayout.LayoutParams(-2, -2, 17));
        this.LIZIZ = frameLayout;
        this.LJFF.LJIIJ(frameLayout, this.LIZJ);
        this.LIZLLL.LIZ(this.LJFF.LJIIJJI().LJJJLIIL(new AfS66S0100000_14(this, 47), C73674Svm.LJ));
    }

    @Override // X.WQA
    public final void LIZIZ(ACListenerS34S0100000_14 aCListenerS34S0100000_14) {
        this.LIZ = aCListenerS34S0100000_14;
    }

    public C82254WPy(Context context, WQ1 tabListView) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(tabListView, "tabListView");
        this.LJ = context;
        this.LJFF = tabListView;
        this.LIZJ = new Object();
        this.LIZLLL = new C73318Sq2();
    }
}
