package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.MuteAnchorRoomAudioSetting;

/* renamed from: X.Boq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29928Boq extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C29928Boq LJLIL = new C29928Boq();

    public C29928Boq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(MuteAnchorRoomAudioSetting.class));
    }
}
