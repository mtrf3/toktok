package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.Umu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC78220Umu {
    NONE(LiveGiftNewGifterBadgeSetting.DEFAULT),
    ALPHA_PLAYER("alpha_player"),
    LYNX("lynx_native"),
    COMBINATION("combination");

    public final String LJLIL;

    public static EnumC78220Umu valueOf(String str) {
        return (EnumC78220Umu) V0N.LJJJ(EnumC78220Umu.class, str);
    }

    public final String getTypeString() {
        return this.LJLIL;
    }

    EnumC78220Umu(String str) {
        this.LJLIL = str;
    }
}
