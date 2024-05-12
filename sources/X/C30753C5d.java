package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAudioMuteTypeSetting;

/* renamed from: X.C5d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30753C5d extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C30753C5d LJLIL = new C30753C5d();

    public C30753C5d() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveAudioMuteTypeSetting.class));
    }
}
