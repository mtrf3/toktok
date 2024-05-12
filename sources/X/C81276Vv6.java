package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Vv6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81276Vv6 {
    public static final /* synthetic */ int LIZ = 0;

    public static Animator LIZ(View target, float f) {
        o.LJIIIZ(target, "target");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(target, "translationY", target.getTranslationY(), f);
        ofFloat.setDuration(300L);
        return ofFloat;
    }
}
