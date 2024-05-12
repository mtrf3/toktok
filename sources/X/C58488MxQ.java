package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestBusinessServerReporterIntervalSetting;

/* renamed from: X.MxQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58488MxQ extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C58488MxQ LJLIL = new C58488MxQ();

    public C58488MxQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(MultiGuestBusinessServerReporterIntervalSetting.INSTANCE.getValue());
    }
}
