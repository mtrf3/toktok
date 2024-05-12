package X;

/* renamed from: X.SjL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC72903SjL {
    SOURCE_TYPE_BY_CREATE_TIME(1),
    SOURCE_TYPE_BY_ALGO_OLD_VERSION(2),
    SOURCE_TYPE_BY_LIVE_NOTIFICATION(3),
    SOURCE_TYPE_BY_MAF_TOP(4),
    SOURCE_TYPE_BY_MAF_FAN_NOTICE(5),
    SOURCE_TYPE_BY_LOW_FAN(6);

    public final int LJLIL;

    public static EnumC72903SjL valueOf(String str) {
        return (EnumC72903SjL) V0N.LJJJ(EnumC72903SjL.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC72903SjL(int i) {
        this.LJLIL = i;
    }
}
