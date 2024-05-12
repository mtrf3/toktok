package com.ss.android.ugc.aweme.search.ecommerce;

import X.ActivityC45651qj;
import X.C2U8;
import X.C50221JnN;
import X.C50293JoX;
import X.C50294JoY;
import X.C50605JtZ;
import X.C50645JuD;
import X.C50650JuI;
import X.C50676Jui;
import X.C50677Juj;
import X.C50678Juk;
import X.C50688Juu;
import X.C50699Jv5;
import X.C50701Jv7;
import X.C58096Mr6;
import X.InterfaceC178696zp;
import X.InterfaceC50547Jsd;
import X.InterfaceC50548Jse;
import X.InterfaceC51113K4f;
import X.JYS;
import X.K56;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcDynamicSingleIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchMiddleForEcService implements ISearchMiddleForECService {
    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LIZIZ() {
        K56.LJIIIIZZ(5);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJI() {
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJIIIZ() {
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJIJI() {
        C50293JoX.LJFF = true;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJI() {
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJIJIIJI() {
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJJJIZL() {
    }

    public static ISearchMiddleForECService LJJJJLI() {
        Object LIZ = C58096Mr6.LIZ(ISearchMiddleForECService.class, false);
        if (LIZ != null) {
            return (ISearchMiddleForECService) LIZ;
        }
        if (C58096Mr6.J4 == null) {
            synchronized (ISearchMiddleForECService.class) {
                if (C58096Mr6.J4 == null) {
                    C58096Mr6.J4 = new SearchMiddleForEcService();
                }
            }
        }
        return C58096Mr6.J4;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJ() {
        if (C50688Juu.LIZ == 0) {
            C50688Juu.LIZ = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJIIJ() {
        C50688Juu.LIZ = 0L;
        C50688Juu.LIZIZ = 0L;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJIIIIZZ() {
        return C50293JoX.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJIILJJIL() {
        C50688Juu.LIZ().LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJJIJLIJ() {
        return C50293JoX.LJI();
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJFF() {
        C50293JoX.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LIZ(String keyword) {
        o.LJIIIZ(keyword, "keyword");
        C50293JoX.LIZLLL.add(keyword);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LIZJ(int i) {
        return C50605JtZ.LJFF(i);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final int LIZLLL(C50650JuI c50650JuI) {
        return new C50699Jv5(c50650JuI).LJFF() ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJII(String str) {
        C50293JoX.LIZLLL(str, true);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJIIJ(String key) {
        List<String> list;
        o.LJIIIZ(key, "key");
        C50294JoY c50294JoY = (C50294JoY) ((LinkedHashMap) C50293JoX.LIZ).get(key);
        if (c50294JoY != null && (list = c50294JoY.LJ) != null) {
            list.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJIIJJI(SearchResultParam searchResultParam) {
        C2U8.LIZ(new C50221JnN(searchResultParam));
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJIILIIL(int i) {
        return C50676Jui.LJFF(i);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final InterfaceC50547Jsd LJIILL(ActivityC45651qj activityC45651qj) {
        return ((SearchStartViewModel) ViewModelProviders.of(activityC45651qj).get(SearchStartViewModel.class)).LJZ;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final int LJIILLIIL(LifecycleOwner lifecycleOwner) {
        return new C50699Jv5(lifecycleOwner).LIZLLL().LIZIZ().LJLJI ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJIIZILJ(List<String> list) {
        C50293JoX.LIZJ.add(list);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJIJ(int i) {
        return C50676Jui.LIZLLL(i);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJIJJ(List<String> list) {
        C50293JoX.LIZIZ.add(list);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final Word LJIJJLI(LifecycleOwner lifecycleOwner) {
        return new C50699Jv5(lifecycleOwner).LIZLLL().LIZIZ().LJLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final boolean LJIL(ActivityC45651qj activityC45651qj) {
        return activityC45651qj instanceof SearchResultActivity;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final long LJJ(LifecycleOwner lifecycleOwner) {
        return new C50699Jv5(lifecycleOwner).LIZLLL().LIZIZ().LJLJLJ / 1000;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJIFFI(String key) {
        o.LJIIIZ(key, "key");
        C50294JoY c50294JoY = (C50294JoY) ((LinkedHashMap) C50293JoX.LIZ).get(key);
        if (c50294JoY == null) {
            return;
        }
        c50294JoY.LJIILJJIL = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final HashMap<String, Long> LJJII(ActivityC45651qj activityC45651qj) {
        return ((SearchStartViewModel) ViewModelProviders.of(activityC45651qj).get(SearchStartViewModel.class)).LLFF;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJJIIJZLJL(C50650JuI c50650JuI) {
        return new C50699Jv5(c50650JuI).LJ().LIZIZ().M();
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final InterfaceC50548Jse LJJIJ(ActivityC45651qj activityC45651qj) {
        return ((SearchStartViewModel) ViewModelProviders.of(activityC45651qj).get(SearchStartViewModel.class)).LJLZ;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final boolean LJJIJIIJIL(EcDynamicSingleIntermediateFragmentNew ecDynamicSingleIntermediateFragmentNew) {
        return new C50699Jv5(ecDynamicSingleIntermediateFragmentNew).LJ().LIZIZ().N();
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJJIJL(LifecycleOwner lifecycleOwner) {
        return new C50699Jv5(lifecycleOwner).LIZLLL().LIZIZ().LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJIL(long j) {
        C50645JuD.LIZ(j);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final int LJJIZ(String name) {
        o.LJIIIZ(name, "name");
        return C50605JtZ.LIZLLL(name);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final InterfaceC51113K4f LJJJ(ActivityC45651qj activityC45651qj) {
        return ((SearchStartViewModel) ViewModelProviders.of(activityC45651qj).get(SearchStartViewModel.class)).LJLLLLLL;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final boolean LJJJI(EcDynamicSingleIntermediateFragmentNew ecDynamicSingleIntermediateFragmentNew) {
        return new C50699Jv5(ecDynamicSingleIntermediateFragmentNew).LJ().LIZIZ().LJLILLLLZI.isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final C50701Jv7 LJJJIL(C50650JuI c50650JuI) {
        return new C50699Jv5(c50650JuI).LIZLLL().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJJJJI(int i) {
        return C50676Jui.LIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final InterfaceC178696zp LJJJJJ(ActivityC45651qj activityC45651qj) {
        return ((SearchStartViewModel) ViewModelProviders.of(activityC45651qj).get(SearchStartViewModel.class)).LL;
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJJJJJL(int i) {
        return C50676Jui.LJ(i);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJIIL(String key, String str) {
        List<String> list;
        o.LJIIIZ(key, "key");
        C50294JoY c50294JoY = (C50294JoY) ((LinkedHashMap) C50293JoX.LIZ).get(key);
        if (c50294JoY != null && (list = c50294JoY.LJ) != null) {
            list.add(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJIII(String type, Map<String, ? extends Object> map) {
        o.LJIIIZ(type, "type");
        if (map != null) {
            C2U8.LIZ(new JYS(C50605JtZ.LIZLLL(type), map));
        } else {
            C2U8.LIZ(new JYS(C50605JtZ.LIZLLL(type)));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJIIZ(LifecycleOwner lifecycleOwner, String str) {
        C50699Jv5 c50699Jv5 = new C50699Jv5(lifecycleOwner);
        if (str == null) {
            str = "";
        }
        c50699Jv5.LJII(str);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJIIZI(LifecycleOwner lifecycleOwner, String str) {
        new C50699Jv5(lifecycleOwner).LIZIZ(new C50678Juk(str));
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final void LJJIJIL(LifecycleOwner lifecycleOwner, boolean z) {
        new C50699Jv5(lifecycleOwner).LIZIZ(new C50677Juj(z));
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJJJJ(String str, String str2) {
        return C50293JoX.LJ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService
    public final String LJJJJL(String str, String str2) {
        return C50293JoX.LJ(str, str2);
    }
}
