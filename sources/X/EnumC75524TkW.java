package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.TkW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75524TkW {
    NONE(LiveGiftNewGifterBadgeSetting.DEFAULT),
    SUCCESS("success"),
    ROOM_ENTER("room_enter"),
    LINK_ENTER("link_enter"),
    FIRST_SEI("first_sei"),
    OTHER_SEI("other_sei");

    public final String LJLIL;

    public static EnumC75524TkW valueOf(String str) {
        return (EnumC75524TkW) V0N.LJJJ(EnumC75524TkW.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC75524TkW(String str) {
        this.LJLIL = str;
    }
}
