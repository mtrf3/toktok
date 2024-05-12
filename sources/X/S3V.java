package X;

import Y.AUListenerS90S0100000_1;
import Y.IDAListenerS38S0200000_4;
import Y.IDAListenerS42S0200000_12;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AqS15S2200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S3V {
    public static final /* synthetic */ int LIZ = 0;

    public static ObjectAnimator LIZJ(TuxTextView tuxTextView) {
        S3Z onAnimStart = S3Z.LJLIL;
        C71466S3a onAnimEnd = C71466S3a.LJLIL;
        o.LJIIIZ(onAnimStart, "onAnimStart");
        o.LJIIIZ(onAnimEnd, "onAnimEnd");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tuxTextView, PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.3f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.3f, 1.0f));
        o.LJIIIIZZ(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n… 0f, 1.3f, 1f),\n        )");
        ofPropertyValuesHolder.setDuration(300L);
        ofPropertyValuesHolder.addListener(new IDAListenerS38S0200000_4(onAnimStart, onAnimEnd, 3));
        return ofPropertyValuesHolder;
    }

    public static ObjectAnimator LIZLLL(TuxTextView tuxTextView, InterfaceC65784Pro interfaceC65784Pro) {
        C71467S3b onAnimEnd = C71467S3b.LJLIL;
        o.LJIIIZ(onAnimEnd, "onAnimEnd");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tuxTextView, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        o.LJIIIIZZ(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…lpha\", 0f, 1f),\n        )");
        ofPropertyValuesHolder.setDuration(100L);
        ofPropertyValuesHolder.addListener(new IDAListenerS38S0200000_4(interfaceC65784Pro, onAnimEnd, 4));
        return ofPropertyValuesHolder;
    }

    public static ObjectAnimator LIZ(View view, InterfaceC65784Pro onAnimStart, InterfaceC65784Pro onAnimEnd) {
        o.LJIIIZ(onAnimStart, "onAnimStart");
        o.LJIIIZ(onAnimEnd, "onAnimEnd");
        view.setPivotX(0.0f);
        view.setPivotY(view.getMeasuredHeight() / 2.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
        o.LJIIIIZZ(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…aleY\", 0f, 1f),\n        )");
        ofPropertyValuesHolder.setDuration(300L);
        ofPropertyValuesHolder.addListener(new IDAListenerS42S0200000_12(onAnimStart, onAnimEnd, 1));
        return ofPropertyValuesHolder;
    }

    public static ValueAnimator LIZIZ(View view, float f, float f2, AqS15S2200000_12 aqS15S2200000_12, AqS15S2200000_12 aqS15S2200000_122, int i) {
        InterfaceC65784Pro onAnimStart = aqS15S2200000_12;
        if ((i & 8) != 0) {
            onAnimStart = S3W.LJLIL;
        }
        InterfaceC65784Pro onAnimEnd = aqS15S2200000_122;
        if ((i & 16) != 0) {
            onAnimEnd = S3X.LJLIL;
        }
        o.LJIIIZ(onAnimStart, "onAnimStart");
        o.LJIIIZ(onAnimEnd, "onAnimEnd");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new AUListenerS90S0100000_1(view, 63));
        ofFloat.addListener(new IDAListenerS38S0200000_4(onAnimStart, onAnimEnd, 1));
        return ofFloat;
    }
}
