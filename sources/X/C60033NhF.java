package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.NhF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60033NhF implements InterfaceC60039NhL {
    public final int[] LIZ = new int[2];

    @Override // X.InterfaceC60039NhL
    public final JSONObject LIZ(View view) {
        if (view == null) {
            return C60031NhD.LIZ(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.LIZ);
        int[] iArr = this.LIZ;
        return C60031NhD.LIZ(iArr[0], iArr[1], width, height);
    }

    @Override // X.InterfaceC60039NhL
    public final void LIZIZ(View view, JSONObject jSONObject, InterfaceC60043NhP interfaceC60043NhP, boolean z) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        if (z) {
            HashMap hashMap = new HashMap();
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i++;
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hashMap.get(it.next())).iterator();
                while (it2.hasNext()) {
                    ((C60030NhC) interfaceC60043NhP).LIZIZ((View) it2.next(), this, jSONObject);
                }
            }
            return;
        }
        while (i < viewGroup.getChildCount()) {
            ((C60030NhC) interfaceC60043NhP).LIZIZ(viewGroup.getChildAt(i), this, jSONObject);
            i++;
        }
    }
}
