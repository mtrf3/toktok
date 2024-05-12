package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastSmoothGoLiveSetting;

/* renamed from: X.BlB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29701BlB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C29701BlB LJLIL = new C29701BlB();

    public C29701BlB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(BroadcastSmoothGoLiveSetting.class));
    }
}
