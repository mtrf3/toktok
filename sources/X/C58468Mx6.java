package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftListStaticDataTTLSetting;

/* renamed from: X.Mx6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58468Mx6 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C58468Mx6 LJLIL = new C58468Mx6();

    public C58468Mx6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveGiftListStaticDataTTLSetting.class));
    }
}
