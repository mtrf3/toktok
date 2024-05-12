package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes9.dex */
public enum IMR {
    DIGITAL_0(CardStruct.IStatusCode.DEFAULT),
    DIGITAL_1("1"),
    NULL("null");

    public final String LJLIL;

    public static IMR valueOf(String str) {
        return (IMR) V0N.LJJJ(IMR.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    IMR(String str) {
        this.LJLIL = str;
    }
}
