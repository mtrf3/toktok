package X;

/* loaded from: classes10.dex */
public enum L8D {
    FIRST("awaitFirst"),
    FIRST_OR_DEFAULT("awaitFirstOrDefault"),
    /* JADX INFO: Fake field, exist only in values array */
    LAST("awaitLast"),
    SINGLE("awaitSingle");

    public final String LJLIL;

    public static L8D valueOf(String str) {
        return (L8D) V0N.LJJJ(L8D.class, str);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.LJLIL;
    }

    L8D(String str) {
        this.LJLIL = str;
    }
}
