package X;

import defpackage.i0;

/* renamed from: X.P9w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC64000P9w {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public final String LJLIL;

    public String javaName() {
        return this.LJLIL;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    public static EnumC64000P9w forJavaName(String str) {
        str.getClass();
        str.hashCode();
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    return TLS_1_1;
                }
                throw new IllegalArgumentException(i0.LJFF("Unexpected TLS version: ", str));
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    return TLS_1_2;
                }
                throw new IllegalArgumentException(i0.LJFF("Unexpected TLS version: ", str));
            case -503070501:
                if (str.equals("TLSv1.3")) {
                    return TLS_1_3;
                }
                throw new IllegalArgumentException(i0.LJFF("Unexpected TLS version: ", str));
            case 79201641:
                if (str.equals("SSLv3")) {
                    return SSL_3_0;
                }
                throw new IllegalArgumentException(i0.LJFF("Unexpected TLS version: ", str));
            case 79923350:
                if (str.equals("TLSv1")) {
                    return TLS_1_0;
                }
                throw new IllegalArgumentException(i0.LJFF("Unexpected TLS version: ", str));
            default:
                throw new IllegalArgumentException(i0.LJFF("Unexpected TLS version: ", str));
        }
    }

    public static EnumC64000P9w valueOf(String str) {
        return (EnumC64000P9w) V0N.LJJJ(EnumC64000P9w.class, str);
    }

    EnumC64000P9w(String str) {
        this.LJLIL = str;
    }
}
