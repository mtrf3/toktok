package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;

/* renamed from: X.Yk2, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88234Yk2 extends AbstractC65781Prl implements InterfaceC65784Pro<CHK> {
    public static final C88234Yk2 LJLIL = new C88234Yk2();

    public C88234Yk2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CHK invoke() {
        return new CHK("preview_enter", LiveFluencySupportSampleSetting.INSTANCE.getPreviewEnterSamplingRate(), C88207Yjb.LJIIIIZZ, 8);
    }
}
