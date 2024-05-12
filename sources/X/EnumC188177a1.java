package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.7a1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC188177a1 {
    ALL("all"),
    MULTIPLE("multiple"),
    SINGLE("single"),
    NONE(LiveGiftNewGifterBadgeSetting.DEFAULT);

    public final String LJLIL;

    public static EnumC188177a1 valueOf(String str) {
        return (EnumC188177a1) V0N.LJJJ(EnumC188177a1.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC188177a1(String str) {
        this.LJLIL = str;
    }
}
