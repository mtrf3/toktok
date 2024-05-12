package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUploadALogConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkMicAlogUploadSetting;

/* renamed from: X.Mww, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58458Mww extends AbstractC65781Prl implements InterfaceC65784Pro<LinkMicUploadALogConfig> {
    public static final C58458Mww LJLIL = new C58458Mww();

    public C58458Mww() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUploadALogConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LinkMicUploadALogConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveLinkMicAlogUploadSetting.class);
        if (valueSafely == 0) {
            return LiveLinkMicAlogUploadSetting.DEFAULT;
        }
        return valueSafely;
    }
}
