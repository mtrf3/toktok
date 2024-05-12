package X;

import com.bytedance.android.livesdk.livesetting.clientai.CohostNoticeStrategySettings;

/* renamed from: X.Cjn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32163Cjn extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C32163Cjn LJLIL = new C32163Cjn();

    public C32163Cjn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(CohostNoticeStrategySettings.INSTANCE.getValue());
    }
}
