package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelDisableOnTouch;

/* renamed from: X.CKw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31162CKw extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31162CKw LJLIL = new C31162CKw();

    public C31162CKw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LiveGiftPanelDisableOnTouch.INSTANCE.getValue());
    }
}
