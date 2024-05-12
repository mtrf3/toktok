package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.GgF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC42135GgF {
    COVER_EXTRACT("cover_extract"),
    AUTH("auth"),
    COMPILE("compile"),
    UPLOAD("upload"),
    NONE(LiveGiftNewGifterBadgeSetting.DEFAULT);

    public final String LJLIL;

    public static EnumC42135GgF valueOf(String str) {
        return (EnumC42135GgF) V0N.LJJJ(EnumC42135GgF.class, str);
    }

    public final String getState() {
        return this.LJLIL;
    }

    EnumC42135GgF(String str) {
        this.LJLIL = str;
    }
}
