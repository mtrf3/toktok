package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.ToolBarRefactor;

/* loaded from: classes6.dex */
public final class C5K extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C5K LJLIL = new C5K();

    public C5K() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(ToolBarRefactor.class));
    }
}
