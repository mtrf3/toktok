package X;

import Y.ALAdapterS1S0000000_4;
import android.animation.Animator;
import com.bytedance.android.live.slot.IIconSlot;

/* renamed from: X.A6r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25697A6r implements IIconSlot {
    public final InterfaceC31687Cc7 LIZ;

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final void getScheme() {
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener LIZIZ() {
        return new ALAdapterS1S0000000_4(3);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final InterfaceC31687Cc7 LIZ() {
        return this.LIZ;
    }

    public C25697A6r(C25694A6o c25694A6o) {
        this.LIZ = c25694A6o;
    }
}
