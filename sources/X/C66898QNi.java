package X;

import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;

/* renamed from: X.QNi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66898QNi extends QNH {
    public final String LJFF = null;
    public final boolean LJI = false;
    public final String LJII = null;

    @Override // X.QNH
    public final int LIZIZ() {
        return LiveEffectMusicFadeDurationSetting.DEFAULT;
    }

    @Override // X.QNH
    public final String LIZLLL() {
        return "sms";
    }

    @Override // X.QNH
    public final int LJ() {
        return 1;
    }

    public C66898QNi(int i) {
        this.LIZIZ = true;
    }

    @Override // X.QNH
    public final void LIZ(StringBuilder sb) {
        C78840Uwu.LIZJ(sb, WM7.SCENE_SERVICE, this.LJFF);
        C78840Uwu.LIZJ(sb, "show_success_toast", String.valueOf(this.LJI ? 1 : 0));
        C78840Uwu.LIZJ(sb, "uid", this.LJII);
    }
}
