package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Umr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78217Umr {
    public final long LIZ;
    public final long LIZIZ;
    public final android.net.Uri LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final long LJII;
    public InterfaceC88471Ynr<? super Integer, ? super String, C76800UCe> LJIIIIZZ;
    public InterfaceC65784Pro<C76800UCe> LJIIIZ;
    public InterfaceC88471Ynr<? super Integer, ? super String, C76800UCe> LJIIJ;
    public InterfaceC78206Umg LJIIJJI;
    public final JSONObject LJIIL;

    public C78217Umr() {
        this(0L, 0L, null, 0L, 0L, false, false, 0L, null, 8191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78217Umr)) {
            return false;
        }
        C78217Umr c78217Umr = (C78217Umr) obj;
        return this.LIZ == c78217Umr.LIZ && this.LIZIZ == c78217Umr.LIZIZ && o.LJ(this.LIZJ, c78217Umr.LIZJ) && this.LIZLLL == c78217Umr.LIZLLL && this.LJ == c78217Umr.LJ && this.LJFF == c78217Umr.LJFF && this.LJI == c78217Umr.LJI && this.LJII == c78217Umr.LJII && o.LJ(this.LJIIIIZZ, c78217Umr.LJIIIIZZ) && o.LJ(this.LJIIIZ, c78217Umr.LJIIIZ) && o.LJ(this.LJIIJ, c78217Umr.LJIIJ) && o.LJ(this.LJIIJJI, c78217Umr.LJIIJJI) && o.LJ(this.LJIIL, c78217Umr.LJIIL);
    }

    public final String toString() {
        return "LynxInfo(assetsId=" + this.LIZ + ", giftId=" + this.LIZIZ + ", uri=" + this.LIZJ + ", firstFrameTimeout=" + this.LIZLLL + ", completeTimeout=" + this.LJ + ", touchStop=" + this.LJFF + ", forceDowngrade=" + this.LJI + ", minMemory=" + this.LJII + ", firstFrameTimeoutCallback=" + this.LJIIIIZZ + ", completeTimeoutCallback=" + this.LJIIIZ + ", runtimeErrorCallback=" + this.LJIIJ + ", listener=" + this.LJIIJJI + ", initialData=" + this.LJIIL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LIZJ = JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
        android.net.Uri uri = this.LIZJ;
        int i = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int LIZJ2 = JBR.LIZJ(this.LJ, JBR.LIZJ(this.LIZLLL, (LIZJ + hashCode) * 31, 31), 31);
        boolean z = this.LJFF;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (LIZJ2 + i3) * 31;
        if (!this.LJI) {
            i2 = 0;
        }
        int LIZJ3 = JBR.LIZJ(this.LJII, (i4 + i2) * 31, 31);
        InterfaceC88471Ynr<? super Integer, ? super String, C76800UCe> interfaceC88471Ynr = this.LJIIIIZZ;
        if (interfaceC88471Ynr == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC88471Ynr.hashCode();
        }
        int i5 = (LIZJ3 + hashCode2) * 31;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJIIIZ;
        if (interfaceC65784Pro == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = interfaceC65784Pro.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        InterfaceC88471Ynr<? super Integer, ? super String, C76800UCe> interfaceC88471Ynr2 = this.LJIIJ;
        if (interfaceC88471Ynr2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = interfaceC88471Ynr2.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        InterfaceC78206Umg interfaceC78206Umg = this.LJIIJJI;
        if (interfaceC78206Umg != null) {
            i = interfaceC78206Umg.hashCode();
        }
        return this.LJIIL.hashCode() + ((i7 + i) * 31);
    }

    public C78217Umr(long j, long j2, android.net.Uri uri, long j3, long j4, boolean z, boolean z2, long j5, JSONObject jSONObject, int i) {
        boolean z3 = z;
        long j6 = j5;
        JSONObject initialData = jSONObject;
        j = (i & 1) != 0 ? 0L : j;
        j2 = (i & 2) != 0 ? 0L : j2;
        uri = (i & 4) != 0 ? null : uri;
        j3 = (i & 8) != 0 ? 0L : j3;
        j4 = (i & 16) != 0 ? 0L : j4;
        z3 = (i & 32) != 0 ? false : z3;
        boolean z4 = (i & 64) == 0 ? z2 : false;
        j6 = (i & 128) != 0 ? 0L : j6;
        initialData = (i & 4096) != 0 ? new JSONObject() : initialData;
        o.LJIIIZ(initialData, "initialData");
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = uri;
        this.LIZLLL = j3;
        this.LJ = j4;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = j6;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = initialData;
    }
}
