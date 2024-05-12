package X;

import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.57B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57B {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final C56A LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final float LJII;
    public final InterfaceC65784Pro<TextView> LJIIIIZZ;
    public final InterfaceC88472Yns<TextView, C76800UCe> LJIIIZ;

    public C57B() {
        this(0, 0, null, 0, 0.0f, null, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57B)) {
            return false;
        }
        C57B c57b = (C57B) obj;
        return this.LIZ == c57b.LIZ && this.LIZIZ == c57b.LIZIZ && this.LIZJ == c57b.LIZJ && this.LIZLLL == c57b.LIZLLL && this.LJ == c57b.LJ && this.LJFF == c57b.LJFF && this.LJI == c57b.LJI && Float.compare(this.LJII, c57b.LJII) == 0 && o.LJ(this.LJIIIIZZ, c57b.LJIIIIZZ) && o.LJ(this.LJIIIZ, c57b.LJIIIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LIZIZ = C47959Irz.LIZIZ(this.LJII, (((((((this.LIZLLL.hashCode() + (((((r0 * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31)) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31, 31);
        InterfaceC65784Pro<TextView> interfaceC65784Pro = this.LJIIIIZZ;
        int i = 0;
        if (interfaceC65784Pro == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC65784Pro.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        InterfaceC88472Yns<TextView, C76800UCe> interfaceC88472Yns = this.LJIIIZ;
        if (interfaceC88472Yns != null) {
            i = interfaceC88472Yns.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResourceTextConfig(enableText=");
        LIZ.append(this.LIZ);
        LIZ.append(", textColor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", textSelectedColor=");
        LIZ.append(this.LIZJ);
        LIZ.append(", textPosition=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", textMaxLen=");
        LIZ.append(this.LJ);
        LIZ.append(", textSize=");
        LIZ.append(this.LJFF);
        LIZ.append(", textMargin=");
        LIZ.append(this.LJI);
        LIZ.append(", textDisableAlpha=");
        LIZ.append(this.LJII);
        LIZ.append(", createCustomTextView=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", onCustomTextViewSelect=");
        return C249109q6.LIZIZ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C57B(int i, int i2, C56A textPosition, int i3, float f, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, int i4) {
        boolean z;
        int i5;
        if ((i4 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        i = (i4 & 2) != 0 ? -1 : i;
        i2 = (i4 & 4) != 0 ? i : i2;
        textPosition = (i4 & 8) != 0 ? C56A.UP : textPosition;
        if ((i4 & 16) != 0) {
            i5 = 12;
        } else {
            i5 = 0;
        }
        int i6 = (i4 & 32) != 0 ? 14 : 0;
        i3 = (i4 & 64) != 0 ? 3 : i3;
        f = (i4 & 128) != 0 ? 0.3f : f;
        interfaceC65784Pro = (i4 & 256) != 0 ? null : interfaceC65784Pro;
        interfaceC88472Yns = (i4 & 512) != 0 ? null : interfaceC88472Yns;
        o.LJIIIZ(textPosition, "textPosition");
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = textPosition;
        this.LJ = i5;
        this.LJFF = i6;
        this.LJI = i3;
        this.LJII = f;
        this.LJIIIIZZ = interfaceC65784Pro;
        this.LJIIIZ = interfaceC88472Yns;
    }
}
