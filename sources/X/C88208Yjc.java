package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;

/* renamed from: X.Yjc, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88208Yjc extends AbstractC65781Prl implements InterfaceC65784Pro<CHK> {
    public static final C88208Yjc LJLIL = new C88208Yjc();

    public C88208Yjc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CHK invoke() {
        return new CHK("watch_click_enter", LiveFluencySupportSampleSetting.INSTANCE.getWatchEnterSamplingRate(), C88207Yjb.LJIIIIZZ, 8);
    }
}
