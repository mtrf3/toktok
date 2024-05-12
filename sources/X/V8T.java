package X;

/* loaded from: classes14.dex */
public enum V8T {
    TYPE_PRIVATE("private"),
    TYPE_GROUP("group"),
    TYPE_TCM("tcm");

    public final String LJLIL;

    public static V8T valueOf(String str) {
        return (V8T) V0N.LJJJ(V8T.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    V8T(String str) {
        this.LJLIL = str;
    }
}
