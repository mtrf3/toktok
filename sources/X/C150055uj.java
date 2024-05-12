package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.5uj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150055uj {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Integer LJFF;

    public C150055uj() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C150055uj)) {
            return false;
        }
        C150055uj c150055uj = (C150055uj) obj;
        return o.LJ(this.LIZ, c150055uj.LIZ) && o.LJ(this.LIZIZ, c150055uj.LIZIZ) && o.LJ(this.LIZJ, c150055uj.LIZJ) && o.LJ(this.LIZLLL, c150055uj.LIZLLL) && o.LJ(this.LJ, c150055uj.LJ) && o.LJ(this.LJFF, c150055uj.LJFF);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.LJFF;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SoundFilterMobData(creationId=");
        LIZ.append(this.LIZ);
        LIZ.append(", contentSource=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", contentType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", musicId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", shootWay=");
        LIZ.append(this.LJ);
        LIZ.append(", isEditorPro=");
        return s0.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C150055uj(String str, String str2, String str3, String str4, String str5, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = num;
    }
}
