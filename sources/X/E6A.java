package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class E6A {
    public static final E6I Companion;
    public static final E6A FAVORITE_SOUND;
    public static final /* synthetic */ E6A[] LJLILLLLZI;
    public final int LJLIL = 1;

    public static E6A valueOf(String str) {
        return (E6A) V0N.LJJJ(E6A.class, str);
    }

    public static E6A[] values() {
        return (E6A[]) LJLILLLLZI.clone();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.E6I] */
    static {
        E6A e6a = new E6A();
        FAVORITE_SOUND = e6a;
        LJLILLLLZI = new E6A[]{e6a};
        Companion = new Object() { // from class: X.E6I
        };
    }

    public final int getValue() {
        return this.LJLIL;
    }
}
