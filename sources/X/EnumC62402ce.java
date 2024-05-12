package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.2ce, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC62402ce {
    DEFAULT(CardStruct.IStatusCode.DEFAULT),
    VSA("1");

    public final String LJLIL;

    public static EnumC62402ce valueOf(String str) {
        return (EnumC62402ce) V0N.LJJJ(EnumC62402ce.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC62402ce(String str) {
        this.LJLIL = str;
    }
}
