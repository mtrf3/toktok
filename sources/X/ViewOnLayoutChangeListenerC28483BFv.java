package X;

import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BFv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC28483BFv implements View.OnLayoutChangeListener {
    public final /* synthetic */ Fragment LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    public ViewOnLayoutChangeListenerC28483BFv(View view, Fragment fragment) {
        this.LJLIL = fragment;
        this.LJLILLLLZI = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(v, "v");
        Fragment fragment = this.LJLIL;
        WeakHashMap<View, Integer> weakHashMap = C28482BFu.LIZIZ.get(fragment);
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap<>();
        }
        HashMap hashMap = new HashMap();
        int i9 = 0;
        for (ViewParent parent = v.getParent(); parent != null; parent = parent.getParent()) {
            i9++;
            hashMap.put(parent, Integer.valueOf(i9));
        }
        for (ViewParent parent2 = v.getParent(); parent2 != null; parent2 = parent2.getParent()) {
            if (hashMap.containsKey(parent2)) {
                Object obj = hashMap.get(parent2);
                o.LJI(obj);
                int intValue = i9 - ((Number) obj).intValue();
                if ((parent2 instanceof View) && !weakHashMap.containsKey(parent2)) {
                    weakHashMap.put(parent2, Integer.valueOf(intValue));
                }
            }
        }
        C28482BFu.LIZIZ.put(fragment, weakHashMap);
        this.LJLILLLLZI.removeOnLayoutChangeListener(this);
    }
}
