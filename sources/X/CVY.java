package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class CVY extends AbstractC03490Bt {
    @Override // X.AbstractC03490Bt
    public final void LIZLLL(C03860De c03860De) {
        View view = c03860De.LIZIZ;
        if (view instanceof TextView) {
            ((HashMap) c03860De.LIZ).put("android:textscale:scale", Float.valueOf(view.getScaleX()));
        }
    }

    @Override // X.AbstractC03490Bt
    public final void LJI(C03860De c03860De) {
        View view = c03860De.LIZIZ;
        if (view instanceof TextView) {
            ((HashMap) c03860De.LIZ).put("android:textscale:scale", Float.valueOf(view.getScaleX()));
        }
    }

    @Override // X.AbstractC03490Bt
    public final Animator LJIIJ(ViewGroup viewGroup, C03860De c03860De, C03860De c03860De2) {
        float f;
        if (c03860De == null || c03860De2 == null || !(c03860De.LIZIZ instanceof TextView)) {
            return null;
        }
        View view = c03860De2.LIZIZ;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        java.util.Map<String, Object> map = c03860De.LIZ;
        java.util.Map<String, Object> map2 = c03860De2.LIZ;
        HashMap hashMap = (HashMap) map;
        float f2 = 1.0f;
        if (hashMap.get("android:textscale:scale") != null) {
            f = ((Float) hashMap.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        HashMap hashMap2 = (HashMap) map2;
        if (hashMap2.get("android:textscale:scale") != null) {
            f2 = ((Float) hashMap2.get("android:textscale:scale")).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new CVZ(textView));
        return ofFloat;
    }
}
