package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import kotlin.jvm.internal.o;

/* renamed from: X.Ca5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31561Ca5 {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public final int LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final View LJI;

    public final void LIZ(boolean z) {
        int i;
        ViewGroup.LayoutParams layoutParams = this.LJI.getLayoutParams();
        if (this.LIZJ) {
            this.LIZ = this.LJI.getMeasuredWidth();
            this.LJFF.measure(0, 0);
            this.LIZIZ = this.LJFF.getMeasuredWidth();
            this.LIZJ = false;
        }
        if (z) {
            i = this.LIZ - (this.LIZIZ + this.LIZLLL);
        } else {
            i = -1;
        }
        layoutParams.width = i;
        C1CT c1ct = new C1CT();
        C1CR c1cr = new C1CR();
        c1cr.LJLJJLL.add(this.LJI);
        c1cr.LJLJJLL.add(this.LJFF);
        c1ct.LJJIJL(c1cr);
        c1ct.LJJIIJZLJL(new AccelerateInterpolator());
        c1ct.LJJIII(300L);
        View view = this.LJ;
        if (view != null) {
            C03510Bv.LIZ((ViewGroup) view, c1ct);
            this.LJI.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public C31561Ca5(Context context, View root, View hideButton, View searchContainer) {
        o.LJIIIZ(root, "root");
        o.LJIIIZ(hideButton, "hideButton");
        o.LJIIIZ(searchContainer, "searchContainer");
        this.LJ = root;
        this.LJFF = hideButton;
        this.LJI = searchContainer;
        this.LIZJ = true;
        this.LIZLLL = (int) C74275TDb.LIZIZ(context, 16);
    }
}
