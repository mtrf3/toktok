package X;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1os, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44501os extends AbstractC38521fE {
    @Override // X.InterfaceC268913t
    public final AbstractC22650uj<C271914x, Path> LIZ() {
        final List list = (List) this.LJLILLLLZI;
        return new AbstractC22650uj<C271914x, Path>(list) { // from class: X.1Zn
            public final C271914x LJIIJ = new C271914x();
            public final Path LJIIJJI = new Path();

            @Override // X.AbstractC22650uj
            public final Path LJII(C06780Ok<C271914x> c06780Ok, float f) {
                boolean z;
                PointF pointF;
                C271914x c271914x = c06780Ok.LIZIZ;
                C271914x c271914x2 = c06780Ok.LIZJ;
                C271914x c271914x3 = this.LJIIJ;
                if (c271914x3.LIZIZ == null) {
                    c271914x3.LIZIZ = new PointF();
                }
                if (c271914x.LIZJ || c271914x2.LIZJ) {
                    z = true;
                } else {
                    z = false;
                }
                c271914x3.LIZJ = z;
                if (((ArrayList) c271914x.LIZ).size() != ((ArrayList) c271914x2.LIZ).size()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Curves must have the same number of control points. Shape 1: ");
                    LIZ.append(((ArrayList) c271914x.LIZ).size());
                    LIZ.append("\tShape 2: ");
                    LIZ.append(((ArrayList) c271914x2.LIZ).size());
                    C0GR.LIZIZ(X1D.LIZIZ(LIZ));
                }
                if (((ArrayList) c271914x3.LIZ).isEmpty()) {
                    int min = Math.min(((ArrayList) c271914x.LIZ).size(), ((ArrayList) c271914x2.LIZ).size());
                    for (int i = 0; i < min; i++) {
                        ((ArrayList) c271914x3.LIZ).add(new C263311p());
                    }
                }
                PointF pointF2 = c271914x.LIZIZ;
                PointF pointF3 = c271914x2.LIZIZ;
                float f2 = pointF2.x;
                float LIZIZ = C06420Na.LIZIZ(pointF3.x, f2, f, f2);
                float f3 = pointF2.y;
                float LIZIZ2 = C06420Na.LIZIZ(pointF3.y, f3, f, f3);
                if (c271914x3.LIZIZ == null) {
                    c271914x3.LIZIZ = new PointF();
                }
                c271914x3.LIZIZ.set(LIZIZ, LIZIZ2);
                for (int size = ((ArrayList) c271914x3.LIZ).size() - 1; size >= 0; size--) {
                    C263311p c263311p = (C263311p) ListProtector.get(c271914x.LIZ, size);
                    C263311p c263311p2 = (C263311p) ListProtector.get(c271914x2.LIZ, size);
                    PointF pointF4 = c263311p.LIZ;
                    PointF pointF5 = c263311p.LIZIZ;
                    PointF pointF6 = c263311p.LIZJ;
                    PointF pointF7 = c263311p2.LIZ;
                    PointF pointF8 = c263311p2.LIZIZ;
                    PointF pointF9 = c263311p2.LIZJ;
                    C263311p c263311p3 = (C263311p) ListProtector.get(c271914x3.LIZ, size);
                    float f4 = pointF4.x;
                    float LIZIZ3 = C06420Na.LIZIZ(pointF7.x, f4, f, f4);
                    float f5 = pointF4.y;
                    c263311p3.LIZ.set(LIZIZ3, C06420Na.LIZIZ(pointF7.y, f5, f, f5));
                    C263311p c263311p4 = (C263311p) ListProtector.get(c271914x3.LIZ, size);
                    float f6 = pointF5.x;
                    float LIZIZ4 = C06420Na.LIZIZ(pointF8.x, f6, f, f6);
                    float f7 = pointF5.y;
                    c263311p4.LIZIZ.set(LIZIZ4, C06420Na.LIZIZ(pointF8.y, f7, f, f7));
                    C263311p c263311p5 = (C263311p) ListProtector.get(c271914x3.LIZ, size);
                    float f8 = pointF6.x;
                    float LIZIZ5 = C06420Na.LIZIZ(pointF9.x, f8, f, f8);
                    float f9 = pointF6.y;
                    c263311p5.LIZJ.set(LIZIZ5, C06420Na.LIZIZ(pointF9.y, f9, f, f9));
                }
                C271914x c271914x4 = this.LJIIJ;
                Path path = this.LJIIJJI;
                path.reset();
                PointF pointF10 = c271914x4.LIZIZ;
                path.moveTo(pointF10.x, pointF10.y);
                if (C03970Dp.LIZ) {
                    pointF = C06260Mk.LIZ.get();
                    pointF.set(pointF10.x, pointF10.y);
                } else {
                    pointF = new PointF(pointF10.x, pointF10.y);
                }
                for (int i2 = 0; i2 < ((ArrayList) c271914x4.LIZ).size(); i2++) {
                    C263311p c263311p6 = (C263311p) ListProtector.get(c271914x4.LIZ, i2);
                    PointF pointF11 = c263311p6.LIZ;
                    PointF pointF12 = c263311p6.LIZIZ;
                    PointF pointF13 = c263311p6.LIZJ;
                    if (pointF11.equals(pointF) && pointF12.equals(pointF13)) {
                        path.lineTo(pointF13.x, pointF13.y);
                    } else {
                        path.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
                    }
                    pointF.set(pointF13.x, pointF13.y);
                }
                if (c271914x4.LIZJ) {
                    path.close();
                }
                return this.LJIIJJI;
            }
        };
    }

    public C44501os(List<C06780Ok<C271914x>> list) {
        super(list, 0);
    }
}
