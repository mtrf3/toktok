package X;

import android.text.SpannableString;
import kotlin.jvm.internal.o;

/* renamed from: X.8Uf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212138Uf implements C33Q {
    public final boolean LJLIL;
    public final SpannableString LJLILLLLZI;

    public C212138Uf() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C212138Uf)) {
            return false;
        }
        C212138Uf c212138Uf = (C212138Uf) obj;
        return this.LJLIL == c212138Uf.LJLIL && o.LJ(this.LJLILLLLZI, c212138Uf.LJLILLLLZI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        SpannableString spannableString = this.LJLILLLLZI;
        return i + (spannableString == null ? 0 : spannableString.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoTopCautionState(visible=");
        LIZ.append(this.LJLIL);
        LIZ.append(", text=");
        LIZ.append((Object) this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C212138Uf(int i) {
        this(null, false);
    }

    public C212138Uf(SpannableString spannableString, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = spannableString;
    }
}
