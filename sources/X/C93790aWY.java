package X;

import Y.IDTListenerS124S0100000_42;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aWY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93790aWY {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, X.aWa] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static C93792aWa LIZ(C93790aWY c93790aWY, ActivityC45651qj activityC45651qj, int i, View target, C94254ae2 c94254ae2, C93792aWa c93792aWa, boolean z, int i2) {
        ?? r5;
        C93792aWa c93792aWa2 = c93792aWa;
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            c93792aWa2 = null;
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        }
        c93790aWY.getClass();
        o.LJIIIZ(target, "target");
        if ((!o.LJ(target.getContext(), activityC45651qj)) || activityC45651qj.findViewById(R.id.nm_) == null) {
            return null;
        }
        C68322mC c68322mC = new C68322mC();
        if (c93792aWa2 != null) {
            r5 = c93792aWa2;
        } else {
            r5 = new C93792aWa(activityC45651qj);
        }
        HashMap<Integer, List<OSZ<View, InterfaceC93791aWZ>>> hashMap = r5.LIZ;
        Integer valueOf = Integer.valueOf(i);
        List<OSZ<View, InterfaceC93791aWZ>> list = r5.LIZ.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<OSZ<View, InterfaceC93791aWZ>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFirst());
        }
        if (arrayList.contains(target)) {
            ListProtector.remove(list, arrayList.indexOf(target));
        }
        list.add(new OSZ<>(target, c94254ae2));
        hashMap.put(valueOf, list);
        c68322mC.element = r5;
        target.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC93789aWX(c68322mC, c93792aWa2, activityC45651qj, i, target, c94254ae2, z2));
        C94164aca c94164aca = (C94164aca) activityC45651qj.findViewById(R.id.nm_);
        if (c94164aca != null) {
            IDTListenerS124S0100000_42 touchListener = ((C93792aWa) c68322mC.element).LJI;
            o.LJIIIZ(touchListener, "touchListener");
            ((ArrayList) c94164aca.LJLIL).remove(touchListener);
        }
        C94164aca c94164aca2 = (C94164aca) activityC45651qj.findViewById(R.id.nm_);
        if (c94164aca2 != null) {
            IDTListenerS124S0100000_42 touchListener2 = ((C93792aWa) c68322mC.element).LJI;
            o.LJIIIZ(touchListener2, "touchListener");
            ((ArrayList) c94164aca2.LJLIL).add(touchListener2);
        }
        return (C93792aWa) c68322mC.element;
    }
}
