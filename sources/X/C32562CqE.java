package X;

import android.graphics.drawable.Animatable;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import java.lang.reflect.Field;

/* renamed from: X.CqE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32562CqE extends W4V<InterfaceC81599W0t> {
    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        if (animatable != null) {
            Field declaredField = AnimatedDrawable2.class.getDeclaredField("LJLIL");
            declaredField.setAccessible(true);
            declaredField.set(animatable, 1);
            animatable.start();
        }
    }
}
