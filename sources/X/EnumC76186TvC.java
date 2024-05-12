package X;

/* renamed from: X.TvC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC76186TvC {
    INVITEONE("invite_one_more"),
    WAITINGFORQUIT("waitting_for_quit"),
    INVITING("in_inviting"),
    HADREPLY("has_reply"),
    DISCONNECT("disconnect_pk"),
    INVITE("invite");

    public final String LJLIL;

    public static EnumC76186TvC valueOf(String str) {
        return (EnumC76186TvC) V0N.LJJJ(EnumC76186TvC.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    EnumC76186TvC(String str) {
        this.LJLIL = str;
    }
}
