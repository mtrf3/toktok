package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class INU {
    public final int LIZ;
    public final String LIZIZ;
    public final InterfaceC15800jg LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof INU)) {
            return false;
        }
        INU inu = (INU) obj;
        return this.LIZ == inu.LIZ && o.LJ(this.LIZIZ, inu.LIZIZ) && o.LJ(this.LIZJ, inu.LIZJ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC15800jg interfaceC15800jg = this.LIZJ;
        return hashCode + (interfaceC15800jg != null ? interfaceC15800jg.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentGiftAction(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", commentInput=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", highlightHandler=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public INU(int i, String str, InterfaceC15800jg interfaceC15800jg, int i2) {
        str = (i2 & 2) != 0 ? null : str;
        interfaceC15800jg = (i2 & 4) != 0 ? null : interfaceC15800jg;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = interfaceC15800jg;
    }
}
