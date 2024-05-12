package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TKl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74467TKl implements InterfaceC82244WPo {
    public static final C74470TKo LJIILJJIL = C74470TKo.LJLIL;
    public final C74464TKi LIZ;
    public final C74469TKn LIZIZ;
    public java.util.Map<FilterBean, ? extends EnumC82260WQe> LIZJ;
    public FilterBean LIZLLL;
    public final C73893SzJ LJ;
    public final C73893SzJ LJFF;
    public final C73893SzJ LJI;
    public final AqS194S0100000_12 LJII;
    public final RecyclerView LJIIIIZZ;
    public final LifecycleOwner LJIIIZ;
    public final InterfaceC74472TKq LJIIJ;
    public final InterfaceC74471TKp LJIIJJI;
    public final InterfaceC88473Ynt<InterfaceC82244WPo, FilterBean, EnumC82260WQe, C76800UCe> LJIIL;
    public final C74466TKk LJIILIIL;

    @Override // X.InterfaceC82244WPo
    public final AbstractC73672Svk<C35794E3a<FilterBean>> LIZLLL() {
        C73893SzJ c73893SzJ = this.LJFF;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.InterfaceC82244WPo
    public final AbstractC73672Svk<FilterBean> LJIIIIZZ() {
        C73893SzJ c73893SzJ = this.LJ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    public final AbstractC73672Svk<FilterBean> LJIILIIL() {
        C73893SzJ c73893SzJ = this.LJI;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.InterfaceC82244WPo
    public final FilterBean LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC82244WPo
    public final void LIZJ(FilterBean filterBean) {
        LJII(filterBean);
        InterfaceC74472TKq interfaceC74472TKq = this.LJIIJ;
        if (interfaceC74472TKq != null) {
            interfaceC74472TKq.sw(filterBean);
        } else {
            LJIILL(filterBean);
        }
    }

    @Override // X.InterfaceC82244WPo
    public final void LJII(FilterBean filterBean) {
        LJIILJJIL(filterBean, new AqS178S0100000_12(this, 646));
    }

    @Override // X.WPM
    public final void LJIIIZ(java.util.Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> filterList) {
        o.LJIIIZ(filterList, "filterList");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Map.Entry<EffectCategoryResponse, ? extends List<? extends FilterBean>>> it = filterList.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.addAll(it.next().getValue());
            if (i < filterList.size() - 1 && (!r1.getValue().isEmpty())) {
                arrayList2.add(new OSZ(Integer.valueOf(arrayList.size() - 1), C76800UCe.LIZ));
            }
            i++;
        }
        C74464TKi c74464TKi = this.LIZ;
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object filter = it2.next();
            java.util.Map<FilterBean, ? extends EnumC82260WQe> states = this.LIZJ;
            o.LJIIIZ(states, "states");
            o.LJIIIZ(filter, "filter");
            EnumC82260WQe enumC82260WQe = states.get(filter);
            if (enumC82260WQe == null) {
                enumC82260WQe = EnumC82260WQe.FILTER_STATE_UNKNOWN;
            }
            arrayList3.add(new OSZ(filter, enumC82260WQe));
        }
        c74464TKi.LJLZ(arrayList3);
        this.LIZIZ.LL(arrayList2);
        InterfaceC74471TKp interfaceC74471TKp = this.LJIIJJI;
        if (interfaceC74471TKp != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator<Map.Entry<EffectCategoryResponse, ? extends List<? extends FilterBean>>> it3 = filterList.entrySet().iterator();
            while (it3.hasNext()) {
                ORS.LJJLIIIJILLIZJL(it3.next().getValue(), arrayList4);
            }
            interfaceC74471TKp.no0(arrayList4);
        }
    }

    @Override // X.InterfaceC82244WPo
    public final void LJIIL(FilterBean filterBean) {
        LJIILJJIL(filterBean, new AqS178S0100000_12(this, 648));
    }

    public final void LJIILL(FilterBean filterBean) {
        FilterBean filterBean2 = this.LIZLLL;
        if (filterBean2 == null && filterBean == null) {
            return;
        }
        this.LIZLLL = filterBean;
        AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12(this, 647);
        if (!o.LJ(filterBean2, filterBean)) {
            aqS178S0100000_12.invoke(filterBean2);
            aqS178S0100000_12.invoke(filterBean);
        }
        this.LJFF.onNext(C1XY.LJJIIJ(filterBean));
    }

    public final void LJIILJJIL(FilterBean filterBean, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        if (filterBean != null) {
            Iterator it = ((ArrayList) this.LIZ.getData()).iterator();
            int i = 0;
            while (it.hasNext()) {
                if (o.LJ(filterBean, ((OSZ) it.next()).getFirst())) {
                    if (i >= 0) {
                        interfaceC88472Yns.invoke(Integer.valueOf(this.LIZIZ.LJZI(i)));
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C74467TKl(RecyclerView recyclerView, LifecycleOwner lifecycleOwner, InterfaceC74472TKq interfaceC74472TKq, InterfaceC74471TKp interfaceC74471TKp, InterfaceC88473Ynt<? super InterfaceC82244WPo, ? super FilterBean, ? super EnumC82260WQe, C76800UCe> interfaceC88473Ynt, C74466TKk c74466TKk) {
        RecyclerView recyclerView2;
        MutableLiveData Vr0;
        MutableLiveData Fa0;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJIIIIZZ = recyclerView;
        this.LJIIIZ = lifecycleOwner;
        this.LJIIJ = interfaceC74472TKq;
        this.LJIIJJI = interfaceC74471TKp;
        this.LJIIL = interfaceC88473Ynt;
        this.LJIILIIL = c74466TKk;
        C74464TKi c74464TKi = new C74464TKi(this);
        this.LIZ = c74464TKi;
        C74469TKn c74469TKn = new C74469TKn(this, c74464TKi);
        this.LIZIZ = c74469TKn;
        this.LIZJ = C113554cx.LJJJLIIL();
        this.LJ = new C73893SzJ();
        this.LJFF = new C73893SzJ();
        this.LJI = new C73893SzJ();
        this.LJII = new AqS194S0100000_12(this, 252);
        boolean z = recyclerView instanceof C73124Smu;
        if (!z) {
            recyclerView2 = null;
        } else {
            recyclerView2 = recyclerView;
        }
        C73124Smu c73124Smu = (C73124Smu) recyclerView2;
        if (c73124Smu != null) {
            c73124Smu.setItemShowBorder(c74466TKk.LIZIZ);
        }
        Context context = recyclerView.getContext();
        if (context != null) {
            C73124Smu c73124Smu2 = (C73124Smu) (z ? recyclerView : null);
            if (c73124Smu2 != null) {
                c73124Smu2.setItemMargin((int) C74275TDb.LIZIZ(context, c74466TKk.LIZ));
            }
        }
        recyclerView.setAdapter(c74469TKn);
        if (interfaceC74471TKp != null && (Fa0 = interfaceC74471TKp.Fa0()) != null) {
            Fa0.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 111));
        }
        if (interfaceC74472TKq != null && (Vr0 = interfaceC74472TKq.Vr0()) != null) {
            Vr0.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 112));
        }
        recyclerView.LJIIJJI(new C74468TKm(this));
    }
}
