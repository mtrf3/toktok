package X;

import Y.ALAdapterS2S0000000_5;
import android.animation.Animator;
import com.bytedance.android.live.slot.IIconSlot;

/* loaded from: classes6.dex */
public final class C05 implements IIconSlot {
    public final InterfaceC31687Cc7 LIZ;

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final void getScheme() {
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener LIZIZ() {
        return new ALAdapterS2S0000000_5(1);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final InterfaceC31687Cc7 LIZ() {
        return this.LIZ;
    }

    public C05(InterfaceC31687Cc7 interfaceC31687Cc7) {
        this.LIZ = interfaceC31687Cc7;
    }
}
