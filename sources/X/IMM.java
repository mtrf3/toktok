package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes9.dex */
public enum IMM {
    DIGITAL_0(CardStruct.IStatusCode.DEFAULT),
    DIGITAL_1("1"),
    NULL("null");

    public final String LJLIL;

    public static IMM valueOf(String str) {
        return (IMM) V0N.LJJJ(IMM.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    IMM(String str) {
        this.LJLIL = str;
    }
}
