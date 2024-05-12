package X;

import android.graphics.drawable.Animatable;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* renamed from: X.TiG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75384TiG extends C78983UzD {
    public final /* synthetic */ C75378TiA LJZL;
    public final /* synthetic */ String LL;

    @Override // X.C78983UzD, X.InterfaceC81841WAb
    public final void LIZLLL(AnimatedDrawable2 animatedDrawable2, int i) {
        if (animatedDrawable2 != null && i == animatedDrawable2.LIZJ() - 1) {
            C75378TiA c75378TiA = this.LJZL;
            if (c75378TiA.LIZJ) {
                C47061t0 c47061t0 = c75378TiA.LIZ;
                if (c47061t0 != null) {
                    c47061t0.setController(null);
                }
                C29306Beo.LJIIIZ(this.LJZL.LIZ);
            }
            if (!o.LJ(this.LL, this.LJZL.LJ)) {
                C75378TiA c75378TiA2 = this.LJZL;
                c75378TiA2.LIZ(c75378TiA2.LJ);
            }
        }
    }

    public C75384TiG(C75378TiA c75378TiA, Animatable animatable, String str) {
        this.LJZL = c75378TiA;
        this.LL = str;
    }
}
