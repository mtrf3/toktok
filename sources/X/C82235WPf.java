package X;

import Y.AObserverS82S0100000_14;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel$onStart$1$2", f = "EditFilterViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.WPf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82235WPf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AObserverS82S0100000_14 LJLIL;
    public final /* synthetic */ List LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82235WPf(AObserverS82S0100000_14 aObserverS82S0100000_14, List list, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = aObserverS82S0100000_14;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C82235WPf(this.LJLIL, this.LJLILLLLZI, completion);
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
                List<FilterBean> list2 = (List) entry.getValue();
                ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
                for (FilterBean filterBean : list2) {
                    arrayList.add(new OSZ(new Integer(filterBean.getId()), new OSZ(Boolean.valueOf(TMC.LJJIII(filterBean, ((EditFilterViewModel) this.LJLIL.l0).LJLZ)), Boolean.valueOf(C78764Uvg.LJIIL(filterBean.getThumbnailFileUri())))));
                }
                java.util.Map LJJLIIIJLJLI = C113554cx.LJJLIIIJLJLI(arrayList);
                map2.put(key, ORZ.LLILII(C66851QLn.LJ(new AqS180S0100000_14(LJJLIIIJLJLI, 207), new AqS180S0100000_14(LJJLIIIJLJLI, 208)), list2));
            }
        } else {
            map2 = C113554cx.LJJJLIIL();
        }
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder sb = new StringBuilder("viki filter, categoryFilters()?.observe -> !NetWorkStateManagerProxy.isNetworkAvailable -> filterTable=");
        java.util.Set keySet = map2.keySet();
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EffectCategoryResponse) it.next()).getName());
        }
        sb.append(arrayList2);
        sb.append(", filter.size =");
        Iterator it2 = map2.values().iterator();
        while (it2.hasNext()) {
            i += new Integer(((List) it2.next()).size()).intValue();
        }
        sb.append(i);
        LIZLLL.d(sb.toString());
        ((EditFilterViewModel) this.LJLIL.l0).setStateImmediate(new AqS180S0100000_14(map2, 206));
        return C76800UCe.LIZ;
    }
}
