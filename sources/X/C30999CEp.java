package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.EffectPreloadParams;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectPreloadSetting;

/* renamed from: X.CEp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30999CEp extends AbstractC65781Prl implements InterfaceC65784Pro<EffectPreloadParams> {
    public static final C30999CEp LJLIL = new C30999CEp();

    public C30999CEp() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.gift.EffectPreloadParams, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final EffectPreloadParams invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveGiftEffectPreloadSetting.class);
        if (valueSafely == 0) {
            return LiveGiftEffectPreloadSetting.INSTANCE.getDEFAULT();
        }
        return valueSafely;
    }
}
