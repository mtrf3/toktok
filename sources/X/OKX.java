package X;

import Y.ALAdapterS3S0000000_10;
import android.animation.Animator;
import com.bytedance.android.live.slot.IIconSlot;

/* loaded from: classes11.dex */
public final class OKX implements IIconSlot {
    public final InterfaceC31687Cc7 LIZ;

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final void getScheme() {
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener LIZIZ() {
        return new ALAdapterS3S0000000_10(7);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final InterfaceC31687Cc7 LIZ() {
        return this.LIZ;
    }

    public OKX(OKS oks) {
        this.LIZ = oks;
    }
}