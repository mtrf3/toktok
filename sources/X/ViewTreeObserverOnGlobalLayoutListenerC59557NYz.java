package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.o;

/* renamed from: X.NYz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC59557NYz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver LJLIL;
    public final /* synthetic */ C59556NYy LJLILLLLZI;
    public final /* synthetic */ ViewPager LJLJI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.LJLIL.isAlive()) {
            this.LJLIL.removeOnGlobalLayoutListener(this);
            C59556NYy c59556NYy = this.LJLILLLLZI;
            ViewPager viewPager = this.LJLJI;
            View view = c59556NYy.LJLILLLLZI;
            if (view != null) {
                c59556NYy.getClass();
                if (viewPager != null) {
                    c59556NYy.LIZ(0.0f, viewPager.getCurrentItem(), view);
                    return;
                }
                return;
            }
            o.LJIJI("indicator");
            throw null;
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC59557NYz(ViewTreeObserver viewTreeObserver, C59556NYy c59556NYy, ViewPager viewPager) {
        this.LJLIL = viewTreeObserver;
        this.LJLILLLLZI = c59556NYy;
        this.LJLJI = viewPager;
    }
}
