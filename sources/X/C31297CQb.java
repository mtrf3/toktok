package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAudienceImageCacheRefactorSetting;

/* renamed from: X.CQb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31297CQb extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31297CQb LJLIL = new C31297CQb();

    public C31297CQb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveAudienceImageCacheRefactorSetting.class));
    }
}
