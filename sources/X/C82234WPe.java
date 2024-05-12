package X;

import Y.AObjectS89S0100000_14;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel$onStart$1$2$1", f = "FilterPanelViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.WPe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82234WPe extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AObjectS89S0100000_14 LJLIL;
    public final /* synthetic */ List LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82234WPe(AObjectS89S0100000_14 aObjectS89S0100000_14, List list, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = aObjectS89S0100000_14;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C82234WPe(this.LJLIL, this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        java.util.Map map;
        C141335gf.LIZJ(obj);
        List list = this.LJLILLLLZI;
        java.util.Map map2 = null;
        if (list != null) {
            map = C82238WPi.LIZ(list);
        } else {
            map = null;
        }
        if (C65777Prh.LJII(map)) {
            map2 = map;
        }
        int i = 0;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                Object key = entry.getKey();
                List list2 = (List) entry.getValue();
                ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
                Iterator it = list2.iterator();
                while (true) {
                    boolean z = true;
                    if (it.hasNext()) {
                        FilterBean filterBean = (FilterBean) it.next();
                        Integer num = new Integer(filterBean.getId());
                        InterfaceC82236WPg invoke = ((FilterPanelViewModel) ((AqS180S0100000_14) this.LJLIL.l0).l0).LJZ.invoke();
                        if (invoke == null || !TMC.LJJIII(filterBean, invoke)) {
                            z = false;
                        }
                        arrayList.add(new OSZ(num, new OSZ(Boolean.valueOf(z), Boolean.valueOf(C78764Uvg.LJIIL(filterBean.getThumbnailFileUri())))));
                    }
                }
                java.util.Map LJJLIIIJLJLI = C113554cx.LJJLIIIJLJLI(arrayList);
                map2.put(key, ORZ.LLILII(C66851QLn.LJ(new AqS180S0100000_14(LJJLIIIJLJLI, 35), new AqS180S0100000_14(LJJLIIIJLJLI, 36)), list2));
            }
        } else {
            map2 = C113554cx.LJJJLIIL();
        }
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder sb = new StringBuilder("viki filter, categoryFilters()?.observe -> !NetWorkStateManagerProxy.isNetworkAvailable -> filterTable=");
        java.util.Set keySet = map2.keySet();
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(keySet, 10));
        Iterator it2 = keySet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((EffectCategoryResponse) it2.next()).getName());
        }
        sb.append(arrayList2);
        sb.append(", filter.size =");
        Iterator it3 = map2.values().iterator();
        while (it3.hasNext()) {
            i += new Integer(((List) it3.next()).size()).intValue();
        }
        sb.append(i);
        LIZLLL.d(sb.toString());
        ((FilterPanelViewModel) ((AqS180S0100000_14) this.LJLIL.l0).l0).setStateImmediate(new AqS180S0100000_14(map2, 37));
        return C76800UCe.LIZ;
    }
}
