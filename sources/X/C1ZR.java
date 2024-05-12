package X;

import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.1ZR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZR implements InterfaceC22120ts {
    public final AbstractC32681Qa LIZIZ;
    public final float LIZJ;

    @Override // X.InterfaceC22120ts
    public final /* synthetic */ InterfaceC22120ts LIZIZ(InterfaceC22120ts interfaceC22120ts) {
        return i0.LIZ(this, interfaceC22120ts);
    }

    @Override // X.InterfaceC22120ts
    public final /* synthetic */ InterfaceC22120ts LJ(InterfaceC65784Pro interfaceC65784Pro) {
        return i0.LIZIZ(this, interfaceC65784Pro);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZJ) + (this.LIZIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BrushStyle(value=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", alpha=");
        return C74221TAz.LIZLLL(LIZ, this.LIZJ, ')', LIZ);
    }

    @Override // X.InterfaceC22120ts
    public final float LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC22120ts
    public final long LIZJ() {
        return C11850dJ.LJI;
    }

    @Override // X.InterfaceC22120ts
    public final AbstractC11740d8 LIZLLL() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1ZR)) {
            return false;
        }
        C1ZR c1zr = (C1ZR) obj;
        if (o.LJ(this.LIZIZ, c1zr.LIZIZ) && o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(c1zr.LIZJ))) {
            return true;
        }
        return false;
    }

    public C1ZR(AbstractC32681Qa value, float f) {
        o.LJIIIZ(value, "value");
        this.LIZIZ = value;
        this.LIZJ = f;
    }
}
