package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E33 {
    public final SSU LIZ;
    public final int LIZIZ;
    public final Boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E33)) {
            return false;
        }
        E33 e33 = (E33) obj;
        return this.LIZ == e33.LIZ && this.LIZIZ == e33.LIZIZ && o.LJ(this.LIZJ, e33.LIZJ);
    }

    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        Boolean bool = this.LIZJ;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarDownloadInfo(state=");
        LIZ.append(this.LIZ);
        LIZ.append(", finishedCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isSuccessful=");
        return C78920UyC.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public E33(SSU state, int i, Boolean bool) {
        o.LJIIIZ(state, "state");
        this.LIZ = state;
        this.LIZIZ = i;
        this.LIZJ = bool;
    }

    public /* synthetic */ E33(SSU ssu, int i, int i2) {
        this(ssu, (i2 & 2) != 0 ? 0 : i, (Boolean) null);
    }
}
