package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.BuriedFieldData;

/* renamed from: X.CEj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30993CEj extends AbstractC65781Prl implements InterfaceC65784Pro<BuriedFieldData> {
    public static final C30993CEj LJLIL = new C30993CEj();

    public C30993CEj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.model.BuriedFieldData] */
    @Override // X.InterfaceC65784Pro
    public final BuriedFieldData invoke() {
        return SettingsManager.INSTANCE.getValueSafely(BuriedFieldReductionSetting.class);
    }
}
