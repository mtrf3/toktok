package X;

/* renamed from: X.0sJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC21150sJ {
    NORMAL("normal"),
    SEARCH("search"),
    REQUESTS("requests"),
    QUEUE("queue"),
    OTHER("other");

    public final String LJLIL;

    public static EnumC21150sJ valueOf(String str) {
        return (EnumC21150sJ) V0N.LJJJ(EnumC21150sJ.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC21150sJ(String str) {
        this.LJLIL = str;
    }
}
