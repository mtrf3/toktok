package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;

/* renamed from: X.Yjr, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88223Yjr extends AbstractC65781Prl implements InterfaceC65784Pro<CHK> {
    public static final C88223Yjr LJLIL = new C88223Yjr();

    public C88223Yjr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CHK invoke() {
        return new CHK("panel_public_screen_slide", LiveFluencySupportSampleSetting.INSTANCE.getPanelPublicScreenSlideSamplingRate(), C88207Yjb.LJIIIIZZ, 8);
    }
}