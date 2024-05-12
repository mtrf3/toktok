package X;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* renamed from: X.BqH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30017BqH extends C31073CHl {
    public final /* synthetic */ C30016BqG LJLJL;

    public C30017BqH(C30016BqG c30016BqG) {
        this.LJLJL = c30016BqG;
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        C47061t0 c47061t0 = this.LJLJL.LIZ;
        if (c47061t0 != null) {
            c47061t0.setVisibility(8);
        } else {
            o.LJIJI("flowerAnimationWebp");
            throw null;
        }
    }
}
