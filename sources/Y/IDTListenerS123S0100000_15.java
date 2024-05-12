package Y;

import X.C16880lQ;
import X.C86165Xrl;
import X.T2T;
import X.YAX;
import X.YAY;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public class IDTListenerS123S0100000_15 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS123S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(IDTListenerS123S0100000_15 iDTListenerS123S0100000_15, View view, MotionEvent motionEvent) {
        return ((YAY) iDTListenerS123S0100000_15.l0).LJZI;
    }

    public static final boolean onTouch$1(IDTListenerS123S0100000_15 iDTListenerS123S0100000_15, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            YAX yax = (YAX) iDTListenerS123S0100000_15.l0;
            yax.LIZLLL.clearAnimation();
            Animation loadAnimation = AnimationUtils.loadAnimation(yax.LIZ, R.anim.bn);
            loadAnimation.setAnimationListener(new IDAListenerS239S0100000_15(yax, 1));
            yax.LIZLLL.startAnimation(loadAnimation);
            return false;
        }
        YAX yax2 = (YAX) iDTListenerS123S0100000_15.l0;
        yax2.LIZLLL.clearAnimation();
        yax2.LJFF.LIZIZ(T2T.LJLIL);
        yax2.LIZLLL.startAnimation(AnimationUtils.loadAnimation(yax2.LIZ, R.anim.bm));
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS123S0100000_15 iDTListenerS123S0100000_15, View view, MotionEvent motionEvent) {
        C86165Xrl c86165Xrl = (C86165Xrl) iDTListenerS123S0100000_15.l0;
        C16880lQ.LJLLL(c86165Xrl.LJFF, c86165Xrl.LIZJ);
        return true;
    }
}
