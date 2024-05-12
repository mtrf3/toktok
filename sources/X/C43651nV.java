package X;

import android.graphics.Matrix;
import android.graphics.Path;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.1nV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43651nV implements InterfaceC34851Yj, InterfaceC20650rV {
    public final Path LIZ = new Path();
    public final Path LIZIZ = new Path();
    public final Path LIZJ = new Path();
    public final List<InterfaceC34851Yj> LIZLLL = new ArrayList();
    public final C38801fg LJ;

    @Override // X.InterfaceC34851Yj
    public final Path getPath() {
        this.LIZJ.reset();
        int i = C20660rW.LIZ[this.LJ.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            LIZIZ(Path.Op.XOR);
                        }
                    } else {
                        LIZIZ(Path.Op.INTERSECT);
                    }
                } else {
                    LIZIZ(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                LIZIZ(Path.Op.UNION);
            }
        } else {
            for (int i2 = 0; i2 < ((ArrayList) this.LIZLLL).size(); i2++) {
                this.LIZJ.addPath(((InterfaceC34851Yj) ListProtector.get(this.LIZLLL, i2)).getPath());
            }
        }
        return this.LIZJ;
    }

    public C43651nV(C38801fg c38801fg) {
        this.LJ = c38801fg;
    }

    public final void LIZIZ(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        this.LIZIZ.reset();
        this.LIZ.reset();
        for (int size = ((ArrayList) this.LIZLLL).size() - 1; size >= 1; size--) {
            InterfaceC34851Yj interfaceC34851Yj = (InterfaceC34851Yj) ListProtector.get(this.LIZLLL, size);
            if (interfaceC34851Yj instanceof C43611nR) {
                C43611nR c43611nR = (C43611nR) interfaceC34851Yj;
                List<InterfaceC34851Yj> LJFF = c43611nR.LJFF();
                for (int size2 = LJFF.size() - 1; size2 >= 0; size2--) {
                    Path path = ((InterfaceC34851Yj) ListProtector.get(LJFF, size2)).getPath();
                    C22670ul c22670ul = c43611nR.LJII;
                    if (c22670ul != null) {
                        matrix2 = c22670ul.LIZLLL();
                    } else {
                        c43611nR.LIZ.reset();
                        matrix2 = c43611nR.LIZ;
                    }
                    path.transform(matrix2);
                    this.LIZIZ.addPath(path);
                }
            } else {
                this.LIZIZ.addPath(interfaceC34851Yj.getPath());
            }
        }
        InterfaceC34851Yj interfaceC34851Yj2 = (InterfaceC34851Yj) ListProtector.get(this.LIZLLL, 0);
        if (interfaceC34851Yj2 instanceof C43611nR) {
            C43611nR c43611nR2 = (C43611nR) interfaceC34851Yj2;
            List<InterfaceC34851Yj> LJFF2 = c43611nR2.LJFF();
            for (int i = 0; i < LJFF2.size(); i++) {
                Path path2 = ((InterfaceC34851Yj) ListProtector.get(LJFF2, i)).getPath();
                C22670ul c22670ul2 = c43611nR2.LJII;
                if (c22670ul2 != null) {
                    matrix = c22670ul2.LIZLLL();
                } else {
                    c43611nR2.LIZ.reset();
                    matrix = c43611nR2.LIZ;
                }
                path2.transform(matrix);
                this.LIZ.addPath(path2);
            }
        } else {
            this.LIZ.set(interfaceC34851Yj2.getPath());
        }
        this.LIZJ.op(this.LIZ, this.LIZIZ, op);
    }

    @Override // X.InterfaceC20650rV
    public final void LJFF(ListIterator<InterfaceC20640rU> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC20640rU previous = listIterator.previous();
            if (previous instanceof InterfaceC34851Yj) {
                ((ArrayList) this.LIZLLL).add(previous);
                listIterator.remove();
            }
        }
    }

    @Override // X.InterfaceC20640rU
    public final void LIZLLL(List<InterfaceC20640rU> list, List<InterfaceC20640rU> list2) {
        for (int i = 0; i < ((ArrayList) this.LIZLLL).size(); i++) {
            ((InterfaceC20640rU) ListProtector.get(this.LIZLLL, i)).LIZLLL(list, list2);
        }
    }
}
