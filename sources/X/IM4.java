package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes9.dex */
public enum IM4 {
    DIGITAL_0(CardStruct.IStatusCode.DEFAULT),
    DIGITAL_1("1"),
    DIGITAL_NEG_1("-1");

    public final String LJLIL;

    public static IM4 valueOf(String str) {
        return (IM4) V0N.LJJJ(IM4.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    IM4(String str) {
        this.LJLIL = str;
    }
}
