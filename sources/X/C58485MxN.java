package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicEffectFpsGuestSetting;

/* renamed from: X.MxN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58485MxN extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58485MxN LJLIL = new C58485MxN();

    public C58485MxN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LinkMicEffectFpsGuestSetting.INSTANCE.getValue());
    }
}
