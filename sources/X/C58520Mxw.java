package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.AudienceWidgetLazyLoadSetting;

/* renamed from: X.Mxw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58520Mxw extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58520Mxw LJLIL = new C58520Mxw();

    public C58520Mxw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(AudienceWidgetLazyLoadSetting.class));
    }
}
