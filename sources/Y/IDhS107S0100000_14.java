package Y;

import X.AbstractC48314Ixi;
import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C07670Rv;
import X.C141335gf;
import X.C17N;
import X.C32I;
import X.C36241EKf;
import X.C3C5;
import X.C44687HgJ;
import X.C45451Hsd;
import X.C45938I1e;
import X.C47261Igj;
import X.C5NP;
import X.C73536StY;
import X.C73893SzJ;
import X.C74299TDz;
import X.C76800UCe;
import X.C79057V0z;
import X.C79155V4t;
import X.C81287VvH;
import X.C81288VvI;
import X.C82237WPh;
import X.C82239WPj;
import X.C82240WPk;
import X.C82263WQh;
import X.C82264WQi;
import X.C82265WQj;
import X.C82727WdP;
import X.C82891Wg3;
import X.C83146WkA;
import X.C83160WkO;
import X.C83186Wko;
import X.C83310Wmo;
import X.I1Z;
import X.InterfaceC48038ItG;
import X.InterfaceC82275WQt;
import X.InterfaceC82281WQz;
import X.ORS;
import X.ORZ;
import X.OSZ;
import X.WQG;
import X.WQO;
import X.WQQ;
import X.WQW;
import X.WR5;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.effectplatform.FilterEffect;
import com.ss.android.ugc.aweme.filter.repository.internal.main.FilterCategoryExtra;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectNetListResponse;
import defpackage.b1;
import defpackage.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDhS107S0100000_14 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case 9:
                return apply$9(this, obj);
            case 10:
                return apply$10(this, obj);
            default:
                return null;
        }
    }

    public IDhS107S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(IDhS107S0100000_14 iDhS107S0100000_14, Object obj) {
        Integer errorCode = (Integer) obj;
        o.LJIIIZ(errorCode, "errorCode");
        int intValue = errorCode.intValue();
        if (C82727WdP.LJ.contains(Integer.valueOf(intValue)) || intValue < 0) {
            throw new C36241EKf(errorCode.intValue(), "", "carrier login only request error");
        }
        Bundle arguments = ((BaseAccountFlowFragment) iDhS107S0100000_14.l0).getArguments();
        if (arguments != null) {
            arguments.putString("platform", "instant_login_si");
        }
        return AbstractC73638SvC.LJIJ(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$1(IDhS107S0100000_14 iDhS107S0100000_14, Object obj) {
        List<String> list;
        String str;
        Object LIZ;
        Exception exc;
        long j;
        Exception exc2;
        Long l;
        String str2;
        C79155V4t filterMeta = (C79155V4t) obj;
        o.LJIIIZ(filterMeta, "filterMeta");
        if (((C82264WQi) iDhS107S0100000_14.l0).LJI.LIZJ(filterMeta)) {
            return ((C82264WQi) iDhS107S0100000_14.l0).LJI.LIZ(filterMeta.LIZ);
        }
        if (((C82264WQi) iDhS107S0100000_14.l0).LJFF.LIZJ(filterMeta)) {
            return ((C82264WQi) iDhS107S0100000_14.l0).LJFF.LJ(filterMeta.LIZ);
        }
        ToolsUrlModel toolsUrlModel = filterMeta.LJFF;
        if (toolsUrlModel != null && (list = toolsUrlModel.urlList) != null && (str = (String) ORZ.LJLLLLLL(0, list)) != null) {
            String LIZLLL = ((C82264WQi) iDhS107S0100000_14.l0).LJFF.LIZLLL(filterMeta.LIZ);
            String LJFF = ((C82264WQi) iDhS107S0100000_14.l0).LJFF.LJFF(filterMeta.LIZ);
            AbstractC48314Ixi abstractC48314Ixi = ((C82264WQi) iDhS107S0100000_14.l0).LJII.get();
            try {
                C44687HgJ.LJIILIIL(((C82264WQi) iDhS107S0100000_14.l0).LJFF.LIZIZ(filterMeta.LIZ));
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m12isFailureimpl(LIZ);
            C44687HgJ.LJFF(LIZLLL, false);
            C73893SzJ c73893SzJ = new C73893SzJ();
            abstractC48314Ixi.LIZJ(new I1Z(c73893SzJ, filterMeta), str, C17N.LJJIJIL(LIZLLL) + LJFF);
            try {
                Long l2 = (Long) c73893SzJ.LIZLLL();
                InterfaceC82275WQt interfaceC82275WQt = ((C82264WQi) iDhS107S0100000_14.l0).LIZLLL;
                if (interfaceC82275WQt != null) {
                    interfaceC82275WQt.LIZ(filterMeta, str, l2.longValue(), abstractC48314Ixi, C44687HgJ.LJIIIIZZ(C79057V0z.LJJIJIIJI(LIZLLL) + LJFF));
                }
                if (((C82264WQi) iDhS107S0100000_14.l0).LJFF.LIZ(filterMeta.LIZ)) {
                    Keva keva = C45451Hsd.LIZ;
                    String valueOf = String.valueOf(filterMeta.LIZ);
                    ToolsUrlModel toolsUrlModel2 = filterMeta.LJFF;
                    if (toolsUrlModel2 == null || (str2 = toolsUrlModel2.uri) == null) {
                        str2 = "";
                    }
                    keva.storeString(valueOf, str2);
                    return ((C82264WQi) iDhS107S0100000_14.l0).LJFF.LJ(filterMeta.LIZ);
                }
                StringBuilder sb = new StringBuilder("Filter unzip failed and causing exception is missing. id : ");
                sb.append(filterMeta.LIZ);
                sb.append(", name : ");
                throw new RuntimeException(C07670Rv.LIZIZ(sb, filterMeta.LIZJ, '.'));
            } catch (Exception e) {
                InterfaceC82275WQt interfaceC82275WQt2 = ((C82264WQi) iDhS107S0100000_14.l0).LIZLLL;
                if (interfaceC82275WQt2 != null) {
                    boolean z = e instanceof C45938I1e;
                    Integer num = null;
                    if (!z) {
                        exc = null;
                    } else {
                        exc = e;
                    }
                    C45938I1e c45938I1e = (C45938I1e) exc;
                    if (c45938I1e != null && (l = c45938I1e.LJLILLLLZI) != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    if (!z) {
                        exc2 = null;
                    } else {
                        exc2 = e;
                    }
                    C45938I1e c45938I1e2 = (C45938I1e) exc2;
                    if (c45938I1e2 != null) {
                        num = c45938I1e2.LJLIL;
                    }
                    interfaceC82275WQt2.LIZIZ(filterMeta, str, j, abstractC48314Ixi, e, num);
                }
                throw e;
            }
        }
        StringBuilder LIZJ = b1.LIZJ("Filter url list is empty while downloading. ", "id : ");
        LIZJ.append(filterMeta.LIZ);
        LIZJ.append(", name : ");
        throw new RuntimeException(q.LIZIZ(LIZJ, filterMeta.LIZJ, '.', LIZJ));
    }

    public static final Object apply$10(IDhS107S0100000_14 iDhS107S0100000_14, Object obj) {
        C82263WQh event = (C82263WQh) obj;
        o.LJIIIZ(event, "event");
        return C47261Igj.LJJIJ(((WQW) iDhS107S0100000_14.l0).LLLZI(event));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$2(IDhS107S0100000_14 iDhS107S0100000_14, Object obj) {
        ArrayList it = (ArrayList) obj;
        o.LJIIIZ(it, "it");
        ((C83146WkA) iDhS107S0100000_14.l0).LJIIJJI.getClass();
        C83186Wko c83186Wko = ((C83146WkA) iDhS107S0100000_14.l0).LJIIJJI;
        c83186Wko.getClass();
        if (!it.isEmpty()) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(it, 10));
            Iterator it2 = it.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C83160WkO((ComposerBeauty) it2.next()));
            }
            C83310Wmo<C83160WkO, Void> LIZJ = c83186Wko.LIZJ();
            LIZJ.getClass();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (next != null) {
                    LIZJ.LJIIJJI.add(next);
                }
            }
        }
        return it;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        r2.add(r5);
        r1 = ((X.C83146WkA) r13.l0).LJIIJJI;
        r9 = new X.C83160WkO(r5);
        r10 = ((X.C83146WkA) r13.l0).LJJIIJZLJL;
        r1.getClass();
        kotlin.jvm.internal.o.LJIIIZ(r10, "callback");
        r8 = r1.LIZJ();
        r8.getClass();
        r8.LJIIIIZZ(new kotlin.jvm.internal.AqS74S0400000_14(r8, r9, r10, (X.InterfaceC65784Pro) null, 2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object apply$3(Y.IDhS107S0100000_14 r13, java.lang.Object r14) {
        /*
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r14, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r14.iterator()
        L10:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r5 = r6.next()
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r5 = (com.ss.android.ugc.aweme.beauty.ComposerBeauty) r5
            X.Wg6 r0 = X.C82894Wg6.LIZIZ
            boolean r0 = r0.LJIILJJIL()
            if (r0 != 0) goto L2b
            java.lang.Object r0 = r13.l0
            X.WkA r0 = (X.C83146WkA) r0
            r0.LJIJI(r5)
        L2b:
            java.lang.Object r0 = r13.l0
            X.WkA r0 = (X.C83146WkA) r0
            X.Wko r1 = r0.LJIIJJI
            r0 = 0
            boolean r0 = r1.LIZLLL(r5, r0)
            if (r0 != 0) goto L10
            java.util.Iterator r4 = r2.iterator()
        L3c:
            boolean r0 = r4.hasNext()
            r11 = 0
            if (r0 == 0) goto L63
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r0 = (com.ss.android.ugc.aweme.beauty.ComposerBeauty) r0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.getEffect()
            java.lang.String r1 = r0.getUnzipPath()
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r5.getEffect()
            java.lang.String r0 = r0.getUnzipPath()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L3c
            if (r3 == 0) goto L63
            goto L10
        L63:
            r2.add(r5)
            java.lang.Object r0 = r13.l0
            X.WkA r0 = (X.C83146WkA) r0
            X.Wko r1 = r0.LJIIJJI
            X.WkO r9 = new X.WkO
            r9.<init>(r5)
            java.lang.Object r0 = r13.l0
            X.WkA r0 = (X.C83146WkA) r0
            X.WkJ r10 = r0.LJJIIJZLJL
            r1.getClass()
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            X.Wmo r8 = r1.LIZJ()
            r8.getClass()
            kotlin.jvm.internal.AqS74S0400000_14 r7 = new kotlin.jvm.internal.AqS74S0400000_14
            r12 = 2
            r7.<init>(r8, r9, r10, r11, r12)
            r8.LJIIIIZZ(r7)
            goto L10
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDhS107S0100000_14.apply$3(Y.IDhS107S0100000_14, java.lang.Object):java.lang.Object");
    }

    public static final Object apply$4(IDhS107S0100000_14 iDhS107S0100000_14, Object obj) {
        C81288VvI it = (C81288VvI) obj;
        o.LJIIIZ(it, "it");
        C82240WPk c82240WPk = (C82240WPk) iDhS107S0100000_14.l0;
        return new C82239WPj(it, c82240WPk.LIZIZ, c82240WPk.LIZ);
    }

    public static final Object apply$5(IDhS107S0100000_14 iDhS107S0100000_14, Object obj) {
        EffectNetListResponse resp = (EffectNetListResponse) obj;
        o.LJIIIZ(resp, "resp");
        ArrayList arrayList = new ArrayList();
        List<EffectCategoryModel> category = resp.getData().getCategory();
        InterfaceC82281WQz interfaceC82281WQz = ((WR5) iDhS107S0100000_14.l0).LJFF;
        if (interfaceC82281WQz != null) {
            ArrayList arrayList2 = new ArrayList();
            for (EffectCategoryModel effectCategoryModel : category) {
                EffectCategoryModel effectCategoryModel2 = effectCategoryModel;
                ((WR5) iDhS107S0100000_14.l0).getClass();
                String extra = effectCategoryModel2.getExtra();
                if (extra != null && extra.length() != 0) {
                    Object fromJson = GsonProtectorUtils.fromJson(C82891Wg3.LIZJ(), effectCategoryModel2.getExtra(), (Class<Object>) FilterCategoryExtra.class);
                    o.LJIIIIZZ(fromJson, "CukaieManifest.gson.from…ategoryExtra::class.java)");
                    if (interfaceC82281WQz.LIZ((FilterCategoryExtra) fromJson)) {
                    }
                }
                arrayList2.add(effectCategoryModel);
            }
            category = arrayList2;
        }
        for (EffectCategoryModel effectCategoryModel3 : category) {
            List<Effect> effects = resp.getData().getEffects();
            ArrayList arrayList3 = new ArrayList();
            for (Effect effect : effects) {
                Effect effect2 = effect;
                if ((effect2 instanceof FilterEffect) && effectCategoryModel3.getEffects().contains(effect2.getEffectId())) {
                    arrayList3.add(effect);
                }
            }
            List<Effect> LLILII = ORZ.LLILII(new C74299TDz(effectCategoryModel3), arrayList3);
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(LLILII, 10));
            for (Effect effect3 : LLILII) {
                if (effect3 != null) {
                    FilterEffect filterEffect = (FilterEffect) effect3;
                    String categoryKey = effectCategoryModel3.getKey();
                    o.LJIIIZ(categoryKey, "categoryKey");
                    arrayList4.add(new C81287VvH(C82265WQj.LIZ(filterEffect, categoryKey), filterEffect.getChecked(), filterEffect.getBuildIn()));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.effectplatform.FilterEffect");
                }
            }
            arrayList.add(new OSZ(effectCategoryModel3, arrayList4));
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL((Iterable) ((OSZ) it.next()).getSecond(), arrayList5);
        }
        return new C81288VvI(arrayList5, arrayList);
    }

    public static final Object apply$6(IDhS107S0100000_14 iDhS107S0100000_14, Object obj) {
        C82237WPh it = (C82237WPh) obj;
        o.LJIIIZ(it, "it");
        WQG wqg = (WQG) iDhS107S0100000_14.l0;
        wqg.getClass();
        return AbstractC73672Svk.LJJIIJZLJL(new ACallableS91S0200000_14(it, wqg, 2));
    }

    public static final Object apply$7(IDhS107S0100000_14 iDhS107S0100000_14, Object obj) {
        Map it = (Map) obj;
        o.LJIIIZ(it, "it");
        WQG wqg = (WQG) iDhS107S0100000_14.l0;
        wqg.getClass();
        return AbstractC73672Svk.LJJIIJZLJL(new ACallableS91S0200000_14(it, wqg, 3));
    }

    public static final Object apply$8(IDhS107S0100000_14 iDhS107S0100000_14, Object obj) {
        C82263WQh it = (C82263WQh) obj;
        o.LJIIIZ(it, "it");
        return ((WQW) iDhS107S0100000_14.l0).LLLZI(it);
    }

    public static final Object apply$9(IDhS107S0100000_14 iDhS107S0100000_14, Object obj) {
        WQO cachedResponse = (WQO) obj;
        o.LJIIIZ(cachedResponse, "cachedResponse");
        if (((WQQ) iDhS107S0100000_14.l0).LJLILLLLZI) {
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder sb = new StringBuilder("viki filter, alterCache -> filterTable=");
            List<OSZ<EffectCategoryResponse, List<C79155V4t>>> list = cachedResponse.LJLIL.LJLILLLLZI;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<OSZ<EffectCategoryResponse, List<C79155V4t>>> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getFirst().getName());
            }
            sb.append(arrayList);
            sb.append(", filter.size=");
            sb.append(cachedResponse.LJLIL.LJLIL.size());
            LIZLLL.d(sb.toString());
        }
        if (cachedResponse.LJLILLLLZI) {
            if (((WQQ) iDhS107S0100000_14.l0).LJLILLLLZI) {
                C82891Wg3.LIZLLL().d("viki filter, cachedResponse.brokenData");
            }
            return C73536StY.LJLIL;
        }
        return AbstractC73672Svk.LJJIJIL(cachedResponse);
    }
}
