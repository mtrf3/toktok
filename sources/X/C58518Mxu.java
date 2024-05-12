package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveSupportSetSurfaceTexture;

/* renamed from: X.Mxu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58518Mxu extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58518Mxu LJLIL = new C58518Mxu();

    public C58518Mxu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveSupportSetSurfaceTexture.class));
    }
}
