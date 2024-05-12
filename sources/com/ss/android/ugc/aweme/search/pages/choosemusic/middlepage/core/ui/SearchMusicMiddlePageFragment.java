package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C1799074g;
import X.C184077Kh;
import X.C188727au;
import X.C1EU;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C32I;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C47261Igj;
import X.C50764Jw8;
import X.C50890JyA;
import X.C51029K0z;
import X.C56412MCa;
import X.C57964Moy;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78524Uro;
import X.C78926UyI;
import X.C78T;
import X.C78V;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9CH;
import X.FMX;
import X.HJZ;
import X.InterfaceC1798974f;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC50894JyE;
import X.InterfaceC51059K2d;
import X.InterfaceC57784Mm4;
import X.InterfaceC65350Pko;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.K2F;
import X.K2G;
import X.K2H;
import X.K2J;
import X.K2L;
import X.K2N;
import X.K2O;
import X.K2Q;
import X.K2R;
import X.K2S;
import X.K2T;
import X.K2U;
import X.K2Z;
import X.K3D;
import X.KIJ;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.QD3;
import X.SYL;
import X.TBT;
import X.TBW;
import X.XVF;
import Y.AObserverS76S0100000_8;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.viewmodel.ChooseSearchMusicStateViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.model.TrendingWord;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.model.TrendingWordsStorageData;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.viewmodel.MusicTrendingViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.config.SearchUserFeedbackSettings;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchMusicMiddlePageFragment extends AmeBaseFragment implements InterfaceC50894JyE, KPL {
    public MusicTrendingViewModel LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final ArrayList<InterfaceC57784Mm4> LJLJJL;
    public final ArrayList<Word> LJLJJLL;
    public String LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public final int LJLL;
    public final AObserverS76S0100000_8 LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final String LJLIL = "tt_music_create_transfer_feedback_params";

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLILLLL;
        Integer valueOf = Integer.valueOf(R.id.i04);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.i04)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
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

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public SearchMusicMiddlePageFragment() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ChooseSearchMusicStateViewModel.class);
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 193);
        K2L k2l = K2L.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), k2l, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), k2l, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJI = c214298b3;
        this.LJLJJI = C221108m2.LIZIZ(KIJ.LJLIL);
        this.LJLJJL = new ArrayList<>();
        this.LJLJJLL = new ArrayList<>();
        this.LJLJL = "";
        this.LJLL = 4;
        this.LJLLI = new AObserverS76S0100000_8(this, 39);
    }

    public final ChooseSearchMusicStateViewModel vl() {
        return (ChooseSearchMusicStateViewModel) this.LJLJI.getValue();
    }

    public final void Al() {
        P5(C50890JyA.LJIIIZ().LIZLLL());
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        NextLiveData<C50764Jw8<SuggestWordResponse>> nextLiveData;
        super.onDestroyView();
        ChooseSearchMusicStateViewModel vl = vl();
        vl.getClass();
        vl.setState(new AqS174S0100000_8(vl, 213));
        List<WeakReference<InterfaceC50894JyE>> list = C50890JyA.LJIIIZ().LJLJJLL;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                if (reference != null && reference.get() == this) {
                    it.remove();
                }
            }
        }
        MusicTrendingViewModel musicTrendingViewModel = this.LJLILLLLZI;
        if (musicTrendingViewModel != null && (nextLiveData = musicTrendingViewModel.LJLIL) != null) {
            nextLiveData.removeObserver(this.LJLLI);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Al();
    }

    public final void wl() {
        int size = ((ArrayList) C50890JyA.LJIIIZ().LIZLLL()).size();
        if (size > 0) {
            C57964Moy.LJ(vl().gv0(), "show", C51029K0z.LJJIIZI(new OSZ("item_num", String.valueOf(size))));
        }
    }

    @Override // X.InterfaceC50894JyE
    public final void P5(List<? extends MusicSearchHistory> searchHistory) {
        o.LJIIIZ(searchHistory, "searchHistory");
        this.LJLJJL.clear();
        if (!K3D.LIZ()) {
            Iterator<? extends MusicSearchHistory> it = searchHistory.iterator();
            while (it.hasNext()) {
                this.LJLJJL.add(new K2F(it.next()));
                if (this.LJLJJL.size() >= Integer.MAX_VALUE) {
                    break;
                }
            }
            if (this.LJLJJL.size() >= 3) {
                this.LJLJJL.add(new K2Q());
            }
        } else {
            int i = 0;
            if (!this.LJLJLJ) {
                int min = Math.min(this.LJLL - 1, searchHistory.size() - 1);
                if (min >= 0) {
                    int i2 = 0;
                    while (true) {
                        this.LJLJJL.add(new K2G((MusicSearchHistory) ListProtector.get(searchHistory, i2)));
                        if (i2 == min) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (searchHistory.size() > this.LJLL) {
                    this.LJLJJL.add(new K2S());
                }
            } else {
                Iterator<? extends MusicSearchHistory> it2 = searchHistory.iterator();
                while (it2.hasNext()) {
                    this.LJLJJL.add(new K2G(it2.next()));
                }
                if (searchHistory.size() > this.LJLL) {
                    this.LJLJJL.add(new K2R());
                }
            }
            if (!this.LJLJJLL.isEmpty()) {
                this.LJLJJL.add(new K2U());
                Iterator<Word> it3 = this.LJLJJLL.iterator();
                while (it3.hasNext()) {
                    Word next = it3.next();
                    int i3 = i + 1;
                    if (i >= 0) {
                        this.LJLJJL.add(new K2N(next, i));
                        i = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                this.LJLJJL.add(new K2T());
            }
        }
        ((SYL) _$_findCachedViewById(R.id.i04)).getState().LJFF();
        ((SYL) _$_findCachedViewById(R.id.i04)).getState().LJ(this.LJLJJL);
    }

    @QD3
    public final void onExpandHistoryEvent(C78T event) {
        o.LJIIIZ(event, "event");
        this.LJLJLJ = true;
        Al();
        C57964Moy.LJ(vl().gv0(), "show_all", null);
    }

    @QD3
    public final void onMusicTrendingSugFeedbackEvent(C78V event) {
        String str;
        Map<String, String> schemaParams;
        o.LJIIIZ(event, "event");
        ArrayList<Word> arrayList = this.LJLJJLL;
        List<MusicSearchHistory> LIZLLL = C50890JyA.LJIIIZ().LIZLLL();
        String gv0 = vl().gv0();
        String str2 = this.LJLJL;
        ArrayList arrayList2 = new ArrayList();
        Iterator<Word> it = arrayList.iterator();
        while (it.hasNext()) {
            Word next = it.next();
            arrayList2.add(new TrendingWord(next.getWord(), next.getId()));
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(LIZLLL, 10));
        Iterator it2 = ((ArrayList) LIZLLL).iterator();
        while (it2.hasNext()) {
            arrayList3.add(((MusicSearchHistory) it2.next()).keyword);
        }
        try {
            Object LJI = GsonHolder.LIZLLL().LIZ().LJI(GsonHolder.LIZLLL().LIZ().LJIILL(new TrendingWordsStorageData(arrayList2, arrayList3, gv0, str2)), HashMap.class);
            o.LJIIIIZZ(LJI, "get().gson\n             …ta), HashMap::class.java)");
            Map LJJLIIIJLLLLLLLZ = C113554cx.LJJLIIIJLLLLLLLZ((Map) LJI);
            Context context = getContext();
            if (context != null) {
                C78524Uro.LIZ(context).LJIIIIZZ(LJJLIIIJLLLLLLLZ, this.LJLIL);
            }
            SearchUserFeedbackSettings.Feedback LIZ = SearchUserFeedbackSettings.LIZ("mc_transfer_page");
            if (LIZ == null || (str = LIZ.getSchema()) == null) {
                str = "";
            }
            if (str.length() == 0) {
                return;
            }
            String uri = UriProtector.parse(str).buildUpon().appendQueryParameter("search_type", "mc_transfer_page").build().toString();
            o.LJIIIIZZ(uri, "parse(url)\n            .…)\n            .toString()");
            Uri.Builder LIZIZ = C1EU.LIZIZ("aweme://webview/", "url", uri);
            SearchUserFeedbackSettings.Feedback LIZ2 = SearchUserFeedbackSettings.LIZ("mc_transfer_page");
            if (LIZ2 != null && (schemaParams = LIZ2.getSchemaParams()) != null) {
                for (Map.Entry<String, String> entry : schemaParams.entrySet()) {
                    LIZIZ.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            String uri2 = LIZIZ.build().toString();
            o.LJIIIIZZ(uri2, "parse(Constants.URL_WEB_…     }.build().toString()");
            SmartRouter.buildRoute(getContext(), uri2).open();
        } catch (Exception unused) {
        }
    }

    @QD3
    public final void onPostHistoryMobEvent(K2H event) {
        o.LJIIIZ(event, "event");
        C57964Moy.LJ(vl().gv0(), event.LJLIL, event.LJLILLLLZI);
    }

    @QD3
    public final void onPostTrendingClickEvent(C9CH event) {
        String str;
        o.LJIIIZ(event, "event");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", XVF.LJ);
        c188727au.LJIIIZ("impr_id", this.LJLJL);
        c188727au.LJIIIZ("search_entrance", XVF.LIZ);
        c188727au.LJIIIZ("search_position", vl().gv0());
        c188727au.LJIIIZ("words_source", "recom_search");
        c188727au.LJIIIIZZ(event.LJLIL);
        if (this.LJLJLLL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_cache", str);
        FMX.LJIIL("trending_words_click", c188727au.LIZ);
    }

    public final void xl(boolean z) {
        String str;
        String str2;
        this.LJLJLLL = z;
        if (!this.LJLJJLL.isEmpty()) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("creation_id", XVF.LJ);
            c188727au.LJIIIZ("impr_id", this.LJLJL);
            c188727au.LJIIIZ("search_entrance", XVF.LIZ);
            c188727au.LJIIIZ("search_position", vl().gv0());
            c188727au.LJIIIZ("words_source", "recom_search");
            c188727au.LIZLLL(this.LJLJJLL.size(), "words_num");
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("is_cache", str2);
            FMX.LJIIL("trending_show", c188727au.LIZ);
        }
        Iterator<Word> it = this.LJLJJLL.iterator();
        int i = 0;
        while (it.hasNext()) {
            Word next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                Word word = next;
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("creation_id", XVF.LJ);
                c188727au2.LJIIIZ("impr_id", this.LJLJL);
                c188727au2.LJIIIZ("search_entrance", XVF.LIZ);
                c188727au2.LJIIIZ("search_position", vl().gv0());
                c188727au2.LJIIIZ("words_source", "recom_search");
                c188727au2.LIZLLL(i, "words_position");
                c188727au2.LJIIIZ("words_content", word.getShowWord());
                c188727au2.LJIIIZ("group_id", word.getId());
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au2.LJIIIZ("is_cache", str);
                FMX.LJIIL("trending_words_show", c188727au2.LIZ);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        ActivityC45651qj mo49getActivity;
        NextLiveData<C50764Jw8<SuggestWordResponse>> nextLiveData;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C50890JyA LJIIIZ = C50890JyA.LJIIIZ();
        if (LJIIIZ.LJLJJLL == null) {
            LJIIIZ.LJLJJLL = new ArrayList();
        }
        ((ArrayList) LJIIIZ.LJLJJLL).add(new WeakReference(this));
        ((RecyclerView) _$_findCachedViewById(R.id.i04)).setNestedScrollingEnabled(true);
        ((RecyclerView) _$_findCachedViewById(R.id.i04)).setItemAnimator(null);
        ((SYL) _$_findCachedViewById(R.id.i04)).LLLF.LJZL(SearchMusicHistoryCell.class, SearchMusicHistoryCellNew.class, ClearSearchHistoryCell.class, ClearSearchHistoryCellNew.class, SearchMusicSugTitleCell.class, SearchMusicSugFeedbackCell.class, SearchMusicTrendingCell.class, ExpandSearchHistoryCell.class);
        if (K3D.LIZ()) {
            ((RecyclerView) _$_findCachedViewById(R.id.i04)).LJIIJ(new K2J());
        }
        K2O k2o = new K2O();
        k2o.LJIJI("change_music_page");
        if (K2Z.LIZ() != 0 && o.LJ(XVF.LIZ, "video_edit_page") && (((InterfaceC51059K2d) this.LJLJJI.getValue()).getLastSearchSoundPage() == HJZ.DISCOVER_PAGE || ((InterfaceC51059K2d) this.LJLJJI.getValue()).getLastSearchSoundPage() == HJZ.SEARCH_RES_PAGE)) {
            str = "return";
        } else {
            str = "enter";
        }
        k2o.LJIIZILJ("enter_method", str);
        String str2 = XVF.LIZ;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        k2o.LJ("search_entrance", str2, c1799074g);
        k2o.LJ("creation_id", XVF.LJ, c1799074g);
        k2o.LJIILIIL();
        Al();
        wl();
        if (K3D.LIZ() && (mo49getActivity = mo49getActivity()) != null) {
            if (isAdded()) {
                this.LJLILLLLZI = (MusicTrendingViewModel) ViewModelProviders.of(mo49getActivity).get(MusicTrendingViewModel.class);
            }
            MusicTrendingViewModel musicTrendingViewModel = this.LJLILLLLZI;
            if (musicTrendingViewModel != null && (nextLiveData = musicTrendingViewModel.LJLIL) != null) {
                nextLiveData.observe(mo49getActivity, this.LJLLI);
            }
            MusicTrendingViewModel musicTrendingViewModel2 = this.LJLILLLLZI;
            if (musicTrendingViewModel2 != null) {
                musicTrendingViewModel2.gv0();
            }
        }
        ((InterfaceC51059K2d) this.LJLJJI.getValue()).setLastSearchSoundPage(HJZ.SEARCH_SUG_PAGE);
        C8YN.LJII(this, vl(), new TBT() { // from class: X.K2K
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((K2M) obj).LJLIL);
            }
        }, null, new AqS190S0100000_8(this, 22), 6);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cg5, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
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
