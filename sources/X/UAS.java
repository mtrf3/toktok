package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UAS {
    public String LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final U85 LJI;
    public boolean LJII;
    public final long LJIIIIZZ;
    public final U94 LJIIIZ;
    public final String LJIIJ;
    public final C76786UBq LJIIJJI;
    public final WeakReference<U66> LJIIL;
    public final String LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public final int LJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UAS)) {
            return false;
        }
        UAS uas = (UAS) obj;
        return o.LJ(this.LIZ, uas.LIZ) && o.LJ(this.LIZIZ, uas.LIZIZ) && o.LJ(this.LIZJ, uas.LIZJ) && o.LJ(this.LIZLLL, uas.LIZLLL) && o.LJ(this.LJ, uas.LJ) && o.LJ(this.LJFF, uas.LJFF) && this.LJI == uas.LJI && this.LJII == uas.LJII && this.LJIIIIZZ == uas.LJIIIIZZ && this.LJIIIZ == uas.LJIIIZ && o.LJ(this.LJIIJ, uas.LJIIJ) && o.LJ(this.LJIIJJI, uas.LJIIJJI) && o.LJ(this.LJIIL, uas.LJIIL) && o.LJ(this.LJIILIIL, uas.LJIILIIL) && this.LJIILJJIL == uas.LJIILJJIL && this.LJIILL == uas.LJIILL && this.LJIILLIIL == uas.LJIILLIIL && this.LJIIZILJ == uas.LJIIZILJ && this.LJIJ == uas.LJIJ && this.LJIJI == uas.LJIJI && this.LJIJJ == uas.LJIJJ && this.LJIJJLI == uas.LJIJJLI && this.LJIL == uas.LJIL && this.LJJ == uas.LJJ;
    }

    public final String LIZ() {
        switch (U9P.LIZ[this.LJI.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.LIZIZ;
            case 4:
            case 5:
            case 6:
                return this.LIZ;
            default:
                throw new C162476Zf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31);
        String str = this.LJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.LJFF;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int hashCode2 = (this.LJI.hashCode() + ((i2 + i) * 31)) * 31;
        boolean z = this.LJII;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int LJ2 = C79062V1e.LJ(this.LJIILIIL, (this.LJIIL.hashCode() + ((this.LJIIJJI.hashCode() + C79062V1e.LJ(this.LJIIJ, (this.LJIIIZ.hashCode() + JBR.LIZJ(this.LJIIIIZZ, (hashCode2 + i4) * 31, 31)) * 31, 31)) * 31)) * 31, 31);
        boolean z2 = this.LJIILJJIL;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i6 = (LJ2 + i5) * 31;
        boolean z3 = this.LJIILL;
        int i7 = z3;
        if (z3 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z4 = this.LJIILLIIL;
        int i9 = z4;
        if (z4 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z5 = this.LJIIZILJ;
        int i11 = z5;
        if (z5 != 0) {
            i11 = 1;
        }
        int LIZJ = JBR.LIZJ(this.LJIJJ, JBR.LIZJ(this.LJIJI, JBR.LIZJ(this.LJIJ, (i10 + i11) * 31, 31), 31), 31);
        boolean z6 = this.LJIJJLI;
        int i12 = z6;
        if (z6 != 0) {
            i12 = 1;
        }
        int i13 = (LIZJ + i12) * 31;
        if (!this.LJIL) {
            i3 = 0;
        }
        return ((i13 + i3) * 31) + this.LJJ;
    }

    public final String LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZ());
        LIZ.append('_');
        LIZ.append(this.LJI);
        return X1D.LIZIZ(LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("currentLinkMicId = ");
        LIZ.append(this.LIZ);
        LIZ.append(", remoteLinkMicId = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", remoteUserId = ");
        LIZ.append(this.LIZJ);
        LIZ.append(", roleForCurrentUser = ");
        LIZ.append(this.LJI);
        LIZ.append(", isLinked=");
        LIZ.append(this.LJII);
        LIZ.append(", beginTimestamp=");
        LIZ.append(this.LJIIIIZZ);
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZJ(String linkmicId) {
        EnumC76760UAq enumC76760UAq;
        o.LJIIIZ(linkmicId, "linkmicId");
        String LIZIZ = LIZIZ();
        this.LIZ = linkmicId;
        String LIZIZ2 = LIZIZ();
        if (!o.LJ(LIZIZ, LIZIZ2)) {
            C76786UBq c76786UBq = this.LJIIJJI;
            String u94 = this.LJIIIZ.toString();
            if (this.LJII) {
                enumC76760UAq = EnumC76760UAq.LINKED;
            } else {
                enumC76760UAq = EnumC76760UAq.LINKING;
            }
            c76786UBq.LJI(u94, enumC76760UAq.toString(), LIZIZ, LIZIZ2);
        }
    }

    public final void LIZLLL(String linkmicId) {
        EnumC76760UAq enumC76760UAq;
        o.LJIIIZ(linkmicId, "linkmicId");
        String LIZIZ = LIZIZ();
        this.LIZIZ = linkmicId;
        String LIZIZ2 = LIZIZ();
        if (!o.LJ(LIZIZ, LIZIZ2)) {
            C76786UBq c76786UBq = this.LJIIJJI;
            String u94 = this.LJIIIZ.toString();
            if (this.LJII) {
                enumC76760UAq = EnumC76760UAq.LINKED;
            } else {
                enumC76760UAq = EnumC76760UAq.LINKING;
            }
            c76786UBq.LJI(u94, enumC76760UAq.toString(), LIZIZ, LIZIZ2);
        }
    }

    public UAS(String str, String str2, String remoteUserId, String remoteRoomId, String str3, String str4, U85 roleForCurrentUser, long j, U94 scene, String str5, C76786UBq linkLayerSeqEventReporter, WeakReference weakReference, String currentRoomId, long j2, long j3, int i) {
        o.LJIIIZ(remoteUserId, "remoteUserId");
        o.LJIIIZ(remoteRoomId, "remoteRoomId");
        o.LJIIIZ(roleForCurrentUser, "roleForCurrentUser");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(linkLayerSeqEventReporter, "linkLayerSeqEventReporter");
        o.LJIIIZ(currentRoomId, "currentRoomId");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = remoteUserId;
        this.LIZLLL = remoteRoomId;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = roleForCurrentUser;
        this.LJII = false;
        this.LJIIIIZZ = j;
        this.LJIIIZ = scene;
        this.LJIIJ = str5;
        this.LJIIJJI = linkLayerSeqEventReporter;
        this.LJIIL = weakReference;
        this.LJIILIIL = currentRoomId;
        this.LJIILJJIL = false;
        this.LJIILL = false;
        this.LJIILLIIL = false;
        this.LJIIZILJ = false;
        this.LJIJ = j2;
        this.LJIJI = 0L;
        this.LJIJJ = j3;
        this.LJIJJLI = false;
        this.LJIL = false;
        this.LJJ = i;
    }
}
