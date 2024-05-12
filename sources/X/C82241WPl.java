package X;

import Y.ACListenerS39S0300000_14;
import Y.ACListenerS48S0200000_14;
import Y.AfS66S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.WPl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82241WPl implements WQ1 {
    public final java.util.Map<EffectCategoryResponse, List<FilterBean>> LIZ = new LinkedHashMap();
    public final java.util.Map<Object, View> LIZIZ = new LinkedHashMap();
    public boolean LIZJ = true;
    public final C73893SzJ LIZLLL = new C73893SzJ();
    public final C73893SzJ LJ = new C73893SzJ();
    public final InterfaceC82244WPo LJFF;
    public final C80695Vlj LJI;
    public final InterfaceC82245WPp LJII;

    @Override // X.InterfaceC82244WPo
    public final FilterBean LIZIZ() {
        return this.LJFF.LIZIZ();
    }

    @Override // X.InterfaceC82244WPo
    public final AbstractC73672Svk<C35794E3a<FilterBean>> LIZLLL() {
        return this.LJFF.LIZLLL();
    }

    @Override // X.InterfaceC82244WPo
    public final AbstractC73672Svk<FilterBean> LJIIIIZZ() {
        return this.LJFF.LJIIIIZZ();
    }

    @Override // X.WQ1
    public final C73426Srm LJIIJJI() {
        C73893SzJ c73893SzJ = this.LJ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    public final C73426Srm LJIILL() {
        C73893SzJ c73893SzJ = this.LIZLLL;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.WQ1
    public final C80695Vlj LJFF() {
        return this.LJI;
    }

    @Override // X.InterfaceC82244WPo
    public final void LIZJ(FilterBean filterBean) {
        this.LJFF.LIZJ(filterBean);
    }

    @Override // X.InterfaceC82244WPo
    public final void LJII(FilterBean filterBean) {
        this.LJFF.LJII(filterBean);
    }

    @Override // X.WPM
    public final void LJIIIZ(java.util.Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> filterList) {
        o.LJIIIZ(filterList, "filterList");
        ((LinkedHashMap) this.LIZ).clear();
        this.LIZ.putAll(filterList);
        LJIJ(ORZ.LLJI(((LinkedHashMap) this.LIZ).keySet()));
        this.LJFF.LJIIIZ(this.LIZ);
        FilterBean LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            LJII(LIZIZ);
            LJIIZILJ(LIZIZ);
        } else {
            LJIILLIIL(null, false);
        }
    }

    @Override // X.InterfaceC82244WPo
    public final void LJIIL(FilterBean filterBean) {
        this.LJFF.LJIIL(filterBean);
    }

    public final void LJIIZILJ(FilterBean filterBean) {
        EffectCategoryResponse effectCategoryResponse;
        Object obj;
        o.LJIIIZ(filterBean, "filterBean");
        Iterator it = ((LinkedHashMap) this.LIZ).entrySet().iterator();
        while (true) {
            effectCategoryResponse = null;
            if (it.hasNext()) {
                obj = it.next();
                Iterator it2 = ((Iterable) ((Map.Entry) obj).getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (o.LJ(filterBean, next)) {
                            if (next != null) {
                                break;
                            }
                        }
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            effectCategoryResponse = (EffectCategoryResponse) entry.getKey();
        }
        LJIILLIIL(effectCategoryResponse, false);
    }

    public void LJIJ(List<EffectCategoryResponse> tabDataList) {
        o.LJIIIZ(tabDataList, "tabDataList");
        this.LJI.LJIILJJIL();
        for (EffectCategoryResponse effectCategoryResponse : tabDataList) {
            Context context = this.LJI.getContext();
            o.LJIIIIZZ(context, "tabLayout.context");
            THN LJIILJJIL = LJIILJJIL(context, effectCategoryResponse);
            C164456cr LJIIL = this.LJI.LJIIL();
            LJIIL.LIZLLL = LJIILJJIL;
            LJIIL.LIZIZ();
            this.LJI.LIZJ(LJIIL);
            C16880lQ.LJIIJ(new ACListenerS48S0200000_14(this, effectCategoryResponse, 11), LJIILJJIL);
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
            LJIILIIL((View) entry.getValue(), entry.getKey());
        }
    }

    @Override // X.WQ1
    public final void LJIIJ(View view, Object token) {
        o.LJIIIZ(token, "token");
        this.LIZIZ.put(token, view);
        LJIILIIL(view, token);
    }

    public final void LJIILIIL(View view, Object obj) {
        C164456cr LJIIL = this.LJI.LJIIL();
        LJIIL.LIZLLL = view;
        LJIIL.LIZIZ();
        Object parent = view.getParent();
        if (parent != null) {
            C16880lQ.LJIIJ(new ACListenerS39S0300000_14(this, view, obj, 1), (View) parent);
            this.LJI.LIZJ(LJIIL);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    public THN LJIILJJIL(Context context, EffectCategoryResponse tabData) {
        o.LJIIIZ(tabData, "tabData");
        THN LIZ = C163486bI.LIZ(context);
        int LIZIZ = (int) C74275TDb.LIZIZ(context, 4.0f);
        LIZ.setPadding(LIZIZ, 0, LIZIZ, 0);
        if (TextUtils.isEmpty(tabData.getIcon_normal_url())) {
            LIZ.setText(tabData.getName());
        } else {
            String icon_normal_url = tabData.getIcon_normal_url();
            if (icon_normal_url == null) {
                icon_normal_url = "";
            }
            LIZ.setImage(icon_normal_url);
        }
        InterfaceC82245WPp interfaceC82245WPp = this.LJII;
        if (interfaceC82245WPp != null) {
            interfaceC82245WPp.LIZJ(tabData, new C82246WPq(LIZ));
        }
        return LIZ;
    }

    public final void LJIILLIIL(EffectCategoryResponse effectCategoryResponse, boolean z) {
        int i;
        C164456cr LJIIJJI;
        List list;
        FilterBean filterBean;
        if (effectCategoryResponse != null) {
            i = 0;
            for (Object obj : ((LinkedHashMap) this.LIZ).keySet()) {
                if (i >= 0) {
                    if (o.LJ(((com.ss.ugc.effectplatform.model.EffectCategoryResponse) obj).getId(), effectCategoryResponse.getId())) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        i = -1;
        if (z && effectCategoryResponse != null && (list = (List) ((LinkedHashMap) this.LIZ).get(effectCategoryResponse)) != null && (filterBean = (FilterBean) ORZ.LJLLLL(list)) != null) {
            this.LJFF.LJIIL(filterBean);
        }
        if (i >= 0) {
            if (this.LJI.getSelectedTabPosition() != i && (LJIIJJI = this.LJI.LJIIJJI(i)) != null) {
                LJIIJJI.LIZ();
                return;
            }
            return;
        }
        if (this.LJI.getCurSelectedTab() != null) {
            C164456cr curSelectedTab = this.LJI.getCurSelectedTab();
            o.LJIIIIZZ(curSelectedTab, "tabLayout.curSelectedTab");
            View view = curSelectedTab.LIZLLL;
            if (view != null) {
                view.setSelected(false);
            }
        }
        C80695Vlj c80695Vlj = this.LJI;
        if (c80695Vlj.LJLILLLLZI == null) {
            return;
        }
        C80696Vlk c80696Vlk = c80695Vlj.LJLJI;
        ValueAnimator valueAnimator = c80696Vlk.LJLLI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            c80696Vlk.LJLLI.cancel();
        }
        c80696Vlk.LJLJI = -1;
        c80696Vlk.LJLJJI = 0.0f;
        c80696Vlk.LIZIZ();
        c80695Vlj.LJIIIIZZ(c80695Vlj.LJLILLLLZI);
        c80695Vlj.LJLILLLLZI = null;
    }

    public C82241WPl(C74473TKr c74473TKr, C80695Vlj c80695Vlj, InterfaceC82245WPp interfaceC82245WPp) {
        this.LJFF = c74473TKr;
        this.LJI = c80695Vlj;
        this.LJII = interfaceC82245WPp;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        AbstractC73672Svk<FilterBean> LJIIIIZZ = c74473TKr.LJIIIIZZ();
        AfS66S0100000_14 afS66S0100000_14 = new AfS66S0100000_14(this, 53);
        C73683Svv c73683Svv = C73674Svm.LJ;
        c73318Sq2.LIZ(LJIIIIZZ.LJJJLIIL(afS66S0100000_14, c73683Svv));
        c73318Sq2.LIZ(c74473TKr.LIZLLL().LJJJLIIL(new AfS66S0100000_14(this, 44), c73683Svv));
        c73318Sq2.LIZ(c74473TKr.LJIILIIL().LJJJLIIL(new AfS66S0100000_14(this, 45), c73683Svv));
        c80695Vlj.LIZIZ(new C82243WPn(this));
        c80695Vlj.setOnTabClickListener(C78949Uyf.LJLILLLLZI);
    }
}
