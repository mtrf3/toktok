package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.LivePreviewCardResourceOpt;

/* renamed from: X.Mxg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58504Mxg extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58504Mxg LJLIL = new C58504Mxg();

    public C58504Mxg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LivePreviewCardResourceOpt.class));
    }
}
