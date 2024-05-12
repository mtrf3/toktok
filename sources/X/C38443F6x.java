package X;

import com.bytedance.android.livesdk.livesetting.other.LiveSoMonitorFilterSetting;

/* renamed from: X.F6x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38443F6x extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final C38443F6x LJLIL = new C38443F6x();

    public C38443F6x() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        return LiveSoMonitorFilterSetting.INSTANCE.getValue();
    }
}
