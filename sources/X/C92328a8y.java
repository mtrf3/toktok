package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a8y, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92328a8y extends C92108a5Q {
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final int hashCode() {
        return (((((((this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PayResultProcessing(msg=");
        LIZ.append(this.LIZJ);
        LIZ.append(", orderId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", orderTime=");
        LIZ.append(this.LJ);
        LIZ.append(", paymentMethod=");
        LIZ.append(this.LJFF);
        LIZ.append(", amount=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C92108a5Q
    public final String LIZ() {
        return this.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92328a8y)) {
            return false;
        }
        C92328a8y c92328a8y = (C92328a8y) obj;
        if (o.LJ(this.LIZJ, c92328a8y.LIZJ) && o.LJ(this.LIZLLL, c92328a8y.LIZLLL) && o.LJ(this.LJ, c92328a8y.LJ) && o.LJ(this.LJFF, c92328a8y.LJFF) && o.LJ(this.LJI, c92328a8y.LJI)) {
            return true;
        }
        return false;
    }

    public C92328a8y(String str, String str2, String str3, String str4, String str5) {
        super(EnumC92109a5R.PENDING, str);
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
    }
}
