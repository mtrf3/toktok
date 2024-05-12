package X;

/* loaded from: classes14.dex */
public enum U85 {
    APPLICANT("applicant"),
    HANDLER("handler"),
    INVITER("inviter"),
    INVITEE("invitee"),
    INVITER_DIRECT("inviter_direct"),
    INVITEE_DIRECT("invitee_direct");

    public final String LJLIL;

    public static U85 valueOf(String str) {
        return (U85) V0N.LJJJ(U85.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }

    U85(String str) {
        this.LJLIL = str;
    }
}
