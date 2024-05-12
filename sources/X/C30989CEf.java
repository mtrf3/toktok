package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.ToolbarHitboxExpansionSetting;

/* renamed from: X.CEf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30989CEf extends AbstractC65781Prl implements InterfaceC65784Pro<ToolbarHitboxExpansionSetting.ToolbarHitboxConfig> {
    public static final C30989CEf LJLIL = new C30989CEf();

    public C30989CEf() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.other.ToolbarHitboxExpansionSetting$ToolbarHitboxConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ToolbarHitboxExpansionSetting.ToolbarHitboxConfig invoke() {
        return SettingsManager.INSTANCE.getValueSafely(ToolbarHitboxExpansionSetting.class);
    }
}
