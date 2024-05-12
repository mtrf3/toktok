package X;

import Y.ALAdapterS4S0000000_12;
import android.animation.Animator;
import com.bytedance.android.live.slot.IIconSlot;

/* renamed from: X.Rxd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71241Rxd implements IIconSlot {
    public final InterfaceC31687Cc7 LIZ;

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final void getScheme() {
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener LIZIZ() {
        return new ALAdapterS4S0000000_12(2);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final InterfaceC31687Cc7 LIZ() {
        return this.LIZ;
    }

    public C71241Rxd(C71224RxM c71224RxM) {
        this.LIZ = c71224RxM;
    }
}
