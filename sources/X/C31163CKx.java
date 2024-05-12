package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelRecyclerViewOpt;

/* renamed from: X.CKx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31163CKx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31163CKx LJLIL = new C31163CKx();

    public C31163CKx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LiveGiftPanelRecyclerViewOpt.INSTANCE.isEnabled());
    }
}
