package X;

/* renamed from: X.a4u, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92076a4u {
    public Boolean LIZ = Boolean.TRUE;
    public String LIZIZ = null;
    public final String LIZJ = "83639969f5b36a5e31a83487aedcbc9b";
    public EnumC92086a54 LIZLLL = null;
    public final String LJ = null;

    public final C92078a4w LIZ() {
        int i;
        String str;
        boolean booleanValue;
        int i2;
        int i3;
        String str2 = this.LIZIZ;
        if (str2 == null) {
            EnumC92086a54 enumC92086a54 = this.LIZLLL;
            if (enumC92086a54 == null || (i3 = C92079a4x.LIZ[enumC92086a54.ordinal()]) == -1) {
                throw new IllegalArgumentException("should pass host");
            }
            if (i3 != 1 && i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        str2 = "https://fp.us.tiktokv.com";
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    str2 = "https://f-p-va.isnssdk.com";
                }
            } else {
                str2 = "https://f-p.sgsnssdk.com";
            }
        }
        String str3 = this.LJ;
        if (str3 == null) {
            EnumC92086a54 enumC92086a542 = this.LIZLLL;
            if (enumC92086a542 == null || (i2 = C92079a4x.LIZ[enumC92086a542.ordinal()]) == -1 || i2 == 1) {
                str3 = "https://starling-oversea.byteoversea.com";
            } else if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        str3 = "https://starling.us.tiktokv.com";
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    str3 = "https://starling-va.byteoversea.com";
                }
            } else {
                str3 = "https://starling-sg.byteoversea.com";
            }
        }
        EnumC92086a54 enumC92086a543 = this.LIZLLL;
        if (enumC92086a543 == null || (i = C92079a4x.LIZ[enumC92086a543.ordinal()]) == -1 || i == 1 || i == 2) {
            str = "https://location-sg.byteintl.com";
        } else if (i != 3) {
            if (i == 4) {
                str = "https://location.us.tiktok.com";
            } else {
                throw new C162476Zf();
            }
        } else {
            str = "https://location-va.byteintl.com";
        }
        Boolean bool = this.LIZ;
        if (bool == null) {
            booleanValue = true;
        } else {
            booleanValue = bool.booleanValue();
        }
        return new C92078a4w(str2, this.LIZJ, str3, str, booleanValue);
    }

    public C92076a4u(int i) {
    }
}
