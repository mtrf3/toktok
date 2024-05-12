package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.HideEffectEntrySetting;

/* renamed from: X.Bxr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30487Bxr extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30487Bxr LJLIL = new C30487Bxr();

    public C30487Bxr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(HideEffectEntrySetting.class));
    }
}
