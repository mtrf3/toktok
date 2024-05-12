package X;

import defpackage.i0;

/* renamed from: X.QdE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67428QdE extends AbstractC67480Qe4 {
    public Long LIZ;
    public Long LIZIZ;
    public java.util.Set<EnumC67424QdA> LIZJ;

    public final C67425QdB LIZ() {
        String str = "";
        if (this.LIZ == null) {
            str = i0.LJFF("", " delta");
        }
        if (this.LIZIZ == null) {
            str = i0.LJFF(str, " maxAllowedDelay");
        }
        if (this.LIZJ == null) {
            str = i0.LJFF(str, " flags");
        }
        if (str.isEmpty()) {
            return new C67425QdB(this.LIZ.longValue(), this.LIZIZ.longValue(), this.LIZJ);
        }
        throw new IllegalStateException(i0.LJFF("Missing required properties:", str));
    }
}
