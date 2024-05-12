package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.Fsj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC40361Fsj {
    MAIN("enter_launch"),
    DEEP_LINK("deep_link"),
    SHORTCUT("client_shortcut"),
    WIDGET("client_widget"),
    OPEN_SHARE("open_share"),
    NONE(LiveGiftNewGifterBadgeSetting.DEFAULT);

    public final String LJLIL;

    public static EnumC40361Fsj valueOf(String str) {
        return (EnumC40361Fsj) V0N.LJJJ(EnumC40361Fsj.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC40361Fsj(String str) {
        this.LJLIL = str;
    }
}
