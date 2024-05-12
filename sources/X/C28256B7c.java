package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectHasNameSetting;

/* renamed from: X.B7c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28256B7c extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C28256B7c LJLIL = new C28256B7c();

    public C28256B7c() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveEffectHasNameSetting.class));
    }
}
