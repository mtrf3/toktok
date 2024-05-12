package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeRoomPositionSetting;

/* renamed from: X.Bdd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29233Bdd extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C29233Bdd LJLIL = new C29233Bdd();

    public C29233Bdd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(SubscribeRoomPositionSetting.class));
    }
}
