package X;

/* renamed from: X.99J, reason: invalid class name */
/* loaded from: classes5.dex */
public enum C99J {
    CLICK("click"),
    INVITATION_ACCEPTED("invitationAccept");

    public final String LJLIL;

    C99J(String str) {
        this.LJLIL = str;
    }

    public static C99J valueOf(String str) {
        return (C99J) V0N.LJJJ(C99J.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }
}
