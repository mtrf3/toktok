package X;

import Y.ARunnableS50S0100000_14;
import Y.AfS66S0100000_14;
import Y.IDaS223S0100000_14;
import Y.IDhS107S0100000_14;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.internal.main.FilterCategoryExtra;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQW extends AbstractC73313Spx implements InterfaceC82236WPg {
    public final C74440TJk<WQO> LJLILLLLZI;
    public final C73849Syb<C82237WPh> LJLJI;
    public final T02<Integer, C82268WQm> LJLJJI;
    public final C73849Syb<java.util.Map<Integer, C82268WQm>> LJLJJL;
    public final C73893SzJ<C74477TKv> LJLJJLL;
    public final AtomicReference<OSZ<AbstractC73672Svk<WQO>, AbstractC73851Syd<WQO>>> LJLJL;
    public final C62822Ol8 LJLJLJ;
    public C73318Sq2 LJLJLLL;
    public final InterfaceC82272WQq LJLL;
    public final InterfaceC82274WQs LJLLI;
    public final InterfaceC82271WQp LJLLILLLL;
    public final TPN LJLLJ;
    public final InterfaceC82276WQu LJLLL;
    public final WQH LJLLLL;
    public final boolean LJLLLLLL;
    public final InterfaceC82281WQz LJLZ;

    @Override // X.InterfaceC82236WPg
    public final void LJIIL() {
        C73318Sq2 c73318Sq2 = this.LJLJLLL;
        c73318Sq2.dispose();
        c73318Sq2.LIZLLL();
        this.LJLJLLL = new C73318Sq2();
        this.LJLLILLLL.invalidate();
        this.LJLLI.cancelAllDownload();
        C82891Wg3.LIZLLL().d("viki filter, DefaultFilterRepository.invalidateDataCache");
        this.LJLILLLLZI.LJIIIZ();
        this.LJLJI.onNext(C82238WPi.LIZ);
        C73969T1h.LIZIZ().LIZIZ(new ARunnableS50S0100000_14(this, 188));
    }

    @Override // X.InterfaceC82236WPg
    public final void LJJIJ() {
        this.LJLLI.cancelAllDownload();
    }

    @Override // X.InterfaceC82236WPg
    public final WPX LJJJJIZL() {
        return (WPX) this.LJLJLJ.getValue();
    }

    @Override // X.InterfaceC82236WPg
    public final AbstractC73672Svk<C74477TKv> LJJJLIIL() {
        C73893SzJ<C74477TKv> c73893SzJ = this.LJLJJLL;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    public final C73426Srm LLLZIL() {
        C73849Syb<C82237WPh> c73849Syb = this.LJLJI;
        return C42193GhB.LIZJ(c73849Syb, c73849Syb);
    }

    public final C73426Srm LLLZL() {
        C73849Syb<java.util.Map<Integer, C82268WQm>> c73849Syb = this.LJLJJL;
        return C42193GhB.LIZJ(c73849Syb, c73849Syb);
    }

    @Override // X.InterfaceC82236WPg
    public final InterfaceC82278WQw LJIIJJI() {
        return this.LJLL;
    }

    @Override // X.InterfaceC82236WPg
    public final AbstractC73672Svk<C82237WPh> LIZJ(boolean z) {
        return LLLLZLLLI(-1, z, true);
    }

    @Override // X.InterfaceC82236WPg
    public final void LJIIZILJ(C79155V4t filterData) {
        C82237WPh c82237WPh;
        List<C79155V4t> list;
        o.LJIIIZ(filterData, "filterData");
        C82891Wg3.LIZLLL().d("viki filter, DefaultFilterRepository.removeFilterData");
        WQO LIZIZ = this.LJLILLLLZI.LIZIZ(C76800UCe.LIZ);
        if (LIZIZ != null && (c82237WPh = LIZIZ.LJLIL) != null && (list = c82237WPh.LJLIL) != null) {
            for (C79155V4t c79155V4t : list) {
                if (o.LJ(filterData, c79155V4t)) {
                    if (c79155V4t != null) {
                        List<C79155V4t> list2 = LIZIZ.LJLIL.LJLIL;
                        ArrayList arrayList = new ArrayList();
                        for (C79155V4t c79155V4t2 : list2) {
                            if (c79155V4t2.LIZ != filterData.LIZ) {
                                arrayList.add(c79155V4t2);
                            }
                        }
                        List<OSZ<EffectCategoryResponse, List<C79155V4t>>> list3 = LIZIZ.LJLIL.LJLILLLLZI;
                        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list3, 10));
                        for (OSZ<EffectCategoryResponse, List<C79155V4t>> osz : list3) {
                            EffectCategoryResponse first = osz.getFirst();
                            List<C79155V4t> second = osz.getSecond();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : second) {
                                if (((C79155V4t) obj).LIZ != filterData.LIZ) {
                                    arrayList3.add(obj);
                                }
                            }
                            arrayList2.add(new OSZ(first, arrayList3));
                        }
                        WQO wqo = new WQO(new C82237WPh(arrayList, arrayList2), LIZIZ.LJLILLLLZI);
                        C5NP LIZLLL = C82891Wg3.LIZLLL();
                        StringBuilder sb = new StringBuilder("viki filter, DefaultFilterRepository.removeFilterData -> filterTable=");
                        List<OSZ<EffectCategoryResponse, List<C79155V4t>>> list4 = wqo.LJLIL.LJLILLLLZI;
                        ArrayList arrayList4 = new ArrayList(C32I.LJJL(list4, 10));
                        Iterator<OSZ<EffectCategoryResponse, List<C79155V4t>>> it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(it.next().getFirst().getName());
                        }
                        sb.append(arrayList4);
                        sb.append(", filter.size=");
                        sb.append(wqo.LJLIL.LJLIL.size());
                        sb.append('\"');
                        LIZLLL.d(sb.toString());
                        C74440TJk<WQO> c74440TJk = this.LJLILLLLZI;
                        c74440TJk.getClass();
                        c74440TJk.put(C76800UCe.LIZ, wqo);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC82236WPg
    public final AbstractC73672Svk<C82268WQm> LJIJJ(FilterBean filterBean) {
        o.LJIIIZ(filterBean, "filterBean");
        return LLLLZIL(C82265WQj.LIZIZ(filterBean), true);
    }

    @Override // X.InterfaceC82236WPg
    public final AbstractC73672Svk<C82268WQm> LJIL(C79155V4t c79155V4t) {
        return LLLLZIL(c79155V4t, false);
    }

    @Override // X.InterfaceC82236WPg
    public final EnumC82260WQe LJJIIZI(int i) {
        EnumC82260WQe enumC82260WQe;
        C82268WQm LIZIZ = this.LJLJJI.LIZIZ(Integer.valueOf(i));
        if (LIZIZ != null && (enumC82260WQe = LIZIZ.LJLILLLLZI) != null) {
            return enumC82260WQe;
        }
        return EnumC82260WQe.FILTER_STATE_UNKNOWN;
    }

    public final WQO LLLLZ(WQO wqo) {
        InterfaceC82281WQz interfaceC82281WQz = this.LJLZ;
        if (interfaceC82281WQz != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder sb = new StringBuilder("viki filter, applyFilterLogic -> before -> filterTable=");
            List<OSZ<EffectCategoryResponse, List<C79155V4t>>> list = wqo.LJLIL.LJLILLLLZI;
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(list, 10));
            Iterator<OSZ<EffectCategoryResponse, List<C79155V4t>>> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(it.next().getFirst().getName());
            }
            sb.append(arrayList3);
            sb.append(", filter.size=");
            sb.append(wqo.LJLIL.LJLIL.size());
            LIZLLL.d(sb.toString());
            for (OSZ<EffectCategoryResponse, List<C79155V4t>> osz : wqo.LJLIL.LJLILLLLZI) {
                String extra = osz.getFirst().getExtra();
                if (extra == null || extra.length() == 0) {
                    arrayList2.add(new OSZ(osz.getFirst(), osz.getSecond()));
                    arrayList.addAll(osz.getSecond());
                } else {
                    Object fromJson = GsonProtectorUtils.fromJson(C82891Wg3.LIZJ(), osz.getFirst().getExtra(), (Class<Object>) FilterCategoryExtra.class);
                    o.LJIIIIZZ(fromJson, "CukaieManifest.gson.from…ava\n                    )");
                    if (interfaceC82281WQz.LIZ((FilterCategoryExtra) fromJson)) {
                        arrayList2.add(new OSZ(osz.getFirst(), osz.getSecond()));
                        arrayList.addAll(osz.getSecond());
                    }
                }
            }
            C5NP LIZLLL2 = C82891Wg3.LIZLLL();
            StringBuilder sb2 = new StringBuilder("viki filter, applyFilterLogic -> after -> filterTable=");
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ((OSZ) it2.next()).getFirst()).getName());
            }
            sb2.append(arrayList4);
            sb2.append(", filter.size=");
            sb2.append(arrayList.size());
            LIZLLL2.d(sb2.toString());
            return new WQO(new C82237WPh(arrayList, arrayList2), false);
        }
        return wqo;
    }

    public final void LLLLZLLIL(List list) {
        EnumC82260WQe enumC82260WQe;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C82268WQm LIZIZ = this.LJLJJI.LIZIZ(Integer.valueOf(((C79155V4t) obj).LIZ));
            if (LIZIZ == null || (enumC82260WQe = LIZIZ.LJLILLLLZI) == null) {
                enumC82260WQe = EnumC82260WQe.FILTER_STATE_UNKNOWN;
            }
            if (enumC82260WQe != EnumC82260WQe.FILTER_STATE_DOWNLOAD_SUCCESS) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.LJLLI.LIZ((C79155V4t) it.next());
            }
        }
    }

    public final C82268WQm LLLZI(C82263WQh c82263WQh) {
        EnumC82257WQb enumC82257WQb = c82263WQh.LJLIL;
        if (enumC82257WQb == EnumC82257WQb.PENDING || enumC82257WQb == EnumC82257WQb.START) {
            return new C82268WQm(c82263WQh.LJLILLLLZI.LIZ, EnumC82260WQe.FILTER_STATE_DOWNLOADING, "", "");
        }
        if (enumC82257WQb == EnumC82257WQb.SUCCESS) {
            C82273WQr c82273WQr = c82263WQh.LJLJI;
            if (c82273WQr == null) {
                if (this.LJLLILLLL.LIZJ(c82263WQh.LJLILLLLZI)) {
                    c82273WQr = this.LJLLILLLL.LIZ(c82263WQh.LJLILLLLZI.LIZ);
                } else {
                    c82273WQr = this.LJLL.LJ(c82263WQh.LJLILLLLZI.LIZ);
                }
            }
            return new C82268WQm(c82263WQh.LJLILLLLZI.LIZ, EnumC82260WQe.FILTER_STATE_DOWNLOAD_SUCCESS, c82273WQr.LJLIL, c82273WQr.LJLILLLLZI);
        }
        if (enumC82257WQb == EnumC82257WQb.FAILED) {
            return new C82268WQm(c82263WQh.LJLILLLLZI.LIZ, EnumC82260WQe.FILTER_STATE_DOWNLOAD_FAILED, "", "");
        }
        return new C82268WQm(c82263WQh.LJLILLLLZI.LIZ, EnumC82260WQe.FILTER_STATE_UNKNOWN, "", "");
    }

    public final void LLLZLL(List<C82268WQm> list) {
        ArrayList arrayList = new ArrayList();
        for (C82268WQm c82268WQm : list) {
            C82268WQm LIZIZ = this.LJLJJI.LIZIZ(Integer.valueOf(c82268WQm.LJLIL));
            if (LIZIZ == null) {
                LIZIZ = new C82268WQm(c82268WQm.LJLIL, EnumC82260WQe.FILTER_STATE_UNKNOWN, "", "");
            }
            if (true ^ o.LJ(LIZIZ, c82268WQm)) {
                this.LJLJJI.put(Integer.valueOf(c82268WQm.LJLIL), c82268WQm);
                arrayList.add(new C74477TKv(LIZIZ, c82268WQm));
            }
        }
        if (!arrayList.isEmpty()) {
            C73849Syb<java.util.Map<Integer, C82268WQm>> c73849Syb = this.LJLJJL;
            List<OSZ<Integer, C82268WQm>> LJII = this.LJLJJI.LJII();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((ArrayList) LJII).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((OSZ) next).getSecond() != null) {
                    arrayList2.add(next);
                }
            }
            int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(arrayList2, 10));
            if (LJJIIZ < 16) {
                LJJIIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                OSZ osz = (OSZ) it2.next();
                Object first = osz.getFirst();
                Object second = osz.getSecond();
                o.LJI(second);
                OSZ osz2 = new OSZ(first, second);
                linkedHashMap.put(osz2.getFirst(), osz2.getSecond());
            }
            c73849Syb.onNext(linkedHashMap);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                this.LJLJJLL.onNext(it3.next());
            }
        }
    }

    @Override // X.InterfaceC82236WPg
    public final void LJJIIJZLJL(int i, boolean z) {
        LLLLZLLLI(i, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x037f, code lost:
    
        if (r3 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017e, code lost:
    
        if (r16 >= 0) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc A[LOOP:3: B:37:0x00c6->B:39:0x00cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List<X.OSZ<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.util.List<X.V4t>>>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.util.ArrayList] */
    @Override // X.InterfaceC82236WPg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC73672Svk<X.C82268WQm> LJJJ(X.C79155V4t r19, java.util.List<? extends X.OSZ<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, ? extends java.util.List<X.C79155V4t>>> r20) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WQW.LJJJ(X.V4t, java.util.List):X.Svk");
    }

    @Override // X.InterfaceC82236WPg
    public final C79155V4t LJJJI(int i, String str) {
        C82237WPh c82237WPh;
        List<C79155V4t> list;
        WQO LIZIZ = this.LJLILLLLZI.LIZIZ(C76800UCe.LIZ);
        C79155V4t c79155V4t = null;
        if (LIZIZ == null || (c82237WPh = LIZIZ.LJLIL) == null || (list = c82237WPh.LJLIL) == null) {
            return null;
        }
        Iterator<C79155V4t> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C79155V4t next = it.next();
            C79155V4t isSameFilterMeta = next;
            o.LJIIIZ(isSameFilterMeta, "$this$isSameFilterMeta");
            if (isSameFilterMeta.LIZ == i && o.LJ(isSameFilterMeta.LIZLLL, str)) {
                c79155V4t = next;
                break;
            }
        }
        return c79155V4t;
    }

    public final AbstractC73672Svk<C82268WQm> LLLLZIL(C79155V4t c79155V4t, boolean z) {
        EnumC82260WQe enumC82260WQe;
        C73849Syb LIZ;
        C82268WQm LIZIZ = this.LJLJJI.LIZIZ(Integer.valueOf(c79155V4t.LIZ));
        if (LIZIZ != null) {
            enumC82260WQe = LIZIZ.LJLILLLLZI;
        } else {
            enumC82260WQe = null;
        }
        if (enumC82260WQe == EnumC82260WQe.FILTER_STATE_DOWNLOAD_SUCCESS) {
            return AbstractC73672Svk.LJJIJIL(LIZIZ);
        }
        if (z) {
            LIZ = this.LJLLI.LIZIZ(c79155V4t);
        } else {
            LIZ = this.LJLLI.LIZ(c79155V4t);
        }
        return LIZ.LJJIJL(new IDhS107S0100000_14(this, 8));
    }

    public final void LLLZ(int i, List list) {
        AbstractC73946T0k LIZIZ;
        C73428Sro LJJL = this.LJLLL.LIZ(list).LJJL(T16.LIZ());
        if (C84499XEh.LIZIZ) {
            LIZIZ = T16.LIZ();
        } else {
            LIZIZ = C73969T1h.LIZIZ();
        }
        this.LJLJLLL.LIZ(LJJL.LJJJ(LIZIZ).LJJJLIIL(new WQX(this, list, i), C73982T1u.LJLIL));
    }

    public final AbstractC73672Svk LLLLZLLLI(int i, boolean z, boolean z2) {
        C73422Sri LIZ;
        AbstractC73672Svk c73426Srm;
        AbstractC73851Syd<WQO> second;
        if (z) {
            LIZ = this.LJLLJ.request().LJIJJLI(new WQR(this, z2, i));
        } else {
            if (z2) {
                C82891Wg3.LIZLLL().d("viki filter, DefaultFilterRepository#fetchDataWithReturn -> filterDataFetcher.withCache");
            }
            LIZ = C77117UOj.LJJIIJZLJL(this.LJLLJ, this.LJLILLLLZI, new AqS180S0100000_14(this, 332)).LIZ(new WQQ(this, z2, i)).LIZ(C76800UCe.LIZ);
        }
        C73849Syb c73849Syb = new C73849Syb();
        if (z) {
            if (z2) {
                C82891Wg3.LIZLLL().d("viki filter, forceRefresh");
            }
            LIZ.LJJL(T16.LIZ()).LIZ(c73849Syb);
            c73426Srm = new C73426Srm(c73849Syb);
        } else {
            AtomicReference<OSZ<AbstractC73672Svk<WQO>, AbstractC73851Syd<WQO>>> atomicReference = this.LJLJL;
            OSZ<AbstractC73672Svk<WQO>, AbstractC73851Syd<WQO>> osz = new OSZ<>(LIZ, c73849Syb);
            while (true) {
                if (atomicReference.compareAndSet(null, osz)) {
                    if (z2) {
                        C82891Wg3.LIZLLL().d("viki filter, ongoingFetch.compareAndSet");
                    }
                    LIZ.LJJL(T16.LIZ()).LJIJJ(new AfS66S0100000_14(this, 42)).LJIIZILJ(new IDaS223S0100000_14(this, 0)).LIZ(c73849Syb);
                    c73426Srm = new C73426Srm(c73849Syb);
                } else if (atomicReference.get() != null) {
                    if (z2) {
                        C82891Wg3.LIZLLL().d("viki filter, else");
                    }
                    OSZ<AbstractC73672Svk<WQO>, AbstractC73851Syd<WQO>> osz2 = this.LJLJL.get();
                    if (osz2 != null && (second = osz2.getSecond()) != null) {
                        c73426Srm = new C73426Srm(second);
                    } else {
                        c73426Srm = AbstractC73672Svk.LJJIJIL(new WQO(C82238WPi.LIZ, true));
                    }
                }
            }
        }
        return c73426Srm.LJIJJLI(WQP.LJLIL).LJJIJL(new WQM(z2));
    }

    public WQW(InterfaceC82272WQq interfaceC82272WQq, C82264WQi c82264WQi, InterfaceC82271WQp interfaceC82271WQp, WQS wqs, WQZ wqz, WQG wqg, boolean z, InterfaceC82281WQz interfaceC82281WQz) {
        AbstractC73946T0k LIZIZ;
        this.LJLL = interfaceC82272WQq;
        this.LJLLI = c82264WQi;
        this.LJLLILLLL = interfaceC82271WQp;
        this.LJLLJ = wqs;
        this.LJLLL = wqz;
        this.LJLLLL = wqg;
        this.LJLLLLLL = z;
        this.LJLZ = interfaceC82281WQz;
        C74440TJk<WQO> c74440TJk = new C74440TJk<>();
        this.LJLILLLLZI = c74440TJk;
        this.LJLJI = new C73849Syb<>();
        this.LJLJJI = new T02<>();
        this.LJLJJL = new C73849Syb<>();
        this.LJLJJLL = new C73893SzJ<>();
        this.LJLJL = new AtomicReference<>(null);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 353));
        this.LJLJLLL = new C73318Sq2();
        LJJIJL(UC0.LJI(wqs), UC0.LJ(c74440TJk), C73302Spm.LIZ(C73324Sq8.LJLIL));
        C82891Wg3.LIZLLL().d("viki filter, DefaultFilterRepository.connectFilterDataSources");
        C73454SsE LIZJ = UC0.LJ(c74440TJk).LIZJ(true, new InterfaceC68914R2w[0]);
        AfS66S0100000_14 afS66S0100000_14 = new AfS66S0100000_14(this, 39);
        C73982T1u c73982T1u = C73982T1u.LJLIL;
        LIZJ.LJJJLIIL(afS66S0100000_14, c73982T1u);
        C73805Sxt LJJIJL = c82264WQi.LJ().LJJL(T16.LIZ()).LJJIJL(new IDhS107S0100000_14(this, 10));
        if (C84499XEh.LIZIZ) {
            LIZIZ = T16.LIZ();
        } else {
            LIZIZ = C73969T1h.LIZIZ();
        }
        LJJIJL.LJJJ(LIZIZ).LJJJLIIL(new AfS66S0100000_14(this, 36), c73982T1u);
    }
}
