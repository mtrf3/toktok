package X;

import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;

/* renamed from: X.QNk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66900QNk extends QNH {
    public final int LJFF;

    @Override // X.QNH
    public final int LIZIZ() {
        return LiveEffectMusicFadeDurationSetting.DEFAULT;
    }

    @Override // X.QNH
    public final String LIZLLL() {
        return "verify";
    }

    @Override // X.QNH
    public final int LJ() {
        return 2;
    }

    public C66900QNk(int i) {
        this.LJFF = i;
    }

    @Override // X.QNH
    public final void LIZ(StringBuilder sb) {
        int i = this.LJFF;
        if (i != 0) {
            C78840Uwu.LIZJ(sb, "challenge_code", String.valueOf(i));
        }
    }
}
