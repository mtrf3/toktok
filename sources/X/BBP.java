package X;

/* loaded from: classes6.dex */
public enum BBP {
    GUIDE,
    MODERATOR_LIST,
    TITLE_AND_COVER,
    VIDEO_QUALITY,
    TEMPORARY_MUTE,
    MANAGE_MODERATOR,
    EDIT_MODERATOR_PERMISSION,
    MUTE,
    BLOCK,
    BLOCK_KEYWORDS,
    FILTER_SETTING,
    FILTER_APPROVE,
    FAST_ADD_BLOCK_KEYWORDS,
    COMMENT_SETTING,
    PREVIEW_RANK_SWITCH,
    LIVE_RANK_SWITCH,
    FILTER_COMMENT,
    RANKINGS_SWITCH,
    DISMISS,
    GIFT_REMINDER,
    SHARESETTING_GUIDE,
    BGM_SONG_LIST,
    BGM_PLAYLIST;

    public boolean LJLIL = true;

    public static BBP valueOf(String str) {
        return (BBP) V0N.LJJJ(BBP.class, str);
    }

    public final BBP next() {
        this.LJLIL = true;
        return this;
    }

    public final BBP pre() {
        this.LJLIL = false;
        return this;
    }

    public final boolean getGoNextPage() {
        return this.LJLIL;
    }

    public final void setGoNextPage(boolean z) {
        this.LJLIL = z;
    }

    BBP() {
    }
}
