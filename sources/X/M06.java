package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* loaded from: classes10.dex */
public enum M06 {
    NONE(LiveGiftNewGifterBadgeSetting.DEFAULT),
    NORMAL("normal"),
    NUMBER("number"),
    SPECIAL("special");

    public final String LJLIL;

    public static M06 valueOf(String str) {
        return (M06) V0N.LJJJ(M06.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    M06(String str) {
        this.LJLIL = str;
    }
}
