package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;

/* renamed from: X.Yjw, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88228Yjw extends AbstractC65781Prl implements InterfaceC65784Pro<CHK> {
    public static final C88228Yjw LJLIL = new C88228Yjw();

    public C88228Yjw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CHK invoke() {
        return new CHK("watch_period", LiveFluencySupportSampleSetting.INSTANCE.getWatchPeriodSamplingRate(), C88207Yjb.LJIIIIZZ, 8);
    }
}
