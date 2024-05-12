package X;

/* renamed from: X.Mqi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC58072Mqi {
    NONE(-2),
    REQ(0),
    SUCCESS(1),
    FAIL(-1);

    public final int LJLIL;

    public static EnumC58072Mqi valueOf(String str) {
        return (EnumC58072Mqi) V0N.LJJJ(EnumC58072Mqi.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC58072Mqi(int i) {
        this.LJLIL = i;
    }
}
