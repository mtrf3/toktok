package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Ul, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33831Ul extends AbstractC16010k1 {
    public final InterfaceC12040dc LJLJJLL;
    public final long LJLJL;
    public final long LJLJLJ;
    public int LJLJLLL;
    public final long LJLL;
    public float LJLLI;
    public C11890dN LJLLILLLL;

    @Override // X.AbstractC16010k1
    public final long LJI() {
        return C78996UzQ.LJJJJIZL(this.LJLL);
    }

    public final int hashCode() {
        return JBR.LIZJ(this.LJLJLJ, JBR.LIZJ(this.LJLJL, this.LJLJJLL.hashCode() * 31, 31), 31) + this.LJLJLLL;
    }

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BitmapPainter(image=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", srcOffset=");
        LIZ.append((Object) C23450w1.LIZLLL(this.LJLJL));
        LIZ.append(", srcSize=");
        LIZ.append((Object) C23490w5.LIZJ(this.LJLJLJ));
        LIZ.append(", filterQuality=");
        int i = this.LJLJLLL;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else if (i == 3) {
            str = "High";
        } else {
            str = "Unknown";
        }
        LIZ.append((Object) str);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C33831Ul(InterfaceC12040dc interfaceC12040dc) {
        this(interfaceC12040dc, C23450w1.LIZIZ, C78996UzQ.LIZIZ(interfaceC12040dc.getWidth(), interfaceC12040dc.getHeight()));
    }

    @Override // X.AbstractC16010k1
    public final boolean LIZ(float f) {
        this.LJLLI = f;
        return true;
    }

    @Override // X.AbstractC16010k1
    public final boolean LJ(C11890dN c11890dN) {
        this.LJLLILLLL = c11890dN;
        return true;
    }

    @Override // X.AbstractC16010k1
    public final void LJII(InterfaceC33691Tx interfaceC33691Tx) {
        o.LJIIIZ(interfaceC33691Tx, "<this>");
        C14720hw.LIZLLL(interfaceC33691Tx, this.LJLJJLL, this.LJLJL, this.LJLJLJ, C78996UzQ.LIZIZ(O6R.LJJIIZ(C10430b1.LIZLLL(interfaceC33691Tx.LIZIZ())), O6R.LJJIIZ(C10430b1.LIZIZ(interfaceC33691Tx.LIZIZ()))), this.LJLLI, this.LJLLILLLL, this.LJLJLLL, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33831Ul)) {
            return false;
        }
        C33831Ul c33831Ul = (C33831Ul) obj;
        if (o.LJ(this.LJLJJLL, c33831Ul.LJLJJLL) && C23450w1.LIZIZ(this.LJLJL, c33831Ul.LJLJL) && C23490w5.LIZ(this.LJLJLJ, c33831Ul.LJLJLJ) && this.LJLJLLL == c33831Ul.LJLJLLL) {
            return true;
        }
        return false;
    }

    public C33831Ul(InterfaceC12040dc interfaceC12040dc, long j, long j2) {
        int i;
        this.LJLJJLL = interfaceC12040dc;
        this.LJLJL = j;
        this.LJLJLJ = j2;
        this.LJLJLLL = 1;
        if (((int) (j >> 32)) >= 0 && C23450w1.LIZJ(j) >= 0 && (i = (int) (j2 >> 32)) >= 0 && C23490w5.LIZIZ(j2) >= 0 && i <= interfaceC12040dc.getWidth() && C23490w5.LIZIZ(j2) <= interfaceC12040dc.getHeight()) {
            this.LJLL = j2;
            this.LJLLI = 1.0f;
        } else {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
