package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.LiveCpuMemoryOptSetting;
import com.bytedance.android.livesdk.model.CpuMemoryOptList;

/* renamed from: X.CEc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30986CEc extends AbstractC65781Prl implements InterfaceC65784Pro<CpuMemoryOptList> {
    public static final C30986CEc LJLIL = new C30986CEc();

    public C30986CEc() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.model.CpuMemoryOptList, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final CpuMemoryOptList invoke() {
        return SettingsManager.INSTANCE.getValueSafely(LiveCpuMemoryOptSetting.class);
    }
}
