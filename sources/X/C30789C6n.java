package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveImageMonitorSceneSetting;

/* renamed from: X.C6n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30789C6n extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final C30789C6n LJLIL = new C30789C6n();

    public C30789C6n() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        return LiveImageMonitorSceneSetting.INSTANCE.getValue();
    }
}
