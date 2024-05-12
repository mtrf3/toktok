package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes9.dex */
public enum ILL {
    FIRST_SEARCH_IN_SESSION("-1"),
    OUTER_FLOW_VIDEO(CardStruct.IStatusCode.DEFAULT),
    INNER_FLOW_VIDEO("1"),
    NO_VIDEO("2");

    public final String LJLIL;

    public static ILL valueOf(String str) {
        return (ILL) V0N.LJJJ(ILL.class, str);
    }

    public final String getTag() {
        return this.LJLIL;
    }

    ILL(String str) {
        this.LJLIL = str;
    }
}
