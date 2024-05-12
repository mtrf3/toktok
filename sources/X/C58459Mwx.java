package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUploadConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkMicExceptionUploadSetting;

/* renamed from: X.Mwx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58459Mwx extends AbstractC65781Prl implements InterfaceC65784Pro<LinkMicUploadConfig> {
    public static final C58459Mwx LJLIL = new C58459Mwx();

    public C58459Mwx() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUploadConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LinkMicUploadConfig invoke() {
        return SettingsManager.INSTANCE.getValueSafely(LiveLinkMicExceptionUploadSetting.class);
    }
}
