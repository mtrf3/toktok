package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6D6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6D6 {
    public static final C6D7 Companion;
    public static final C6D6 LINEAR;
    public static final /* synthetic */ C6D6[] LJLILLLLZI;
    public final int LJLIL = 0;

    public static C6D6 valueOf(String str) {
        return (C6D6) V0N.LJJJ(C6D6.class, str);
    }

    public static C6D6[] values() {
        return (C6D6[]) LJLILLLLZI.clone();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.6D7] */
    static {
        C6D6 c6d6 = new C6D6();
        LINEAR = c6d6;
        LJLILLLLZI = new C6D6[]{c6d6};
        Companion = new Object() { // from class: X.6D7
        };
    }

    public final int getType() {
        return this.LJLIL;
    }
}
