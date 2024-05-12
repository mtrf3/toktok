package X;

import android.graphics.drawable.Animatable;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* renamed from: X.TiH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75385TiH extends W4V<InterfaceC81599W0t> {
    public final /* synthetic */ C75378TiA LIZIZ;
    public final /* synthetic */ String LIZJ;

    public C75385TiH(C75378TiA c75378TiA, String str) {
        this.LIZIZ = c75378TiA;
        this.LIZJ = str;
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        if (animatable instanceof AnimatedDrawable2) {
            ((AnimatedDrawable2) animatable).LJI(new C75384TiG(this.LIZIZ, animatable, this.LIZJ));
        }
    }
}
