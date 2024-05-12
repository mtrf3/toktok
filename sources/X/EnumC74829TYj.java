package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.TYj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC74829TYj {
    CUT("cut"),
    BLACK("black"),
    NONE(LiveGiftNewGifterBadgeSetting.DEFAULT);

    public final String LJLIL;

    public static EnumC74829TYj valueOf(String str) {
        return (EnumC74829TYj) V0N.LJJJ(EnumC74829TYj.class, str);
    }

    public final String getStr() {
        return this.LJLIL;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }

    EnumC74829TYj(String str) {
        this.LJLIL = str;
    }
}
