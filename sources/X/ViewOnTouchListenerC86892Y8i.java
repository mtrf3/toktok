package X;

import Y.ARunnableS51S0100000_15;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Y8i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ViewOnTouchListenerC86892Y8i implements View.OnTouchListener {
    public final int LJLIL;
    public final InterfaceC86893Y8j LJLILLLLZI;
    public final View LJLJI;
    public int LJLJJI;
    public long LJLJJL;
    public boolean LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;

    public static float LIZ(MotionEvent motionEvent) {
        float abs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
        float abs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
        return (float) Math.sqrt((abs2 * abs2) + (abs * abs));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer valueOf;
        if (view != null && motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction() & 255)) != null) {
            if (valueOf.intValue() == 0) {
                this.LJLLI = motionEvent.getX();
                this.LJLLILLLL = motionEvent.getY();
                this.LJLLJ = motionEvent.getX();
                this.LJLLL = motionEvent.getY();
                if ((this.LJLIL & 1) != 0) {
                    int i = this.LJLJJI + 1;
                    this.LJLJJI = i;
                    if (i != 1) {
                        if (i == 2) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis - this.LJLJJL <= 300) {
                                this.LJLILLLLZI.LJLLI(motionEvent.getX(), motionEvent.getY(), view);
                                this.LJLJJI = 0;
                                this.LJLJJL = 0L;
                            } else {
                                this.LJLJJI = 1;
                                this.LJLJJL = currentTimeMillis;
                            }
                        }
                    } else {
                        this.LJLJJL = System.currentTimeMillis();
                    }
                }
                if ((this.LJLIL & 2) != 0) {
                    this.LJLJJLL = true;
                    view.postDelayed(new ARunnableS51S0100000_15(this, 116), 400L);
                }
            } else if (valueOf != null) {
                if (valueOf.intValue() == 5) {
                    if ((this.LJLIL & 4) != 0 && motionEvent.getPointerCount() >= 2) {
                        this.LJLJI.getParent().requestDisallowInterceptTouchEvent(true);
                        this.LJLJLLL = LIZ(motionEvent);
                        float f = 2;
                        this.LJLJL = (motionEvent.getX(1) + motionEvent.getX(0)) / f;
                        this.LJLJLJ = (motionEvent.getY(1) + motionEvent.getY(0)) / f;
                        this.LJLL = 1.0f;
                        this.LJLILLLLZI.R0();
                    }
                } else if (valueOf.intValue() == 2) {
                    this.LJLLJ = motionEvent.getX();
                    this.LJLLL = motionEvent.getY();
                    if ((this.LJLIL & 2) != 0 && (Math.abs(this.LJLLI - this.LJLLJ) > 50.0f || Math.abs(this.LJLLILLLL - this.LJLLL) > 50.0f)) {
                        this.LJLJJLL = false;
                    }
                    if (motionEvent.getPointerCount() >= 2 && (this.LJLIL & 4) != 0) {
                        this.LJLJI.getParent().requestDisallowInterceptTouchEvent(true);
                        float LIZ = (LIZ(motionEvent) / this.LJLJLLL) * this.LJLL;
                        this.LJLL = LIZ;
                        float max = Math.max(LIZ, 1.0f);
                        this.LJLL = max;
                        this.LJLL = Math.min(max, 4.0f);
                        float f2 = 2;
                        this.LJLILLLLZI.M(((motionEvent.getX(1) + motionEvent.getX(0)) / f2) - this.LJLJL, ((motionEvent.getY(1) + motionEvent.getY(0)) / f2) - this.LJLJLJ, this.LJLL);
                    }
                } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                    this.LJLJJLL = false;
                    if ((this.LJLIL & 2) != 0) {
                        this.LJLILLLLZI.C(false);
                    }
                    if ((this.LJLIL & 4) != 0) {
                        this.LJLILLLLZI.m2();
                    }
                }
            }
        }
        return true;
    }

    public ViewOnTouchListenerC86892Y8i(int i, View view, InterfaceC86893Y8j listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = i;
        this.LJLILLLLZI = listener;
        this.LJLJI = view;
        this.LJLL = 1.0f;
    }
}
