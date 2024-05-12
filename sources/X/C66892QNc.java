package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;

/* renamed from: X.QNc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66892QNc extends QNH {
    public final String LJFF;
    public final String LJI;

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
        return 7;
    }

    @Override // X.QNH
    public final void LIZ(StringBuilder sb) {
        C78840Uwu.LIZJ(sb, "decision_config", "block-sms");
        C78840Uwu.LIZJ(sb, "is_turing", String.valueOf(1));
        if (!TextUtils.isEmpty(this.LJFF)) {
            C78840Uwu.LIZJ(sb, "verify_ticket", this.LJFF);
        }
        if (!TextUtils.isEmpty(this.LJI)) {
            C78840Uwu.LIZJ(sb, "show_mobile", this.LJI);
        }
        C78840Uwu.LIZJ(sb, "use_turing_bridge", String.valueOf(1));
    }

    public C66892QNc(String str, String str2) {
        this.LJFF = str;
        this.LJI = str2;
    }
}
