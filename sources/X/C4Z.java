package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeFpsAnchorSetting;

/* loaded from: classes6.dex */
public final class C4Z extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C4Z LJLIL = new C4Z();

    public C4Z() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(MultiGuestV3ChangeFpsAnchorSetting.INSTANCE.getValue());
    }
}
