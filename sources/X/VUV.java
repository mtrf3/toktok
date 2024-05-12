package X;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class VUV extends HorizontalScrollView {
    public final /* synthetic */ VUU LJLIL;

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLIL.LLIIIL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VUU vuu = this.LJLIL;
        if (vuu.LLIIIL) {
            vuu.LJIJI(motionEvent);
            if (motionEvent.getAction() == 0) {
                VUU vuu2 = this.LJLIL;
                vuu2.LJIJJ(vuu2.LLILL);
            }
            if (motionEvent.getAction() == 1) {
                VUU vuu3 = this.LJLIL;
                vuu3.LLIL = vuu3.getScrollY();
                vuu3.LLILII = vuu3.LLIIII.getScrollX();
                vuu3.postDelayed(vuu3.LLIIZ, vuu3.LLILIL);
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VUV(VUU vuu, Context context) {
        super(context);
        this.LJLIL = vuu;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        VUU vuu = this.LJLIL;
        if (i == vuu.LLIIIJ) {
            return;
        }
        if (vuu.LLIIJLIL && !vuu.LLIIL) {
            vuu.LLIIL = true;
            vuu.LJIJJ(1);
            Iterator<InterfaceC79812VUa> it = vuu.LLIILII.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ();
            }
        } else {
            vuu.LJIJJ(vuu.LLILL);
            Iterator<InterfaceC79812VUa> it2 = vuu.LLIILII.iterator();
            while (it2.hasNext()) {
                it2.next().onScrollChanged();
            }
        }
        if (this.LJLIL.LLIIIJ != getScrollX()) {
            this.LJLIL.LLIIIJ = getScrollX();
        }
    }
}
