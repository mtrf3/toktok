package X;

import Y.ARunnableS32S0200000_13;
import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U2B extends C31073CHl {
    public final /* synthetic */ U2A LJLJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLJ;

    @Override // X.C31073CHl
    public final void LJFF() {
        C47061t0 c47061t0 = this.LJLJL.LLD;
        if (c47061t0 != null) {
            c47061t0.setVisibility(0);
        }
        this.LJLJL.LL = 1;
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        C47061t0 c47061t0 = this.LJLJL.LLD;
        if (c47061t0 != null) {
            c47061t0.setVisibility(8);
        }
        U2A u2a = this.LJLJL;
        u2a.LL = 2;
        C47061t0 c47061t02 = u2a.LLD;
        if (c47061t02 != null) {
            C15610jN.LIZIZ(new ARunnableS32S0200000_13(u2a, c47061t02, 14));
        }
        this.LJLJL.LLD = null;
        this.LJLJLJ.invoke();
    }

    public U2B(U2A u2a, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJL = u2a;
        this.LJLJLJ = interfaceC65784Pro;
    }
}
