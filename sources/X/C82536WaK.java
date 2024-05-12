package X;

import android.content.Context;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.WaK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82536WaK extends AbstractC82535WaJ {
    public boolean LJIIL;
    public float LJIILIIL;
    public float LJIILJJIL;
    public final InterfaceC82540WaO LJIILL;

    public final float LJI() {
        return (float) (Math.atan2(this.LJIIIIZZ, this.LJII) - Math.atan2(this.LJIIJ, this.LJIIIZ));
    }

    @Override // X.AbstractC82538WaM
    public final void LIZLLL() {
        super.LIZLLL();
        this.LJIIL = false;
    }

    @Override // X.AbstractC82535WaJ, X.AbstractC82538WaM
    public final void LJ(MotionEvent curr) {
        int i;
        o.LJIIIZ(curr, "curr");
        super.LJ(curr);
        int pointerCount = curr.getPointerCount();
        if ((curr.getAction() & 255) == 6) {
            i = curr.getActionIndex();
        } else {
            i = -1;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (i != i2) {
                float x = curr.getX(i2) + f;
                f2 = curr.getY(i2) + f2;
                f = x;
            }
        }
        float f3 = pointerCount;
        this.LJIILIIL = f / f3;
        this.LJIILJJIL = f2 / f3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82536WaK(Context context, C6V9 mListener) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(mListener, "mListener");
        this.LJIILL = mListener;
    }

    @Override // X.AbstractC82538WaM
    public final void LIZ(MotionEvent event, int i) {
        o.LJIIIZ(event, "event");
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    return;
                }
                LJ(event);
                if (!this.LJIIL) {
                    this.LJIILL.LIZJ(this);
                }
                LIZLLL();
                return;
            }
            if (!this.LJIIL) {
                this.LJIILL.LIZJ(this);
            }
            LIZLLL();
            return;
        }
        LJ(event);
        if (this.LIZJ / this.LIZLLL <= 0.67f) {
            return;
        }
        this.LJIILL.LIZIZ(this);
        MotionEvent motionEvent = this.LIZ;
        o.LJI(motionEvent);
        motionEvent.recycle();
        this.LIZ = MotionEvent.obtain(event);
    }

    @Override // X.AbstractC82538WaM
    public final void LIZIZ(MotionEvent event, int i) {
        o.LJIIIZ(event, "event");
        if (i != 2) {
            if (i != 5) {
                return;
            }
            LIZLLL();
            this.LIZ = MotionEvent.obtain(event);
            LJ(event);
            boolean LJFF = LJFF(event);
            this.LJIIL = LJFF;
            if (LJFF) {
                return;
            }
            this.LJIILL.LIZ(this);
            this.LJ = true;
            return;
        }
        if (!this.LJIIL) {
            return;
        }
        boolean LJFF2 = LJFF(event);
        this.LJIIL = LJFF2;
        if (LJFF2) {
            return;
        }
        this.LJIILL.LIZ(this);
        this.LJ = true;
    }
}
