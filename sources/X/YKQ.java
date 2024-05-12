package X;

import Y.ALAdapterS12S0200000_15;
import Y.ARunnableS51S0100000_15;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class YKQ implements View.OnTouchListener {
    public boolean LJLIL;
    public final ARunnableS51S0100000_15 LJLILLLLZI = new ARunnableS51S0100000_15(this, 105);

    public Animator LIZ(View view) {
        throw null;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        View view2;
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 3) {
                    return false;
                }
                LIZ(view).start();
                return false;
            }
            Animator LIZ = LIZ(view);
            LIZ.addListener(new ALAdapterS12S0200000_15(this, view, event, 2));
            LIZ.start();
            return true;
        }
        if (view != null) {
            view2 = view.findViewById(R.id.hoh);
        } else {
            view2 = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.2f);
        ofFloat.setDuration(150L);
        ofFloat.addListener(new ALAdapterS12S0200000_15(this, view, event, 1));
        ofFloat.start();
        return true;
    }
}
