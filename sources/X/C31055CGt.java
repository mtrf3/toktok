package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeAccompany;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeAccompanySetting;

/* renamed from: X.CGt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31055CGt extends AbstractC65781Prl implements InterfaceC65784Pro<LiveKaraokeAccompany> {
    public static final C31055CGt LJLIL = new C31055CGt();

    public C31055CGt() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeAccompany, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveKaraokeAccompany invoke() {
        return SettingsManager.INSTANCE.getValueSafely(LiveKaraokeAccompanySetting.class);
    }
}
