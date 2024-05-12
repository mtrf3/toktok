package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.aYa, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93916aYa {
    public final EnumC93915aYZ LIZ;

    public C93916aYa() {
        EnumC93915aYZ type = EnumC93915aYZ.TRANSLATE_Y;
        o.LJIIIZ(type, "type");
        this.LIZ = type;
    }

    public final ValueAnimator LIZ(View view, InterfaceC65784Pro<C76800UCe> onEnd) {
        ObjectAnimator ofFloat;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(onEnd, "onEnd");
        int i = C93917aYb.LIZ[this.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
                o.LJIIIIZZ(ofFloat, "ObjectAnimator.ofFloat(view, \"alpha\", 0f, 1f)");
            } else {
                throw new C162476Zf();
            }
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, "translationY", view.getHeight(), 0.0f);
            o.LJIIIIZZ(ofFloat, "ObjectAnimator.ofFloat(v…iew.height.toFloat(), 0f)");
        }
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(C94010aa6.LIZ());
        ofFloat.addListener(new C94320af6(onEnd));
        ofFloat.start();
        return ofFloat;
    }

    public final ValueAnimator LIZIZ(View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ObjectAnimator ofFloat;
        int i = C93917aYb.LIZIZ[this.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                o.LJIIIIZZ(ofFloat, "ObjectAnimator.ofFloat(view, \"alpha\", 1f, 0f)");
            } else {
                throw new C162476Zf();
            }
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, view.getHeight());
            o.LJIIIIZZ(ofFloat, "ObjectAnimator.ofFloat(v…f, view.height.toFloat())");
        }
        ofFloat.setDuration(350L);
        ofFloat.setInterpolator(C94010aa6.LIZ());
        ofFloat.addListener(new C94321af7(interfaceC65784Pro));
        ofFloat.start();
        return ofFloat;
    }
}
