package X;

import android.animation.ObjectAnimator;
import kotlin.jvm.internal.o;

/* renamed from: X.ahN, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94461ahN extends C1CS {
    public final /* synthetic */ ObjectAnimator LJLIL;

    public C94461ahN(ObjectAnimator objectAnimator) {
        this.LJLIL = objectAnimator;
    }

    @Override // X.C1CS, X.InterfaceC03480Bs
    public final void LIZIZ(AbstractC03490Bt transition) {
        o.LJIIIZ(transition, "transition");
        this.LJLIL.start();
    }
}
