package X;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout$DrawerListener;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BUB implements DrawerLayout$DrawerListener {
    public final /* synthetic */ BUC LIZ;

    @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public final void onDrawerSlide(View view, float f) {
        o.LJIIIZ(view, "view");
    }

    public BUB(BUC buc) {
        this.LIZ = buc;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public final void onDrawerClosed(View view) {
        o.LJIIIZ(view, "view");
        this.LIZ.LJLJJI = false;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public final void onDrawerOpened(View view) {
        o.LJIIIZ(view, "view");
        this.LIZ.LJLJJI = true;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public final void onDrawerStateChanged(int i) {
        this.LIZ.getClass();
    }
}
