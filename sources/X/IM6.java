package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes9.dex */
public enum IM6 {
    DIGITAL_0(CardStruct.IStatusCode.DEFAULT),
    DIGITAL_1("1"),
    DIGITAL_NEG_1("-1");

    public final String LJLIL;

    public static IM6 valueOf(String str) {
        return (IM6) V0N.LJJJ(IM6.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    IM6(String str) {
        this.LJLIL = str;
    }
}
