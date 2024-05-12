package X;

/* renamed from: X.9qO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC249289qO implements OJI {
    IGNORE_CASE(2),
    MULTILINE(8),
    LITERAL(16),
    UNIX_LINES(1),
    COMMENTS(4),
    DOT_MATCHES_ALL(32),
    CANON_EQ(128);

    public final int LJLIL;
    public final int LJLILLLLZI;

    EnumC249289qO() {
        throw null;
    }

    public static EnumC249289qO valueOf(String str) {
        return (EnumC249289qO) V0N.LJJJ(EnumC249289qO.class, str);
    }

    @Override // X.OJI
    public int getMask() {
        return this.LJLILLLLZI;
    }

    @Override // X.OJI
    public int getValue() {
        return this.LJLIL;
    }

    EnumC249289qO(int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = i;
    }
}
