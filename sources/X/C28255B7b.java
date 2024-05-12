package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyReverseExperiment;

/* renamed from: X.B7b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28255B7b extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C28255B7b LJLIL = new C28255B7b();

    public C28255B7b() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveBeautyReverseExperiment.class));
    }
}
