package X;

/* loaded from: classes12.dex */
public final class PVH {
    public final boolean LIZ;
    public String[] LIZIZ;
    public String[] LIZJ;
    public boolean LIZLLL;

    public PVH(PVF pvf) {
        this.LIZ = pvf.LIZ;
        this.LIZIZ = pvf.LIZJ;
        this.LIZJ = pvf.LIZLLL;
        this.LIZLLL = pvf.LIZIZ;
    }

    public final void LIZ(String... strArr) {
        if (this.LIZ) {
            if (strArr.length != 0) {
                this.LIZIZ = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public final void LIZIZ(PVG... pvgArr) {
        if (this.LIZ) {
            String[] strArr = new String[pvgArr.length];
            for (int i = 0; i < pvgArr.length; i++) {
                strArr[i] = pvgArr[i].LIZ;
            }
            LIZ(strArr);
            return;
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public final void LIZJ(String... strArr) {
        if (this.LIZ) {
            if (strArr.length != 0) {
                this.LIZJ = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    public final void LIZLLL(EnumC64000P9w... enumC64000P9wArr) {
        if (this.LIZ) {
            String[] strArr = new String[enumC64000P9wArr.length];
            for (int i = 0; i < enumC64000P9wArr.length; i++) {
                strArr[i] = enumC64000P9wArr[i].LJLIL;
            }
            LIZJ(strArr);
            return;
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    public PVH(boolean z) {
        this.LIZ = z;
    }
}
