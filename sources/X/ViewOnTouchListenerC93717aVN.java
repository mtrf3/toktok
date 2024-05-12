package X;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.aVN, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnTouchListenerC93717aVN implements View.OnTouchListener {
    public final /* synthetic */ C93718aVO LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    public ViewOnTouchListenerC93717aVN(C93718aVO c93718aVO, View view, View view2) {
        this.LJLIL = c93718aVO;
        this.LJLILLLLZI = view;
        this.LJLJI = view2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        if (!this.LJLILLLLZI.isClickable()) {
            return false;
        }
        o.LJIIIIZZ(event, "event");
        if (event.getActionMasked() == 0) {
            C93718aVO c93718aVO = this.LJLIL;
            if (!c93718aVO.LIZIZ) {
                c93718aVO.LIZIZ = true;
                this.LJLJI.setAlpha(1.0f);
                ValueAnimator valueAnimator = this.LJLIL.LIZ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                C93718aVO c93718aVO2 = this.LJLIL;
                c93718aVO2.LIZ = c93718aVO2.LIZJ.LIZIZ(this.LJLJI, C94630ak6.LJLIL);
            }
        }
        if (event.getActionMasked() == 1 || event.getActionMasked() == 3) {
            C93718aVO c93718aVO3 = this.LJLIL;
            if (c93718aVO3.LIZIZ) {
                c93718aVO3.LIZIZ = false;
                this.LJLJI.setAlpha(0.34f);
                ValueAnimator valueAnimator2 = this.LJLIL.LIZ;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                C93718aVO c93718aVO4 = this.LJLIL;
                c93718aVO4.LIZ = c93718aVO4.LIZJ.LIZ(this.LJLJI, C94631ak7.LJLIL);
            }
        }
        return false;
    }
}
