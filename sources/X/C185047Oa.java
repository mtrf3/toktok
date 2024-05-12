package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7Oa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185047Oa implements C33Q {
    public final String LJLIL;
    public final boolean LJLILLLLZI;

    public C185047Oa() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C185047Oa)) {
            return false;
        }
        C185047Oa c185047Oa = (C185047Oa) obj;
        return o.LJ(this.LJLIL, c185047Oa.LJLIL) && this.LJLILLLLZI == c185047Oa.LJLILLLLZI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PostModeCommentState(commentCountText=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isCommentCountVisible=");
        return C48339Iy7.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public /* synthetic */ C185047Oa(int i) {
        this("", true);
    }

    public C185047Oa(String str, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
    }
}
