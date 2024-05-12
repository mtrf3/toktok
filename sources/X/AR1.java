package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes5.dex */
public final class AR1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C45631qh LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ FrameLayout LJLJI;

    public AR1(C45631qh c45631qh, View view, FrameLayout frameLayout) {
        this.LJLIL = c45631qh;
        this.LJLILLLLZI = view;
        this.LJLJI = frameLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.LJLIL.removeOnLayoutChangeListener(this);
        if (this.LJLIL.canScrollVertically(1)) {
            this.LJLILLLLZI.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.LJLJI.getLayoutParams();
            layoutParams.height = C7MY.LIZIZ(70);
            this.LJLJI.setLayoutParams(layoutParams);
            return;
        }
        this.LJLILLLLZI.setVisibility(4);
    }
}
