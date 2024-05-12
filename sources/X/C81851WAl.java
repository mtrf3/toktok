package X;

import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import o53.IDdS479S0100000_14;

/* renamed from: X.WAl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81851WAl extends C78983UzD {
    public int LJZL;
    public final /* synthetic */ IDdS479S0100000_14 LL;

    public C81851WAl(IDdS479S0100000_14 iDdS479S0100000_14) {
        this.LL = iDdS479S0100000_14;
    }

    @Override // X.C78983UzD, X.InterfaceC81841WAb
    public final void LIZLLL(AnimatedDrawable2 animatedDrawable2, int i) {
        if (i == animatedDrawable2.LIZJ() - 1) {
            int i2 = this.LJZL + 1;
            this.LJZL = i2;
            if (i2 >= ((KS9) this.LL.l0).LJII) {
                animatedDrawable2.stop();
            }
        }
    }
}
