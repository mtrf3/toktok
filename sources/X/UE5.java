package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.drawable.Animatable;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UE5 extends W4V<Object> {
    public final /* synthetic */ UE4 LIZIZ;
    public final /* synthetic */ ImageView LIZJ;
    public final /* synthetic */ C14500ha LIZLLL;

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        if (th != null) {
            th.printStackTrace();
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        UE4 ue4 = this.LIZIZ;
        ImageView imageView = this.LIZJ;
        C14500ha c14500ha = this.LIZLLL;
        ue4.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        if (imageView != null) {
            ((ConcurrentHashMap) ue4.LJLIL).put(imageView, animatorSet);
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.3f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.3f, 1.0f));
        ofPropertyValuesHolder.setDuration(200L);
        ofPropertyValuesHolder.setInterpolator(new OvershootInterpolator());
        ObjectAnimator LIZ = UE4.LIZ(imageView);
        ArrayList arrayList = new ArrayList();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("playCompleteAnimation-");
        LIZ2.append(imageView);
        LIZ2.append(" , ");
        LIZ2.append(ue4);
        LIZ2.append(" - ");
        LIZ2.append(ue4.getChildCount());
        C0NB.LIZIZ("AnimationView", X1D.LIZIZ(LIZ2));
        int childCount = ue4.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = ue4.getChildAt(i);
            if (!o.LJ(childAt, imageView)) {
                childAt.setTranslationX(0.0f);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("transition-view=");
                LIZ3.append(childAt);
                LIZ3.append(",giftview=");
                LIZ3.append(imageView);
                LIZ3.append(" - ");
                float f = i + 1;
                LIZ3.append((childAt.getWidth() + 0.0f) * f);
                LIZ3.append('}');
                C0NB.LIZIZ("AnimationView", X1D.LIZIZ(LIZ3));
                if (CCJ.LIZ(ue4.getContext())) {
                    arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, (ue4.LJLILLLLZI + 0.0f) * f));
                } else {
                    arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, (-(ue4.LJLILLLLZI + 0.0f)) * f));
                }
            }
        }
        ue4.LJFF(animatorSet, ofPropertyValuesHolder, LIZ, arrayList, imageView, c14500ha);
    }

    public UE5(UE4 ue4, String str, ImageView imageView, C14500ha c14500ha) {
        this.LIZIZ = ue4;
        this.LIZJ = imageView;
        this.LIZLLL = c14500ha;
    }
}
