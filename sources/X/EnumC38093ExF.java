package X;

/* renamed from: X.ExF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC38093ExF {
    ENCRYPT_NONE(0),
    ENCRYPT_QUERY(1),
    ENCRYPT_BODY(2),
    ENCRYPT_BOTH_QUERY_AND_BODY(3);

    public final int LJLIL;

    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC38093ExF valueOf(String str) {
        return (EnumC38093ExF) V0N.LJJJ(EnumC38093ExF.class, str);
    }

    EnumC38093ExF(int i) {
        this.LJLIL = i;
    }
}
