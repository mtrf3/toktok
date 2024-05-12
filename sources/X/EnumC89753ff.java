package X;

/* renamed from: X.3ff, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC89753ff {
    UNDEFINED(0),
    COMMENT_MENTION(3),
    VIDEO_TAG(4),
    QA_INVITE(5),
    VIDEO_MENTION(6);

    public final int LJLIL;

    public static EnumC89753ff valueOf(String str) {
        return (EnumC89753ff) V0N.LJJJ(EnumC89753ff.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC89753ff(int i) {
        this.LJLIL = i;
    }
}
