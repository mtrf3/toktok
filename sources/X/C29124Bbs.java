package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveSlardarTagSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.SlardarTagData;

/* renamed from: X.Bbs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29124Bbs extends AbstractC65781Prl implements InterfaceC65784Pro<SlardarTagData> {
    public static final C29124Bbs LJLIL = new C29124Bbs();

    public C29124Bbs() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.watchlive.enterroom.SlardarTagData] */
    @Override // X.InterfaceC65784Pro
    public final SlardarTagData invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveSlardarTagSetting.class);
        if (valueSafely == 0) {
            return LiveSlardarTagSetting.INSTANCE.getDEFAULT();
        }
        return valueSafely;
    }
}
