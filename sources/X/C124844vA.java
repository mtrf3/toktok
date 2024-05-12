package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.4vA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124844vA {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final int LJIIJ;
    public final boolean LJIIJJI;
    public final Long LJIIL;
    public final String LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C124844vA)) {
            return false;
        }
        C124844vA c124844vA = (C124844vA) obj;
        return o.LJ(this.LIZ, c124844vA.LIZ) && o.LJ(this.LIZIZ, c124844vA.LIZIZ) && o.LJ(this.LIZJ, c124844vA.LIZJ) && this.LIZLLL == c124844vA.LIZLLL && this.LJ == c124844vA.LJ && this.LJFF == c124844vA.LJFF && this.LJI == c124844vA.LJI && this.LJII == c124844vA.LJII && this.LJIIIIZZ == c124844vA.LJIIIIZZ && this.LJIIIZ == c124844vA.LJIIIZ && this.LJIIJ == c124844vA.LJIIJ && this.LJIIJJI == c124844vA.LJIIJJI && o.LJ(this.LJIIL, c124844vA.LJIIL) && o.LJ(this.LJIILIIL, c124844vA.LJIILIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJ, JBR.LIZJ(this.LIZLLL, (LJ + hashCode) * 31, 31), 31);
        boolean z = this.LJFF;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (LIZJ + i3) * 31;
        boolean z2 = this.LJI;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z3 = this.LJII;
        int i7 = z3;
        if (z3 != 0) {
            i7 = 1;
        }
        int LIZJ2 = (JBR.LIZJ(this.LJIIIZ, JBR.LIZJ(this.LJIIIIZZ, (i6 + i7) * 31, 31), 31) + this.LJIIJ) * 31;
        if (!this.LJIIJJI) {
            i2 = 0;
        }
        int i8 = (LIZJ2 + i2) * 31;
        Long l = this.LJIIL;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        String str2 = this.LJIILIIL;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioParam(audioName=");
        sb.append(this.LIZ);
        sb.append(", audioPath=");
        sb.append(this.LIZIZ);
        sb.append(", audioId=");
        sb.append(this.LIZJ);
        sb.append(", startTime=");
        sb.append(this.LIZLLL);
        sb.append(", endTime=");
        sb.append(this.LJ);
        sb.append(", isMoveTrack=");
        sb.append(this.LJFF);
        sb.append(", isFromRecord=");
        sb.append(this.LJI);
        sb.append(", isAudioEffect=");
        sb.append(this.LJII);
        sb.append(", timeClipStart=");
        sb.append(this.LJIIIIZZ);
        sb.append(", timeClipEnd=");
        sb.append(this.LJIIIZ);
        sb.append(", audioTrackLayer=");
        sb.append(this.LJIIJ);
        sb.append(", isTTSAudio=");
        sb.append(this.LJIIJJI);
        sb.append(", duration=");
        sb.append(this.LJIIL);
        sb.append(", audioTrackType=");
        return C07670Rv.LIZIZ(sb, this.LJIILIIL, ')');
    }

    public static C124844vA LIZ(C124844vA c124844vA, int i) {
        String audioName = c124844vA.LIZ;
        String audioPath = c124844vA.LIZIZ;
        String str = c124844vA.LIZJ;
        long j = c124844vA.LIZLLL;
        long j2 = c124844vA.LJ;
        boolean z = c124844vA.LJFF;
        boolean z2 = c124844vA.LJI;
        boolean z3 = c124844vA.LJII;
        long j3 = c124844vA.LJIIIIZZ;
        long j4 = c124844vA.LJIIIZ;
        boolean z4 = c124844vA.LJIIJJI;
        Long l = c124844vA.LJIIL;
        String str2 = c124844vA.LJIILIIL;
        c124844vA.getClass();
        o.LJIIIZ(audioName, "audioName");
        o.LJIIIZ(audioPath, "audioPath");
        return new C124844vA(audioName, audioPath, str, j, j2, z, z2, z3, j3, j4, i, z4, l, str2);
    }

    public /* synthetic */ C124844vA(String str, String str2, String str3, long j, long j2, boolean z, boolean z2, long j3, int i, boolean z3, Long l, String str4, int i2) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? 0L : j2, false, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? 0L : j3, 0L, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? false : z3, (i2 & 4096) != 0 ? null : l, (i2 & FileUtils.BUFFER_SIZE) == 0 ? str4 : null);
    }

    public C124844vA(String audioName, String audioPath, String str, long j, long j2, boolean z, boolean z2, boolean z3, long j3, long j4, int i, boolean z4, Long l, String str2) {
        o.LJIIIZ(audioName, "audioName");
        o.LJIIIZ(audioPath, "audioPath");
        this.LIZ = audioName;
        this.LIZIZ = audioPath;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = j3;
        this.LJIIIZ = j4;
        this.LJIIJ = i;
        this.LJIIJJI = z4;
        this.LJIIL = l;
        this.LJIILIIL = str2;
    }
}
