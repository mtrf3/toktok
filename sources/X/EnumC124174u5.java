package X;

/* renamed from: X.4u5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC124174u5 {
    PRIORITY_MUST_SHOW(0),
    PRIORITY1(1),
    PRIORITY2(2),
    PRIORITY3(3),
    PRIORITY4(4),
    PRIORITY5(5);

    public int LJLIL;

    public static EnumC124174u5 valueOf(String str) {
        return (EnumC124174u5) V0N.LJJJ(EnumC124174u5.class, str);
    }

    public final int getPriority() {
        return this.LJLIL;
    }

    public final void setPriority(int i) {
        this.LJLIL = i;
    }

    EnumC124174u5(int i) {
        this.LJLIL = i;
    }
}
