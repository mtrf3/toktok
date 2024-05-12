package X;

/* renamed from: X.Plw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC65420Plw {
    /* JADX INFO: Fake field, exist only in values array */
    INT("int"),
    STRING("java.lang.String"),
    /* JADX INFO: Fake field, exist only in values array */
    LONG("long"),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE("double"),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN("boolean");

    public final String LJLIL;

    @Override // java.lang.Enum
    public final String toString() {
        return this.LJLIL;
    }

    public static EnumC65420Plw valueOf(String str) {
        return (EnumC65420Plw) V0N.LJJJ(EnumC65420Plw.class, str);
    }

    EnumC65420Plw(String str) {
        this.LJLIL = str;
    }
}
