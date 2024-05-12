package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;

/* renamed from: X.QNe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66894QNe extends QNH {
    public final String LJFF;

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
        return 13;
    }

    public C66894QNe(String str) {
        this.LJFF = str;
    }

    @Override // X.QNH
    public final void LIZ(StringBuilder sb) {
        C78840Uwu.LIZJ(sb, "decision_config", "mobile_voice_sms_verify");
        if (!TextUtils.isEmpty(this.LJFF)) {
            C78840Uwu.LIZJ(sb, "verify_ticket", this.LJFF);
        }
        C78840Uwu.LIZJ(sb, "use_turing_bridge", String.valueOf(1));
    }
}
