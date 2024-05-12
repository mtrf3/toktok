package X;

import com.bytedance.effectcreatormobile.modelselect.model.ModelViewModel;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.afx, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94373afx implements InterfaceC93663aUV<C94355aff> {
    public final /* synthetic */ ModelViewModel LIZ;
    public final /* synthetic */ InterfaceC88472Yns LIZIZ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C94955apL(this, null), 3);
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(C94355aff c94355aff) {
        int i;
        int i2;
        C94355aff result = c94355aff;
        o.LJIIIZ(result, "result");
        if (result.LJLIL.isEmpty()) {
            return;
        }
        ModelViewModel modelViewModel = this.LIZ;
        modelViewModel.LJLJJLL = result.LJLIL;
        modelViewModel.LJLJL.clear();
        C93624aTs<List<String>> c93624aTs = this.LIZ.LJLJI;
        LinkedHashMap<String, List<C94256ae4>> linkedHashMap = result.LJLIL;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator<Map.Entry<String, List<C94256ae4>>> it = linkedHashMap.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, List<C94256ae4>> next = it.next();
            this.LIZ.LJLJL.put(next.getKey(), 0);
            arrayList.add(next.getKey());
        }
        StateViewModel.hv0(c93624aTs, arrayList);
        ModelViewModel modelViewModel2 = this.LIZ;
        modelViewModel2.getClass();
        String LIZ = C93950aZ8.LIZ();
        List<String> value = modelViewModel2.LJLJI.LIZ.getValue();
        if (value != null) {
            i = 0;
            i2 = 0;
            int i3 = 0;
            for (String str : value) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    List<C94256ae4> list = modelViewModel2.LJLJJLL.get(str);
                    if (list != null) {
                        int i5 = 0;
                        for (C94256ae4 c94256ae4 : list) {
                            int i6 = i5 + 1;
                            if (i5 >= 0) {
                                if (o.LJ(LIZ, c94256ae4.LJLJJLL)) {
                                    i = i3;
                                    i2 = i5;
                                }
                                i5 = i6;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                    }
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        } else {
            i2 = 0;
        }
        modelViewModel2.kv0(i);
        modelViewModel2.iv0(i2);
        StateViewModel.hv0(modelViewModel2.LJLJJI, Integer.valueOf(i2));
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C94956apM(this, null), 3);
    }

    public C94373afx(ModelViewModel modelViewModel, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = modelViewModel;
        this.LIZIZ = interfaceC88472Yns;
    }
}
