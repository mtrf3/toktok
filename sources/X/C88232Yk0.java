package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;

/* renamed from: X.Yk0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88232Yk0 extends AbstractC65781Prl implements InterfaceC65784Pro<CHK> {
    public static final C88232Yk0 LJLIL = new C88232Yk0();

    public C88232Yk0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CHK invoke() {
        return new CHK("broadcast_period", LiveFluencySupportSampleSetting.INSTANCE.getBroadcastPeriodSamplingRate(), C88207Yjb.LJIIIIZZ, 8);
    }
}
