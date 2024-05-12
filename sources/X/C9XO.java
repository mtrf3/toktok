package X;

/* renamed from: X.9XO, reason: invalid class name */
/* loaded from: classes5.dex */
public enum C9XO {
    LANGUAGE_UNSUPPORTED(10001),
    LANGUAGE_SAME(10002),
    TRANSLATION_NOT_REQUIRED(10003);

    public final int LJLIL;

    public static C9XO valueOf(String str) {
        return (C9XO) V0N.LJJJ(C9XO.class, str);
    }

    public final int getStatusCode() {
        return this.LJLIL;
    }

    C9XO(int i) {
        this.LJLIL = i;
    }
}
