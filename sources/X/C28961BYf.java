package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.SubOnlyLiveGuideSetting;

/* renamed from: X.BYf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28961BYf extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C28961BYf LJLIL = new C28961BYf();

    public C28961BYf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(SubOnlyLiveGuideSetting.class));
    }
}
