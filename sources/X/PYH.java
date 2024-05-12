package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes12.dex */
public enum PYH {
    NOT_LOGIN("-1"),
    NORMAL(CardStruct.IStatusCode.DEFAULT),
    CHILD_US("1"),
    CHILD_OTHERS("2"),
    UNKNOWN("");

    public static final PYJ Companion = new PYJ();
    public final String LJLIL;

    public static PYH valueOf(String str) {
        return (PYH) V0N.LJJJ(PYH.class, str);
    }

    public final String getUserType() {
        return this.LJLIL;
    }

    PYH(String str) {
        this.LJLIL = str;
    }
}
