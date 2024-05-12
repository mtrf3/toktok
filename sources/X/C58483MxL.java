package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAudioModeOptGuestSetting;

/* renamed from: X.MxL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58483MxL extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58483MxL LJLIL = new C58483MxL();

    public C58483MxL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LinkMicAudioModeOptGuestSetting.INSTANCE.getValue());
    }
}
