package X;

/* loaded from: classes13.dex */
public enum SVI {
    FEED_ANCHOR(0),
    DSP_YDM(1),
    DSP_LIBRARY(2),
    TTM_BRAND_ICON(3),
    TTM_BRAND_POPUP(4),
    NEW_RELEASE_ANCHOR(5),
    PRE_SAVE_ANCHOR(6),
    EVENT_TRACK(7),
    MUSIC_DETAIL(8),
    TTM_MDP_UA(9);

    public final int LJLIL;

    public static SVI valueOf(String str) {
        return (SVI) V0N.LJJJ(SVI.class, str);
    }

    public final int getNumber() {
        return this.LJLIL;
    }

    SVI(int i) {
        this.LJLIL = i;
    }
}
