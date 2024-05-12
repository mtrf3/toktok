package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;

/* renamed from: X.07u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C024607u {
    public static final DataBinderMapperImpl LIZ = new DataBinderMapperImpl();

    public static <T extends ViewDataBinding> T LIZ(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, InterfaceC024507t interfaceC024507t) {
        boolean z2;
        int i2;
        if (viewGroup != null && z) {
            z2 = true;
            i2 = viewGroup.getChildCount();
        } else {
            z2 = false;
            i2 = 0;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, i, viewGroup, z);
        if (z2) {
            int childCount = viewGroup.getChildCount();
            int i3 = childCount - i2;
            if (i3 == 1) {
                return (T) LIZ.LIZIZ(interfaceC024507t, viewGroup.getChildAt(childCount - 1), i);
            }
            View[] viewArr = new View[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                viewArr[i4] = viewGroup.getChildAt(i4 + i2);
            }
            return (T) LIZ.LIZJ(interfaceC024507t, viewArr, i);
        }
        return (T) LIZ.LIZIZ(interfaceC024507t, LLLLIILL, i);
    }
}
