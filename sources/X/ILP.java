package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes9.dex */
public enum ILP {
    SUCCESS(CardStruct.IStatusCode.DEFAULT),
    FAILURE("1"),
    NOT_FINISH("2"),
    NOT_START("3");

    public final String LJLIL;

    public static ILP valueOf(String str) {
        return (ILP) V0N.LJJJ(ILP.class, str);
    }

    public final String getStatus() {
        return this.LJLIL;
    }

    ILP(String str) {
        this.LJLIL = str;
    }
}
