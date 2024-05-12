package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicEffectFpsAnchorSetting;

/* renamed from: X.MxM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58484MxM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58484MxM LJLIL = new C58484MxM();

    public C58484MxM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LinkMicEffectFpsAnchorSetting.INSTANCE.getValue());
    }
}
