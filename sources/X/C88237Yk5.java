package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;

/* renamed from: X.Yk5, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88237Yk5 extends AbstractC65781Prl implements InterfaceC65784Pro<CHK> {
    public static final C88237Yk5 LJLIL = new C88237Yk5();

    public C88237Yk5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CHK invoke() {
        return new CHK("broadcast_link_period", LiveFluencySupportSampleSetting.INSTANCE.getBroadcastLinkPeriodSamplingRate(), C88207Yjb.LJIIIIZZ, 8);
    }
}
