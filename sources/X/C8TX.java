package X;

/* renamed from: X.8TX, reason: invalid class name */
/* loaded from: classes4.dex */
public enum C8TX {
    ONLINE(0),
    FIRST_FRAME(1),
    NONE_FIRST_FRAME(2);

    public final int LJLIL;

    public static C8TX valueOf(String str) {
        return (C8TX) V0N.LJJJ(C8TX.class, str);
    }

    public final int getNum() {
        return this.LJLIL;
    }

    C8TX(int i) {
        this.LJLIL = i;
    }
}
