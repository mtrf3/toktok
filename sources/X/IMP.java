package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes9.dex */
public enum IMP {
    DIGITAL_0(CardStruct.IStatusCode.DEFAULT),
    DIGITAL_1("1"),
    NULL("null");

    public final String LJLIL;

    public static IMP valueOf(String str) {
        return (IMP) V0N.LJJJ(IMP.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    IMP(String str) {
        this.LJLIL = str;
    }
}
