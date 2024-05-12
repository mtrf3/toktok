package X;

import android.graphics.drawable.Animatable;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* renamed from: X.TiF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75383TiF extends C78983UzD {
    public final /* synthetic */ C75379TiB LJZL;
    public final /* synthetic */ String LL;

    @Override // X.C78983UzD, X.InterfaceC81841WAb
    public final void LIZLLL(AnimatedDrawable2 animatedDrawable2, int i) {
        if (animatedDrawable2 != null && i == animatedDrawable2.LIZJ() - 1) {
            C75379TiB c75379TiB = this.LJZL;
            if (c75379TiB.LIZIZ) {
                C47061t0 c47061t0 = c75379TiB.LIZ;
                if (c47061t0 != null) {
                    c47061t0.setController(null);
                }
                C29306Beo.LJIIIZ(this.LJZL.LIZ);
            }
            if (!o.LJ(this.LL, this.LJZL.LIZJ)) {
                C75379TiB c75379TiB2 = this.LJZL;
                c75379TiB2.LIZ(c75379TiB2.LIZJ);
            }
        }
    }

    public C75383TiF(C75379TiB c75379TiB, Animatable animatable, String str) {
        this.LJZL = c75379TiB;
        this.LL = str;
    }
}
