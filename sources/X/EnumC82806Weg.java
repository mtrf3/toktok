package X;

/* renamed from: X.Weg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC82806Weg {
    IDLE(0),
    DOWNLOADING(1),
    SUCCESS(2),
    FAIL(3);

    public final int LJLIL;

    public static EnumC82806Weg valueOf(String str) {
        return (EnumC82806Weg) V0N.LJJJ(EnumC82806Weg.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC82806Weg(int i) {
        this.LJLIL = i;
    }
}
