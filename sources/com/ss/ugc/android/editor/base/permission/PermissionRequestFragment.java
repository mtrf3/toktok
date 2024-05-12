package com.ss.ugc.android.editor.base.permission;

import X.C1B3;
import X.C76800UCe;
import X.InterfaceC88473Ynt;
import X.OHQ;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PermissionRequestFragment extends Fragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final Map<Integer, InterfaceC88473Ynt<Boolean, List<String>, List<String>, C76800UCe>> LJLIL = new LinkedHashMap();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        FragmentManager fragmentManager;
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) ((LinkedHashMap) this.LJLIL).get(Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            int i4 = i3 + 1;
            if (grantResults[i3] == 0) {
                arrayList2.add(str);
            } else {
                arrayList.add(str);
            }
            i2++;
            i3 = i4;
        }
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(Boolean.valueOf(arrayList.isEmpty()), arrayList2, arrayList);
        }
        this.LJLIL.remove(Integer.valueOf(i));
        if (this.LJLIL.isEmpty() && (fragmentManager = getFragmentManager()) != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJJI(this);
            c1b3.LJI();
        }
    }
}
