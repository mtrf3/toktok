package X;

import android.graphics.drawable.Animatable;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* renamed from: X.CqG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32564CqG extends W4V<InterfaceC81599W0t> {
    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String id, Object obj, Animatable animatable) {
        AnimatedDrawable2 animatedDrawable2;
        o.LJIIIZ(id, "id");
        try {
            if ((animatable instanceof AnimatedDrawable2) && (animatedDrawable2 = (AnimatedDrawable2) animatable) != null) {
                animatedDrawable2.setPrivateFrameScheduler(new V9F(animatedDrawable2.LJLJI));
                animatedDrawable2.start();
            }
        } catch (Exception unused) {
        }
    }
}
