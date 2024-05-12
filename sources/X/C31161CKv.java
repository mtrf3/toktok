package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelDisableOnTouch;

/* renamed from: X.CKv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31161CKv extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31161CKv LJLIL = new C31161CKv();

    public C31161CKv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LiveGiftPanelDisableOnTouch.INSTANCE.getTouchAnimDisabled());
    }
}
