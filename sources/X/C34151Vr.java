package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Vr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34151Vr extends AbstractC17370mD {
    public final long LIZ;
    public final C33541Ti LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34151Vr)) {
            return false;
        }
        C34151Vr c34151Vr = (C34151Vr) obj;
        return this.LIZ == c34151Vr.LIZ && o.LJ(this.LIZIZ, c34151Vr.LIZIZ) && this.LIZJ == c34151Vr.LIZJ && this.LIZLLL == c34151Vr.LIZLLL;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZLLL) + ((((this.LIZIZ.hashCode() + (C16880lQ.LLJIJIL(this.LIZ) * 31)) * 31) + this.LIZJ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddSongs(albumId=");
        LIZ.append(this.LIZ);
        LIZ.append(", songList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", startPosition=");
        LIZ.append(this.LIZJ);
        LIZ.append(", addNum=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C34151Vr(long j, C33541Ti songList, int i, long j2) {
        o.LJIIIZ(songList, "songList");
        this.LIZ = j;
        this.LIZIZ = songList;
        this.LIZJ = i;
        this.LIZLLL = j2;
    }
}
