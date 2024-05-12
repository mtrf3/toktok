package X;

/* renamed from: X.3fe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC89743fe {
    UNDEFINED(0),
    VIDEO_CAPTION_MENTION(1),
    VIDEO_STICKER_MENTION(2),
    COMMENT_MENTION(3),
    VIDEO_TAG(4),
    QA_INVITE(5);

    public final int LJLIL;

    public static EnumC89743fe valueOf(String str) {
        return (EnumC89743fe) V0N.LJJJ(EnumC89743fe.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC89743fe(int i) {
        this.LJLIL = i;
    }
}
