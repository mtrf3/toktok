package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeVocal;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeVocalSetting;

/* renamed from: X.CGu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31056CGu extends AbstractC65781Prl implements InterfaceC65784Pro<LiveKaraokeVocal> {
    public static final C31056CGu LJLIL = new C31056CGu();

    public C31056CGu() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeVocal, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveKaraokeVocal invoke() {
        return SettingsManager.INSTANCE.getValueSafely(LiveKaraokeVocalSetting.class);
    }
}
