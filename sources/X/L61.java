package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class L61 {
    public static final /* synthetic */ L61[] LJLILLLLZI;
    public static final L61 STORY;
    public final String LJLIL = "story";

    public static L61 valueOf(String str) {
        return (L61) V0N.LJJJ(L61.class, str);
    }

    public static L61[] values() {
        return (L61[]) LJLILLLLZI.clone();
    }

    static {
        L61 l61 = new L61();
        STORY = l61;
        LJLILLLLZI = new L61[]{l61};
    }

    public final String getTagName() {
        return this.LJLIL;
    }
}
