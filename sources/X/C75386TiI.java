package X;

import android.graphics.drawable.Animatable;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* renamed from: X.TiI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75386TiI extends W4V<InterfaceC81599W0t> {
    public final /* synthetic */ C75379TiB LIZIZ;
    public final /* synthetic */ String LIZJ;

    public C75386TiI(C75379TiB c75379TiB, String str) {
        this.LIZIZ = c75379TiB;
        this.LIZJ = str;
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        if (animatable instanceof AnimatedDrawable2) {
            ((AnimatedDrawable2) animatable).LJI(new C75383TiF(this.LIZIZ, animatable, this.LIZJ));
        }
    }
}
