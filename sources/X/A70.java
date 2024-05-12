package X;

import Y.ALAdapterS1S0000000_4;
import android.animation.Animator;
import com.bytedance.android.live.slot.IIconSlot;

/* loaded from: classes5.dex */
public final class A70 implements IIconSlot {
    public final InterfaceC31687Cc7 LIZ;

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final void getScheme() {
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener LIZIZ() {
        return new ALAdapterS1S0000000_4(4);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final InterfaceC31687Cc7 LIZ() {
        return this.LIZ;
    }

    public A70(A71 a71) {
        this.LIZ = a71;
    }
}
