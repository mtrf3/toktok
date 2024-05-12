package X;

import X.AbstractC216018dp;
import android.graphics.Canvas;
import kotlin.jvm.internal.o;

/* renamed from: X.8ew, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC216708ew<T extends AbstractC216018dp> {
    public T LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public int LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public boolean LJIIIZ;

    public abstract int LIZJ();

    public abstract void LJI(T t);

    public abstract void LJII(Canvas canvas, C216758f1 c216758f1);

    public abstract void LJIIIIZZ(C216758f1 c216758f1);

    public void LJIIIZ() {
        this.LIZ = null;
        LJIIJ(0.0f);
        LJIIJJI(0.0f);
        this.LIZLLL = 0.0f;
        this.LJ = 0.0f;
        this.LJFF = 0;
        this.LJI = 0L;
        this.LJII = 0L;
        this.LJIIIZ = false;
    }

    public AbstractC216708ew() {
        C221108m2.LIZIZ(C216918fH.LJLIL);
    }

    public float LIZLLL() {
        return this.LIZIZ;
    }

    public float LJ() {
        return this.LIZJ;
    }

    public final void LIZ(T t) {
        this.LIZ = t;
        LJI(t);
    }

    public final void LJFF(C216758f1 config) {
        o.LJIIIZ(config, "config");
        LJIIIIZZ(config);
    }

    public void LJIIJ(float f) {
        this.LIZIZ = f;
    }

    public void LJIIJJI(float f) {
        this.LIZJ = f;
    }

    public void LIZIZ(Canvas canvas, C216758f1 config) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(config, "config");
        canvas.save();
        canvas.rotate(0.0f, LIZLLL(), LJ());
        LJII(canvas, config);
        canvas.restore();
    }
}
