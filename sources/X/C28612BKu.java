package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;

/* renamed from: X.BKu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28612BKu extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C28612BKu LJLIL = new C28612BKu();

    public C28612BKu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LivePreCreateNextRoomPlayer.class));
    }
}
