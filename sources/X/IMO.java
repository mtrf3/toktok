package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes9.dex */
public enum IMO {
    DIGITAL_0(CardStruct.IStatusCode.DEFAULT),
    DIGITAL_1("1"),
    NULL("null");

    public final String LJLIL;

    public static IMO valueOf(String str) {
        return (IMO) V0N.LJJJ(IMO.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    IMO(String str) {
        this.LJLIL = str;
    }
}
