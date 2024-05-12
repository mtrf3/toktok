package com.google.android.material.transformation;

import X.C06F;
import X.C16300kU;
import X.C1PH;
import X.C45621qg;
import X.C80246VeU;
import X.C80380Vge;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public Map<View, Integer> LJIIIIZZ;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final C80380Vge LJII(Context context, boolean z) {
        int i;
        if (z) {
            i = R.animator.t;
        } else {
            i = R.animator.s;
        }
        C80380Vge c80380Vge = new C80380Vge();
        c80380Vge.LIZ = C80246VeU.LIZ(i, context);
        c80380Vge.LIZIZ = new C1PH();
        return c80380Vge;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void LIZ(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        ViewParent parent = view2.getParent();
        if (parent instanceof C45621qg) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            if (z) {
                this.LJIIIIZZ = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt.getLayoutParams() instanceof C06F) && (((C06F) childAt.getLayoutParams()).LIZ instanceof FabTransformationScrimBehavior)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map<View, Integer> map = this.LJIIIIZZ;
                        if (map != null && ((HashMap) map).containsKey(childAt)) {
                            C16300kU.LJIJ(childAt, ((Integer) ((HashMap) this.LJIIIIZZ).get(childAt)).intValue());
                        }
                    } else {
                        ((HashMap) this.LJIIIIZZ).put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        C16300kU.LJIJ(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.LJIIIIZZ = null;
            }
        }
        super.LIZ(view, view2, z, z2);
    }
}
