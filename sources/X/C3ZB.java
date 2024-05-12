package X;

/* renamed from: X.3ZB, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C3ZB {
    UNKNOWN(0),
    CREATE_CONTACT(1),
    UPDATE_AVATAR(2),
    UPDATE_NICKNAME(3),
    UPDATE_FOLLOWSTATUS(4),
    UPDATE_MAFSTATUS(5),
    UPDATE_CANSHAREMESSAGE(6),
    UPDATE_UNIQUEID(7);

    public final int LJLIL;

    public static C3ZB valueOf(String str) {
        return (C3ZB) V0N.LJJJ(C3ZB.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    C3ZB(int i) {
        this.LJLIL = i;
    }
}
