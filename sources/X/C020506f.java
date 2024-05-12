package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* renamed from: X.06f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C020506f {
    public Bundle LIZLLL() {
        return null;
    }

    public static C1AT LIZJ(Activity activity, C15070iV... c15070iVArr) {
        Pair[] pairArr = new Pair[c15070iVArr.length];
        for (int i = 0; i < c15070iVArr.length; i++) {
            C15070iV c15070iV = c15070iVArr[i];
            pairArr[i] = Pair.create(c15070iV.LIZ, c15070iV.LIZIZ);
        }
        return new C1AT(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    public static C020506f LIZ(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return new C1AT(C06Z.LIZIZ(view, 0, 0, i, i2));
        }
        return new C020506f();
    }

    public static C1AT LIZIZ(View view, int i, int i2) {
        return new C1AT(ActivityOptions.makeScaleUpAnimation(view, i, i2, 0, 0));
    }
}
