package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveRandomGiftCapsuleGovernanceSetting;

/* renamed from: X.CBw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30928CBw extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C30928CBw LJLIL = new C30928CBw();

    public C30928CBw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveRandomGiftCapsuleGovernanceSetting.class));
    }
}
