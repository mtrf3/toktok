package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;

/* renamed from: X.Yjy, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88230Yjy extends AbstractC65781Prl implements InterfaceC65784Pro<CHK> {
    public static final C88230Yjy LJLIL = new C88230Yjy();

    public C88230Yjy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CHK invoke() {
        return new CHK("broadcast_enter", LiveFluencySupportSampleSetting.INSTANCE.getBroadcastEnterSamplingRate(), C88207Yjb.LJIIIIZZ, 8);
    }
}
