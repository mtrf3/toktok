package com.ss.android.ugc.aweme.ecommerce.search.sug.ui;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C214298b3;
import X.C37190Eig;
import X.C51246K9i;
import X.C51249K9l;
import X.C51260K9w;
import X.C51261K9x;
import X.C51266KAc;
import X.C51290KBa;
import X.C51307KBr;
import X.C55096Ljo;
import X.C55230Lly;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78866UxK;
import X.C78926UyI;
import X.C8YN;
import X.C9CW;
import X.C9XN;
import X.InterfaceC45601Hv3;
import X.InterfaceC50670Juc;
import X.InterfaceC65350Pko;
import X.K4W;
import X.K7B;
import X.KA0;
import X.KAC;
import X.KAD;
import X.KAN;
import X.KAU;
import X.KBP;
import X.KCA;
import X.KCO;
import X.QD3;
import X.RunnableC51616KNo;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.vm.EcSearchSugAssemVM;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.impl.OptimizerHelperServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.SearchMiddleForEcService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public final class EcSearchSugAssem extends UISlotAssem implements ISearchSugSubPageAbility {
    public final C214298b3 LJLJLLL;
    public RecyclerView LJLL;
    public final C5H3 LJLLI;
    public InterfaceC50670Juc LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLJ;
        Integer valueOf = Integer.valueOf(R.id.jhr);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.jhr)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.apb;
    }

    public EcSearchSugAssem() {
        C9XN c9xn = C9XN.LIZ;
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 72);
        C65776Prg LIZ = C65352Pkq.LIZ(EcSearchSugAssemVM.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9xn, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 71), C51290KBa.INSTANCE, aqS158S0100000_8);
        this.LJLLI = C78866UxK.LJJLIIIJLJLI(new AqS158S0100000_8(this, 70));
    }

    public final KBP H3() {
        return (KBP) this.LJLLI.getValue();
    }

    public final EcSearchSugAssemVM I3() {
        return (EcSearchSugAssemVM) this.LJLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void hide() {
        OptimizerHelperServiceImpl.LJIIIZ().LIZLLL();
        if (C51246K9i.LIZ != 0) {
            C51246K9i.LIZIZ = System.currentTimeMillis();
        }
        _$_findCachedViewById(R.id.jhr).setVisibility(8);
        ISearchSugContextAbility iSearchSugContextAbility = I3().LJLILLLLZI;
        if (iSearchSugContextAbility != null) {
            iSearchSugContextAbility.Kr0();
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        super.onCreateView();
        C8YN.LJIILLIIL(this, I3(), null, new AqS190S0100000_8(this, 46), 3);
        EcSearchSugAssemVM I3 = I3();
        ActivityC45651qj activityC45651qj = I3.LJLIL;
        if (activityC45651qj != null) {
            I3.LJLL = new C51266KAc(activityC45651qj, ViewModelKt.getViewModelScope(I3), new KA0(I3));
        }
        H3().LJLILLLLZI = new C51261K9x(this);
        H3().LJLJI = I3().hv0();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), this, ISearchSugSubPageAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugSubPageAbility
    public final void z2() {
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        String str5;
        KAN Vk0;
        KBP H3 = H3();
        ISearchSugContextAbility iSearchSugContextAbility = I3().LJLILLLLZI;
        if (iSearchSugContextAbility == null || (str = iSearchSugContextAbility.f1()) == null) {
            str = "";
        }
        String str6 = null;
        if (!o.LJ(str, H3.LJLJJL)) {
            return;
        }
        Iterator it = ((ArrayList) H3.LJLJJLL).iterator();
        while (it.hasNext()) {
            SearchSugEntity searchSugEntity = (SearchSugEntity) it.next();
            SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo != null && sugExtraInfo.matchQuery()) {
                EcSearchSugAssemVM I3 = I3();
                I3.getClass();
                ISearchSugContextAbility iSearchSugContextAbility2 = I3.LJLILLLLZI;
                if (iSearchSugContextAbility2 != null && (Vk0 = iSearchSugContextAbility2.Vk0()) != null) {
                    str2 = Vk0.LIZIZ;
                } else {
                    str2 = null;
                }
                ISearchSugContextAbility iSearchSugContextAbility3 = I3.LJLILLLLZI;
                if (iSearchSugContextAbility3 != null) {
                    str3 = iSearchSugContextAbility3.f1();
                } else {
                    str3 = null;
                }
                LogPbBean logPbBean = I3.LJLJLJ;
                RecommendWordMob recommendWordMob = I3.LJLJLLL;
                KCA kca = new KCA();
                Word word = searchSugEntity.mWord;
                if (word != null) {
                    num = Integer.valueOf(word.getWordPosition());
                } else {
                    num = null;
                }
                kca.LJIIZILJ(num);
                kca.LJIILL("words_source", "sug");
                kca.LJIILL("raw_query", str3);
                kca.LJIILL("words_content", searchSugEntity.content);
                if (logPbBean != null) {
                    str4 = logPbBean.getImprId();
                } else {
                    str4 = null;
                }
                kca.LJIILL("impr_id", str4);
                if (recommendWordMob != null) {
                    str5 = recommendWordMob.getQueryId();
                } else {
                    str5 = null;
                }
                kca.LJIILL("query_id", str5);
                Word word2 = searchSugEntity.mWord;
                if (word2 != null) {
                    str6 = word2.getId();
                }
                kca.LJIILL("group_id", str6);
                kca.LJIILL("search_position", str2);
                kca.LJIILIIL();
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final KAU Jc0() {
        return KAU.SUG;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void DV(SearchResultParam searchResultParam) {
        o.LJIIIZ(searchResultParam, "searchResultParam");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x013a, code lost:
    
        if (r8 != null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013a  */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ff(X.EnumC51268KAe r15) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.sug.ui.EcSearchSugAssem.Ff(X.KAe):void");
    }

    @QD3
    public final void onSugSessionEndEvent(C9CW event) {
        C51260K9w c51260K9w;
        o.LJIIIZ(event, "event");
        C51266KAc c51266KAc = I3().LJLL;
        if (c51266KAc != null && (c51260K9w = c51266KAc.LIZ) != null) {
            c51260K9w.LJLJJI.clear();
            KAD.LIZ = 0L;
            KAD.LIZIZ = 0L;
        }
        if (event.LJLIL == 3 && C51246K9i.LIZ != 0) {
            C51246K9i.LIZIZ = System.currentTimeMillis();
            ISearchSugContextAbility iSearchSugContextAbility = I3().LJLILLLLZI;
            if (iSearchSugContextAbility != null) {
                iSearchSugContextAbility.oC();
            }
        }
    }

    @Override // X.KCT
    public final void I1(KAU kau, KAU curPageState) {
        InterfaceC45601Hv3 interfaceC45601Hv3;
        KAC Yr0;
        o.LJIIIZ(curPageState, "curPageState");
        ISearchSugContextAbility iSearchSugContextAbility = I3().LJLILLLLZI;
        if (iSearchSugContextAbility == null || (Yr0 = iSearchSugContextAbility.Yr0()) == null || !Yr0.LIZJ) {
            KAU kau2 = KAU.RESULT;
            if (kau == kau2 && curPageState == KAU.SUG) {
                K4W.LIZJ = true;
            }
            if (kau == kau2) {
                K4W.LIZ();
            }
            if (curPageState == kau2) {
                C51307KBr.LIZ(1);
            }
        }
        if (curPageState == KAU.SUGGEST) {
            if (K7B.LJLILLLLZI.LJJII() && (getContext() instanceof InterfaceC45601Hv3)) {
                Object context = getContext();
                if ((context instanceof InterfaceC45601Hv3) && (interfaceC45601Hv3 = (InterfaceC45601Hv3) context) != null && KCO.LIZ(interfaceC45601Hv3.getInflater())) {
                    C37190Eig.LIZ.post(new RunnableC51616KNo(2, interfaceC45601Hv3));
                }
            }
            K4W.LIZJ = false;
            C51249K9l.LIZ(SearchMiddleForEcService.LJJJJLI(), C212428Vi.LIZ(this));
            EcSearchSugAssemVM I3 = I3();
            I3.getClass();
            I3.LJLJJI = "";
            ((ArrayList) H3().LJLJJLL).clear();
            C51307KBr.LIZ(3);
        }
    }
}
