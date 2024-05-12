package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class GG4 {
    public static final /* synthetic */ GG4[] LJLILLLLZI;
    public static final GG4 SHOW;
    public final String LJLIL = "show";

    static {
        GG4 gg4 = new GG4();
        SHOW = gg4;
        LJLILLLLZI = new GG4[]{gg4};
    }

    public static GG4 valueOf(String str) {
        return (GG4) V0N.LJJJ(GG4.class, str);
    }

    public static GG4[] values() {
        return (GG4[]) LJLILLLLZI.clone();
    }

    public final String getValue() {
        return this.LJLIL;
    }
}
