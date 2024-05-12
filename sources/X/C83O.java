package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.83O, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C83O {
    public static final /* synthetic */ C83O[] LJLJI;
    public static final C83O SEE_MORE;
    public final int LJLIL = 0;
    public final String LJLILLLLZI = "see_more";

    public static C83O valueOf(String str) {
        return (C83O) V0N.LJJJ(C83O.class, str);
    }

    public static C83O[] values() {
        return (C83O[]) LJLJI.clone();
    }

    static {
        C83O c83o = new C83O();
        SEE_MORE = c83o;
        LJLJI = new C83O[]{c83o};
    }

    public final String getEtUIType() {
        return this.LJLILLLLZI;
    }

    public final int getValue() {
        return this.LJLIL;
    }
}
