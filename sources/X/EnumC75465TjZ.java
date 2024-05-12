package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.TjZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75465TjZ {
    NONE(0, LiveGiftNewGifterBadgeSetting.DEFAULT),
    COHOST(4, "cohost");

    public final int LJLIL;
    public final String LJLILLLLZI;

    public static EnumC75465TjZ valueOf(String str) {
        return (EnumC75465TjZ) V0N.LJJJ(EnumC75465TjZ.class, str);
    }

    public final String getScene() {
        return this.LJLILLLLZI;
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC75465TjZ(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
