package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HcE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44434HcE implements C15X {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C82622Wbi LJLJI;
    public final /* synthetic */ ViewGroup LJLJJI;

    public C44434HcE(Context context, boolean z, C82622Wbi c82622Wbi, ViewGroup viewGroup) {
        this.LJLIL = context;
        this.LJLILLLLZI = z;
        this.LJLJI = c82622Wbi;
        this.LJLJJI = viewGroup;
    }

    @Override // X.C15X
    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        int i2;
        o.LJIIIZ(view, "view");
        View findViewById = view.findViewById(R.id.j53);
        int LJFF = C81184Vtc.LJFF(this.LJLIL);
        View findViewById2 = view.findViewById(R.id.iaz);
        if (this.LJLILLLLZI) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        findViewById2.setVisibility(i2);
        C44432HcC.LIZ(this.LJLIL.getResources().getDimensionPixelSize(R.dimen.a6f) + LJFF, findViewById2);
        C44432HcC.LIZ(this.LJLIL.getResources().getDimensionPixelSize(R.dimen.a6d) + LJFF, findViewById);
        C44432HcC.LIZ(this.LJLIL.getResources().getDimensionPixelSize(R.dimen.a6d) + LJFF, view.findViewById(R.id.ej6));
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = (ViewOnTouchListenerC82377WUr) view.findViewById(R.id.ioq);
        viewOnTouchListenerC82377WUr.setObjectContainer(this.LJLJI);
        View findViewById3 = view.findViewById(R.id.bih);
        view.findViewById(R.id.bif);
        view.findViewById(R.id.big);
        ViewGroup.LayoutParams layoutParams = viewOnTouchListenerC82377WUr.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = findViewById3.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        if (AnonymousClass668.LIZ()) {
            boolean LJIILIIL = C157226Fa.LIZ.LJIILIIL();
            layoutParams2.bottomMargin = SFS.LJI(40.0d) + C1549666i.LIZ(LJIILIIL);
            layoutParams4.bottomMargin = SFS.LJI(40.0d) + C1549666i.LIZ(LJIILIIL);
        } else {
            int LJIIIZ = C157236Fb.LIZ.LJIIIZ();
            if (LJIIIZ != 1 && LJIIIZ != 2 && LJIIIZ != 4 && LJIIIZ != 5) {
                layoutParams2.bottomMargin = SFS.LJI(40.0d);
                layoutParams4.bottomMargin = SFS.LJI(40.0d);
            } else {
                layoutParams2.bottomMargin = SFS.LJI(40.0d) + SFS.LJI(33.0d);
                layoutParams4.bottomMargin = SFS.LJI(40.0d) + SFS.LJI(33.0d);
            }
        }
        viewOnTouchListenerC82377WUr.setLayoutParams(layoutParams2);
        findViewById3.setLayoutParams(layoutParams4);
        findViewById3.bringToFront();
        if (C44432HcC.LJLIL) {
            this.LJLJJI.addView(view);
        }
    }
}
