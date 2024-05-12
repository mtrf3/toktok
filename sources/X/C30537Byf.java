package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectHouseEffectSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* renamed from: X.Byf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30537Byf {
    public C30536Bye LIZ;
    public LiveEffect LIZIZ;

    public final void LIZ() {
        if (!LiveEffectHouseEffectSetting.INSTANCE.shouldShowInfo()) {
            return;
        }
        if (this.LIZ == null) {
            this.LIZ = new C30536Bye(this);
        }
        C30536Bye c30536Bye = this.LIZ;
        if (c30536Bye != null) {
            C72818Shy.LIZLLL("ttlive_report_effect_preview", c30536Bye);
        }
    }
}
