package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQE implements InterfaceC82236WPg {
    public final C73849Syb<C82237WPh> LJLIL;
    public final C73849Syb<java.util.Map<Integer, C82268WQm>> LJLILLLLZI;
    public List<? extends FilterBean> LJLJI;
    public final WQD LJLJJI;

    @Override // X.InterfaceC82236WPg
    public final void LJIIL() {
    }

    @Override // X.InterfaceC82236WPg
    public final void LJJIIJZLJL(int i, boolean z) {
    }

    @Override // X.InterfaceC82236WPg
    public final InterfaceC82278WQw LJIIJJI() {
        throw new UnsupportedOperationException("option not supported.");
    }

    @Override // X.InterfaceC82236WPg
    public final void LJJIJ() {
        throw new UnsupportedOperationException("option not supported.");
    }

    @Override // X.InterfaceC82236WPg
    public final AbstractC73672Svk<C74477TKv> LJJJLIIL() {
        C73536StY c73536StY = C73536StY.LJLIL;
        o.LJIIIIZZ(c73536StY, "Observable.empty()");
        return c73536StY;
    }

    @Override // X.InterfaceC82236WPg
    public final WPX LJJJJIZL() {
        return this.LJLJJI;
    }

    public WQE(int i) {
        C61878OQg filterList = C61878OQg.INSTANCE;
        WQD wqd = new WQD(0);
        o.LJIIIZ(filterList, "filterList");
        this.LJLJI = filterList;
        this.LJLJJI = wqd;
        this.LJLIL = new C73849Syb<>();
        this.LJLILLLLZI = new C73849Syb<>();
        LIZ(this.LJLJI);
    }

    public final void LIZ(List<? extends FilterBean> list) {
        C73849Syb<C82237WPh> c73849Syb = this.LJLIL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (FilterBean toFilterMeta : list) {
            o.LJIIIZ(toFilterMeta, "$this$toFilterMeta");
            arrayList.add(C82265WQj.LIZIZ(toFilterMeta));
        }
        c73849Syb.onNext(new C82237WPh(arrayList, C61878OQg.INSTANCE));
        C73849Syb<java.util.Map<Integer, C82268WQm>> c73849Syb2 = this.LJLILLLLZI;
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (FilterBean filterBean : list) {
            OSZ osz = new OSZ(Integer.valueOf(filterBean.getId()), C82265WQj.LJI(filterBean, EnumC82260WQe.FILTER_STATE_DOWNLOAD_SUCCESS));
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        c73849Syb2.onNext(linkedHashMap);
        WQD wqd = this.LJLJJI;
        wqd.getClass();
        wqd.LIZ.setValue(list);
        wqd.LIZLLL.setValue(list);
    }

    @Override // X.InterfaceC82236WPg
    public final AbstractC73672Svk<C82237WPh> LIZJ(boolean z) {
        C73536StY c73536StY = C73536StY.LJLIL;
        o.LJIIIIZZ(c73536StY, "Observable.empty()");
        return c73536StY;
    }

    @Override // X.InterfaceC82236WPg
    public final void LJIIZILJ(C79155V4t filterData) {
        o.LJIIIZ(filterData, "filterData");
        throw new UnsupportedOperationException("option not supported.");
    }

    @Override // X.InterfaceC82236WPg
    public final AbstractC73672Svk<C82268WQm> LJIJJ(FilterBean filterBean) {
        FilterBean filterBean2;
        o.LJIIIZ(filterBean, "filterBean");
        Iterator<? extends FilterBean> it = this.LJLJI.iterator();
        while (true) {
            if (it.hasNext()) {
                filterBean2 = it.next();
                if (filterBean2.getId() == filterBean.getId()) {
                    break;
                }
            } else {
                filterBean2 = null;
                break;
            }
        }
        FilterBean filterBean3 = filterBean2;
        if (filterBean3 != null) {
            return AbstractC73672Svk.LJJIJIL(C82265WQj.LJI(filterBean3, EnumC82260WQe.FILTER_STATE_DOWNLOAD_SUCCESS));
        }
        return AbstractC73672Svk.LJJIJIL(new C82268WQm(filterBean.getId(), EnumC82260WQe.FILTER_STATE_DOWNLOAD_FAILED, "", ""));
    }

    @Override // X.InterfaceC82236WPg
    public final AbstractC73672Svk<C82268WQm> LJIL(C79155V4t c79155V4t) {
        FilterBean filterBean;
        Iterator<? extends FilterBean> it = this.LJLJI.iterator();
        while (true) {
            if (it.hasNext()) {
                filterBean = it.next();
                if (filterBean.getId() == c79155V4t.LIZ) {
                    break;
                }
            } else {
                filterBean = null;
                break;
            }
        }
        FilterBean filterBean2 = filterBean;
        if (filterBean2 != null) {
            return AbstractC73672Svk.LJJIJIL(C82265WQj.LJI(filterBean2, EnumC82260WQe.FILTER_STATE_DOWNLOAD_SUCCESS));
        }
        return AbstractC73672Svk.LJJIJIL(new C82268WQm(c79155V4t.LIZ, EnumC82260WQe.FILTER_STATE_DOWNLOAD_FAILED, "", ""));
    }

    @Override // X.InterfaceC82236WPg
    public final EnumC82260WQe LJJIIZI(int i) {
        EnumC82260WQe enumC82260WQe;
        Iterator<? extends FilterBean> it = this.LJLJI.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FilterBean next = it.next();
            if (next.getId() == i) {
                if (next != null && (enumC82260WQe = EnumC82260WQe.FILTER_STATE_DOWNLOAD_SUCCESS) != null) {
                    return enumC82260WQe;
                }
            }
        }
        return EnumC82260WQe.FILTER_STATE_UNKNOWN;
    }

    @Override // X.InterfaceC82236WPg
    public final AbstractC73672Svk<C82268WQm> LJJJ(C79155V4t filterData, List<? extends OSZ<EffectCategoryResponse, ? extends List<C79155V4t>>> list) {
        o.LJIIIZ(filterData, "filterData");
        throw new UnsupportedOperationException("option not supported.");
    }

    @Override // X.InterfaceC82236WPg
    public final C79155V4t LJJJI(int i, String str) {
        FilterBean filterBean;
        Iterator<? extends FilterBean> it = this.LJLJI.iterator();
        while (true) {
            if (it.hasNext()) {
                filterBean = it.next();
                if (TML.LJ(filterBean, i, str)) {
                    break;
                }
            } else {
                filterBean = null;
                break;
            }
        }
        FilterBean filterBean2 = filterBean;
        if (filterBean2 == null) {
            return null;
        }
        return C82265WQj.LIZIZ(filterBean2);
    }
}
