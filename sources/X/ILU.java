package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes9.dex */
public enum ILU {
    MALE(CardStruct.IStatusCode.DEFAULT),
    FEMALE("1"),
    ALL("2"),
    CUR("-1");

    public final String LJLIL;

    public static ILU valueOf(String str) {
        return (ILU) V0N.LJJJ(ILU.class, str);
    }

    public final String getFlag() {
        return this.LJLIL;
    }

    ILU(String str) {
        this.LJLIL = str;
    }
}
