package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayNewSortSettings;

/* renamed from: X.MxG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58478MxG extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58478MxG LJLIL = new C58478MxG();

    public C58478MxG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (SettingsManager.INSTANCE.getIntValue(LiveGiftTrayNewSortSettings.class) > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
