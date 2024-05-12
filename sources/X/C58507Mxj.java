package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.rank.RankListFlipImageSetting;

/* renamed from: X.Mxj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58507Mxj extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58507Mxj LJLIL = new C58507Mxj();

    public C58507Mxj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Boolean bool = (Boolean) SettingsManager.INSTANCE.getValueSafely(RankListFlipImageSetting.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = RankListFlipImageSetting.DEFAULT;
        }
        return Boolean.valueOf(z);
    }
}
