package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Vq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34141Vq extends AbstractC17370mD {
    public final C33541Ti LIZ;
    public final int LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34141Vq)) {
            return false;
        }
        C34141Vq c34141Vq = (C34141Vq) obj;
        return o.LJ(this.LIZ, c34141Vq.LIZ) && this.LIZIZ == c34141Vq.LIZIZ && this.LIZJ == c34141Vq.LIZJ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZJ) + (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddFavoriteSongs(songList=");
        LIZ.append(this.LIZ);
        LIZ.append(", startPosition=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", addNum=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C34141Vq(C33541Ti songList, int i, long j) {
        o.LJIIIZ(songList, "songList");
        this.LIZ = songList;
        this.LIZIZ = i;
        this.LIZJ = j;
    }
}
