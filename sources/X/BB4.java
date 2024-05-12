package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.PreloadInteractionLayerDelaySetting;

/* loaded from: classes6.dex */
public final class BB4 extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final BB4 LJLIL = new BB4();

    public BB4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SettingsManager.INSTANCE.getLongValue(PreloadInteractionLayerDelaySetting.class));
    }
}
