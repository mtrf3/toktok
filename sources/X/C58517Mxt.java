package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreviewPrepareFixSetting;

/* renamed from: X.Mxt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58517Mxt extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58517Mxt LJLIL = new C58517Mxt();

    public C58517Mxt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (SettingsManager.INSTANCE.getIntValue(LivePreviewPrepareFixSetting.class) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
