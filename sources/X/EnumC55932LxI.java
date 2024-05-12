package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.LxI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC55932LxI {
    HOME_TAB("1"),
    NOT_HOME_TAB(CardStruct.IStatusCode.DEFAULT),
    NONE("-1");

    public final String LJLIL;

    public static EnumC55932LxI valueOf(String str) {
        return (EnumC55932LxI) V0N.LJJJ(EnumC55932LxI.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC55932LxI(String str) {
        this.LJLIL = str;
    }
}
