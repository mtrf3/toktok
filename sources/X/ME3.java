package X;

import Y.ARunnableS45S0100000_9;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class ME3 implements View.OnTouchListener {
    public final View LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public final float LJLJJLL;
    public EdgeSpeedupAbility LJLJLJ;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 3));
    public final ARunnableS45S0100000_9 LJLJLLL = new ARunnableS45S0100000_9(this, 2);

    public final SafeHandler LIZ() {
        return (SafeHandler) this.LJLJL.getValue();
    }

    public ME3(View view) {
        this.LJLIL = view;
        this.LJLJJLL = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        EdgeSpeedupAbility edgeSpeedupAbility;
        ViewGroup viewGroup;
        EdgeSpeedupAbility edgeSpeedupAbility2;
        if (motionEvent == null || (edgeSpeedupAbility = this.LJLJLJ) == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5 && !edgeSpeedupAbility.sM()) {
                            LIZ().removeCallbacks(this.LJLJLLL);
                        }
                    } else {
                        LIZ().removeCallbacks(this.LJLJLLL);
                        if (edgeSpeedupAbility.sM() && (edgeSpeedupAbility2 = this.LJLJLJ) != null) {
                            edgeSpeedupAbility2.Zt0(false);
                        }
                    }
                } else {
                    this.LJLJJI = motionEvent.getX();
                    this.LJLJJL = motionEvent.getY();
                    float abs = Math.abs(this.LJLILLLLZI - this.LJLJJI);
                    float abs2 = Math.abs(this.LJLJI - this.LJLJJL);
                    float f = this.LJLJJLL;
                    if ((abs > f || abs2 > f) && !edgeSpeedupAbility.sM()) {
                        LIZ().removeCallbacks(this.LJLJLLL);
                    }
                }
            } else {
                LIZ().removeCallbacks(this.LJLJLLL);
                if (edgeSpeedupAbility.sM()) {
                    EdgeSpeedupAbility edgeSpeedupAbility3 = this.LJLJLJ;
                    if (edgeSpeedupAbility3 != null) {
                        edgeSpeedupAbility3.Zt0(false);
                    }
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    ViewParent parent = this.LJLIL.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        viewGroup.dispatchTouchEvent(obtain);
                    }
                }
            }
        } else {
            this.LJLILLLLZI = motionEvent.getX();
            float y = motionEvent.getY();
            this.LJLJI = y;
            if (edgeSpeedupAbility.oJ(this.LJLILLLLZI, y)) {
                LIZ().postDelayed(this.LJLJLLL, 300L);
            }
        }
        return edgeSpeedupAbility.sM();
    }
}
