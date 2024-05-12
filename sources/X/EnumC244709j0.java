package X;

/* renamed from: X.9j0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC244709j0 {
    NULL(-1),
    EMPTY(0),
    HAS_UNREAD(1),
    ALL_VIEWED(2);

    public final int LJLIL;

    public static EnumC244709j0 valueOf(String str) {
        return (EnumC244709j0) V0N.LJJJ(EnumC244709j0.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    EnumC244709j0(int i) {
        this.LJLIL = i;
    }
}
