package X;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* renamed from: X.BqE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30014BqE extends C31073CHl {
    public final /* synthetic */ C30015BqF LJLJL;

    public C30014BqE(C30015BqF c30015BqF) {
        this.LJLJL = c30015BqF;
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        C47061t0 c47061t0 = this.LJLJL.LIZ;
        if (c47061t0 != null) {
            c47061t0.setVisibility(8);
        } else {
            o.LJIJI("bubblesAnimation");
            throw null;
        }
    }
}
