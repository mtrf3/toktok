package X;

import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;

/* renamed from: X.QNj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66899QNj extends QNH {
    public final String LJFF;

    @Override // X.QNH
    public final int LIZIZ() {
        return LiveEffectMusicFadeDurationSetting.DEFAULT;
    }

    @Override // X.QNH
    public final String LIZLLL() {
        return "qa";
    }

    @Override // X.QNH
    public final int LJ() {
        return 3;
    }

    public C66899QNj(String str) {
        this.LJFF = str;
    }

    @Override // X.QNH
    public final void LIZ(StringBuilder sb) {
        C78840Uwu.LIZJ(sb, "isPop", String.valueOf(!this.LIZIZ ? 1 : 0));
        C78840Uwu.LIZJ(sb, "uid", this.LJFF);
    }
}
