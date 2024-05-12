package X;

import Y.ARunnableS38S0100000_2;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.AqS121S0300000_2;

/* renamed from: X.5CX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CX implements View.OnTouchListener {
    public final C5CY LJLIL;
    public final InterfaceC88471Ynr<Float, MotionEvent, C76800UCe> LJLILLLLZI;
    public final int LJLJI = ViewConfiguration.get(C58S.LIZ()).getScaledTouchSlop();
    public final Handler LJLJJI = new Handler(C16880lQ.LLJJJJ());
    public final long LJLJJL = ViewConfiguration.getLongPressTimeout();
    public final ARunnableS38S0100000_2 LJLJJLL = new ARunnableS38S0100000_2(this, 160);
    public final ARunnableS38S0100000_2 LJLJL = new ARunnableS38S0100000_2(this, 159);
    public float LJLJLJ;
    public float LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public float LJLLILLLL;
    public MotionEvent LJLLJ;

    public C5CX(C5A1 c5a1, AqS121S0300000_2 aqS121S0300000_2) {
        this.LJLIL = c5a1;
        this.LJLILLLLZI = aqS121S0300000_2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.LJLLJ = motionEvent;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        if (this.LJLLI) {
                            this.LJLIL.LIZ();
                            this.LJLLI = false;
                        }
                        if (this.LJLL) {
                            this.LJLL = false;
                        } else {
                            this.LJLJJI.removeCallbacks(this.LJLJJLL);
                        }
                    }
                } else {
                    float rawX = motionEvent.getRawX() - this.LJLJLJ;
                    float rawY = motionEvent.getRawY() - this.LJLJLLL;
                    if (this.LJLLI) {
                        C5CY c5cy = this.LJLIL;
                        float rawX2 = motionEvent.getRawX();
                        motionEvent.getRawY();
                        c5cy.LIZIZ(rawX2, rawX, rawY);
                    }
                    if (!this.LJLL) {
                        int i = this.LJLJI;
                        if (i * i <= (rawY * rawY) + (rawX * rawX)) {
                            this.LJLJJI.removeCallbacks(this.LJLJJLL);
                            this.LJLL = true;
                        }
                    }
                    this.LJLJLJ = motionEvent.getRawX();
                    this.LJLJLLL = motionEvent.getRawY();
                }
            } else {
                if (this.LJLLI) {
                    this.LJLIL.LIZ();
                    this.LJLLI = false;
                } else if (!this.LJLL) {
                    this.LJLJJI.removeCallbacks(this.LJLJJLL);
                    this.LJLLILLLL = motionEvent.getX();
                    this.LJLJL.run();
                }
                System.currentTimeMillis();
                this.LJLL = false;
            }
        } else {
            this.LJLJLJ = motionEvent.getRawX();
            this.LJLJLLL = motionEvent.getRawY();
            System.currentTimeMillis();
            this.LJLJJI.postDelayed(this.LJLJJLL, this.LJLJJL);
        }
        return true;
    }
}
