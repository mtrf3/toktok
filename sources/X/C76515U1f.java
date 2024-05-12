package X;

import android.text.SpannableString;
import kotlin.jvm.internal.o;

/* renamed from: X.U1f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76515U1f {
    public final AbstractC76516U1g LIZ;
    public final boolean LIZIZ;
    public final SpannableString LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76515U1f)) {
            return false;
        }
        C76515U1f c76515U1f = (C76515U1f) obj;
        return o.LJ(this.LIZ, c76515U1f.LIZ) && this.LIZIZ == c76515U1f.LIZIZ && o.LJ(this.LIZJ, c76515U1f.LIZJ) && this.LIZLLL == c76515U1f.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        SpannableString spannableString = this.LIZJ;
        return ((i2 + (spannableString == null ? 0 : spannableString.hashCode())) * 31) + (this.LIZLLL ? 1 : 0);
    }

    public C76515U1f() {
        this(C76518U1i.LIZ, true, null, false);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MatchBottomContentConfig(contentType=");
        LIZ.append(this.LIZ);
        LIZ.append(", singleLine=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", contentText=");
        LIZ.append((Object) this.LIZJ);
        LIZ.append(", isMultiScene=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C76515U1f(AbstractC76516U1g contentType, boolean z, SpannableString spannableString, boolean z2) {
        o.LJIIIZ(contentType, "contentType");
        this.LIZ = contentType;
        this.LIZIZ = z;
        this.LIZJ = spannableString;
        this.LIZLLL = z2;
    }
}
