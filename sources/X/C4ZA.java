package X;

/* renamed from: X.4ZA, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C4ZA {
    UNKNOWN(-1),
    LOGIN(0),
    LOGOUT(1),
    SWITCH(2);

    public final int LJLIL;

    public static C4ZA valueOf(String str) {
        return (C4ZA) V0N.LJJJ(C4ZA.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    C4ZA(int i) {
        this.LJLIL = i;
    }
}
