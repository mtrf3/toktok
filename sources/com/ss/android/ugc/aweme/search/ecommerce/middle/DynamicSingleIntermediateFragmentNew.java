package com.ss.android.ugc.aweme.search.ecommerce.middle;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C199097rd;
import X.C252019un;
import X.C278817o;
import X.C34178DbC;
import X.C34444DfU;
import X.C34512Dga;
import X.C35339Dtv;
import X.C47261Igj;
import X.C48841JEv;
import X.C50106JlW;
import X.C50293JoX;
import X.C50294JoY;
import X.C50336JpE;
import X.C50433Jqn;
import X.C50645JuD;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50668Jua;
import X.C50684Juq;
import X.C50688Juu;
import X.C50699Jv5;
import X.C50723JvT;
import X.C50734Jve;
import X.C50766JwA;
import X.C50768JwC;
import X.C50770JwE;
import X.C50773JwH;
import X.C50774JwI;
import X.C50779JwN;
import X.C50783JwR;
import X.C50785JwT;
import X.C50788JwW;
import X.C50789JwX;
import X.C50790JwY;
import X.C50799Jwh;
import X.C50805Jwn;
import X.C50832JxE;
import X.C50843JxP;
import X.C50845JxR;
import X.C50948Jz6;
import X.C56642Ke;
import X.C5H3;
import X.C61282aq;
import X.C72818Shy;
import X.C76800UCe;
import X.C78613UtF;
import X.C78963Uyt;
import X.C84661XKn;
import X.DYB;
import X.DYD;
import X.EDL;
import X.IKP;
import X.IKS;
import X.InterfaceC50548Jse;
import X.InterfaceC50796Jwe;
import X.InterfaceC51113K4f;
import X.InterfaceC65784Pro;
import X.InterfaceC72822Si2;
import X.JTO;
import X.K4Q;
import X.K56;
import X.K75;
import X.KB1;
import X.ORZ;
import X.OSZ;
import X.Q7K;
import X.QD3;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.V16;
import X.ViewTreeObserverOnPreDrawListenerC50795Jwd;
import X.X1D;
import X.XKX;
import Y.AObserverS76S0100000_8;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.n;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TopHistoryWord;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.common.config.SearchIntermediateCardsConfig;
import com.ss.android.ugc.aweme.search.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SuggestWordsViewModel;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.TopHistoryWordsViewModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS75S1100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class DynamicSingleIntermediateFragmentNew extends AbstractSearchIntermediateFragmentNew implements GenericLifecycleObserver, InterfaceC72822Si2 {
    public C50799Jwh LLFFF;
    public SuggestWordsViewModel LLFII;
    public TopHistoryWordsViewModel LLFZ;
    public final Gson LLI;
    public int LLIFFJFJJ;
    public boolean LLII;
    public final String LLIIII;
    public boolean LLIIIILZ;
    public final CountDownLatch LLIIIJ;
    public C84661XKn LLIIIL;
    public final C5H3 LLIIIZ;
    public final AObserverS76S0100000_8 LLIIJI;
    public final AObserverS76S0100000_8 LLIIJLIL;

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onSearchHistoryChangedEvent(IKS event) {
        o.LJIIIZ(event, "event");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public DynamicSingleIntermediateFragmentNew() {
        new LinkedHashMap();
        this.LLI = GsonHolder.LIZLLL().LIZ();
        new Handler();
        this.LLIFFJFJJ = -1;
        this.LLII = true;
        this.LLIIII = C50293JoX.LJFF();
        this.LLIIIJ = new CountDownLatch(1);
        this.LLIIIZ = V16.LJJJJLL(C50785JwT.LJLIL);
        this.LLIIJI = new AObserverS76S0100000_8(this, 30);
        this.LLIIJLIL = new AObserverS76S0100000_8(this, 29);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        if (r16 == false) goto L33;
     */
    @Override // com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ml() {
        /*
            Method dump skipped, instructions count: 1307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.ecommerce.middle.DynamicSingleIntermediateFragmentNew.Ml():void");
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew
    public final boolean Ol() {
        InterfaceC50548Jse LIZ;
        Integer valueOf;
        K75 k75 = this.LLFF;
        if (k75 == null || (LIZ = k75.LIZ()) == null || (valueOf = Integer.valueOf(LIZ.LIZ())) == null) {
            return false;
        }
        if (valueOf.intValue() == 2) {
            if (Al().getVisibility() == 0) {
                Al().setVisibility(4);
            }
        } else if (valueOf.intValue() == 0) {
            if (Al().getVisibility() == 0) {
                Al().setVisibility(4);
            }
        } else if (valueOf.intValue() == 1 && xl().getVisibility() == 0) {
            xl().setVisibility(4);
        }
        return super.Ol();
    }

    public final void Rl() {
        C50805Jwn c50805Jwn;
        boolean z;
        boolean z2;
        ViewGroup viewGroup;
        C50799Jwh c50799Jwh = this.LLFFF;
        if (c50799Jwh != null) {
            ViewParent parent = c50799Jwh.LJIIJJI.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.removeAllViews();
            }
            C50799Jwh c50799Jwh2 = this.LLFFF;
            if (c50799Jwh2 != null) {
                Al().addView(c50799Jwh2.LJIIJJI, new ViewGroup.LayoutParams(-1, -1));
                List LIZ = SearchIntermediateCardsConfig.LIZ();
                DynamicData dynamicData = (DynamicData) ORZ.LJLLLLLL(0, LIZ);
                if (dynamicData != null) {
                    this.LLIFFJFJJ = C50106JlW.LIZ(dynamicData.dynamicPatch);
                }
                C50799Jwh c50799Jwh3 = this.LLFFF;
                if (c50799Jwh3 != null) {
                    c50799Jwh3.LIZLLL = new C50790JwY(this);
                    C50799Jwh c50799Jwh4 = this.LLFFF;
                    if (c50799Jwh4 != null) {
                        c50799Jwh4.LIZJ = new C50788JwW(this);
                        if (Vl()) {
                            C50799Jwh c50799Jwh5 = this.LLFFF;
                            if (c50799Jwh5 != null) {
                                C50770JwE callback = C50783JwR.LIZIZ;
                                o.LJIIIZ(callback, "callback");
                                c50799Jwh5.LJIIJ = callback;
                            } else {
                                o.LJIJI("dynamicViewsContainer");
                                throw null;
                            }
                        }
                        if (!LIZ.isEmpty()) {
                            DynamicPatch dynamicPatch = ((DynamicData) ListProtector.get(LIZ, 0)).dynamicPatch;
                            C34444DfU c34444DfU = C34444DfU.LJLILLLLZI;
                            if ((c34444DfU.LJJII() || C34178DbC.LJLILLLLZI.LJJII()) && !C50845JxR.LIZ()) {
                                dynamicPatch.setRawData(Sl(this, true, null, 2).toString());
                            }
                            if (Vl()) {
                                C50799Jwh c50799Jwh6 = this.LLFFF;
                                if (c50799Jwh6 != null) {
                                    c50805Jwn = c50799Jwh6.LJIILLIIL;
                                } else {
                                    o.LJIJI("dynamicViewsContainer");
                                    throw null;
                                }
                            } else {
                                c50805Jwn = null;
                            }
                            C50799Jwh c50799Jwh7 = this.LLFFF;
                            if (c50799Jwh7 != null) {
                                boolean LIZ2 = C50845JxR.LIZ();
                                if (c34444DfU.LJJII() || C34178DbC.LJLILLLLZI.LJJII()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (c34444DfU.LJJII() || C34178DbC.LJLILLLLZI.LJJII()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c50799Jwh7.LJI(dynamicPatch, null, LIZ2, z, z2, c50805Jwn);
                                return;
                            }
                            o.LJIJI("dynamicViewsContainer");
                            throw null;
                        }
                        return;
                    }
                    o.LJIJI("dynamicViewsContainer");
                    throw null;
                }
                o.LJIJI("dynamicViewsContainer");
                throw null;
            }
            o.LJIJI("dynamicViewsContainer");
            throw null;
        }
        o.LJIJI("dynamicViewsContainer");
        throw null;
    }

    public final boolean Vl() {
        return ((Boolean) this.LLIIIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        K75 k75;
        InterfaceC50548Jse LIZ;
        C50789JwX c50789JwX = C50768JwC.LIZIZ;
        if (c50789JwX != null && c50789JwX.LIZJ > 0) {
            c50789JwX.LJIIJ = System.currentTimeMillis();
        }
        super.onResume();
        C50789JwX c50789JwX2 = C50768JwC.LIZIZ;
        if (c50789JwX2 != null && c50789JwX2.LIZJ > 0 && c50789JwX2.LJIIJ > 0) {
            c50789JwX2.LJJ = System.currentTimeMillis() - c50789JwX2.LJIIJ;
        }
        if (C252019un.LIZ().LJJIJIIJIL() && (k75 = this.LLFF) != null && (LIZ = k75.LIZ()) != null && LIZ.LIZ() == 1) {
            if (Al().getChildCount() == 0) {
                Ml();
            }
            String jSONObject = C252019un.LIZ().LJJIZ(new JSONObject(), false).toString();
            o.LJIIIIZZ(jSONObject, "SearchCoinHelper.instanc…ject(), false).toString()");
            if (Vl()) {
                Wl("coin", new AqS75S1100000_8(this, jSONObject, 0));
            } else {
                C50799Jwh c50799Jwh = this.LLFFF;
                if (c50799Jwh != null) {
                    c50799Jwh.LIZJ(jSONObject);
                } else {
                    o.LJIJI("dynamicViewsContainer");
                    throw null;
                }
            }
        }
        if (this.LJLILLLLZI != null && Al().getChildCount() < 1 && Q7K.LIZIZ("reload_spark_view_when_middle_page_on_resume", 0) == 0) {
            Rl();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew
    public final void Nl() {
        xl().setVisibility(0);
        Al().setVisibility(4);
        super.Nl();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C84661XKn c84661XKn;
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        C72818Shy.LJII("event_claim_search_coin_task_success", this);
        if (Vl() && (c84661XKn = this.LLIIIL) != null) {
            c84661XKn.LIZIZ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C50768JwC.LIZIZ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.Map<?, ?>] */
    public final void Tl(HashMap<?, ?> hashMap) {
        HashMap<?, ?> hashMap2;
        Object obj;
        TemplateData LJ;
        C50433Jqn searchCommonModel;
        Integer valueOf;
        K75 k75;
        InterfaceC51113K4f LJI;
        SuggestWordResponse suggestWordResponse;
        List<String> list;
        List<String> list2;
        List<TypeWords> list3;
        TypeWords typeWords;
        List<Word> list4;
        String str;
        List<String> list5;
        C50699Jv5 c50699Jv5 = new C50699Jv5(this);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = Boolean.FALSE;
        linkedHashMap.put("isPreload", bool);
        linkedHashMap.put("isFromCache", bool);
        if (hashMap == null) {
            ?? r13 = c50699Jv5.LJ().LIZIZ().LJLILLLLZI;
            linkedHashMap.put("isCachedSuggestWords", 1);
            hashMap2 = r13;
        } else {
            c50699Jv5.LIZIZ(new C50684Juq(hashMap));
            linkedHashMap.put("isCachedSuggestWords", 0);
            hashMap2 = hashMap;
        }
        linkedHashMap.put("guessSearchData", hashMap2);
        if (hashMap2 != null) {
            obj = hashMap2.get("qrec_virtual_enable");
        } else {
            obj = null;
        }
        if (o.LJ(obj, "1")) {
            String LJI2 = C50293JoX.LJI();
            C50293JoX.LIZLLL(this.LLIIII, true);
            Map<String, C50294JoY> map = C50293JoX.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJI2);
            LIZ.append(this.LLIIII);
            C50294JoY c50294JoY = (C50294JoY) ((LinkedHashMap) map).get(X1D.LIZIZ(LIZ));
            if (c50294JoY != null && (list5 = c50294JoY.LJ) != null) {
                list5.clear();
            }
            try {
                suggestWordResponse = (SuggestWordResponse) GsonProtectorUtils.fromJson(this.LLI, GsonProtectorUtils.toJsonTree(this.LLI, hashMap2), SuggestWordResponse.class);
            } catch (n unused) {
                suggestWordResponse = null;
            }
            Map<String, C50294JoY> map2 = C50293JoX.LIZ;
            StringBuilder LIZJ = C278817o.LIZJ(LJI2);
            LIZJ.append(this.LLIIII);
            C50294JoY c50294JoY2 = (C50294JoY) ((LinkedHashMap) map2).get(LIZJ.toString());
            if (c50294JoY2 != null) {
                list = c50294JoY2.LJ;
                list2 = c50294JoY2.LJFF;
                if (suggestWordResponse != null) {
                    str = suggestWordResponse.logId;
                } else {
                    str = null;
                }
                c50294JoY2.LJI = str;
            } else {
                list = null;
                list2 = null;
            }
            if (suggestWordResponse != null && (list3 = suggestWordResponse.data) != null && (typeWords = (TypeWords) ORZ.LJLLLL(list3)) != null && (list4 = typeWords.words) != null) {
                for (Word word : list4) {
                    String word2 = word.getWord();
                    if (word2 != null) {
                        if (((Number) C50843JxP.LIZ.getValue()).intValue() != 1 && DYB.LIZ()) {
                            if (o.LJ(word.getShowPosition(), "UNDER_BOX")) {
                                if (list2 != null) {
                                    list2.add(word2);
                                }
                            } else if (list != null) {
                                list.add(word2);
                            }
                        } else if (list != null) {
                            list.add(word2);
                        }
                    }
                }
            }
            if (c50294JoY2 != null) {
                c50294JoY2.LJIILJJIL = System.currentTimeMillis();
                c50294JoY2.LJIILL = System.currentTimeMillis();
            }
        }
        linkedHashMap.put("latestGroupId", c50699Jv5.LIZLLL().LIZIZ().LJLJJI);
        linkedHashMap.put("totalPlayTime", Long.valueOf(c50699Jv5.LIZLLL().LIZIZ().LJLJLJ / 1000));
        linkedHashMap.put("hasEffectiveClick", Integer.valueOf(c50699Jv5.LIZLLL().LIZIZ().LJLJI ? 1 : 0));
        linkedHashMap.put("lastFromGroupId", this.LLIIII);
        linkedHashMap.put("new_sug_session_id", K56.LIZ(mo49getActivity()));
        K56.LJIIIIZZ(3);
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c50651JuJ.getClass();
        C50650JuI LJII = C50651JuJ.LJII(mo49getActivity);
        if (LJII != null && (searchCommonModel = LJII.getSearchCommonModel()) != null && (valueOf = Integer.valueOf(searchCommonModel.getFeedSearchBarFlag())) != null && valueOf.intValue() == 2 && ((k75 = this.LLFF) == null || (LJI = k75.LJI()) == null || !LJI.LJ())) {
            linkedHashMap.put("is_from_outside", 1);
        }
        try {
            C50799Jwh c50799Jwh = this.LLFFF;
            if (c50799Jwh != null) {
                String url = c50799Jwh.LJIIJJI.getUrl();
                if (url != null) {
                    HashMap hashMap3 = new HashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        Object value = entry.getValue();
                        if (value != null) {
                            hashMap3.put(entry.getKey(), value);
                        }
                    }
                    C50336JpE c50336JpE = C50336JpE.LJI;
                    C50799Jwh c50799Jwh2 = this.LLFFF;
                    if (c50799Jwh2 != null) {
                        LJ = C50336JpE.LIZ(c50336JpE, url, hashMap3, c50799Jwh2.LJIIJJI.getSparkContext());
                    } else {
                        o.LJIJI("dynamicViewsContainer");
                        throw null;
                    }
                } else {
                    LJ = TemplateData.LJ(linkedHashMap);
                }
                LJ.LIZLLL = "guessSearchDataProcess";
                if (Vl()) {
                    Wl("guess_search", new AqS155S0200000_8(this, LJ, 7));
                    return;
                }
                C50799Jwh c50799Jwh3 = this.LLFFF;
                if (c50799Jwh3 != null) {
                    c50799Jwh3.LJFF(LJ);
                    return;
                } else {
                    o.LJIJI("dynamicViewsContainer");
                    throw null;
                }
            }
            o.LJIJI("dynamicViewsContainer");
            throw null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @QD3
    public final void doRefreshMidPage(IKP managerSearchEvent) {
        o.LJIIIZ(managerSearchEvent, "managerSearchEvent");
        this.LLII = false;
        Ml();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew
    public final void initView(View view) {
        C50433Jqn searchCommonModel;
        InterfaceC50796Jwe LIZJ;
        K75 k75;
        InterfaceC50796Jwe LIZJ2;
        InterfaceC51113K4f LJI;
        ViewTreeObserver viewTreeObserver;
        o.LJIIIZ(view, "view");
        super.initView(view);
        OSZ LIZJ3 = C50766JwA.LIZJ();
        if (LIZJ3 == null) {
            if (mo49getActivity() != null) {
                requireActivity().finish();
                return;
            }
            return;
        }
        C50799Jwh c50799Jwh = (C50799Jwh) LIZJ3.getFirst();
        this.LLFFF = c50799Jwh;
        if (c50799Jwh != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50799Jwh.LJIIJJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (viewTreeObserver = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnPreDrawListener(ViewTreeObserverOnPreDrawListenerC50795Jwd.LJLIL);
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity == null) {
                return;
            }
            C50699Jv5 c50699Jv5 = new C50699Jv5(this);
            boolean z = C50723JvT.LIZ;
            if (z || C50779JwN.LIZ()) {
                SuggestWordsViewModel suggestWordsViewModel = (SuggestWordsViewModel) ViewModelProviders.of(mo49getActivity).get(SuggestWordsViewModel.class);
                if (z) {
                    suggestWordsViewModel.LJLJI.observe(mo49getActivity, this.LLIIJI);
                }
                if (Ql() && ((k75 = this.LLFF) == null || (LJI = k75.LJI()) == null || !LJI.LJ())) {
                    Word word = c50699Jv5.LIZLLL().LIZIZ().LJLJLLL;
                    K75 k752 = this.LLFF;
                    if (k752 != null && (LIZJ2 = k752.LIZJ()) != null) {
                        LIZJ2.LIZ(word);
                    }
                }
                C50652JuK.Companion.getClass();
                C50650JuI LJII = C50651JuJ.LJII(this);
                if (LJII != null && (searchCommonModel = LJII.getSearchCommonModel()) != null && !searchCommonModel.m23isFromComment() && !searchCommonModel.isFromVideoDetail() && !searchCommonModel.isFromFeedSearchBar()) {
                    boolean LJII2 = KB1.LJII(KB1.LIZ(JTO.LIZ(mo49getActivity()).LJLIL));
                    if ((!C50779JwN.LIZ() || searchCommonModel.getEnterFrom() == null || LJII2) && C34512Dga.LIZ) {
                        if (ORZ.LJLJJI(searchCommonModel.getEnterFrom(), C47261Igj.LJJIJIIJI("homepage_hot", "homepage_follow", "homepage_friends", "discovery", "homepage_nearby"))) {
                            K75 k753 = this.LLFF;
                            if (k753 != null && (LIZJ = k753.LIZJ()) != null) {
                                LIZJ.LIZIZ();
                            }
                            this.LLFII = suggestWordsViewModel;
                        }
                    }
                }
                suggestWordsViewModel.LJLIL.observe(mo49getActivity, this.LLIIJLIL);
                this.LLFII = suggestWordsViewModel;
            }
            if (DYD.LJFF() != 0) {
                this.LLFZ = (TopHistoryWordsViewModel) ViewModelProviders.of(mo49getActivity).get(TopHistoryWordsViewModel.class);
                return;
            }
            return;
        }
        o.LJIJI("dynamicViewsContainer");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C50789JwX c50789JwX = C50768JwC.LIZIZ;
        if (c50789JwX != null && c50789JwX.LIZJ > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            c50789JwX.LJII = currentTimeMillis;
            c50789JwX.LJIJI = currentTimeMillis - c50789JwX.LIZJ;
        }
        super.onCreate(bundle);
        EventBus.LIZJ().LJIILJJIL(this);
        C72818Shy.LIZLLL("event_claim_search_coin_task_success", this);
        C50789JwX c50789JwX2 = C50768JwC.LIZIZ;
        if (c50789JwX2 != null && c50789JwX2.LIZJ > 0 && c50789JwX2.LJII > 0) {
            c50789JwX2.LJIJJ = System.currentTimeMillis() - c50789JwX2.LJII;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r1 == true) goto L11;
     */
    @X.QD3(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDiscoverSearchEvent(X.IG6 r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L48
            boolean r0 = r6.LJLIL
            if (r0 != 0) goto L48
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            X.K75 r0 = r5.LLFF
            r4 = 0
            if (r0 == 0) goto L5a
            X.K4f r0 = r0.LJI()
            if (r0 == 0) goto L5a
            boolean r1 = r0.LJ()
            r0 = 1
            if (r1 != r0) goto L5a
        L1d:
            r2 = 0
            if (r0 == 0) goto L49
            java.lang.String r1 = "result"
        L22:
            java.lang.String r0 = "enter_from"
            r3.put(r0, r1)
            X.K75 r0 = r5.LLFF
            if (r0 == 0) goto L35
            X.6zp r0 = r0.LIZIZ()
            if (r0 == 0) goto L35
            int r4 = r0.LIZIZ()
        L35:
            java.lang.String r1 = X.C50605JtZ.LJFF(r4)
            java.lang.String r0 = "type"
            r3.put(r0, r1)
            X.Jwh r1 = r5.LLFFF
            if (r1 == 0) goto L5c
            java.lang.String r0 = "searchTransferQuit"
            r1.LIZ(r0, r3)
        L48:
            return
        L49:
            X.1qj r0 = r5.mo49getActivity()
            X.Jz6 r0 = X.JTO.LIZIZ(r0)
            if (r0 == 0) goto L58
            java.lang.String r1 = r0.getEnterSearchFrom()
            goto L22
        L58:
            r1 = r2
            goto L22
        L5a:
            r0 = 0
            goto L1d
        L5c:
            java.lang.String r0 = "dynamicViewsContainer"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.ecommerce.middle.DynamicSingleIntermediateFragmentNew.onDiscoverSearchEvent(X.IG6):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(C56642Ke event) {
        o.LJIIIZ(event, "event");
        if (o.LJ(event.LJLIL.get("eventName"), "SearchTransferFirstScreenFinished")) {
            C50645JuD.LIZ(System.currentTimeMillis());
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        if (o.LJ(c199097rd.LJLIL, "event_claim_search_coin_task_success")) {
            try {
                String jSONObject = new JSONObject().put("coinTask", "").toString();
                o.LJIIIIZZ(jSONObject, "JSONObject().put(\"coinTask\", \"\").toString()");
                C50734Jve LIZ = C252019un.LIZ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onReceiveJsEvent, claim success, coinData = ");
                LIZ2.append(jSONObject);
                LIZ.LJJIJLIJ(X1D.LIZIZ(LIZ2));
                C50799Jwh c50799Jwh = this.LLFFF;
                if (c50799Jwh != null) {
                    c50799Jwh.LIZJ(jSONObject);
                } else {
                    o.LJIJI("dynamicViewsContainer");
                    throw null;
                }
            } catch (Exception e) {
                C50734Jve LIZ3 = C252019un.LIZ();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("onReceiveJsEvent, exception info = ");
                LIZ4.append(C78963Uyt.LJIJJ(e));
                LIZ3.LJJIJLIJ(X1D.LIZIZ(LIZ4));
            }
        }
    }

    @QD3
    public final void onSparkViewLoadStatusEvent(C50774JwI event) {
        o.LJIIIZ(event, "event");
        if (!Vl() || this.LLIIIJ.getCount() == 0) {
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView = event.LJLIL;
        o.LJIIIZ(sparkView, "sparkView");
        if (o.LJ(((ConcurrentHashMap) C50783JwR.LIZ.getValue()).get(Integer.valueOf(sparkView.hashCode())), Boolean.TRUE)) {
            boolean LIZ = C50845JxR.LIZ();
            if (LIZ) {
                C50799Jwh c50799Jwh = this.LLFFF;
                if (c50799Jwh != null) {
                    if (!c50799Jwh.LJIIL) {
                        boolean z = !LIZ;
                        if (0 == 0 && !z) {
                            return;
                        }
                    }
                } else {
                    o.LJIJI("dynamicViewsContainer");
                    throw null;
                }
            }
            this.LLIIIJ.countDown();
        }
    }

    @QD3
    public final void onSugSessionEndEvent(C61282aq event) {
        o.LJIIIZ(event, "event");
        K4Q k4q = this.LJLJJI;
        if (k4q != null) {
            k4q.LJLL.clear();
            C50832JxE.LIZ = 0L;
            C50832JxE.LIZIZ = 0L;
            K4Q k4q2 = this.LJLJJI;
            if (k4q2 != null) {
                k4q2.LJLLJ.clear();
                k4q2.LJLLILLLL.clear();
                if (event.LJLIL == 3 && C50688Juu.LIZ != 0) {
                    C50688Juu.LIZIZ = System.currentTimeMillis();
                    C50688Juu.LIZ().LJIILIIL();
                    C50688Juu.LIZ = 0L;
                    C50688Juu.LIZIZ = 0L;
                    return;
                }
                return;
            }
            o.LJIJI("mSugPresenter");
            throw null;
        }
        o.LJIJI("mSugPresenter");
        throw null;
    }

    public final void Wl(String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C50799Jwh c50799Jwh = this.LLFFF;
        if (c50799Jwh != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView = c50799Jwh.LJIIJJI;
            o.LJIIIZ(sparkView, "sparkView");
            if (o.LJ(((ConcurrentHashMap) C50783JwR.LIZ.getValue()).get(Integer.valueOf(sparkView.hashCode())), Boolean.TRUE)) {
                interfaceC65784Pro.invoke();
                return;
            } else {
                this.LLIIIL = XKX.LIZIZ(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new EDL(this, interfaceC65784Pro, str, null), 3);
                return;
            }
        }
        o.LJIJI("dynamicViewsContainer");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        C50789JwX c50789JwX = C50768JwC.LIZIZ;
        if (c50789JwX != null && c50789JwX.LIZJ > 0) {
            c50789JwX.LJIIIZ = System.currentTimeMillis();
        }
        super.onViewCreated(view, bundle);
        C50789JwX c50789JwX2 = C50768JwC.LIZIZ;
        if (c50789JwX2 != null && c50789JwX2.LIZJ > 0 && c50789JwX2.LJIIIZ > 0) {
            c50789JwX2.LJIJJLI = System.currentTimeMillis() - c50789JwX2.LJIIIZ;
        }
    }

    public static JSONObject Sl(DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew, boolean z, AqS174S0100000_8 aqS174S0100000_8, int i) {
        List<TopHistoryWord> list;
        String LIZLLL;
        if ((i & 1) != 0) {
            z = false;
        }
        C76800UCe c76800UCe = null;
        if ((i & 2) != 0) {
            aqS174S0100000_8 = null;
        }
        dynamicSingleIntermediateFragmentNew.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        List<SearchHistory> vl = dynamicSingleIntermediateFragmentNew.vl();
        C50948Jz6 LIZIZ = JTO.LIZIZ(dynamicSingleIntermediateFragmentNew.mo49getActivity());
        C50773JwH LIZ = C50668Jua.LIZ(false);
        if (LIZ != null) {
            list = LIZ.LJI(vl);
        } else {
            list = null;
        }
        if (LIZIZ != null) {
            LIZIZ.getEnterSearchFrom();
        }
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                for (TopHistoryWord topHistoryWord : list) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("word", topHistoryWord.word);
                        jSONObject.put("is_top_word", topHistoryWord.isTopWord);
                        jSONObject.put("icon_type", topHistoryWord.iconType);
                        jSONObject.put("group_id", topHistoryWord.groupId);
                    } catch (Exception unused) {
                    }
                    jSONArray.put(jSONObject);
                }
                c76800UCe = C76800UCe.LIZ;
            }
        }
        if (c76800UCe == null) {
            for (SearchHistory searchHistory : ORZ.LLILLL(vl, 20)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("word", searchHistory.keyword);
                jSONArray.put(jSONObject2);
            }
        }
        if (aqS174S0100000_8 != null) {
            aqS174S0100000_8.invoke(Boolean.valueOf(vl.isEmpty()));
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("historyList", jSONArray);
            if (LIZ != null && (LIZLLL = LIZ.LIZLLL()) != null) {
                jSONObject3.put("historyTopWordLogId", LIZLLL);
            }
            if (AccountService.LJIJ().LJFF().isLogin()) {
                jSONObject3.put("isLogin", 1);
            } else {
                jSONObject3.put("isLogin", 0);
            }
            if (z && C34178DbC.LJLILLLLZI.LJJII() && !C50766JwA.LJ) {
                C50766JwA.LJ = true;
                jSONObject3.put("isFromCache", true);
                jSONObject3.put("guessSearchData", C35339Dtv.LIZ());
            }
        } catch (Exception unused2) {
        }
        new StringBuilder("getSearchHistory cost:").append(System.currentTimeMillis() - currentTimeMillis);
        return jSONObject3;
    }
}
