package X;

import defpackage.i0;

/* loaded from: classes12.dex */
public final class QGV extends QGX {
    public String LIZ;
    public Long LIZIZ;
    public EnumC66714QGg LIZJ;

    public final C66708QGa LIZ() {
        String str = "";
        if (this.LIZIZ == null) {
            str = i0.LJFF("", " tokenExpirationTimestamp");
        }
        if (str.isEmpty()) {
            return new C66708QGa(this.LIZ, this.LIZIZ.longValue(), this.LIZJ);
        }
        throw new IllegalStateException(i0.LJFF("Missing required properties:", str));
    }
}
