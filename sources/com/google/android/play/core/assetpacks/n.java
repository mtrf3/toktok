package com.google.android.play.core.assetpacks;

import X.C40579FwF;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class n extends l<List<String>> {
    public final /* synthetic */ q LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, C40579FwF c40579FwF) {
        super(qVar, c40579FwF);
        this.LJLJI = qVar;
    }

    @Override // com.google.android.play.core.assetpacks.l, X.InterfaceC40618Fws
    public final void LLJL(List<Bundle> list) {
        super.LLJL(list);
        q qVar = this.LJLJI;
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : list) {
            q0 q0Var = qVar.LIZIZ;
            ArrayList arrayList2 = new ArrayList();
            x xVar = new v() { // from class: com.google.android.play.core.assetpacks.x
                @Override // com.google.android.play.core.assetpacks.v
                public final int a(int i) {
                    return i;
                }
            };
            ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
            HashMap hashMap = new HashMap();
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = (String) ListProtector.get(stringArrayList, i);
                hashMap.put(str, AssetPackState.LIZLLL(bundle, str, q0Var, xVar));
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                hashMap.put(str2, AssetPackState.LIZIZ(str2, 4, 0, 0L, 0L, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1));
            }
            AssetPackState next = new e0(bundle.getLong("total_bytes_to_download"), hashMap).LIZIZ.values().iterator().next();
            if (next == null) {
                q.LJFF.LIZJ("onGetSessionStates: Bundle contained no pack.", 6, new Object[0]);
            }
            int LJI = next.LJI();
            if (LJI == 1 || LJI == 7 || LJI == 2 || LJI == 3) {
                arrayList.add(next.LJFF());
            }
        }
        this.LJLIL.LIZJ(arrayList);
    }
}
