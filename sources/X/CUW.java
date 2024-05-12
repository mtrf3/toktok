package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class CUW extends AbstractC03490Bt {
    @Override // X.AbstractC03490Bt
    public final void LIZLLL(C03860De c03860De) {
    }

    @Override // X.AbstractC03490Bt
    public final void LJI(C03860De c03860De) {
    }

    @Override // X.AbstractC03490Bt
    public final boolean LJIJ(C03860De c03860De, C03860De c03860De2) {
        return true;
    }

    @Override // X.AbstractC03490Bt
    public final Animator LJIIJ(ViewGroup viewGroup, C03860De c03860De, C03860De c03860De2) {
        ArrayList<View> arrayList;
        ArrayList<View> arrayList2 = this.LJLJJLL;
        if (arrayList2 != null) {
            Iterator<View> it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View next = it.next();
                View view = next;
                if (view != null && view.getId() == R.id.lsr) {
                    if (next != null && (arrayList = this.LJLJJLL) != null) {
                        Iterator<View> it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            View next2 = it2.next();
                            View view2 = next2;
                            if (view2 != null && view2.getId() == R.id.lst) {
                                if (next2 != null) {
                                    AnimatorSet LIZ = C1DD.LIZ(900L);
                                    Property property = View.ROTATION;
                                    Keyframe ofFloat = Keyframe.ofFloat(0.22222222f, 35.0f);
                                    ofFloat.setInterpolator(C18950ol.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
                                    Keyframe ofFloat2 = Keyframe.ofFloat(0.44444445f, -10.0f);
                                    ofFloat2.setInterpolator(C18950ol.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
                                    Keyframe ofFloat3 = Keyframe.ofFloat(0.6666667f, 10.0f);
                                    ofFloat3.setInterpolator(C18950ol.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
                                    Keyframe ofFloat4 = Keyframe.ofFloat(1.0f, 0.0f);
                                    ofFloat4.setInterpolator(new OvershootInterpolator());
                                    PropertyValuesHolder[] propertyValuesHolderArr = {PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, -10.0f), ofFloat, ofFloat2, ofFloat3, ofFloat4)};
                                    Property property2 = View.ROTATION;
                                    Keyframe ofFloat5 = Keyframe.ofFloat(0.22222222f, 20.0f);
                                    ofFloat5.setInterpolator(C18950ol.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
                                    Keyframe ofFloat6 = Keyframe.ofFloat(0.44444445f, -10.0f);
                                    ofFloat6.setInterpolator(C18950ol.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
                                    Keyframe ofFloat7 = Keyframe.ofFloat(0.6666667f, 20.0f);
                                    ofFloat7.setInterpolator(C18950ol.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
                                    Keyframe ofFloat8 = Keyframe.ofFloat(1.0f, 0.0f);
                                    ofFloat8.setInterpolator(new OvershootInterpolator());
                                    LIZ.playTogether(ObjectAnimator.ofPropertyValuesHolder(next, propertyValuesHolderArr), ObjectAnimator.ofPropertyValuesHolder(next2, PropertyValuesHolder.ofKeyframe(property2, Keyframe.ofFloat(0.0f, 0.0f), ofFloat5, ofFloat6, ofFloat7, ofFloat8)));
                                    return LIZ;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
