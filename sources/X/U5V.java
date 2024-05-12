package X;

import Y.ARunnableS41S0100000_5;
import com.bytedance.android.livesdk.hotword.HotWordGiftViewModel;
import kotlin.jvm.internal.AqS163S0100000_13;

/* loaded from: classes14.dex */
public final /* synthetic */ class U5V extends TBS implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public U5V(HotWordGiftViewModel hotWordGiftViewModel) {
        super(1, hotWordGiftViewModel, HotWordGiftViewModel.class, "onKeyboardChanged", "onKeyboardChanged(Z)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        HotWordGiftViewModel hotWordGiftViewModel = (HotWordGiftViewModel) this.receiver;
        if (booleanValue) {
            if (hotWordGiftViewModel.LJZ) {
                hotWordGiftViewModel.LJZ = false;
                C15610jN.LIZ().postDelayed(new ARunnableS41S0100000_5(new AqS163S0100000_13(hotWordGiftViewModel, 529), 256), 500L);
            }
        } else {
            hotWordGiftViewModel.getClass();
        }
        return C76800UCe.LIZ;
    }
}
