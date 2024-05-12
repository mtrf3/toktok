package X;

import Y.ALAdapterS1S0000000_4;
import android.animation.Animator;
import com.bytedance.android.live.slot.IIconSlot;

/* renamed from: X.A6x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25703A6x implements IIconSlot {
    public final InterfaceC31687Cc7 LIZ;

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final void getScheme() {
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener LIZIZ() {
        return new ALAdapterS1S0000000_4(5);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final InterfaceC31687Cc7 LIZ() {
        return this.LIZ;
    }

    public C25703A6x(C25700A6u c25700A6u) {
        this.LIZ = c25700A6u;
    }
}
