package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class FVT {
    public static final FVT INSTANCE;
    public static final /* synthetic */ FVT[] LJLIL;

    public static FVT valueOf(String str) {
        return (FVT) V0N.LJJJ(FVT.class, str);
    }

    public static FVT[] values() {
        return (FVT[]) LJLIL.clone();
    }

    static {
        FVT fvt = new FVT();
        INSTANCE = fvt;
        LJLIL = new FVT[]{fvt};
    }
}
