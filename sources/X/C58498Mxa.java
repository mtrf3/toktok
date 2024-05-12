package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestInviteModeInterceptionSkipSetting;

/* renamed from: X.Mxa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58498Mxa extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C58498Mxa LJLIL = new C58498Mxa();

    public C58498Mxa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(MultiGuestInviteModeInterceptionSkipSetting.INSTANCE.getValue());
    }
}
