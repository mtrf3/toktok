package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0vP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23070vP {
    public final C279917z LIZ;
    public final InterfaceC88471Ynr<Long, Integer, C76800UCe> LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23070vP)) {
            return false;
        }
        C23070vP c23070vP = (C23070vP) obj;
        return o.LJ(this.LIZ, c23070vP.LIZ) && o.LJ(this.LIZIZ, c23070vP.LIZIZ) && this.LIZJ == c23070vP.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        InterfaceC88471Ynr<Long, Integer, C76800UCe> interfaceC88471Ynr = this.LIZIZ;
        int hashCode2 = (hashCode + (interfaceC88471Ynr == null ? 0 : interfaceC88471Ynr.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KaraokeDownloadTask(songInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", callback=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", lyricOnly=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C23070vP(C279917z songInfo, InterfaceC88471Ynr<? super Long, ? super Integer, C76800UCe> interfaceC88471Ynr, boolean z) {
        o.LJIIIZ(songInfo, "songInfo");
        this.LIZ = songInfo;
        this.LIZIZ = interfaceC88471Ynr;
        this.LIZJ = z;
    }
}
