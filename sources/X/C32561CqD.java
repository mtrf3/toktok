package X;

import android.graphics.drawable.Animatable;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* renamed from: X.CqD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32561CqD extends W4V<Object> {
    public final /* synthetic */ C32553Cq5 LIZIZ;
    public final /* synthetic */ int LIZJ;

    public C32561CqD(C32553Cq5 c32553Cq5, int i) {
        this.LIZIZ = c32553Cq5;
        this.LIZJ = i;
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String id, Object obj, Animatable animatable) {
        o.LJIIIZ(id, "id");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Final Image Set ");
        LIZ.append(id);
        C0NB.LJIIIZ("Recharge Anim Debug", X1D.LIZIZ(LIZ));
        if (animatable instanceof AnimatedDrawable2) {
            ((AnimatedDrawable2) animatable).LJI(new C32560CqC(this.LIZIZ, this.LIZJ));
        }
    }
}
