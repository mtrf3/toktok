package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;

/* renamed from: X.Yje, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88210Yje extends AbstractC65781Prl implements InterfaceC65784Pro<CHK> {
    public static final C88210Yje LJLIL = new C88210Yje();

    public C88210Yje() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CHK invoke() {
        return new CHK("audience_link_period", LiveFluencySupportSampleSetting.INSTANCE.getAudienceLinkPeriodSamplingRate(), C88207Yjb.LJIIIIZZ, 8);
    }
}
