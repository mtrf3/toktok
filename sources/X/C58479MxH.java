package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveHotRoomLogOptSetting;

/* renamed from: X.MxH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58479MxH extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58479MxH LJLIL = new C58479MxH();

    public C58479MxH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveHotRoomLogOptSetting.class));
    }
}