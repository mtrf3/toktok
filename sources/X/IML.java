package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes9.dex */
public enum IML {
    DIGITAL_0(CardStruct.IStatusCode.DEFAULT),
    DIGITAL_1("1"),
    NULL("null");

    public final String LJLIL;

    public static IML valueOf(String str) {
        return (IML) V0N.LJJJ(IML.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    IML(String str) {
        this.LJLIL = str;
    }
}
