package X;

/* renamed from: X.8OM, reason: invalid class name */
/* loaded from: classes4.dex */
public enum C8OM {
    PLAY(1),
    PAUSE(2),
    STOP(3);

    public final int LJLIL;

    public static C8OM valueOf(String str) {
        return (C8OM) V0N.LJJJ(C8OM.class, str);
    }

    public final int getState() {
        return this.LJLIL;
    }

    C8OM(int i) {
        this.LJLIL = i;
    }
}
