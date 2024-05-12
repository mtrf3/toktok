package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.level.PrivilegeCenterEntranceCacheSetting;

/* renamed from: X.Cq6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32554Cq6 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C32554Cq6 LJLIL = new C32554Cq6();

    public C32554Cq6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(PrivilegeCenterEntranceCacheSetting.class));
    }
}
