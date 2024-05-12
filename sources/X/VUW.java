package X;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class VUW extends HorizontalScrollView {
    public final /* synthetic */ VUT LJLIL;

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLIL.LLIIIL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VUT vut = this.LJLIL;
        if (vut.LLIIIL) {
            vut.LJIJI(motionEvent);
            if (motionEvent.getAction() == 0) {
                VUT vut2 = this.LJLIL;
                vut2.LJIJJ(vut2.LLILL);
            }
            if (motionEvent.getAction() == 1) {
                VUT vut3 = this.LJLIL;
                vut3.LLIL = vut3.getScrollY();
                vut3.LLILII = vut3.LLIIII.getScrollX();
                vut3.postDelayed(vut3.LLIIZ, vut3.LLILIL);
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VUW(VUT vut, Context context) {
        super(context);
        this.LJLIL = vut;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        VUT vut = this.LJLIL;
        if (i == vut.LLIIIJ) {
            return;
        }
        if (vut.LLIIJLIL && !vut.LLIIL) {
            vut.LLIIL = true;
            vut.LJIJJ(1);
            Iterator<VUZ> it = vut.LLIILII.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ();
            }
        } else {
            vut.LJIJJ(vut.LLILL);
            Iterator<VUZ> it2 = vut.LLIILII.iterator();
            while (it2.hasNext()) {
                it2.next().onScrollChanged(i, i2, i3, i4);
            }
        }
        if (this.LJLIL.LLIIIJ != getScrollX()) {
            this.LJLIL.LLIIIJ = getScrollX();
        }
    }
}
