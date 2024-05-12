package X;

/* renamed from: X.0NS, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0NS {
    SILVER(1),
    GOLD(2),
    SUPER(3);

    public final int LJLIL;

    C0NS(int i) {
        this.LJLIL = i;
    }

    public static C0NS valueOf(int i) {
        if (i == 1) {
            return SILVER;
        }
        if (i == 2) {
            return GOLD;
        }
        if (i != 3) {
            return null;
        }
        return SUPER;
    }

    public static C0NS valueOf(String str) {
        return (C0NS) V0N.LJJJ(C0NS.class, str);
    }

    public int getIndex() {
        return this.LJLIL;
    }
}
