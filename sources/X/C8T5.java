package X;

/* renamed from: X.8T5, reason: invalid class name */
/* loaded from: classes4.dex */
public enum C8T5 {
    ALL(1),
    LEFT_AREA(2),
    RIGHT_AREA(4);

    public final int LJLIL;

    public static C8T5 valueOf(String str) {
        return (C8T5) V0N.LJJJ(C8T5.class, str);
    }

    public final int getCategory() {
        return this.LJLIL;
    }

    C8T5(int i) {
        this.LJLIL = i;
    }
}
