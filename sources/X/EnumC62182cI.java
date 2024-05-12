package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.2cI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC62182cI {
    NONE(LiveGiftNewGifterBadgeSetting.DEFAULT),
    WORD("word"),
    BLANK("blank"),
    BUBBLE("bubble"),
    RELATED("related"),
    TO_SUG("to_sug"),
    SINGLE_SEARCH_BTN("single_search_btn");

    public final String LJLIL;

    public static EnumC62182cI valueOf(String str) {
        return (EnumC62182cI) V0N.LJJJ(EnumC62182cI.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC62182cI(String str) {
        this.LJLIL = str;
    }
}
