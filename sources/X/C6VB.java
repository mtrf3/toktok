package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.lang.reflect.Field;

/* renamed from: X.6VB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VB extends FrameLayout implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {
    public C6V2 LJLIL;
    public C16230kN LJLILLLLZI;
    public ScaleGestureDetector LJLJI;
    public C82536WaK LJLJJI;
    public C82537WaL LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public boolean LJLL;
    public float LJLLI;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public C6V2 getOnGestureListener() {
        return this.LJLIL;
    }

    public float getProtectY() {
        return this.LJLLI;
    }

    public ScaleGestureDetector getScaleGestureDetector() {
        return this.LJLJI;
    }

    public C6VB(Context context) {
        super(context, null, 0);
        this.LJLJJLL = 1.0f;
        this.LJLLI = 1000.0f;
        C6V9 c6v9 = new C6V9() { // from class: X.6V8
            @Override // X.InterfaceC82540WaO
            public final void LIZ(C82536WaK c82536WaK) {
                C6V2 c6v2 = C6VB.this.LJLIL;
                if (c6v2 != null) {
                    c6v2.LLLLLLLZIL(c82536WaK);
                }
            }

            @Override // X.InterfaceC82540WaO
            public final void LIZIZ(C82536WaK c82536WaK) {
                float LJI = c82536WaK.LJI();
                C6V2 c6v2 = C6VB.this.LJLIL;
                if (c6v2 != null) {
                    c6v2.LJJIZ(LJI);
                }
            }

            @Override // X.InterfaceC82540WaO
            public final void LIZJ(C82536WaK c82536WaK) {
                float LJI = c82536WaK.LJI();
                C6V2 c6v2 = C6VB.this.LJLIL;
                if (c6v2 != null) {
                    c6v2.LLLLLLZ(LJI);
                }
            }
        };
        InterfaceC82539WaN interfaceC82539WaN = new InterfaceC82539WaN() { // from class: X.6V7
            @Override // X.InterfaceC82539WaN
            public final void LJLI(C82537WaL c82537WaL) {
                C6V2 c6v2 = C6VB.this.LJLIL;
                if (c6v2 != null) {
                    c6v2.LJLI(c82537WaL);
                }
            }

            @Override // X.InterfaceC82539WaN
            public final void LJLJJI(C82537WaL c82537WaL) {
                C6V2 c6v2 = C6VB.this.LJLIL;
                if (c6v2 != null) {
                    c6v2.LJLJJI(c82537WaL);
                }
            }

            @Override // X.InterfaceC82539WaN
            public final void LJJLIL(C82537WaL c82537WaL, float f, float f2) {
                C6V2 c6v2 = C6VB.this.LJLIL;
                if (c6v2 != null) {
                    c6v2.LJJLIL(c82537WaL, f, f2);
                }
            }
        };
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LJLJJI = new C82536WaK(LLLLL, c6v9);
        this.LJLJJL = new C82537WaL(LLLLL, interfaceC82539WaN);
        C16230kN c16230kN = new C16230kN(LLLLL, this);
        this.LJLILLLLZI = c16230kN;
        c16230kN.LIZ.LIZ.setIsLongpressEnabled(false);
        this.LJLILLLLZI.LIZIZ(this);
        this.LJLJI = new ScaleGestureDetector(LLLLL, this);
        float scaledDoubleTapSlop = ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        this.LJLJL = scaledDoubleTapSlop * scaledDoubleTapSlop;
        setOnTouchListener(this);
        try {
            Field declaredField = this.LJLJI.getClass().getDeclaredField("mSpanSlop");
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(this.LJLJI)).intValue();
            Field declaredField2 = this.LJLJI.getClass().getDeclaredField("mMinSpan");
            declaredField2.setAccessible(true);
            declaredField2.set(this.LJLJI, Integer.valueOf(intValue * 6));
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = measuredWidth / 10;
        int i2 = measuredHeight / 10;
        if (this.LJLIL == null) {
            return false;
        }
        float x = motionEvent.getX() - this.LJLJLJ;
        float y = motionEvent.getY() - this.LJLJLLL;
        if ((y * y) + (x * x) >= this.LJLJL) {
            return false;
        }
        float f = i;
        if (motionEvent.getX() >= f && measuredWidth - motionEvent.getX() >= f) {
            float f2 = i2;
            if (motionEvent.getY() >= f2 && measuredHeight - motionEvent.getY() >= f2) {
                return this.LJLIL.LJJJ(motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C6V2 c6v2 = this.LJLIL;
        if (c6v2 != null) {
            boolean onScale = c6v2.onScale(scaleGestureDetector);
            if (onScale) {
                this.LJLJJLL = scaleGestureDetector.getScaleFactor();
            }
            return onScale;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C6V2 c6v2 = this.LJLIL;
        if (c6v2 != null && c6v2.onScaleBegin(scaleGestureDetector)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C6V2 c6v2 = this.LJLIL;
        if (c6v2 != null) {
            c6v2.LJLJI(this.LJLJJLL);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C6V2 c6v2 = this.LJLIL;
        if (c6v2 != null && c6v2.onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.LJLJLJ = motionEvent.getX();
        this.LJLJLLL = motionEvent.getY();
        C6V2 c6v2 = this.LJLIL;
        if (c6v2 != null && c6v2.onSingleTapUp(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.LJLJI.onTouchEvent(motionEvent);
        this.LJLJJI.LIZJ(motionEvent);
        this.LJLJJL.LIZJ(motionEvent);
        if ((motionEvent.getAction() & 255) == 0) {
            this.LJLL = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.LJLL = true;
        }
        if (!this.LJLL) {
            this.LJLILLLLZI.LIZ(motionEvent);
        }
        return true;
    }

    public void setOnGestureListener(C6V2 c6v2) {
        this.LJLIL = c6v2;
    }

    public void setProtectY(float f) {
        this.LJLLI = (f * 17.0f) / 20.0f;
    }

    public void setSloppyExtra(int i) {
        this.LJLJJI.LJIIJJI = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.LJLIL == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 3) {
                    if (action != 5) {
                        if (action == 6) {
                            this.LJLIL.LJJJIL();
                        }
                    } else {
                        this.LJLIL.LJJJI();
                    }
                } else {
                    this.LJLIL.LJJIIZI(motionEvent);
                }
            } else {
                this.LJLIL.LJJIIZI(motionEvent);
            }
        } else {
            this.LJLIL.onDown(motionEvent);
        }
        this.LJLIL.LJIIIIZZ(motionEvent);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C6V2 c6v2 = this.LJLIL;
        if (c6v2 != null && c6v2.onFling(motionEvent, motionEvent2, f, f2)) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C6V2 c6v2;
        if (motionEvent == null || motionEvent2 == null || (c6v2 = this.LJLIL) == null) {
            return false;
        }
        c6v2.onScroll(motionEvent, motionEvent2, f, f2);
        return true;
    }
}
