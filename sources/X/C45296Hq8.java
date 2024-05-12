package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Hq8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45296Hq8 {
    public final android.net.Uri LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final OSZ<android.net.Uri, android.net.Uri> LJI;
    public final boolean LJII;

    public C45296Hq8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45296Hq8)) {
            return false;
        }
        C45296Hq8 c45296Hq8 = (C45296Hq8) obj;
        return o.LJ(this.LIZ, c45296Hq8.LIZ) && o.LJ(this.LIZIZ, c45296Hq8.LIZIZ) && o.LJ(this.LIZJ, c45296Hq8.LIZJ) && this.LIZLLL == c45296Hq8.LIZLLL && this.LJ == c45296Hq8.LJ && this.LJFF == c45296Hq8.LJFF && o.LJ(this.LJI, c45296Hq8.LJI) && this.LJII == c45296Hq8.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        android.net.Uri uri = this.LIZ;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z2 = this.LJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (((i2 + i3) * 31) + this.LJFF) * 31;
        OSZ<android.net.Uri, android.net.Uri> osz = this.LJI;
        return ((i4 + (osz != null ? osz.hashCode() : 0)) * 31) + (this.LJII ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutStates(bgUri=");
        LIZ.append(this.LIZ);
        LIZ.append(", progressHintTitle=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", progressHintDetail=");
        LIZ.append(this.LIZJ);
        LIZ.append(", retryBtnVisibility=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", clearHintVisibility=");
        LIZ.append(this.LJ);
        LIZ.append(", topMargin=");
        LIZ.append(this.LJFF);
        LIZ.append(", animCoversUri=");
        LIZ.append(this.LJI);
        LIZ.append(", enableLoadingAnim=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public /* synthetic */ C45296Hq8(int i) {
        this(null, null, null, false, false, 0, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45296Hq8(android.net.Uri uri, String str, String str2, boolean z, boolean z2, int i, OSZ<? extends android.net.Uri, ? extends android.net.Uri> osz, boolean z3) {
        this.LIZ = uri;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = i;
        this.LJI = osz;
        this.LJII = z3;
    }

    public static C45296Hq8 LIZ(C45296Hq8 c45296Hq8, android.net.Uri uri, String str, String str2, boolean z, boolean z2, int i, OSZ osz, boolean z3, int i2) {
        boolean z4 = z3;
        OSZ osz2 = osz;
        String str3 = str;
        android.net.Uri uri2 = uri;
        String str4 = str2;
        boolean z5 = z;
        boolean z6 = z2;
        int i3 = i;
        if ((i2 & 1) != 0) {
            uri2 = c45296Hq8.LIZ;
        }
        if ((i2 & 2) != 0) {
            str3 = c45296Hq8.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            str4 = c45296Hq8.LIZJ;
        }
        if ((i2 & 8) != 0) {
            z5 = c45296Hq8.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            z6 = c45296Hq8.LJ;
        }
        if ((i2 & 32) != 0) {
            i3 = c45296Hq8.LJFF;
        }
        if ((i2 & 64) != 0) {
            osz2 = c45296Hq8.LJI;
        }
        if ((i2 & 128) != 0) {
            z4 = c45296Hq8.LJII;
        }
        c45296Hq8.getClass();
        return new C45296Hq8(uri2, str3, str4, z5, z6, i3, osz2, z4);
    }
}
