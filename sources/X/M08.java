package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes10.dex */
public enum M08 {
    NORMAL(CardStruct.IStatusCode.DEFAULT),
    NUMBER("1");

    public final String LJLIL;

    public static M08 valueOf(String str) {
        return (M08) V0N.LJJJ(M08.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    M08(String str) {
        this.LJLIL = str;
    }
}
