package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7AV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7AV implements C33Q {
    public final C43I<String> LJLIL;
    public final C43I<C76800UCe> LJLILLLLZI;

    public C7AV() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7AV)) {
            return false;
        }
        C7AV c7av = (C7AV) obj;
        return o.LJ(this.LJLIL, c7av.LJLIL) && o.LJ(this.LJLILLLLZI, c7av.LJLILLLLZI);
    }

    public final int hashCode() {
        C43I<String> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<C76800UCe> c43i2 = this.LJLILLLLZI;
        return hashCode + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoQuickCommentState(onClickQuickEmojiEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", onQuickCommentReadyEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C7AV(C43I<String> c43i, C43I<C76800UCe> c43i2) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
    }
}
