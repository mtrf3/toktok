package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;

/* renamed from: X.B8v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28301B8v extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C28301B8v LJLIL = new C28301B8v();

    public C28301B8v() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LivePlayerResourceReleaseSetting.class));
    }
}
