package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ulw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78160Ulw {
    public final long LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final java.util.Map<String, String> LJ;
    public final int LJFF;
    public final boolean LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;
    public final String LJIIL;
    public final HashMap<String, Long> LJIILIIL;
    public final boolean LJIILJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78160Ulw)) {
            return false;
        }
        C78160Ulw c78160Ulw = (C78160Ulw) obj;
        return this.LIZ == c78160Ulw.LIZ && o.LJ(this.LIZIZ, c78160Ulw.LIZIZ) && this.LIZJ == c78160Ulw.LIZJ && o.LJ(this.LIZLLL, c78160Ulw.LIZLLL) && o.LJ(this.LJ, c78160Ulw.LJ) && this.LJFF == c78160Ulw.LJFF && this.LJI == c78160Ulw.LJI && this.LJII == c78160Ulw.LJII && this.LJIIIIZZ == c78160Ulw.LJIIIIZZ && this.LJIIIZ == c78160Ulw.LJIIIZ && this.LJIIJ == c78160Ulw.LJIIJ && this.LJIIJJI == c78160Ulw.LJIIJJI && o.LJ(this.LJIIL, c78160Ulw.LJIIL) && o.LJ(this.LJIILIIL, c78160Ulw.LJIILIIL) && this.LJIILJJIL == c78160Ulw.LJIILJJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        String str = this.LIZIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LLJIJIL + hashCode) * 31;
        boolean z = this.LIZJ;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int LJ = C79062V1e.LJ(this.LIZLLL, (i2 + i4) * 31, 31);
        java.util.Map<String, String> map = this.LJ;
        if (map != null) {
            i = map.hashCode();
        }
        int i5 = (((LJ + i) * 31) + this.LJFF) * 31;
        boolean z2 = this.LJI;
        int i6 = z2;
        if (z2 != 0) {
            i6 = 1;
        }
        int hashCode2 = (this.LJIILIIL.hashCode() + C79062V1e.LJ(this.LJIIL, JBR.LIZJ(this.LJIIJJI, JBR.LIZJ(this.LJIIJ, JBR.LIZJ(this.LJIIIZ, JBR.LIZJ(this.LJIIIIZZ, JBR.LIZJ(this.LJII, (i5 + i6) * 31, 31), 31), 31), 31), 31), 31)) * 31;
        if (!this.LJIILJJIL) {
            i3 = 0;
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MonitorExtra(msgId=");
        sb.append(this.LIZ);
        sb.append(", logId=");
        sb.append(this.LIZIZ);
        sb.append(", isLocalMsg=");
        sb.append(this.LIZJ);
        sb.append(", roomType=");
        sb.append(this.LIZLLL);
        sb.append(", giftCommonParams=");
        sb.append(this.LJ);
        sb.append(", trayPosition=");
        sb.append(this.LJFF);
        sb.append(", isCachedResource=");
        sb.append(this.LJI);
        sb.append(", receiveGiftTime=");
        sb.append(this.LJII);
        sb.append(", sendReceiveDuration=");
        sb.append(this.LJIIIIZZ);
        sb.append(", beforeQueueDuration=");
        sb.append(this.LJIIIZ);
        sb.append(", inQueueDuration=");
        sb.append(this.LJIIJ);
        sb.append(", dequeueTime=");
        sb.append(this.LJIIJJI);
        sb.append(", resourceFormat=");
        sb.append(this.LJIIL);
        sb.append(", tsMap=");
        sb.append(this.LJIILIIL);
        sb.append(", isReceiver=");
        return C08880Wm.LIZJ(sb, this.LJIILJJIL, ')');
    }

    public C78160Ulw(long j, String str, boolean z, String roomType, java.util.Map<String, String> map, int i, boolean z2, long j2, long j3, long j4, long j5, long j6, String str2, HashMap<String, Long> tsMap, boolean z3) {
        o.LJIIIZ(roomType, "roomType");
        o.LJIIIZ(tsMap, "tsMap");
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = roomType;
        this.LJ = map;
        this.LJFF = i;
        this.LJI = z2;
        this.LJII = j2;
        this.LJIIIIZZ = j3;
        this.LJIIIZ = j4;
        this.LJIIJ = j5;
        this.LJIIJJI = j6;
        this.LJIIL = str2;
        this.LJIILIIL = tsMap;
        this.LJIILJJIL = z3;
    }
}
