package X;

import Y.ARunnableS38S0100000_2;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.AqS152S0100000_2;

/* renamed from: X.59x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC1304159x implements View.OnTouchListener {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public final C59S LJLILLLLZI;
    public boolean LJLJLLL;
    public boolean LJLL;
    public final int LJLJI = ViewConfiguration.get(C58S.LIZ()).getScaledTouchSlop();
    public final Handler LJLJJI = new Handler(C16880lQ.LLJJJJ());
    public final long LJLJJL = ViewConfiguration.getLongPressTimeout();
    public final ARunnableS38S0100000_2 LJLJJLL = new ARunnableS38S0100000_2(this, 18);
    public float LJLJL = -1.0f;
    public float LJLJLJ = -1.0f;
    public float LJLLI = -1.0f;
    public float LJLLILLLL = -1.0f;
    public float LJLLJ = -1.0f;
    public float LJLLL = -1.0f;
    public final int LJLLLL = C134845Qy.LIZJ(C58S.LIZ());

    public ViewOnTouchListenerC1304159x(AqS152S0100000_2 aqS152S0100000_2, C59P c59p) {
        this.LJLIL = aqS152S0100000_2;
        this.LJLILLLLZI = c59p;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        int i = 0;
        boolean z2 = false;
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        if (this.LJLL) {
                            this.LJLL = false;
                        }
                        if (this.LJLJLLL) {
                            this.LJLJLLL = false;
                        } else {
                            this.LJLJJI.removeCallbacks(this.LJLJJLL);
                        }
                    }
                } else {
                    float rawX = motionEvent.getRawX() - this.LJLLJ;
                    float rawY = motionEvent.getRawY() - this.LJLLL;
                    this.LJLLJ = motionEvent.getRawX();
                    this.LJLLL = motionEvent.getRawY();
                    float rawX2 = motionEvent.getRawX() - this.LJLLI;
                    float rawY2 = motionEvent.getRawY() - this.LJLLILLLL;
                    if (this.LJLL) {
                        C59S c59s = this.LJLILLLLZI;
                        float rawX3 = motionEvent.getRawX();
                        float f = C1300758p.LIZJ;
                        if (rawX3 - f < 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (motionEvent.getRawX() + f > this.LJLLLL) {
                            z2 = true;
                        }
                        c59s.LIZLLL(rawX, rawY, z, z2);
                        return true;
                    }
                    if (!this.LJLJLLL) {
                        int i2 = this.LJLJI;
                        if (i2 * i2 <= (rawY2 * rawY2) + (rawX2 * rawX2)) {
                            this.LJLJJI.removeCallbacks(this.LJLJJLL);
                            this.LJLJLLL = true;
                        }
                    }
                }
            } else {
                if (this.LJLL) {
                    this.LJLILLLLZI.LIZ();
                    this.LJLL = false;
                } else if (!this.LJLJLLL) {
                    this.LJLJJI.removeCallbacks(this.LJLJJLL);
                    this.LJLIL.invoke();
                }
                this.LJLJLLL = false;
            }
        } else {
            float x = motionEvent.getX();
            if (view != null) {
                i = view.getLeft();
            }
            this.LJLJL = x + i;
            this.LJLJLJ = motionEvent.getY();
            this.LJLLI = motionEvent.getRawX();
            this.LJLLILLLL = motionEvent.getRawY();
            this.LJLLJ = motionEvent.getRawX();
            this.LJLLL = motionEvent.getRawY();
            System.currentTimeMillis();
            this.LJLJJI.postDelayed(this.LJLJJLL, this.LJLJJL);
        }
        return true;
    }
}
