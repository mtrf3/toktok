package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.Nf7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC59901Nf7 {
    NONE("NONE", LiveGiftNewGifterBadgeSetting.DEFAULT),
    REPORT("REPORT", "report"),
    SHARE("SHARE", "share");

    public static final C59902Nf8 Companion = new C59902Nf8();
    public final String LJLIL;
    public final int LJLILLLLZI;

    public static EnumC59901Nf7 valueOf(String str) {
        return (EnumC59901Nf7) V0N.LJJJ(EnumC59901Nf7.class, str);
    }

    public final String getVALUE() {
        return this.LJLIL;
    }

    public final int getVALUE_INT() {
        return this.LJLILLLLZI;
    }

    EnumC59901Nf7(String str, String str2) {
        this.LJLIL = str2;
        this.LJLILLLLZI = r2;
    }
}
