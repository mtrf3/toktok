package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;

/* renamed from: X.Yk4, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88236Yk4 extends AbstractC65781Prl implements InterfaceC65784Pro<CHK> {
    public static final C88236Yk4 LJLIL = new C88236Yk4();

    public C88236Yk4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CHK invoke() {
        return new CHK("preview_period", LiveFluencySupportSampleSetting.INSTANCE.getPreviewPeriodSamplingRate(), C88207Yjb.LJIIIIZZ, 8);
    }
}
