package X;

import X.C80217Ve1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public abstract class VTL<T extends C80217Ve1> extends C45621qg {
    public boolean LLFII;
    public int LLFZ;
    public boolean LLI;
    public T LLIFFJFJJ;
    public C80221Ve5 LLII;
    public C011902x LLIIII;

    public abstract int getLayoutIntRes();

    public abstract void setScrollEnable(boolean z);

    public final T getAppBarLayout() {
        return this.LLIFFJFJJ;
    }

    public final C80221Ve5 getCollapsingToolbarLayout() {
        return this.LLII;
    }

    public final C011902x getFoldToolBar() {
        return this.LLIIII;
    }

    public final T getMAppBarLayout() {
        return this.LLIFFJFJJ;
    }

    public final C80221Ve5 getMCollapsingToolbarLayout() {
        return this.LLII;
    }

    public final C011902x getMFoldToolBar() {
        return this.LLIIII;
    }

    public final int getMInitScrollFlag() {
        return this.LLFZ;
    }

    public final boolean getMScrollEnable() {
        return this.LLFII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VTL(Context context) {
        super(context, null);
        o.LJIIJ(context, "context");
        this.LLFII = true;
        View inflate = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), getLayoutIntRes(), this, true);
        View findViewById = findViewById(R.id.a6n);
        o.LJFF(findViewById, "findViewById(R.id.app_bar_layout)");
        this.LLIFFJFJJ = (T) findViewById;
        View findViewById2 = findViewById(R.id.bgx);
        o.LJFF(findViewById2, "findViewById(R.id.collapsing_toolbar_layout)");
        this.LLII = (C80221Ve5) findViewById2;
        View findViewById3 = findViewById(R.id.nkd);
        o.LJFF(findViewById3, "findViewById(R.id.x_fold_toolbar)");
        this.LLIIII = (C011902x) findViewById3;
        o.LJFF(inflate, "inflate");
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = this.LLII.getLayoutParams();
        if (layoutParams instanceof C80218Ve2) {
            this.LLFZ = ((C80218Ve2) layoutParams).LIZ;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r1.getTopAndBottomOffset() == 0) goto L15;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean canScrollVertically(int r3) {
        /*
            r2 = this;
            T extends X.Ve1 r0 = r2.LLIFFJFJJ
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L3a
            X.06F r0 = (X.C06F) r0
            X.06C r1 = r0.LIZ
            boolean r0 = r2.LLI
            if (r0 == 0) goto L14
            boolean r0 = r1 instanceof com.google.android.material.appbar.AppBarLayout$Behavior
            if (r0 != 0) goto L19
        L14:
            boolean r0 = super.canScrollVertically(r3)
            return r0
        L19:
            X.Vdy r1 = (X.C80214Vdy) r1
            int r0 = r1.getTopAndBottomOffset()
            if (r0 < 0) goto L29
            if (r3 <= 0) goto L2b
            int r0 = r1.getTopAndBottomOffset()
            if (r0 != 0) goto L35
        L29:
            r0 = 1
        L2a:
            return r0
        L2b:
            if (r3 >= 0) goto L35
            int r0 = r1.getTopAndBottomOffset()
            if (r0 != 0) goto L35
            r0 = 0
            goto L2a
        L35:
            boolean r0 = super.canScrollVertically(r3)
            goto L2a
        L3a:
            X.Eqm r1 = new X.Eqm
            java.lang.String r0 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VTL.canScrollVertically(int):boolean");
    }

    public final void setCompatContainerPopup(boolean z) {
        this.LLI = z;
    }

    public final void setMAppBarLayout(T t) {
        o.LJIIJ(t, "<set-?>");
        this.LLIFFJFJJ = t;
    }

    public final void setMCollapsingToolbarLayout(C80221Ve5 c80221Ve5) {
        o.LJIIJ(c80221Ve5, "<set-?>");
        this.LLII = c80221Ve5;
    }

    public final void setMFoldToolBar(C011902x c011902x) {
        o.LJIIJ(c011902x, "<set-?>");
        this.LLIIII = c011902x;
    }

    public final void setMInitScrollFlag(int i) {
        this.LLFZ = i;
    }

    public final void setMScrollEnable(boolean z) {
        this.LLFII = z;
    }
}
