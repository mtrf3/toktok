package X;

import Y.ARunnableS49S0100000_13;
import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* renamed from: X.U3n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76575U3n extends C31073CHl {
    public final /* synthetic */ C76574U3m LJLJL;

    @Override // X.C31073CHl
    public final void LJI(Animatable anim) {
        o.LJIIIZ(anim, "anim");
    }

    public C76575U3n(C76574U3m c76574U3m) {
        this.LJLJL = c76574U3m;
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        C0NB.LJIIIZ("LiveShowAnimationManager", "endGeckoWebpController onStop");
        C76574U3m c76574U3m = this.LJLJL;
        c76574U3m.LIZ.post(new ARunnableS49S0100000_13(c76574U3m, 244));
        InterfaceC76578U3q interfaceC76578U3q = this.LJLJL.LIZLLL;
        if (interfaceC76578U3q != null) {
            interfaceC76578U3q.LIZ();
        }
    }
}
