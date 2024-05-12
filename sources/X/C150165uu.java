package X;

import Y.ALAdapterS1S0300000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150165uu {
    public static void LIZIZ(InterfaceC150175uv interfaceC150175uv, ImageView imageView) {
        imageView.setImageResource(R.drawable.a9m);
        interfaceC150175uv.B1(ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f).setDuration(800L));
        ObjectAnimator a = interfaceC150175uv.a();
        if (a != null) {
            C149985uc.LIZ(a);
        }
        ObjectAnimator a2 = interfaceC150175uv.a();
        if (a2 == null) {
            return;
        }
        a2.setRepeatCount(-1);
    }

    public static void LIZ(View view, View view2, InterfaceC65784Pro interfaceC65784Pro) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", 0.0f).setDuration(150L);
        o.LJIIIIZZ(duration, "ofFloat(fadeOutView, \"alpha\", 0f).setDuration(150)");
        C149985uc.LIZ(duration);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f).setDuration(150L);
        o.LJIIIIZZ(duration2, "ofFloat(fadeInView, \"alp… 0f, 1f).setDuration(150)");
        duration2.setInterpolator(new LinearInterpolator());
        duration.addListener(new ALAdapterS1S0300000_2(view, view2, interfaceC65784Pro, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        animatorSet.start();
    }
}
