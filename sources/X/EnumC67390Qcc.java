package X;

/* renamed from: X.Qcc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC67390Qcc implements InterfaceC67490QeE {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final int LJLIL;

    @Override // X.InterfaceC67490QeE
    public int getNumber() {
        return this.LJLIL;
    }

    public static EnumC67390Qcc valueOf(String str) {
        return (EnumC67390Qcc) V0N.LJJJ(EnumC67390Qcc.class, str);
    }

    EnumC67390Qcc(int i) {
        this.LJLIL = i;
    }
}
