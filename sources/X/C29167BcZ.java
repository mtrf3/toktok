package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSPreInitSettings;

/* renamed from: X.BcZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29167BcZ extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C29167BcZ LJLIL = new C29167BcZ();

    public C29167BcZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(TTLSPreInitSettings.class));
    }
}
