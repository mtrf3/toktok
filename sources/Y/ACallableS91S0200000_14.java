package Y;

import X.AbstractC83312Wmq;
import X.C157166Eu;
import X.C32I;
import X.C46496IMq;
import X.C48436Izg;
import X.C76800UCe;
import X.C77357UXp;
import X.C79155V4t;
import X.C81808W8u;
import X.C81939WDv;
import X.C82237WPh;
import X.C82238WPi;
import X.C82265WQj;
import X.C82268WQm;
import X.C82273WQr;
import X.C82891Wg3;
import X.C83310Wmo;
import X.EnumC82257WQb;
import X.EnumC82260WQe;
import X.InterfaceC48269Iwz;
import X.InterfaceC82274WQs;
import X.InterfaceC83315Wmt;
import X.OSZ;
import X.UFE;
import X.VBU;
import X.W58;
import X.W6U;
import X.W8X;
import X.WQF;
import X.WQG;
import X.WQZ;
import X.X1D;
import android.view.Surface;
import ccb.t;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ACallableS91S0200000_14 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS91S0200000_14 aCallableS91S0200000_14) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("async setSurface, surface: ");
        LIZ.append((Surface) aCallableS91S0200000_14.l0);
        LIZ.append(", timeout: ");
        UFE.LIZLLL(LIZ, ((t) aCallableS91S0200000_14.l1).a7, LIZ);
        InterfaceC48269Iwz interfaceC48269Iwz = ((t) aCallableS91S0200000_14.l1).LJLJL;
        if (interfaceC48269Iwz != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("async setSurface, surface: ");
            LIZ2.append((Surface) aCallableS91S0200000_14.l0);
            LIZ2.append(", timeout: ");
            LIZ2.append(((t) aCallableS91S0200000_14.l1).a7);
            ((VBU) interfaceC48269Iwz).LJ(X1D.LIZIZ(LIZ2));
        }
        long currentTimeMillis = System.currentTimeMillis();
        C48436Izg c48436Izg = ((t) aCallableS91S0200000_14.l1).LJLLL;
        if (c48436Izg != null) {
            c48436Izg.setSurface((Surface) aCallableS91S0200000_14.l0);
        }
        if (((t) aCallableS91S0200000_14.l1).LJLJJI != null && System.currentTimeMillis() - currentTimeMillis > 0) {
            ((t) aCallableS91S0200000_14.l1).LJLJJI.b5 = System.currentTimeMillis() - currentTimeMillis;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("async setSurface finish, cost: ");
            LIZ3.append(((t) aCallableS91S0200000_14.l1).LJLJJI.b5);
            X1D.LIZIZ(LIZ3);
            C46496IMq.LIZJ();
            InterfaceC48269Iwz interfaceC48269Iwz2 = ((t) aCallableS91S0200000_14.l1).LJLJL;
            if (interfaceC48269Iwz2 != null) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("async setSurface finish, cost: ");
                LIZ4.append(((t) aCallableS91S0200000_14.l1).LJLJJI.b5);
                ((VBU) interfaceC48269Iwz2).LJ(X1D.LIZIZ(LIZ4));
            }
        }
        return Boolean.TRUE;
    }

    public static final Object call$1(ACallableS91S0200000_14 aCallableS91S0200000_14) {
        try {
            AbstractC83312Wmq abstractC83312Wmq = (AbstractC83312Wmq) aCallableS91S0200000_14.l1;
            C83310Wmo callback = (C83310Wmo) aCallableS91S0200000_14.l0;
            abstractC83312Wmq.getClass();
            o.LJIIIZ(callback, "callback");
            if (!abstractC83312Wmq.LIZJ.get()) {
                abstractC83312Wmq.LIZJ.set(true);
                callback.LIZIZ(abstractC83312Wmq);
            }
            if (abstractC83312Wmq.LIZLLL()) {
                abstractC83312Wmq.LIZ(3);
                abstractC83312Wmq.LIZJ(callback);
                callback.LIZJ(abstractC83312Wmq);
            } else {
                abstractC83312Wmq.LIZ(2);
                abstractC83312Wmq.LIZIZ(callback);
            }
        } catch (Exception e) {
            InterfaceC83315Wmt interfaceC83315Wmt = ((C83310Wmo) aCallableS91S0200000_14.l0).LIZJ;
            if (interfaceC83315Wmt != null) {
                interfaceC83315Wmt.LIZ(e);
            }
            ((C83310Wmo) aCallableS91S0200000_14.l0).getClass();
            C82891Wg3.LIZLLL().LIZIZ(e);
            ((C83310Wmo) aCallableS91S0200000_14.l0).LIZ((AbstractC83312Wmq) aCallableS91S0200000_14.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS91S0200000_14 aCallableS91S0200000_14) {
        Object obj;
        FilterBean filterBean;
        ArrayList arrayList = new ArrayList();
        synchronized (((WQG) aCallableS91S0200000_14.l0)) {
            List<C157166Eu> list = ((WQG) aCallableS91S0200000_14.l0).LJII;
            for (OSZ<EffectCategoryResponse, List<C79155V4t>> osz : ((C82237WPh) aCallableS91S0200000_14.l1).LJLILLLLZI) {
                for (C79155V4t c79155V4t : osz.getSecond()) {
                    Iterator it = ((ArrayList) list).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (o.LJ(c79155V4t, (C79155V4t) ((C157166Eu) obj).LJLIL)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C157166Eu c157166Eu = (C157166Eu) obj;
                    C82268WQm c82268WQm = (C82268WQm) ((LinkedHashMap) ((WQG) aCallableS91S0200000_14.l0).LJI).get(Integer.valueOf(c79155V4t.LIZ));
                    if (c82268WQm == null) {
                        c82268WQm = new C82268WQm(c79155V4t.LIZ, EnumC82260WQe.FILTER_STATE_UNKNOWN, "", "");
                    }
                    if (c157166Eu == null || (filterBean = (FilterBean) c157166Eu.LJLJI) == null) {
                        filterBean = new FilterBean();
                    }
                    C82265WQj.LJFF(filterBean, c79155V4t);
                    C82265WQj.LJ(c82268WQm, filterBean);
                    C82265WQj.LIZLLL(osz.getFirst(), filterBean);
                    arrayList.add(new C157166Eu(c79155V4t, c82268WQm, filterBean));
                }
            }
            ((ArrayList) ((WQG) aCallableS91S0200000_14.l0).LJII).clear();
            ((ArrayList) ((WQG) aCallableS91S0200000_14.l0).LJII).addAll(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C157166Eu) it2.next()).LJLJI);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (((C82268WQm) ((C157166Eu) next).LJLILLLLZI).LJLILLLLZI == EnumC82260WQe.FILTER_STATE_DOWNLOAD_SUCCESS) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((C157166Eu) it4.next()).LJLJI);
        }
        WQG wqg = (WQG) aCallableS91S0200000_14.l0;
        List<OSZ<EffectCategoryResponse, List<C79155V4t>>> categories = ((C82237WPh) aCallableS91S0200000_14.l1).LJLILLLLZI;
        wqg.getClass();
        o.LJIIIZ(categories, "categories");
        ArrayList arrayList5 = new ArrayList();
        if (!categories.isEmpty()) {
            for (OSZ<EffectCategoryResponse, List<C79155V4t>> osz2 : categories) {
                ArrayList arrayList6 = new ArrayList();
                for (C79155V4t c79155V4t2 : osz2.getSecond()) {
                    Iterator it5 = arrayList2.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            Object next2 = it5.next();
                            if (C77357UXp.LJJIIZ((FilterBean) next2, c79155V4t2)) {
                                if (next2 != null) {
                                    arrayList6.add(next2);
                                }
                            }
                        }
                    }
                }
                if (!arrayList6.isEmpty()) {
                    arrayList5.add(new OSZ(osz2.getFirst(), arrayList6));
                }
            }
        } else {
            arrayList5.add(new OSZ(C82238WPi.LIZJ, arrayList2));
        }
        List<OSZ<EffectCategoryResponse, List<C79155V4t>>> list2 = ((C82237WPh) aCallableS91S0200000_14.l1).LJLILLLLZI;
        ArrayList arrayList7 = new ArrayList(C32I.LJJL(list2, 10));
        Iterator<OSZ<EffectCategoryResponse, List<C79155V4t>>> it6 = list2.iterator();
        while (it6.hasNext()) {
            arrayList7.add(it6.next().getFirst());
        }
        ((WQG) aCallableS91S0200000_14.l0).getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it7 = arrayList7.iterator();
        while (it7.hasNext()) {
            List<Effect> totalEffects = ((EffectCategoryResponseTemplate) it7.next()).getTotalEffects();
            if (totalEffects != null) {
                for (Effect effect : totalEffects) {
                    if (effect != null && effect.getName() != null) {
                        linkedHashMap.put(effect.getName(), effect);
                    }
                }
            }
        }
        return new WQF(arrayList2, arrayList7, arrayList5, linkedHashMap, arrayList4);
    }

    public static final Object call$3(ACallableS91S0200000_14 aCallableS91S0200000_14) {
        ArrayList arrayList;
        boolean z;
        synchronized (((WQG) aCallableS91S0200000_14.l0)) {
            List<C157166Eu> list = ((WQG) aCallableS91S0200000_14.l0).LJII;
            arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C157166Eu c157166Eu = (C157166Eu) it.next();
                C82268WQm c82268WQm = (C82268WQm) ((Map) aCallableS91S0200000_14.l1).get(Integer.valueOf(((C79155V4t) c157166Eu.LJLIL).LIZ));
                if (c82268WQm == null) {
                    c82268WQm = new C82268WQm(((C79155V4t) c157166Eu.LJLIL).LIZ, EnumC82260WQe.FILTER_STATE_UNKNOWN, "", "");
                }
                Object obj = c157166Eu.LJLIL;
                Object obj2 = c157166Eu.LJLJI;
                C82265WQj.LJ(c82268WQm, (FilterBean) obj2);
                arrayList.add(new C157166Eu(obj, c82268WQm, obj2));
            }
            ((ArrayList) ((WQG) aCallableS91S0200000_14.l0).LJII).clear();
            ((ArrayList) ((WQG) aCallableS91S0200000_14.l0).LJII).addAll(arrayList);
            ((LinkedHashMap) ((WQG) aCallableS91S0200000_14.l0).LJI).clear();
            ((WQG) aCallableS91S0200000_14.l0).LJI.putAll((Map) aCallableS91S0200000_14.l1);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((C82268WQm) ((C157166Eu) next).LJLILLLLZI).LJLILLLLZI == EnumC82260WQe.FILTER_STATE_DOWNLOAD_SUCCESS) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((C157166Eu) it3.next()).LJLJI);
        }
        arrayList2.addAll(arrayList4);
        return arrayList2;
    }

    public static final Object call$4(ACallableS91S0200000_14 aCallableS91S0200000_14) {
        EnumC82260WQe enumC82260WQe;
        C82273WQr c82273WQr;
        List<C79155V4t> list = (List) aCallableS91S0200000_14.l1;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (C79155V4t filterMeta : list) {
            if (((WQZ) aCallableS91S0200000_14.l0).LIZJ.LIZJ(filterMeta)) {
                enumC82260WQe = EnumC82260WQe.FILTER_STATE_DOWNLOAD_SUCCESS;
            } else {
                InterfaceC82274WQs checkFilterIsDownloading = ((WQZ) aCallableS91S0200000_14.l0).LIZLLL;
                o.LJIIIZ(checkFilterIsDownloading, "$this$checkFilterIsDownloading");
                o.LJIIIZ(filterMeta, "filterMeta");
                EnumC82257WQb LIZJ = checkFilterIsDownloading.LIZJ(filterMeta);
                if (LIZJ != null && (LIZJ == EnumC82257WQb.PENDING || LIZJ == EnumC82257WQb.START)) {
                    enumC82260WQe = EnumC82260WQe.FILTER_STATE_DOWNLOADING;
                } else if (((WQZ) aCallableS91S0200000_14.l0).LJ.LIZJ(filterMeta)) {
                    enumC82260WQe = EnumC82260WQe.FILTER_STATE_DOWNLOAD_SUCCESS;
                } else {
                    enumC82260WQe = EnumC82260WQe.FILTER_STATE_NOT_DOWNLOAD;
                }
            }
            if (((WQZ) aCallableS91S0200000_14.l0).LIZJ.LIZJ(filterMeta)) {
                c82273WQr = ((WQZ) aCallableS91S0200000_14.l0).LIZJ.LIZ(filterMeta.LIZ);
            } else if (enumC82260WQe == EnumC82260WQe.FILTER_STATE_DOWNLOAD_SUCCESS) {
                c82273WQr = ((WQZ) aCallableS91S0200000_14.l0).LJ.LJ(filterMeta.LIZ);
            } else {
                c82273WQr = C82265WQj.LIZ;
            }
            arrayList.add(new C82268WQm(filterMeta.LIZ, enumC82260WQe, c82273WQr.LJLIL, c82273WQr.LJLILLLLZI));
        }
        return arrayList;
    }

    public static final Object call$5(ACallableS91S0200000_14 aCallableS91S0200000_14) {
        boolean z;
        C81808W8u c81808W8u = (C81808W8u) aCallableS91S0200000_14.l1;
        W6U w6u = (W6U) aCallableS91S0200000_14.l0;
        W8X LIZ = c81808W8u.LJFF.LIZ(w6u);
        Class<?> cls = C81808W8u.LJII;
        if (LIZ != null) {
            LIZ.close();
            W58.LJIIJJI(cls, "Found image for %s in staging area", w6u.LIZ());
            c81808W8u.LJI.LIZLLL();
            z = true;
        } else {
            W58.LJIIJJI(cls, "Did not find image for %s in staging area", w6u.LIZ());
            c81808W8u.LJI.LJIIIIZZ();
            try {
                z = c81808W8u.LIZ.LJII(w6u);
            } catch (Exception unused) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object call$6(ACallableS91S0200000_14 aCallableS91S0200000_14) {
        try {
            C81939WDv.LIZIZ();
            ((C81808W8u) aCallableS91S0200000_14.l1).LJFF.LIZJ((W6U) aCallableS91S0200000_14.l0);
            ((C81808W8u) aCallableS91S0200000_14.l1).LIZ.LJFF((W6U) aCallableS91S0200000_14.l0);
            C81939WDv.LIZIZ();
            return null;
        } catch (Throwable th) {
            C81939WDv.LIZIZ();
            throw th;
        }
    }

    public ACallableS91S0200000_14(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
