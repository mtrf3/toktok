package X;

/* renamed from: X.5MP, reason: invalid class name */
/* loaded from: classes3.dex */
public enum C5MP {
    EFFECT_NEW_ENGINE(1),
    EFFECT_NEW_OLD_ENGINE_COEXIST(2);

    public int mode;

    public static C5MP valueOf(String str) {
        return (C5MP) V0N.LJJJ(C5MP.class, str);
    }

    C5MP(int i) {
        this.mode = i;
    }
}
