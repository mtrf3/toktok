package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.1QL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QL implements InterfaceC11350cV {
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final Object LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final long LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final boolean LJIIJJI;
    public final List<C11340cU> LJIIL;
    public final C11370cX LJIILIIL;
    public final long LJIILJJIL;
    public final boolean LJIILL;

    public C1QL() {
        throw null;
    }

    public final int LJFF() {
        int i;
        int i2 = this.LJIIIIZZ;
        if (this.LJIIJJI) {
            i = C23490w5.LIZIZ(this.LJI);
        } else {
            i = (int) (this.LJI >> 32);
        }
        return i2 + i;
    }

    @Override // X.InterfaceC11350cV
    public final long LIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC11350cV
    public final int LIZIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC11350cV
    public final long LIZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC11350cV
    public final int LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC11350cV
    public final int getIndex() {
        return this.LIZJ;
    }

    public final C1J4<C23450w1> LJ(int i) {
        Object obj = ((C11340cU) ListProtector.get(this.LJIIL, i)).LIZIZ;
        if (obj instanceof C1J4) {
            return (C1J4) obj;
        }
        return null;
    }

    public C1QL(long j, long j2, int i, Object obj, int i2, int i3, long j3, int i4, int i5, int i6, int i7, boolean z, List list, C11370cX c11370cX, long j4) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = i;
        this.LIZLLL = obj;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = j3;
        this.LJII = i4;
        this.LJIIIIZZ = i5;
        this.LJIIIZ = i6;
        this.LJIIJ = i7;
        this.LJIIJJI = z;
        this.LJIIL = list;
        this.LJIILIIL = c11370cX;
        this.LJIILJJIL = j4;
        int size = list.size();
        boolean z2 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                break;
            }
            if (LJ(i8) != null) {
                z2 = true;
                break;
            }
            i8++;
        }
        this.LJIILL = z2;
    }
}
