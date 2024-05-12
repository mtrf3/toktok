package X;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import java.util.HashMap;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wil, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83059Wil extends WXC {
    public final InterfaceC83061Win LIZ;
    public final InterfaceC88471Ynr<Boolean, Boolean, C76800UCe> LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public final HashMap<Integer, PointF> LJ;
    public boolean LJFF;
    public OSZ<Float, Float> LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    public final boolean LJJII() {
        if (this.LIZLLL >= this.LIZ.LJI().getFingerCountForMove() && this.LIZJ) {
            return true;
        }
        return false;
    }

    public final void LJJIII() {
        C165556ed.LIZ("reset");
        if (this.LJFF) {
            this.LIZ.LIZJ();
            this.LIZIZ.invoke(Boolean.TRUE, Boolean.FALSE);
        }
        this.LJFF = false;
        this.LJ.clear();
        this.LJIIIZ = false;
    }

    @Override // X.WXC, X.C6P6, X.C6V2
    public final void LJIIIIZZ(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked != 6) {
                                return;
                            }
                            this.LIZLLL--;
                            return;
                        } else {
                            this.LIZLLL++;
                            this.LJ.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new PointF(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
                            return;
                        }
                    }
                } else {
                    if (!this.LJFF) {
                        return;
                    }
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i = 0; i < pointerCount; i++) {
                        PointF pointF = this.LJ.get(Integer.valueOf(motionEvent.getPointerId(i)));
                        if (pointF != null) {
                            float f = pointF.x;
                            float f2 = pointF.y;
                            float x = motionEvent.getX(i);
                            float y = motionEvent.getY(i);
                            double d = 2;
                            if (Math.sqrt(Math.pow(f2 - y, d) + Math.pow(f - x, d)) > 5.0d) {
                                if (this.LJIIIZ) {
                                    return;
                                }
                                this.LIZIZ.invoke(Boolean.FALSE, Boolean.TRUE);
                                this.LJIIIZ = true;
                                C165556ed.LIZ("hide panel");
                                return;
                            }
                        }
                    }
                    return;
                }
            }
            this.LIZLLL = 0;
            LJJIII();
            return;
        }
        this.LIZLLL = 1;
        this.LJ.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new PointF(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJIZ(float f) {
        float degrees = (float) Math.toDegrees(f);
        if (!LJJII() || !this.LIZ.LJI().getEnableRotate()) {
            return false;
        }
        if (Math.abs(degrees) < 10.0f && degrees != 0.0f) {
            this.LJFF = true;
            this.LIZ.LIZIZ(-degrees);
        }
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJLI(C82537WaL c82537WaL) {
        boolean z;
        if (c82537WaL != null) {
            PointF pointF = c82537WaL.LJIIIZ;
            if (this.LIZLLL >= this.LIZ.LJI().getFingerCountForMove() && this.LIZJ && this.LIZ.LJI().getEnableMove() && this.LJII) {
                z = true;
                if (this.LJFF || Math.abs(pointF.x) >= 1.0f || Math.abs(pointF.y) >= 1.0f) {
                    this.LJFF = true;
                    this.LIZ.LIZ(pointF.x, pointF.y);
                }
                this.LJIIIIZZ = z;
                return z;
            }
        }
        z = false;
        this.LJIIIIZZ = z;
        return z;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJLJI(float f) {
        if (LJJII() && this.LIZ.LJI().getEnableScale()) {
            return true;
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final void LJLJJI(C82537WaL c82537WaL) {
        this.LJIIIIZZ = false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LLLLLLLZIL(C82536WaK c82536WaK) {
        if (LJJII() && this.LIZ.LJI().getEnableRotate()) {
            return true;
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LLLLLLZ(float f) {
        if (LJJII() && this.LIZ.LJI().getEnableRotate()) {
            return true;
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (scaleGestureDetector == null) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (!LJJII() || !this.LIZ.LJI().getEnableScale()) {
            return false;
        }
        if (scaleFactor != 1.0f) {
            this.LJFF = true;
            this.LIZ.onScale(scaleFactor);
        }
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (LJJII() && this.LIZ.LJI().getEnableScale()) {
            return true;
        }
        return false;
    }

    public C83059Wil(C83062Wio transformAssist, AqS196S0100000_14 aqS196S0100000_14) {
        o.LJIIIZ(transformAssist, "transformAssist");
        this.LIZ = transformAssist;
        this.LIZIZ = aqS196S0100000_14;
        this.LIZJ = true;
        this.LJ = new HashMap<>();
        Float valueOf = Float.valueOf(0.0f);
        this.LJI = new OSZ<>(valueOf, valueOf);
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJLIL(C82537WaL c82537WaL, float f, float f2) {
        OSZ<Float, Float> osz = new OSZ<>(Float.valueOf(f), Float.valueOf(f2));
        this.LJI = osz;
        this.LJII = this.LIZ.LJFF(osz.getFirst().floatValue(), this.LJI.getSecond().floatValue());
        if (LJJII() && this.LIZ.LJI().getEnableMove() && this.LIZ.LIZLLL() && this.LJII) {
            return true;
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.LJIIIIZZ;
    }
}
