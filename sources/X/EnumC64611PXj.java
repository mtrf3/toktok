package X;

/* renamed from: X.PXj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC64611PXj {
    CONNECTION_INFO_UNKNOWN(0),
    CONNECTION_INFO_HTTP1_1(1),
    CONNECTION_INFO_DEPRECATED_SPDY3(3),
    CONNECTION_INFO_HTTP2(4),
    CONNECTION_INFO_QUIC_UNKNOWN_VERSION(5),
    CONNECTION_INFO_HTTP1_0(9);

    public final int LJLIL;

    public static EnumC64611PXj valueOf(String str) {
        return (EnumC64611PXj) V0N.LJJJ(EnumC64611PXj.class, str);
    }

    EnumC64611PXj(int i) {
        this.LJLIL = i;
    }
}
