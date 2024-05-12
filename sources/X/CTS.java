package X;

import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenAvatarHiddenSetting;

/* loaded from: classes6.dex */
public final class CTS extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final CTS LJLIL = new CTS();

    public CTS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(LivePublicScreenAvatarHiddenSetting.getValue());
    }
}
