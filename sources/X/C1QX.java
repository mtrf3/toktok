package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.1QX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QX implements InterfaceC11610cv {
    public final Path LIZIZ;
    public final RectF LIZJ;
    public final float[] LIZLLL;
    public final Matrix LJ;

    public C1QX() {
        this(0);
    }

    @Override // X.InterfaceC11610cv
    public final boolean LIZJ() {
        return this.LIZIZ.isConvex();
    }

    public final boolean LJIILIIL() {
        return this.LIZIZ.isEmpty();
    }

    @Override // X.InterfaceC11610cv
    public final void close() {
        this.LIZIZ.close();
    }

    @Override // X.InterfaceC11610cv
    public final void reset() {
        this.LIZIZ.reset();
    }

    public C1QX(Path internalPath) {
        o.LJIIIZ(internalPath, "internalPath");
        this.LIZIZ = internalPath;
        this.LIZJ = new RectF();
        this.LIZLLL = new float[8];
        this.LJ = new Matrix();
    }

    @Override // X.InterfaceC11610cv
    public final void LJ(C10410az roundRect) {
        o.LJIIIZ(roundRect, "roundRect");
        this.LIZJ.set(roundRect.LIZ, roundRect.LIZIZ, roundRect.LIZJ, roundRect.LIZLLL);
        this.LIZLLL[0] = C10340as.LIZIZ(roundRect.LJ);
        this.LIZLLL[1] = C10340as.LIZJ(roundRect.LJ);
        this.LIZLLL[2] = C10340as.LIZIZ(roundRect.LJFF);
        this.LIZLLL[3] = C10340as.LIZJ(roundRect.LJFF);
        this.LIZLLL[4] = C10340as.LIZIZ(roundRect.LJI);
        this.LIZLLL[5] = C10340as.LIZJ(roundRect.LJI);
        this.LIZLLL[6] = C10340as.LIZIZ(roundRect.LJII);
        this.LIZLLL[7] = C10340as.LIZJ(roundRect.LJII);
        this.LIZIZ.addRoundRect(this.LIZJ, this.LIZLLL, Path.Direction.CCW);
    }

    public final void LJIIL(C10390ax c10390ax) {
        if (!Float.isNaN(c10390ax.LIZ)) {
            if (!Float.isNaN(c10390ax.LIZIZ)) {
                if (!Float.isNaN(c10390ax.LIZJ)) {
                    if (!Float.isNaN(c10390ax.LIZLLL)) {
                        this.LIZJ.set(new RectF(c10390ax.LIZ, c10390ax.LIZIZ, c10390ax.LIZJ, c10390ax.LIZLLL));
                        this.LIZIZ.addRect(this.LIZJ, Path.Direction.CCW);
                        return;
                    } else {
                        "Rect.bottom is NaN".toString();
                        throw new IllegalStateException("Rect.bottom is NaN");
                    }
                }
                "Rect.right is NaN".toString();
                throw new IllegalStateException("Rect.right is NaN");
            }
            "Rect.top is NaN".toString();
            throw new IllegalStateException("Rect.top is NaN");
        }
        "Rect.left is NaN".toString();
        throw new IllegalStateException("Rect.left is NaN");
    }

    public final void LJIILJJIL(long j) {
        this.LJ.reset();
        this.LJ.setTranslate(C10370av.LIZLLL(j), C10370av.LJ(j));
        this.LIZIZ.transform(this.LJ);
    }

    public /* synthetic */ C1QX(int i) {
        this(new Path());
    }

    @Override // X.InterfaceC11610cv
    public final void LIZIZ(float f, float f2) {
        this.LIZIZ.moveTo(f, f2);
    }

    @Override // X.InterfaceC11610cv
    public final void LJI(float f, float f2) {
        this.LIZIZ.rLineTo(f, f2);
    }

    @Override // X.InterfaceC11610cv
    public final void LJII(float f, float f2) {
        this.LIZIZ.rMoveTo(f, f2);
    }

    @Override // X.InterfaceC11610cv
    public final void LJIIJ(float f, float f2) {
        this.LIZIZ.lineTo(f, f2);
    }

    public final void LJIIJJI(InterfaceC11610cv path, long j) {
        o.LJIIIZ(path, "path");
        Path path2 = this.LIZIZ;
        if (path instanceof C1QX) {
            path2.addPath(((C1QX) path).LIZIZ, C10370av.LIZLLL(j), C10370av.LJ(j));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // X.InterfaceC11610cv
    public final boolean LJIIIZ(InterfaceC11610cv path1, InterfaceC11610cv interfaceC11610cv, int i) {
        Path.Op op;
        o.LJIIIZ(path1, "path1");
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (i == 2) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        Path path = this.LIZIZ;
        if (path1 instanceof C1QX) {
            Path path2 = ((C1QX) path1).LIZIZ;
            if (interfaceC11610cv instanceof C1QX) {
                return path.op(path2, ((C1QX) interfaceC11610cv).LIZIZ, op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // X.InterfaceC11610cv
    public final void LIZ(float f, float f2, float f3, float f4) {
        this.LIZIZ.rQuadTo(f, f2, f3, f4);
    }

    @Override // X.InterfaceC11610cv
    public final void LIZLLL(float f, float f2, float f3, float f4) {
        this.LIZIZ.quadTo(f, f2, f3, f4);
    }

    @Override // X.InterfaceC11610cv
    public final void LJFF(float f, float f2, float f3, float f4, float f5, float f6) {
        this.LIZIZ.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // X.InterfaceC11610cv
    public final void LJIIIIZZ(float f, float f2, float f3, float f4, float f5, float f6) {
        this.LIZIZ.rCubicTo(f, f2, f3, f4, f5, f6);
    }
}
