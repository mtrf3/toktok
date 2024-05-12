package X;

import Y.ALAdapterS3S0000000_10;
import android.animation.Animator;
import com.bytedance.android.live.slot.IIconSlot;

/* renamed from: X.OLz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61767OLz implements IIconSlot {
    public final InterfaceC31687Cc7 LIZ;

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final void getScheme() {
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener LIZIZ() {
        return new ALAdapterS3S0000000_10(5);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final InterfaceC31687Cc7 LIZ() {
        return this.LIZ;
    }

    public C61767OLz(C61763OLv c61763OLv) {
        this.LIZ = c61763OLv;
    }
}
