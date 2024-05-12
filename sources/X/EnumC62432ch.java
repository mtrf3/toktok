package X;

/* renamed from: X.2ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC62432ch {
    UnknownType(0),
    NoGiftPermission(1),
    AnchorClose(2),
    HasGiftPermission(3);

    public final int LJLIL;

    public static EnumC62432ch valueOf(String str) {
        return (EnumC62432ch) V0N.LJJJ(EnumC62432ch.class, str);
    }

    public final int getState() {
        return this.LJLIL;
    }

    EnumC62432ch(int i) {
        this.LJLIL = i;
    }
}
