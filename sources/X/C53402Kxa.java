package X;

import com.bytedance.android.livesdk.hotword.HotWordGiftViewModel;

/* renamed from: X.Kxa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C53402Kxa extends TBS implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public C53402Kxa(HotWordGiftViewModel hotWordGiftViewModel) {
        super(1, hotWordGiftViewModel, HotWordGiftViewModel.class, "onGiftSuspensionChanged", "onGiftSuspensionChanged(Z)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        HotWordGiftViewModel hotWordGiftViewModel = (HotWordGiftViewModel) this.receiver;
        if (booleanValue) {
            hotWordGiftViewModel.jv0();
        } else {
            hotWordGiftViewModel.getClass();
        }
        return C76800UCe.LIZ;
    }
}
