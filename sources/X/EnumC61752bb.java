package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.2bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC61752bb {
    NO_DISABLE(CardStruct.IStatusCode.DEFAULT),
    DISABLE_REQUEST("1"),
    DISABLE_PAGE("2");

    public final String LJLIL;

    public static EnumC61752bb valueOf(String str) {
        return (EnumC61752bb) V0N.LJJJ(EnumC61752bb.class, str);
    }

    public final String getStrategy() {
        return this.LJLIL;
    }

    EnumC61752bb(String str) {
        this.LJLIL = str;
    }
}
