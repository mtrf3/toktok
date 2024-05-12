package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class E6E {
    public static final E6J Companion;
    public static final E6E GO_LIVE;
    public static final /* synthetic */ E6E[] LJLILLLLZI;
    public final int LJLIL = 1;

    public static E6E valueOf(String str) {
        return (E6E) V0N.LJJJ(E6E.class, str);
    }

    public static E6E[] values() {
        return (E6E[]) LJLILLLLZI.clone();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.E6J] */
    static {
        E6E e6e = new E6E();
        GO_LIVE = e6e;
        LJLILLLLZI = new E6E[]{e6e};
        Companion = new Object() { // from class: X.E6J
        };
    }

    public final int getValue() {
        return this.LJLIL;
    }
}
