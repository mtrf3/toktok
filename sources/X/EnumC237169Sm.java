package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;

/* renamed from: X.9Sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC237169Sm {
    DOWNLOAD_50_VIDEOS(50, 30, 27),
    DOWNLOAD_100_VIDEOS(100, 50, 70),
    DOWNLOAD_150_VIDEOS(150, 70, 100),
    DOWNLOAD_200_VIDEOS(200, LiveTryModeCountDownThresholdSetting.DEFAULT, 150);

    public static final C237149Sk Companion = new C237149Sk();
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    public static EnumC237169Sm valueOf(String str) {
        return (EnumC237169Sm) V0N.LJJJ(EnumC237169Sm.class, str);
    }

    public final int getCount() {
        return this.LJLIL;
    }

    public final int getMinutes() {
        return this.LJLILLLLZI;
    }

    public final int getSize() {
        return this.LJLJI;
    }

    EnumC237169Sm(int i, int i2, int i3) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
    }
}
