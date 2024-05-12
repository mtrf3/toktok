package com.google.android.material.transformation;

import X.C06C;
import X.C16330kX;
import X.C45621qg;
import X.InterfaceC80382Vgg;
import X.ViewTreeObserverOnPreDrawListenerC80381Vgf;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public abstract class ExpandableBehavior extends C06C<View> {
    public int LIZ;

    public abstract void LIZ(View view, View view2, boolean z, boolean z2);

    @Override // X.C06C
    public abstract boolean layoutDependsOn(C45621qg c45621qg, View view, View view2);

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C06C
    public final boolean onDependentViewChanged(C45621qg c45621qg, View view, View view2) {
        int i;
        InterfaceC80382Vgg interfaceC80382Vgg = (InterfaceC80382Vgg) view2;
        int i2 = 2;
        if (!interfaceC80382Vgg.LJJJLZIJ() ? this.LIZ != 1 : (i = this.LIZ) != 0 && i != 2) {
            return false;
        }
        if (interfaceC80382Vgg.LJJJLZIJ()) {
            i2 = 1;
        }
        this.LIZ = i2;
        LIZ((View) interfaceC80382Vgg, view, interfaceC80382Vgg.LJJJLZIJ(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C06C
    public final boolean onLayoutChild(C45621qg c45621qg, View view, int i) {
        int i2;
        if (!C16330kX.LIZJ(view)) {
            ArrayList arrayList = (ArrayList) c45621qg.LIZLLL(view);
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                View view2 = (View) ListProtector.get(arrayList, i3);
                if (layoutDependsOn(c45621qg, view, view2)) {
                    InterfaceC80382Vgg interfaceC80382Vgg = (InterfaceC80382Vgg) view2;
                    if (interfaceC80382Vgg != null) {
                        int i4 = 2;
                        if (!interfaceC80382Vgg.LJJJLZIJ() ? this.LIZ == 1 : !((i2 = this.LIZ) != 0 && i2 != 2)) {
                            if (interfaceC80382Vgg.LJJJLZIJ()) {
                                i4 = 1;
                            }
                            this.LIZ = i4;
                            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC80381Vgf(this, view, i4, interfaceC80382Vgg));
                        }
                    }
                } else {
                    i3++;
                }
            }
        }
        return false;
    }
}
