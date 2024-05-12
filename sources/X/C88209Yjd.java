package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;

/* renamed from: X.Yjd, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88209Yjd extends AbstractC65781Prl implements InterfaceC65784Pro<CHK> {
    public static final C88209Yjd LJLIL = new C88209Yjd();

    public C88209Yjd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CHK invoke() {
        return new CHK("watch_slide_enter", LiveFluencySupportSampleSetting.INSTANCE.getWatchEnterSamplingRate(), C88207Yjb.LJIIIIZZ, 8);
    }
}
