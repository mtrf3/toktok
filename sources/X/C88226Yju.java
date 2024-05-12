package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;

/* renamed from: X.Yju, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88226Yju extends AbstractC65781Prl implements InterfaceC65784Pro<CHK> {
    public static final C88226Yju LJLIL = new C88226Yju();

    public C88226Yju() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CHK invoke() {
        return new CHK("panel_public_screen_auto_slide", LiveFluencySupportSampleSetting.INSTANCE.getPanelPublicScreenAutoSlideSamplingRate(), C88207Yjb.LJIIIIZZ, 8);
    }
}
