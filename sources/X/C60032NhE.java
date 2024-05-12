package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.NhE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60032NhE implements InterfaceC60039NhL {
    public final InterfaceC60039NhL LIZ;

    public C60032NhE(C60033NhF c60033NhF) {
        this.LIZ = c60033NhF;
    }

    @Override // X.InterfaceC60039NhL
    public final JSONObject LIZ(View view) {
        return C60031NhD.LIZ(0, 0, 0, 0);
    }

    @Override // X.InterfaceC60039NhL
    public final void LIZIZ(View view, JSONObject jSONObject, InterfaceC60043NhP interfaceC60043NhP, boolean z) {
        ArrayList arrayList = new ArrayList();
        C60023Nh5 c60023Nh5 = C60023Nh5.LIZJ;
        if (c60023Nh5 != null) {
            Collection unmodifiableCollection = Collections.unmodifiableCollection(c60023Nh5.LIZIZ);
            IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
            Iterator it = unmodifiableCollection.iterator();
            while (it.hasNext()) {
                View view2 = ((C60014Ngw) it.next()).LIZLLL.get();
                if (view2 != null && view2.isAttachedToWindow() && view2.isShown()) {
                    View view3 = view2;
                    while (view3.getAlpha() != 0.0f) {
                        Object parent = view3.getParent();
                        if (!(parent instanceof View) || (view3 = (View) parent) == null) {
                            View rootView = view2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z2 = rootView.getZ();
                                int size = arrayList.size();
                                while (size > 0) {
                                    int i = size - 1;
                                    if (((View) ListProtector.get(arrayList, i)).getZ() <= z2) {
                                        break;
                                    } else {
                                        size = i;
                                    }
                                }
                                ListProtector.add(arrayList, size, rootView);
                            }
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C60030NhC) interfaceC60043NhP).LIZIZ((View) it2.next(), this.LIZ, jSONObject);
        }
    }
}
