package X;

/* renamed from: X.9WB, reason: invalid class name */
/* loaded from: classes5.dex */
public enum C9WB {
    PHOTO_AVATAR("photo"),
    VIDEO_AVATAR("video"),
    BIO("bio"),
    NICKNAME("name"),
    USERNAME("username"),
    SOCIAL_ACCOUNT_BIND("social_account_bind"),
    SOCIAL_ACCOUNT_UNBIND("social_account_unbind"),
    NGO("ngo");

    public final String LJLIL;

    public static C9WB valueOf(String str) {
        return (C9WB) V0N.LJJJ(C9WB.class, str);
    }

    public final String getStrValue() {
        return this.LJLIL;
    }

    C9WB(String str) {
        this.LJLIL = str;
    }
}
