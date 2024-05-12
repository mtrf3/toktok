package X;

import defpackage.i0;
import java.io.IOException;

/* renamed from: X.PVw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC64572PVw {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public final String LJLIL;

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }

    public static EnumC64572PVw get(String str) {
        EnumC64572PVw enumC64572PVw = HTTP_1_0;
        if (str.equals(enumC64572PVw.LJLIL)) {
            return enumC64572PVw;
        }
        EnumC64572PVw enumC64572PVw2 = HTTP_1_1;
        if (str.equals(enumC64572PVw2.LJLIL)) {
            return enumC64572PVw2;
        }
        EnumC64572PVw enumC64572PVw3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(enumC64572PVw3.LJLIL)) {
            return enumC64572PVw3;
        }
        EnumC64572PVw enumC64572PVw4 = HTTP_2;
        if (str.equals(enumC64572PVw4.LJLIL)) {
            return enumC64572PVw4;
        }
        EnumC64572PVw enumC64572PVw5 = SPDY_3;
        if (str.equals(enumC64572PVw5.LJLIL)) {
            return enumC64572PVw5;
        }
        EnumC64572PVw enumC64572PVw6 = QUIC;
        if (str.equals(enumC64572PVw6.LJLIL)) {
            return enumC64572PVw6;
        }
        throw new IOException(i0.LJFF("Unexpected protocol: ", str));
    }

    public static EnumC64572PVw valueOf(String str) {
        return (EnumC64572PVw) V0N.LJJJ(EnumC64572PVw.class, str);
    }

    EnumC64572PVw(String str) {
        this.LJLIL = str;
    }
}
