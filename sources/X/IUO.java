package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class IUO {
    public static final IUO LIVE;
    public static final /* synthetic */ IUO[] LJLILLLLZI;
    public final int LJLIL = 1;

    public static IUO valueOf(String str) {
        return (IUO) V0N.LJJJ(IUO.class, str);
    }

    public static IUO[] values() {
        return (IUO[]) LJLILLLLZI.clone();
    }

    static {
        IUO iuo = new IUO();
        LIVE = iuo;
        LJLILLLLZI = new IUO[]{iuo};
    }

    public final int getValue() {
        return this.LJLIL;
    }
}
