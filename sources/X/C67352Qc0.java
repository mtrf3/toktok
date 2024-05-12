package X;

import defpackage.i0;

/* renamed from: X.Qc0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67352Qc0 extends AbstractC67353Qc1 {
    public String LIZ;
    public byte[] LIZIZ;
    public EnumC67357Qc5 LIZJ;

    public final C67355Qc3 LIZ() {
        String str = "";
        if (this.LIZ == null) {
            str = i0.LJFF("", " backendName");
        }
        if (this.LIZJ == null) {
            str = i0.LJFF(str, " priority");
        }
        if (str.isEmpty()) {
            return new C67355Qc3(this.LIZ, this.LIZIZ, this.LIZJ);
        }
        throw new IllegalStateException(i0.LJFF("Missing required properties:", str));
    }

    public final C67352Qc0 LIZIZ(String str) {
        if (str != null) {
            this.LIZ = str;
            return this;
        }
        throw new NullPointerException("Null backendName");
    }

    public final C67352Qc0 LIZJ(EnumC67357Qc5 enumC67357Qc5) {
        if (enumC67357Qc5 != null) {
            this.LIZJ = enumC67357Qc5;
            return this;
        }
        throw new NullPointerException("Null priority");
    }
}
