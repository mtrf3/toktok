package X;

import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.1aF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35431aF implements InterfaceC23370vt {
    public final float LJLIL;
    public final float LJLILLLLZI;

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ long LJIJ(long j) {
        return a1.LIZIZ(j, this);
    }

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ int LJJIJ(float f) {
        return a1.LIZ(f, this);
    }

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ float LJJIJL(long j) {
        return a1.LIZJ(j, this);
    }

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ long LJJLI(long j) {
        return a1.LIZLLL(j, this);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LJLILLLLZI) + (Float.floatToIntBits(this.LJLIL) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DensityImpl(density=");
        LIZ.append(this.LJLIL);
        LIZ.append(", fontScale=");
        return C74221TAz.LIZLLL(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJI() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC23370vt
    public final float getDensity() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJIZL(float f) {
        return getDensity() * f;
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLL(int i) {
        return i / this.LJLIL;
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLZIJ(float f) {
        return f / getDensity();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35431aF)) {
            return false;
        }
        C35431aF c35431aF = (C35431aF) obj;
        if (o.LJ(Float.valueOf(this.LJLIL), Float.valueOf(c35431aF.LJLIL)) && o.LJ(Float.valueOf(this.LJLILLLLZI), Float.valueOf(c35431aF.LJLILLLLZI))) {
            return true;
        }
        return false;
    }

    public C35431aF(float f, float f2) {
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
    }
}
