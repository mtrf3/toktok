package X;

/* renamed from: X.IaQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC46870IaQ {
    FromMemory,
    FromDisk,
    FirstMemoryThenDisk;

    public static final C46879IaZ Companion = new C46879IaZ();

    public static EnumC46870IaQ valueOf(String str) {
        return (EnumC46870IaQ) V0N.LJJJ(EnumC46870IaQ.class, str);
    }

    public static final EnumC46870IaQ valueOf(int i) {
        Companion.getClass();
        if (i != 1) {
            if (i != 2) {
                return FromMemory;
            }
            return FirstMemoryThenDisk;
        }
        return FromDisk;
    }
}
