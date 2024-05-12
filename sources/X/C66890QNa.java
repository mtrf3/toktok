package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;

/* renamed from: X.QNa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66890QNa extends QNH {
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    @Override // X.QNH
    public final int LIZIZ() {
        return LiveEffectMusicFadeDurationSetting.DEFAULT;
    }

    @Override // X.QNH
    public final String LIZLLL() {
        return "twice_verify";
    }

    @Override // X.QNH
    public final int LJ() {
        return 6;
    }

    @Override // X.QNH
    public final void LIZ(StringBuilder sb) {
        C78840Uwu.LIZJ(sb, "decision_config", "block-upsms");
        C78840Uwu.LIZJ(sb, "is_turing", String.valueOf(1));
        if (!TextUtils.isEmpty(this.LJFF)) {
            C78840Uwu.LIZJ(sb, "verify_ticket", this.LJFF);
        }
        C78840Uwu.LIZJ(sb, "channel_mobile", this.LJI);
        C78840Uwu.LIZJ(sb, "sms_content", this.LJII);
        C78840Uwu.LIZJ(sb, "use_turing_bridge", String.valueOf(1));
    }

    public C66890QNa(String str, String str2, String str3) {
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = str3;
    }
}
