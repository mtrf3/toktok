package X;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final /* synthetic */ class DIK {
    public static void LIZIZ(DIJ dij, String str, float f) {
        o.LJIIIZ(dij, str);
        dij.LJIJ(f);
        dij.LIZLLL();
    }

    public static ObjectAnimator LIZ(View view, Property property, float[] fArr, String str, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        o.LJIIIIZZ(ofFloat, str);
        ofFloat.setDuration(j);
        return ofFloat;
    }
}
