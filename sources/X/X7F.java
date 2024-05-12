package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public final class X7F {
    public static final /* synthetic */ X7F[] LJLILLLLZI;
    public static final X7F closed;
    public final String LJLIL = "closed";

    static {
        X7F x7f = new X7F();
        closed = x7f;
        LJLILLLLZI = new X7F[]{x7f};
    }

    public static X7F valueOf(String str) {
        return (X7F) V0N.LJJJ(X7F.class, str);
    }

    public static X7F[] values() {
        return (X7F[]) LJLILLLLZI.clone();
    }

    public final String getActionType() {
        return this.LJLIL;
    }
}
