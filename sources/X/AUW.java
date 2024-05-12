package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AUW {
    public static final AUW DEFAULT;
    public static final /* synthetic */ AUW[] LJLILLLLZI;
    public final int LJLIL = 0;

    public static AUW valueOf(String str) {
        return (AUW) V0N.LJJJ(AUW.class, str);
    }

    public static AUW[] values() {
        return (AUW[]) LJLILLLLZI.clone();
    }

    static {
        AUW auw = new AUW();
        DEFAULT = auw;
        LJLILLLLZI = new AUW[]{auw};
    }

    public final int getValue() {
        return this.LJLIL;
    }
}
