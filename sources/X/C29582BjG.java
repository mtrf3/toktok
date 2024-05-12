package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;

/* renamed from: X.BjG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29582BjG extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C29582BjG LJLIL = new C29582BjG();

    public C29582BjG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveImageLoaderModuleSetting.class));
    }
}
