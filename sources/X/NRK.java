package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* loaded from: classes11.dex */
public enum NRK {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(LiveGiftNewGifterBadgeSetting.DEFAULT);

    public final String LJLIL;

    NRK(String str) {
        this.LJLIL = str;
    }

    public static NRK valueOf(String str) {
        return (NRK) V0N.LJJJ(NRK.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }
}
