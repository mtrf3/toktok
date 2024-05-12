package X;

import defpackage.i0;

/* renamed from: X.QcA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67362QcA extends AbstractC67372QcK {
    public String LIZ;
    public Integer LIZIZ;
    public C67366QcE LIZJ;
    public Long LIZLLL;
    public Long LJ;
    public java.util.Map<String, String> LJFF;

    public final C67376QcO LIZIZ() {
        String str = "";
        if (this.LIZ == null) {
            str = i0.LJFF("", " transportName");
        }
        if (this.LIZJ == null) {
            str = i0.LJFF(str, " encodedPayload");
        }
        if (this.LIZLLL == null) {
            str = i0.LJFF(str, " eventMillis");
        }
        if (this.LJ == null) {
            str = i0.LJFF(str, " uptimeMillis");
        }
        if (this.LJFF == null) {
            str = i0.LJFF(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new C67376QcO(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL.longValue(), this.LJ.longValue(), this.LJFF);
        }
        throw new IllegalStateException(i0.LJFF("Missing required properties:", str));
    }

    public final C67362QcA LIZJ(C67366QcE c67366QcE) {
        if (c67366QcE != null) {
            this.LIZJ = c67366QcE;
            return this;
        }
        throw new NullPointerException("Null encodedPayload");
    }

    public final C67362QcA LIZLLL(String str) {
        if (str != null) {
            this.LIZ = str;
            return this;
        }
        throw new NullPointerException("Null transportName");
    }
}
