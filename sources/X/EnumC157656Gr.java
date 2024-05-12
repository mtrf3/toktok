package X;

/* renamed from: X.6Gr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC157656Gr {
    NONE(0),
    INFO(1),
    TEXT(18),
    POLL(3),
    COMMENT(4),
    DONATION(5),
    QUESTION(6),
    LIVE_COUNTDOWN(7),
    CAPTION(20),
    QUESTION_AND_ANSWER(9),
    PICTURE_HASHTAG_GLOBAL(30),
    PICTURE_HASHTAG_SINGLE(31),
    PICTURE_HASHTAG_EMBED(32),
    MUSIC_SHARE_TO_STORY(33),
    ADD_YOURS(88),
    AI_CAPTION_TAG(89);

    public final int LJLIL;

    public static EnumC157656Gr valueOf(String str) {
        return (EnumC157656Gr) V0N.LJJJ(EnumC157656Gr.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC157656Gr(int i) {
        this.LJLIL = i;
    }
}
