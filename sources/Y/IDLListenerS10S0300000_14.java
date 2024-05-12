package Y;

import X.C73157SnR;
import X.InterpolatorC74353TGb;
import X.WOB;
import X.WOC;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.AqS118S0300000_14;

/* loaded from: classes15.dex */
public class IDLListenerS10S0300000_14 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS10S0300000_14 iDLListenerS10S0300000_14) {
        WOC woc = (WOC) iDLListenerS10S0300000_14.l0;
        C73157SnR.LJIIJJI(woc.LJLJLLL, new AqS118S0300000_14(woc, (View) iDLListenerS10S0300000_14.l2, iDLListenerS10S0300000_14, 0));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((View) iDLListenerS10S0300000_14.l1, "translationY", r3.getMeasuredHeight(), 0.0f);
        ofFloat.setInterpolator(new InterpolatorC74353TGb());
        ofFloat.setDuration(490L);
        ofFloat.start();
    }

    public static final void onGlobalLayout$1(IDLListenerS10S0300000_14 iDLListenerS10S0300000_14) {
        WOB wob = (WOB) iDLListenerS10S0300000_14.l0;
        C73157SnR.LJIIJJI(wob.LJLL, new AqS118S0300000_14(wob, (View) iDLListenerS10S0300000_14.l2, iDLListenerS10S0300000_14, 1));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((View) iDLListenerS10S0300000_14.l1, "translationY", r3.getMeasuredHeight(), 0.0f);
        ofFloat.setInterpolator(new InterpolatorC74353TGb());
        ofFloat.setDuration(490L);
        ofFloat.start();
    }

    public IDLListenerS10S0300000_14(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
