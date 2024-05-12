package com.ss.android.ugc.aweme.ecomsearch.ui;

import X.ActivityC45651qj;
import X.C06O;
import X.C0CM;
import X.C10A;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C17N;
import X.C1B3;
import X.C1XY;
import X.C208338Fp;
import X.C208398Fv;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C29615Bjn;
import X.C29S;
import X.C2U8;
import X.C32151Nz;
import X.C33Q;
import X.C36922EeM;
import X.C39774FjG;
import X.C3C5;
import X.C3C8;
import X.C48054ItW;
import X.C50431Jql;
import X.C50433Jqn;
import X.C50616Jtk;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50675Juh;
import X.C50833JxF;
import X.C50948Jz6;
import X.C50988Jzk;
import X.C51110K4c;
import X.C51163K6d;
import X.C51170K6k;
import X.C51178K6s;
import X.C51188K7c;
import X.C51191K7f;
import X.C51194K7i;
import X.C51201K7p;
import X.C51202K7q;
import X.C51204K7s;
import X.C51207K7v;
import X.C51210K7y;
import X.C51214K8c;
import X.C51242K9e;
import X.C51244K9g;
import X.C51246K9i;
import X.C51272KAi;
import X.C51307KBr;
import X.C51379KEl;
import X.C51421KGb;
import X.C51772KTo;
import X.C55230Lly;
import X.C56412MCa;
import X.C68322mC;
import X.C76800UCe;
import X.C78555UsJ;
import X.C78596Usy;
import X.C78685UuP;
import X.C78857UxB;
import X.C78897Uxp;
import X.C8YZ;
import X.C90903hW;
import X.EnumC50961JzJ;
import X.EnumC51280KAq;
import X.IG6;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC50991Jzn;
import X.InterfaceC51136K5c;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.JTO;
import X.K0D;
import X.K4W;
import X.K5P;
import X.K5R;
import X.K65;
import X.K7D;
import X.K7F;
import X.K7J;
import X.K7K;
import X.K7N;
import X.K7U;
import X.K7V;
import X.K7X;
import X.K7Z;
import X.K87;
import X.K89;
import X.K9W;
import X.KAK;
import X.KB1;
import X.KFM;
import X.KL2;
import X.KL8;
import X.KPL;
import X.O6R;
import X.ORZ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.QD3;
import X.T5T;
import X.TBW;
import X.VW3;
import Y.ACListenerS28S0100000_8;
import Y.ACallableS57S0300000_8;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecomsearch.utils.EcSearchShopResultPreload;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchTabViewModel;
import com.ss.android.ugc.aweme.impl.OptimizerHelperServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.keyword.SearchEditTextViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.vision.EComPhotoSearchServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public class EcSearchResultFragmentNew extends EcBaseDiscoverAndSearchFragmentNew implements InterfaceC50991Jzn, KPL {
    public static final int LLJ = C17N.LJIILL(35.0d);
    public ViewGroup LLIILZL;
    public ViewGroup LLIIZ;
    public ViewGroup LLIL;
    public TuxIconView LLILII;
    public ViewGroup LLILIL;
    public View LLILL;
    public String LLILLIZIL;
    public SearchEditTextViewModel LLILLJJLI;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final Map<Integer, View> LLIZLLLIL = new LinkedHashMap();
    public boolean LLILLL = true;
    public String LLIZ = "";

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void Gl() {
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void Jl() {
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final int getLayout() {
        return R.layout.ap4;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void km() {
        Integer num;
        NextLiveData<Integer> hv0;
        C208398Fv capsuleWords = this.LLF.getCapsuleWords();
        T5T mSearchInputView = this.LJLJI;
        o.LJIIIIZZ(mSearchInputView, "mSearchInputView");
        C208338Fp.LIZJ(capsuleWords, mSearchInputView, this.LJLJL, true);
        super.km();
        EcSearchStartViewModel ecSearchStartViewModel = this.LJLZ;
        if (ecSearchStartViewModel == null || (hv0 = ecSearchStartViewModel.hv0()) == null || (num = hv0.getValue()) == null) {
            num = -1;
        }
        Nm(num.intValue());
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void xl() {
        this.LLIIIJ = null;
    }

    public final EcSearchContainerFragment zm() {
        try {
            Fragment LJJJIL = getChildFragmentManager().LJJJIL("Container");
            if (LJJJIL == null || !(LJJJIL instanceof EcSearchContainerFragment)) {
                return null;
            }
            EcSearchContainerFragment ecSearchContainerFragment = (EcSearchContainerFragment) LJJJIL;
            if (ecSearchContainerFragment.isDetached()) {
                return null;
            }
            return ecSearchContainerFragment;
        } catch (Exception e) {
            ALog.e("SearchResultFragment", e);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
            }
            return null;
        }
    }

    public final void Im() {
        C50650JuI immutableData;
        K5P searchEcommerceModel;
        String pageSchema;
        C50652JuK.Companion.getClass();
        C50652JuK LJIIJ = C50651JuJ.LJIIJ(this);
        if (LJIIJ != null && (immutableData = LJIIJ.getImmutableData()) != null && (searchEcommerceModel = immutableData.getSearchEcommerceModel()) != null && (pageSchema = searchEcommerceModel.getPageSchema()) != null) {
            SmartRouter.buildRoute(this, pageSchema).open();
        }
    }

    public final boolean Jm() {
        Integer num;
        C50650JuI LJII;
        C50433Jqn searchCommonModel;
        C50433Jqn searchCommonModel2;
        C50652JuK.Companion.getClass();
        C50650JuI LJII2 = C50651JuJ.LJII(this);
        if (LJII2 != null && (searchCommonModel2 = LJII2.getSearchCommonModel()) != null) {
            num = Integer.valueOf(searchCommonModel2.getBackPressFlag());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 1) {
                return false;
            }
            if (num.intValue() == 2) {
                return true;
            }
        }
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        if ((!C1XY.LJJI(requireActivity) || o.LJ(C1XY.LJIJ(C55230Lly.LIZJ(this, null)), "1")) && (LJII = C50651JuJ.LJII(this)) != null && (searchCommonModel = LJII.getSearchCommonModel()) != null) {
            searchCommonModel.isFromVideoDetail();
        }
        return true;
    }

    public final boolean Km() {
        C50650JuI immutableData;
        K5P searchEcommerceModel;
        C50652JuK.Companion.getClass();
        C50652JuK LJIIJ = C50651JuJ.LJIIJ(this);
        if (LJIIJ != null && (immutableData = LJIIJ.getImmutableData()) != null && (searchEcommerceModel = immutableData.getSearchEcommerceModel()) != null && searchEcommerceModel.getNeedBackToPage() && C78857UxB.LJJJIL(searchEcommerceModel.getPageSchema())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void Nl() {
        T5T t5t = this.LJLJI;
        if (t5t == null) {
            return;
        }
        t5t.post(new ARunnableS44S0100000_8(this, 116));
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void mm() {
        String enterFrom;
        String Cm;
        String str;
        C51110K4c singleSearchEcommerceModel;
        String str2;
        String str3;
        C51110K4c singleSearchEcommerceModel2;
        C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
        if (c50948Jz6 == null) {
            return;
        }
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c50651JuJ.getClass();
        C50431Jql LJFF = C50651JuJ.LJFF(mo49getActivity);
        if (c50948Jz6.obtainEcLogData("search_entrance") != null) {
            enterFrom = String.valueOf(c50948Jz6.obtainEcLogData("search_entrance"));
        } else {
            enterFrom = getEnterFrom();
        }
        String str4 = "flash_sale_search";
        if (this.LLILZLL) {
            C51191K7f c51191K7f = new C51191K7f();
            Object obtainLogData = c50948Jz6.obtainLogData("is_from_video");
            if (obtainLogData != null) {
                c51191K7f.LIZLLL("is_from_video", obtainLogData.toString());
            }
            String LJIJ = C1XY.LJIJ(C55230Lly.LIZJ(this, null));
            LJIJ.toString();
            c51191K7f.LIZLLL("is_from_comment", LJIJ);
            Object obtainLogData2 = c50948Jz6.obtainLogData("tab_name");
            if (obtainLogData2 != null) {
                c51191K7f.LIZLLL("tab_name", obtainLogData2.toString());
            }
            c51191K7f.LJIILL("enter_method", "cancel");
            c51191K7f.LJIILLIIL("return");
            enterFrom.toString();
            c51191K7f.LIZLLL("search_entrance", enterFrom);
            if (LJFF != null) {
                str2 = LJFF.getBlankPageEnterAction();
            } else {
                str2 = null;
            }
            if (C78857UxB.LJJJIL(str2)) {
                c51191K7f.LIZLLL("enter_action", str2);
            }
            c51191K7f.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
            C50650JuI LJII = C50651JuJ.LJII(this);
            if (LJII != null && (singleSearchEcommerceModel2 = LJII.getSingleSearchEcommerceModel()) != null) {
                str3 = singleSearchEcommerceModel2.getSrcMaterialId();
            } else {
                str3 = null;
            }
            if (C78685UuP.LJJJZ(str3) && str3 != null) {
                c51191K7f.LIZLLL("enter_product_id", str3);
            }
            c51191K7f.LIZLLL("search_keyword", "");
            c51191K7f.LJIIZILJ(Integer.valueOf(c50948Jz6.getEcSearchEntranceValue()));
            int ecSearchEntranceValue = c50948Jz6.getEcSearchEntranceValue();
            if (ecSearchEntranceValue != EnumC51280KAq.FLASH_SALE.getValue()) {
                if (ecSearchEntranceValue == EnumC51280KAq.BRAND_BUDGET.getValue()) {
                    str4 = "brand_diskon_search";
                } else if (ecSearchEntranceValue == EnumC51280KAq.FROM_HALF_SHOP.getValue()) {
                    str4 = KAK.SHOP.getTabName();
                } else {
                    str4 = null;
                }
            }
            if (C78685UuP.LJJJZ(str4) && str4 != null) {
                c51191K7f.LJIILLIIL(str4);
            }
            c51191K7f.LJIILIIL();
            if (LJFF != null) {
                LJFF.setBlankPageEnterForm("return");
                LJFF.setBlankPageEnterMethod("cancel");
            }
            C17N.LJJJJJL(this).j4(new C50616Jtk("return", "cancel"));
            this.LLILZLL = false;
            return;
        }
        int Hl = Hl();
        if (Hl != 2) {
            if (Hl != 3) {
                Cm = getEnterFrom();
            } else if (this.LLILZ) {
                Cm = Cm();
            } else {
                Cm = getEnterFrom();
            }
        } else {
            Cm = Cm();
        }
        C51191K7f c51191K7f2 = new C51191K7f();
        Object obtainLogData3 = c50948Jz6.obtainLogData("is_from_video");
        if (obtainLogData3 != null) {
            c51191K7f2.LIZLLL("is_from_video", obtainLogData3.toString());
        }
        String LJIJ2 = C1XY.LJIJ(C55230Lly.LIZJ(this, null));
        LJIJ2.toString();
        c51191K7f2.LIZLLL("is_from_comment", LJIJ2);
        Object obtainLogData4 = c50948Jz6.obtainLogData("tab_name");
        if (obtainLogData4 != null) {
            c51191K7f2.LIZLLL("tab_name", obtainLogData4.toString());
        }
        c51191K7f2.LJIILL("enter_method", "cancel");
        c51191K7f2.LJIILLIIL(Cm);
        enterFrom.toString();
        c51191K7f2.LIZLLL("search_entrance", enterFrom);
        c51191K7f2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        C50650JuI LJII2 = C50651JuJ.LJII(this);
        if (LJII2 != null && (singleSearchEcommerceModel = LJII2.getSingleSearchEcommerceModel()) != null) {
            str = singleSearchEcommerceModel.getSrcMaterialId();
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str) && str != null) {
            c51191K7f2.LIZLLL("enter_product_id", str);
        }
        c51191K7f2.LIZLLL("search_keyword", "");
        c51191K7f2.LJIIZILJ(Integer.valueOf(c50948Jz6.getEcSearchEntranceValue()));
        int ecSearchEntranceValue2 = c50948Jz6.getEcSearchEntranceValue();
        if (ecSearchEntranceValue2 != EnumC51280KAq.FLASH_SALE.getValue()) {
            if (ecSearchEntranceValue2 == EnumC51280KAq.BRAND_BUDGET.getValue()) {
                str4 = "brand_diskon_search";
            } else if (ecSearchEntranceValue2 == EnumC51280KAq.ORDER.getValue()) {
                str4 = "order_list_page";
            } else if (ecSearchEntranceValue2 == EnumC51280KAq.FROM_HALF_SHOP.getValue()) {
                str4 = KAK.SHOP.getTabName();
            } else {
                str4 = null;
            }
        }
        if (C78685UuP.LJJJZ(str4) && str4 != null) {
            c51191K7f2.LJIILLIIL(str4);
        }
        c51191K7f2.LJIILIIL();
        if (LJFF != null) {
            LJFF.setBlankPageEnterForm(Cm);
            LJFF.setBlankPageEnterMethod("cancel");
        }
        C17N.LJJJJJL(this).j4(new C50616Jtk(Cm, "cancel"));
    }

    public final void vm() {
        InterfaceC51136K5c interfaceC51136K5c;
        SearchResultParam searchParam;
        K7V k7v;
        K7X k7x;
        if (C51246K9i.LIZ != 0) {
            C51246K9i.LIZIZ = System.currentTimeMillis();
        }
        om(2);
        this.LJLJI.setCursorVisible(false);
        this.LJLJLLL.LJ();
        ((LiveData) this.LJLZ.LJLLI.getValue()).setValue(0);
        C51207K7v c51207K7v = this.LLII;
        if (c51207K7v != null) {
            c51207K7v.LIZ(0);
        }
        K7X k7x2 = this.LJLZ.LJLLLL;
        if ((k7x2 == null || k7x2.getInnerState() != 0) && (interfaceC51136K5c = this.LJLJLLL) != null && (searchParam = interfaceC51136K5c.getSearchParam()) != null && (k7v = this.LLIFFJFJJ) != null) {
            k7v.LIZ(searchParam);
        }
        K7U k7u = this.LLFF;
        if (k7u != null && (k7x = k7u.LIZ.LLIIII) != null) {
            k7x.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final boolean Al() {
        ECSearchEntranceData eCSearchEntranceData;
        IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
        C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
        if (c50948Jz6 != null) {
            eCSearchEntranceData = c50948Jz6.getEcSearchEntranceData();
        } else {
            eCSearchEntranceData = null;
        }
        return LJJJJZI.LJI(eCSearchEntranceData);
    }

    public final String Am() {
        String LJFF = C51214K8c.LJFF(ym());
        if (LJFF.length() > 0) {
            return LJFF;
        }
        return KAK.TOP.getTabName();
    }

    public final String Cm() {
        String str;
        KAK kak = (KAK) ORZ.LJLLLLLL(ym(), C51214K8c.LIZIZ);
        if (kak == null || (str = kak.getTabName()) == null) {
            str = "";
        }
        if (o.LJ(str, KAK.HASHTAG.getTabName())) {
            str = "challenge";
        }
        if (str.length() > 0) {
            return str;
        }
        return KAK.TOP.getTabName();
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final boolean Dl() {
        C50433Jqn searchCommonModel;
        if (Al()) {
            return false;
        }
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c50651JuJ.getClass();
        C50650JuI LJII = C50651JuJ.LJII(mo49getActivity);
        if (LJII != null && (searchCommonModel = LJII.getSearchCommonModel()) != null) {
            return searchCommonModel.getShouldShowSug();
        }
        return true;
    }

    public final boolean Em() {
        String str;
        ECSearchEntranceData ecSearchEntranceData;
        C50948Jz6 LIZIZ = JTO.LIZIZ(mo49getActivity());
        if (LIZIZ != null && (ecSearchEntranceData = LIZIZ.getEcSearchEntranceData()) != null) {
            str = ecSearchEntranceData.getDisableVisionSearch();
        } else {
            str = null;
        }
        if (o.LJ(str, "true") || o.LJ(str, "1")) {
            return false;
        }
        K65.LIZ.getClass();
        return K65.LIZ();
    }

    public final boolean Hm() {
        if (!Em()) {
            return false;
        }
        K65.LIZ.getClass();
        return K65.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void Ml() {
        LiveData liveData;
        K4W.LIZ();
        K7X k7x = this.LLIIII;
        if (k7x != null && k7x.LIZ() == 1) {
            C51421KGb.LIZIZ("click_back");
            KeyboardUtils.LIZIZ(this.LJLJI);
        }
        if (LLLZZIL(K7D.PRESS_LEFT_BACK)) {
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C06O.LIZ(mo49getActivity);
        }
        mo49getActivity();
        C2U8.LIZ(new IG6());
        mo49getActivity();
        C51307KBr.LIZ(2);
        K4W.LIZ();
        EcSearchStartViewModel ecSearchStartViewModel = this.LJLZ;
        if (ecSearchStartViewModel == null || (liveData = (LiveData) ecSearchStartViewModel.LJLJLLL.getValue()) == null) {
            return;
        }
        liveData.setValue(new Word(Il(), ""));
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void Ql() {
        EnumC50961JzJ initDirectPage;
        K5R k5r;
        if (C39774FjG.LIZ() && (k5r = this.LLIIIJ) != null && k5r.LIZ) {
            return;
        }
        C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
        if (c50948Jz6 != null && (initDirectPage = c50948Jz6.getInitDirectPage()) != null && K7F.LIZIZ[initDirectPage.ordinal()] == 1) {
            c50948Jz6.setInitDirectPage(null);
            String initSugWord = c50948Jz6.getInitSugWord();
            if (initSugWord != null) {
                T5T t5t = this.LJLJI;
                if (t5t != null) {
                    t5t.setText(initSugWord);
                }
                T5T t5t2 = this.LJLJI;
                if (t5t2 != null) {
                    C78555UsJ.LJJIJIL(t5t2, new AqS158S0100000_8(this, 573));
                }
                c50948Jz6.setInitSugWord(null);
                return;
            }
        }
        SearchResultParam searchResultParam = this.LLF;
        if (searchResultParam != null) {
            fm(searchResultParam, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void Rl() {
        Window window;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(51);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void Sl() {
        Context context;
        View LIZJ;
        if (Em() && (context = getContext()) != null && (LIZJ = EComPhotoSearchServiceImpl.LJFF().LIZJ(context, -1, K7K.SEARCH_MIDDLE, null, new K9W(this), new AqS158S0100000_8(this, 80))) != null) {
            if (Hm()) {
                this.LJLIL.addView(LIZJ);
                ImageView imageView = this.LJLJL;
                if (imageView != null) {
                    C78596Usy.LJJJJLL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(35)), imageView);
                }
            }
            this.LJLILLLLZI = EComPhotoSearchServiceImpl.LJFF().LIZIZ(LIZJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void Tl() {
        K5R k5r;
        SearchResultParam searchResultParam;
        if (C39774FjG.LIZ() && (k5r = this.LLIIIJ) != null && k5r.LIZ) {
            if (k5r.LIZLLL) {
                this.LJLJI.setText("");
                return;
            }
            if (k5r.LIZJ) {
                String str = k5r.LJFF;
                if (!C78685UuP.LJJJZ(str) || str == null) {
                    return;
                }
                this.LJLJI.setText(str);
                return;
            }
            if (!k5r.LIZIZ || (searchResultParam = k5r.LJ) == null) {
                return;
            }
            fm(searchResultParam, false);
            this.LLIIIJ = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void Vl() {
        View view;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        TuxIconView tuxIconView;
        com.bytedance.ies.sdk.widgets.NextLiveData<EditText> gv0;
        LiveData liveData;
        NextLiveData<Boolean> iv0;
        NextLiveData<Boolean> gv02;
        NextLiveData<Integer> hv0;
        super.Vl();
        View view2 = getView();
        ViewGroup viewGroup4 = null;
        if (view2 != null) {
            view = view2.findViewById(android.R.id.statusBarBackground);
        } else {
            view = null;
        }
        this.LLILL = view;
        View view3 = getView();
        if (view3 != null) {
            viewGroup = (ViewGroup) view3.findViewById(R.id.g9w);
        } else {
            viewGroup = null;
        }
        this.LLIILZL = viewGroup;
        if (viewGroup != null) {
            viewGroup.setTransitionGroup(true);
        }
        View view4 = getView();
        if (view4 != null) {
            viewGroup2 = (ViewGroup) view4.findViewById(R.id.lgf);
        } else {
            viewGroup2 = null;
        }
        this.LLIL = viewGroup2;
        View view5 = getView();
        if (view5 != null) {
            viewGroup3 = (ViewGroup) view5.findViewById(R.id.kcl);
        } else {
            viewGroup3 = null;
        }
        this.LLIIZ = viewGroup3;
        if (viewGroup3 != null) {
            viewGroup3.setTransitionGroup(true);
        }
        View view6 = getView();
        if (view6 != null) {
            view6.findViewById(R.id.enl);
        }
        View view7 = getView();
        if (view7 != null) {
            tuxIconView = (TuxIconView) view7.findViewById(R.id.f_g);
        } else {
            tuxIconView = null;
        }
        this.LLILII = tuxIconView;
        View view8 = getView();
        if (view8 != null) {
            viewGroup4 = (ViewGroup) view8.findViewById(R.id.jee);
        }
        this.LLILIL = viewGroup4;
        if (viewGroup4 != null) {
            C16880lQ.LJIIL(viewGroup4, new ACListenerS28S0100000_8(this, 11));
        }
        EcSearchStartViewModel ecSearchStartViewModel = this.LJLZ;
        if (ecSearchStartViewModel != null && (hv0 = ecSearchStartViewModel.hv0()) != null) {
            hv0.observe(this, new AObserverS76S0100000_8(this, 16));
        }
        if (C50675Juh.LIZ) {
            EcSearchStartViewModel ecSearchStartViewModel2 = this.LJLZ;
            if (ecSearchStartViewModel2 != null && (gv02 = ecSearchStartViewModel2.gv0()) != null) {
                gv02.observe(this, new AObserverS76S0100000_8(this, 17));
            }
            EcSearchStartViewModel ecSearchStartViewModel3 = this.LJLZ;
            if (ecSearchStartViewModel3 != null && (iv0 = ecSearchStartViewModel3.iv0()) != null) {
                iv0.observe(this, new AObserverS76S0100000_8(this, 18));
            }
        }
        EcSearchStartViewModel ecSearchStartViewModel4 = this.LJLZ;
        if (ecSearchStartViewModel4 != null && (liveData = (LiveData) ecSearchStartViewModel4.LJLJLLL.getValue()) != null) {
            liveData.observe(this, new AObserverS76S0100000_8(this, 19));
        }
        SearchEditTextViewModel searchEditTextViewModel = this.LLILLJJLI;
        if (searchEditTextViewModel == null || (gv0 = searchEditTextViewModel.gv0()) == null) {
            return;
        }
        gv0.setValue(this.LJLJI);
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void Zl() {
        if (Hl() == 2) {
            this.LLILZ = true;
            C208398Fv capsuleWords = this.LLF.getCapsuleWords();
            T5T mSearchInputView = this.LJLJI;
            o.LJIIIIZZ(mSearchInputView, "mSearchInputView");
            C208338Fp.LIZJ(capsuleWords, mSearchInputView, this.LJLJL, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void cm() {
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        if (C1XY.LJJI(requireActivity) || Yl()) {
            super.cm();
        } else {
            requireActivity.finish();
        }
        C50988Jzk.LIZ(requireActivity);
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final String getEnterFrom() {
        String enterSearchFrom;
        C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
        if (c50948Jz6 == null || (enterSearchFrom = c50948Jz6.getEnterSearchFrom()) == null) {
            return "";
        }
        return enterSearchFrom;
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        OptimizerHelperServiceImpl.LJIIIZ().LJIIIIZZ(0L, -1, -2);
        ((LinkedHashMap) this.LLIZLLLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        T5T t5t = this.LJLJI;
        if (t5t != null && t5t.isFocused() && this.LJLJI.isCursorVisible()) {
            T5T mSearchInputView = this.LJLJI;
            o.LJIIIIZZ(mSearchInputView, "mSearchInputView");
            C78555UsJ.LJIILJJIL(mSearchInputView);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        EventBus LIZJ;
        super.onStart();
        if (!isRegisterEventBus() || (LIZJ = EventBus.LIZJ()) == null || LIZJ.LJI(this)) {
            return;
        }
        LIZJ.LJIILJJIL(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        EventBus LIZJ;
        super.onStop();
        if (!isRegisterEventBus() || (LIZJ = EventBus.LIZJ()) == null || !LIZJ.LJI(this)) {
            return;
        }
        LIZJ.LJIJ(this);
    }

    public final int ym() {
        EcSearchContainerFragment zm;
        if (zm() != null && (zm = zm()) != null) {
            if (C48054ItW.LIZ()) {
                C0CM c0cm = zm.LJLJJL;
                if (c0cm != null) {
                    return c0cm.getCurrentItem();
                }
            } else {
                VW3 vw3 = zm.LJLJJI;
                if (vw3 != null) {
                    return vw3.getCurrentItem();
                }
            }
        }
        return 0;
    }

    public final void Dm(boolean z) {
        ECSearchEntranceData eCSearchEntranceData;
        if (z) {
            C50948Jz6 LIZIZ = JTO.LIZIZ(mo49getActivity());
            if (!C51242K9e.LIZ() && KB1.LIZ(LIZIZ) != EnumC51280KAq.FASHION.getValue()) {
                IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
                C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
                if (c50948Jz6 != null) {
                    eCSearchEntranceData = c50948Jz6.getEcSearchEntranceData();
                } else {
                    eCSearchEntranceData = null;
                }
                if (!LJJJJZI.LJJJJ(eCSearchEntranceData)) {
                    ViewGroup viewGroup = this.LLILIL;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                    }
                    TextView textView = this.LJLJJL;
                    if (textView == null) {
                        return;
                    }
                    textView.setVisibility(8);
                    return;
                }
            }
            ViewGroup viewGroup2 = this.LLILIL;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            TextView textView2 = this.LJLJJL;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        ViewGroup viewGroup3 = this.LLILIL;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(8);
        }
        TextView textView3 = this.LJLJJL;
        if (textView3 == null) {
            return;
        }
        textView3.setVisibility(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r6.equals("homepage_hot") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r6.equals("discovery") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        if (r6.equals("homepage_friends") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r6.equals("homepage_follow") == false) goto L29;
     */
    @Override // X.InterfaceC50991Jzn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLLZZIL(X.K7D r9) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultFragmentNew.LLLZZIL(X.K7D):boolean");
    }

    public final void Mm(C51201K7p c51201K7p) {
        String str;
        String str2;
        if (Xl() || Yl()) {
            EcSearchStartViewModel ecSearchStartViewModel = this.LJLZ;
            if (ecSearchStartViewModel != null && ecSearchStartViewModel.LJLJJL) {
                str = "search_bar_inner";
            } else {
                str = "search_bar_outer";
            }
            if (C78857UxB.LJJJIL(c51201K7p.LIZIZ) && C78857UxB.LJJJIL(c51201K7p.LIZJ)) {
                K89 k89 = new K89();
                C50948Jz6 LIZIZ = JTO.LIZIZ(mo49getActivity());
                String str3 = "";
                if (LIZIZ == null || (str2 = LIZIZ.getEnterSearchFrom()) == null) {
                    str2 = "";
                }
                k89.LIZLLL("search_entrance", str2);
                k89.LJIILL("search_position", Kl());
                k89.LJIILL("words_position", String.valueOf((Object) 0));
                k89.LJIILL("words_source", str);
                String str4 = c51201K7p.LIZ;
                if (str4 == null) {
                    str4 = "";
                }
                k89.LJIILL("words_content", str4);
                String str5 = c51201K7p.LIZIZ;
                if (str5 == null) {
                    str5 = "";
                }
                k89.LJIILL("group_id", str5);
                String str6 = c51201K7p.LIZJ;
                if (str6 != null) {
                    str3 = str6;
                }
                k89.LJIILL("impr_id", str3);
                k89.LJIILL("rank", String.valueOf((Object) (-1)));
                Object obtainLogData = JTO.LIZ(mo49getActivity()).hv0().obtainLogData("tab_name");
                if (obtainLogData != null) {
                    k89.LJIIZILJ(obtainLogData);
                }
                k89.LJIILIIL();
            }
        }
        qm(c51201K7p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0171, code lost:
    
        if (r6.intValue() != 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Nm(int r8) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultFragmentNew.Nm(int):void");
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void Ol(String str) {
        this.LJLZ.LJZI.clear();
        this.LJLZ.LJZI.put("default_search_keyword", Long.valueOf(System.currentTimeMillis()));
        SearchStateViewModel searchStateViewModel = this.LJLLL;
        boolean z = true;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(true);
        }
        String charSequence = this.LJLJI.getHint().toString();
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(charSequence) && !Wl(charSequence)) {
            C51204K7s c51204K7s = new C51204K7s();
            c51204K7s.LJIILL("action_type", "click");
            c51204K7s.LJIILLIIL("default_search_keyword");
            c51204K7s.LJIILL("key_word", str);
            c51204K7s.LJIILL("key_word_type", "general_word");
            c51204K7s.LJIILIIL();
            str = charSequence;
        } else {
            z = false;
        }
        this.LLILZIL = z;
        Pl(str, z);
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void dm(boolean z) {
        TuxIconView tuxIconView;
        LinearLayout linearLayout;
        if (z) {
            if (!Hm() || (linearLayout = this.LJLIL) == null) {
                return;
            }
            linearLayout.setVisibility(0);
            return;
        }
        if (!Hm()) {
            return;
        }
        Context context = getContext();
        if (context != null && (tuxIconView = this.LJLJJI) != null) {
            C78596Usy.LJJJJLL((int) KL2.LIZJ(context, 40.0f), tuxIconView);
        }
        View view = this.LJLILLLLZI;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e7, code lost:
    
        if (r5.getEcomPromotionIcon() == null) goto L58;
     */
    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hm(boolean r11) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultFragmentNew.hm(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void lm(String str) {
        String str2;
        int ym = ym();
        if (ym == C51214K8c.LJI()) {
            str2 = "goods_search";
        } else if (ym == C51214K8c.LJII()) {
            str2 = "search_store";
        } else if (ym != C51214K8c.LIZLLL()) {
            return;
        } else {
            str2 = "search_ecom_live";
        }
        C51202K7q c51202K7q = new C51202K7q();
        c51202K7q.LJIILL("enter_method", str);
        c51202K7q.LJIILLIIL(str2);
        c51202K7q.LJIILIIL();
        C50833JxF.LIZ = System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        if (r5.getOriginIsMallTab() != null) goto L45;
     */
    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultFragmentNew.onCreate(android.os.Bundle):void");
    }

    @QD3
    public final void onInnerSearchEvent(C51194K7i innerSearchEvent) {
        o.LJIIIZ(innerSearchEvent, "innerSearchEvent");
        SearchStateViewModel searchStateViewModel = this.LJLLL;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(true);
        }
        fm(innerSearchEvent.LJLIL, false);
    }

    public final void sm(K7D k7d) {
        boolean z;
        String str;
        if (Hl() != 2 || K7J.LIZ(k7d)) {
            z = true;
        } else {
            z = false;
        }
        C51421KGb.LIZIZ("result_2_middle");
        if (z) {
            this.LJLZ.LJLIL = true;
        } else {
            this.LJLZ.LJLIL = false;
        }
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c50651JuJ.getClass();
        C50431Jql LJFF = C50651JuJ.LJFF(mo49getActivity);
        if (LJFF != null) {
            int i = K7F.LIZJ[k7d.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    str = "";
                } else {
                    str = "button";
                }
            } else {
                str = "swipe";
            }
            LJFF.setBlankPageEnterAction(str);
        }
        C17N.LJJJJJL(this).j4(new K7N(k7d));
        this.LLILZLL = true;
        hm(true);
        this.LJLJI.setText("");
        this.LJLJI.setSelection(0);
        Ll(z);
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void vl(View view) {
        o.LJIIIZ(view, "view");
        super.vl(view);
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void wl(SearchResultParam param) {
        Integer num;
        com.bytedance.ies.sdk.widgets.NextLiveData<C29615Bjn> nextLiveData;
        C51163K6d c51163K6d;
        C51244K9g c51244K9g;
        NextLiveData<Integer> hv0;
        o.LJIIIZ(param, "param");
        EcSearchStartViewModel ecSearchStartViewModel = this.LJLZ;
        if (ecSearchStartViewModel == null || (hv0 = ecSearchStartViewModel.hv0()) == null || (num = hv0.getValue()) == null) {
            num = -1;
        }
        num.intValue();
        if (C51379KEl.LIZ()) {
            if (param.isOpenNewSearchContainer()) {
                C50651JuJ c50651JuJ = C50652JuK.Companion;
                ActivityC45651qj mo49getActivity = mo49getActivity();
                c50651JuJ.getClass();
                C50431Jql LJFF = C50651JuJ.LJFF(mo49getActivity);
                if (LJFF != null) {
                    LJFF.setSearchLastShowPageIndex(0);
                }
            } else {
                int forceIndex = param.getForceIndex();
                if (forceIndex >= 0) {
                    C50651JuJ c50651JuJ2 = C50652JuK.Companion;
                    ActivityC45651qj mo49getActivity2 = mo49getActivity();
                    c50651JuJ2.getClass();
                    C50431Jql LJFF2 = C50651JuJ.LJFF(mo49getActivity2);
                    if (LJFF2 != null) {
                        LJFF2.setSearchLastShowPageIndex(forceIndex);
                    }
                }
            }
        } else {
            C50651JuJ c50651JuJ3 = C50652JuK.Companion;
            ActivityC45651qj mo49getActivity3 = mo49getActivity();
            c50651JuJ3.getClass();
            C50431Jql LJFF3 = C50651JuJ.LJFF(mo49getActivity3);
            if (LJFF3 != null) {
                LJFF3.setLastShowingPageIndex(0);
            }
            C50431Jql LJFF4 = C50651JuJ.LJFF(mo49getActivity());
            if (LJFF4 != null) {
                LJFF4.setSearchLastShowPageIndex(0);
            }
            C17N.LJJJJJL(this).j4(new C51178K6s());
            EcSearchTabViewModel ecSearchTabViewModel = K87.LIZ;
            if (ecSearchTabViewModel != null && (nextLiveData = ecSearchTabViewModel.LJLIL) != null) {
                nextLiveData.setValue(new C29615Bjn());
            }
        }
        if (this.LLILZIL && (c51163K6d = this.LJZI) != null && (c51244K9g = c51163K6d.LJIIIZ) != null) {
            param.setResultAttachCard(c51244K9g);
        }
    }

    public final void xm(boolean z) {
        NextLiveData<Boolean> iv0;
        if (z) {
            ViewGroup viewGroup = this.LLILIL;
            if (viewGroup != null) {
                viewGroup.setClickable(true);
            }
            EcSearchStartViewModel ecSearchStartViewModel = this.LJLZ;
            if (ecSearchStartViewModel != null && (iv0 = ecSearchStartViewModel.iv0()) != null && o.LJ(iv0.getValue(), Boolean.TRUE)) {
                TuxIconView tuxIconView = this.LLILII;
                if (tuxIconView != null) {
                    tuxIconView.setTintColorRes(R.attr.eb);
                    return;
                }
                return;
            }
            TuxIconView tuxIconView2 = this.LLILII;
            if (tuxIconView2 == null) {
                return;
            }
            tuxIconView2.setTintColorRes(R.attr.go);
            return;
        }
        ViewGroup viewGroup2 = this.LLILIL;
        if (viewGroup2 != null) {
            viewGroup2.setClickable(true);
        }
        TuxIconView tuxIconView3 = this.LLILII;
        if (tuxIconView3 == null) {
            return;
        }
        tuxIconView3.setTintColorRes(R.attr.go);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v95, types: [T, java.lang.String] */
    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew
    public final void fm(SearchResultParam param, boolean z) {
        boolean isEmpty;
        int i;
        boolean z2;
        String str;
        Integer num;
        String str2;
        NextLiveData<Integer> hv0;
        EcSearchContainerFragment zm;
        EcSearchContainerFragment zm2;
        int i2;
        C51188K7c c51188K7c;
        String str3;
        o.LJIIIZ(param, "param");
        this.LJLJLLL.LIZ();
        this.LLF = param;
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = param.getKeyword();
        if (!TextUtils.isEmpty(param.getRealSearchWord())) {
            c68322mC.element = param.getRealSearchWord();
        }
        String str4 = (String) c68322mC.element;
        if (TextUtils.isEmpty(str4)) {
            isEmpty = true;
        } else if (str4 != null) {
            int length = str4.length() - 1;
            int i3 = 0;
            boolean z3 = false;
            while (i3 <= length) {
                if (!z3) {
                    i = i3;
                } else {
                    i = length;
                }
                if (o.LJIIJJI(str4.charAt(i), 32) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z3) {
                    if (!z2) {
                        z3 = true;
                    } else {
                        i3++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            isEmpty = TextUtils.isEmpty(str4.subSequence(i3, length + 1).toString());
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (isEmpty) {
            str = null;
        } else {
            C10K.LIZIZ(new ACallableS57S0300000_8(param, c68322mC, this, 6), C10K.LJI, null);
            str = (String) c68322mC.element;
        }
        SearchResultParam searchResultParam = this.LLF;
        if (searchResultParam != null && !this.LLILLL && searchResultParam.getCapsuleWords() == null) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            if (C50988Jzk.LJ(requireActivity)) {
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS44S0100000_8(mo49getActivity(), 122), 500L);
            }
        }
        this.LJLLLLLL = str;
        if (TextUtils.isEmpty(str)) {
            if (z && (KL8.LIZ() == 1 || KL8.LIZ() == 3 || KL8.LIZ() == 4 || C51272KAi.LIZ())) {
                hm(false);
                T5T t5t = this.LJLJI;
                if (t5t != null) {
                    C78555UsJ.LJJIJIL(t5t, new AqS158S0100000_8(this, 573));
                }
                this.LJLLILLLL = false;
            }
            this.LJLJI.setText("");
            return;
        }
        K0D k0d = this.LLIIIL;
        if (k0d != null) {
            k0d.LIZ = param;
        }
        K5R k5r = this.LLIIIJ;
        if (k5r != null && (str3 = k5r.LJI) != null) {
            param.setRecreateTabName(str3);
        }
        super.fm(param, z);
        EcSearchStartViewModel ecSearchStartViewModel = this.LJLZ;
        if (ecSearchStartViewModel != null) {
            ecSearchStartViewModel.LJLJI = ecSearchStartViewModel.LJLILLLLZI;
        }
        OptimizerHelperServiceImpl.LJIIIZ().LJIIIIZZ(2000L, 4, 1);
        String mRealSearchWord = this.LJLLLLLL;
        o.LJIIIIZZ(mRealSearchWord, "mRealSearchWord");
        this.LLIZ = mRealSearchWord;
        String keywordToDisplay = param.getKeyword();
        om(2);
        o.LJIIIIZZ(keywordToDisplay, "keywordToDisplay");
        Context context = getContext();
        C208398Fv capsuleWords = this.LLF.getCapsuleWords();
        T5T mSearchInputView = this.LJLJI;
        o.LJIIIIZZ(mSearchInputView, "mSearchInputView");
        if (!C208338Fp.LJ(context, capsuleWords, mSearchInputView, this.LJLJL, null, false, new AqS190S0100000_8(this, 60), new AqS174S0100000_8(this, 205), 48)) {
            this.LJLJI.setText(keywordToDisplay);
        }
        param.setKeyword(this.LJLLLLLL);
        if (mo49getActivity() != null) {
            KFM kfm = EcSearchShopResultPreload.Companion;
            int LIZJ = C51214K8c.LIZJ(KAK.SHOP);
            K7U k7u = this.LLFF;
            if (k7u != null && (c51188K7c = k7u.LIZ.LLIIIILZ) != null) {
                i2 = c51188K7c.LIZIZ();
            } else {
                i2 = -1;
            }
            kfm.getClass();
            KFM.LIZJ(param, true, false, LIZJ, i2);
        }
        if (zm() != null) {
            EcSearchContainerFragment zm3 = zm();
            if (zm3 != null) {
                zm3.Al(param);
            }
            SearchResultParam searchResultParam2 = this.LLF;
            if (searchResultParam2 != null && searchResultParam2.isOpenNewSearchContainer()) {
                EcSearchContainerFragment zm4 = zm();
                if (zm4 != null) {
                    zm4.xl(0);
                }
            } else {
                int forceIndex = param.getForceIndex();
                if (forceIndex >= 0 && (zm2 = zm()) != null) {
                    zm2.xl(forceIndex);
                }
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putSerializable("search_param", param);
            EcSearchContainerFragment ecSearchContainerFragment = new EcSearchContainerFragment();
            ecSearchContainerFragment.setArguments(bundle);
            ecSearchContainerFragment.LJZL = new K7Z(this);
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LJIIJ(ecSearchContainerFragment, "Container", R.id.dm7);
            c1b3.LJII();
        }
        if (C78685UuP.LJJJZ(param.getSugHint())) {
            String landTap = param.getLandTap();
            o.LJIIIIZZ(landTap, "param.landTap");
            if (C51214K8c.LIZIZ(landTap) >= 0 && (zm = zm()) != null) {
                String landTap2 = param.getLandTap();
                o.LJIIIIZZ(landTap2, "param.landTap");
                zm.xl(C51214K8c.LIZIZ(landTap2));
            }
        }
        vm();
        EcSearchStartViewModel ecSearchStartViewModel2 = this.LJLZ;
        if (ecSearchStartViewModel2 == null || (hv0 = ecSearchStartViewModel2.hv0()) == null || (num = hv0.getValue()) == null) {
            num = -1;
        }
        Nm(num.intValue());
        KeyboardUtils.LIZIZ(this.LJLJI);
        C51170K6k c51170K6k = new C51170K6k();
        c51170K6k.LJIILL("enter_method", param.getSearchFrom());
        EcSearchStartViewModel ecSearchStartViewModel3 = this.LJLZ;
        if (ecSearchStartViewModel3 != null && ecSearchStartViewModel3.LJLJJLL != null) {
            str2 = "native";
        } else {
            str2 = null;
        }
        c51170K6k.LJIILL("fe_flag", str2);
        c51170K6k.LJIILIIL();
        if (C51210K7y.LIZ) {
            System.currentTimeMillis();
        }
        this.LLILLL = false;
        C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
        if (c50948Jz6 != null) {
            c50948Jz6.restEnterSearchPosition();
        }
        C50948Jz6 c50948Jz62 = JTO.LIZ(mo49getActivity()).LJLIL;
        if (c50948Jz62 != null) {
            c50948Jz62.setLastSearchPosition(null);
        }
        EcSearchStartViewModel ecSearchStartViewModel4 = this.LJLZ;
        if (ecSearchStartViewModel4 == null) {
            return;
        }
        ecSearchStartViewModel4.LJLILLLLZI = true;
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        TransitionSet transitionSet = new TransitionSet();
        Fade fade = new Fade();
        C51772KTo c51772KTo = new C51772KTo();
        c51772KTo.addTarget(R.id.isn);
        transitionSet.addTransition(c51772KTo);
        transitionSet.addTransition(fade);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setEnterTransition(transitionSet);
        }
        C36922EeM.LIZLLL(2, "SearchResultFragment", "initWindowTransition");
        o.LJIIIIZZ(view.getContext(), "view.context");
        TuxIconView tuxIconView = this.LJLJJI;
        if (tuxIconView != null) {
            C78897Uxp.LJJJJLI(tuxIconView, null);
        }
        ViewGroup viewGroup = this.LLILIL;
        if (viewGroup != null) {
            C78897Uxp.LJJJJLI(viewGroup, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View root = C16970lZ.LIZJ(R.layout.ap4, requireActivity(), viewGroup, false);
        o.LJIIIIZZ(root, "root");
        super.vl(root);
        try {
            ViewTreeLifecycleOwner.set(root, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(root, this);
            C10A.LIZIZ(root, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return root;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
