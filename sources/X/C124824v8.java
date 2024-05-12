package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4v8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124824v8 {
    public final Float LIZ;
    public final Boolean LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC124814v7 LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C124824v8)) {
            return false;
        }
        C124824v8 c124824v8 = (C124824v8) obj;
        return o.LJ(this.LIZ, c124824v8.LIZ) && o.LJ(this.LIZIZ, c124824v8.LIZIZ) && this.LIZJ == c124824v8.LIZJ && o.LJ(this.LIZLLL, c124824v8.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Float f = this.LIZ;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Boolean bool = this.LIZIZ;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        InterfaceC124814v7 interfaceC124814v7 = this.LIZLLL;
        return i2 + (interfaceC124814v7 != null ? interfaceC124814v7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangeSpeedParam(speed=");
        LIZ.append(this.LIZ);
        LIZ.append(", changeTone=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", keepPlay=");
        LIZ.append(this.LIZJ);
        LIZ.append(", listener=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C124824v8(Float f, Boolean bool, boolean z, C125544wI c125544wI) {
        this.LIZ = f;
        this.LIZIZ = bool;
        this.LIZJ = z;
        this.LIZLLL = c125544wI;
    }
}
