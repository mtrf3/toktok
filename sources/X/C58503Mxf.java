package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftGuideOnLeftRTLEnableSetting;

/* renamed from: X.Mxf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58503Mxf extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58503Mxf LJLIL = new C58503Mxf();

    public C58503Mxf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveGiftGuideOnLeftRTLEnableSetting.class));
    }
}
