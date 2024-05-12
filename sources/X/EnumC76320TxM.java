package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.TxM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC76320TxM {
    NONE(LiveGiftNewGifterBadgeSetting.DEFAULT),
    MATCH_ROOM_ENTER("match_room_enter"),
    MATCH_BATTLE_INFO("match_battle_info"),
    MATCH_OPEN_MESSAGE("match_open_message"),
    MATCH_SEI("match_sei");

    public final String LJLIL;

    public static EnumC76320TxM valueOf(String str) {
        return (EnumC76320TxM) V0N.LJJJ(EnumC76320TxM.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC76320TxM(String str) {
        this.LJLIL = str;
    }
}
