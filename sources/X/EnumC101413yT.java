package X;

/* renamed from: X.3yT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC101413yT {
    U16("msg_read_status_default"),
    U18("msg_read_status_guide"),
    O18("msg_read_status_notice");

    public final String LJLIL;

    public static EnumC101413yT valueOf(String str) {
        return (EnumC101413yT) V0N.LJJJ(EnumC101413yT.class, str);
    }

    public final String getNoticeCode() {
        return this.LJLIL;
    }

    EnumC101413yT(String str) {
        this.LJLIL = str;
    }
}
