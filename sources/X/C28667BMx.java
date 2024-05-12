package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastImageCacheRefactorSetting;

/* renamed from: X.BMx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28667BMx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C28667BMx LJLIL = new C28667BMx();

    public C28667BMx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveBroadcastImageCacheRefactorSetting.class));
    }
}
