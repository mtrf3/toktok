package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.Lt6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC55672Lt6 {
    UNKNOW("-1"),
    OPEN(CardStruct.IStatusCode.DEFAULT),
    REFRESH("1"),
    LOAD_MORE("2");

    public final String LJLIL;

    public static EnumC55672Lt6 valueOf(String str) {
        return (EnumC55672Lt6) V0N.LJJJ(EnumC55672Lt6.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC55672Lt6(String str) {
        this.LJLIL = str;
    }
}
