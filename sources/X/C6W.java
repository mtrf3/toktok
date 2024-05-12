package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenFreeGestureSetting;

/* loaded from: classes6.dex */
public final class C6W extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C6W LJLIL = new C6W();

    public C6W() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LivePublicScreenFreeGestureSetting.class));
    }
}
