package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;

/* renamed from: X.Yjf, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88211Yjf extends AbstractC65781Prl implements InterfaceC65784Pro<CHK> {
    public static final C88211Yjf LJLIL = new C88211Yjf();

    public C88211Yjf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CHK invoke() {
        return new CHK("pk_period", LiveFluencySupportSampleSetting.INSTANCE.getPkPeriodSamplingRate(), C88207Yjb.LJIIIIZZ, 8);
    }
}
