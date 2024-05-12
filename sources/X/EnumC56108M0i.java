package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.M0i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56108M0i {
    SWITCH("2"),
    CLICK("1"),
    OTHER(CardStruct.IStatusCode.DEFAULT);

    public final String LJLIL;

    public static EnumC56108M0i valueOf(String str) {
        return (EnumC56108M0i) V0N.LJJJ(EnumC56108M0i.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC56108M0i(String str) {
        this.LJLIL = str;
    }
}
