package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;

/* renamed from: X.Yjo, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88220Yjo extends AbstractC65781Prl implements InterfaceC65784Pro<CHK> {
    public static final C88220Yjo LJLIL = new C88220Yjo();

    public C88220Yjo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CHK invoke() {
        return new CHK("gift_play", LiveFluencySupportSampleSetting.INSTANCE.getGiftPlaySamplingRate(), C88207Yjb.LJIIIIZZ, 8);
    }
}
