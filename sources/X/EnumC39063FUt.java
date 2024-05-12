package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;

/* renamed from: X.FUt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC39063FUt {
    INFINITE(0),
    SHORT(LivePlayEnforceIntervalSetting.DEFAULT),
    LONG(60000),
    ACTIVITY_DESTORY(-1);

    public final long LJLIL;

    public static EnumC39063FUt valueOf(String str) {
        return (EnumC39063FUt) V0N.LJJJ(EnumC39063FUt.class, str);
    }

    public final long getDelay() {
        return this.LJLIL;
    }

    EnumC39063FUt(long j) {
        this.LJLIL = j;
    }
}
