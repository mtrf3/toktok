package com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C29S;
import X.C3A5;
import X.C3C5;
import X.C50764Jw8;
import X.C76800UCe;
import X.C90903hW;
import X.FMX;
import X.IKR;
import X.InterfaceC57784Mm4;
import X.KI0;
import X.KI4;
import X.KIQ;
import X.QD3;
import X.SYL;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS9S1100000_8;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.choosemusic.sug.model.MusicSearchSugResponse;
import com.ss.android.ugc.aweme.choosemusic.sug.model.RecommendWordMob;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.SearchMusicBaseFragment;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.ChooseSearchMusicViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.MusicSugViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchMusicSugFragment extends SearchMusicBaseFragment implements KIQ {
    public static final /* synthetic */ int LJLL = 0;
    public MusicSugViewModel LJLJI;
    public RecommendWordMob LJLJL;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final ArrayList<SearchSugEntity> LJLJJI = new ArrayList<>();
    public final ArrayList<InterfaceC57784Mm4> LJLJJL = new ArrayList<>();
    public String LJLJJLL = "";
    public final AObserverS76S0100000_8 LJLJLJ = new AObserverS76S0100000_8(this, 40);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJLLL;
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

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        NextLiveData<C50764Jw8<MusicSearchSugResponse>> nextLiveData;
        super.onDestroyView();
        MusicSugViewModel musicSugViewModel = this.LJLJI;
        if (musicSugViewModel != null && (nextLiveData = musicSugViewModel.LJLIL) != null) {
            nextLiveData.removeObserver(this.LJLJLJ);
        }
    }

    @Override // X.KIQ
    public final void e4(int i) {
        ((SYL) _$_findCachedViewById(R.id.i04)).getState().LJIILIIL(i);
    }

    @QD3
    public final void onInputClickEvent(IKR event) {
        String str;
        SearchSugEntity next;
        String str2;
        Integer valueOf;
        o.LJIIIZ(event, "event");
        String str3 = this.LJLIL;
        Iterator<SearchSugEntity> it = this.LJLJJI.iterator();
        do {
            str = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                return;
            }
        } while (!TextUtils.equals(next.content, str3));
        KI4 ki4 = new KI4();
        ki4.LIZJ("words_source", "sug");
        ki4.LIZJ("search_position", "music_create");
        Word word = next.mWord;
        if (word != null && (valueOf = Integer.valueOf(word.getWordPosition())) != null) {
            ki4.LIZJ("words_position", GsonProtectorUtils.toJson(new Gson(), valueOf));
        }
        ki4.LIZJ("impr_id", this.LJLJJLL);
        ki4.LIZJ("raw_query", this.LJLIL);
        ki4.LIZJ("words_content", this.LJLIL);
        RecommendWordMob recommendWordMob = this.LJLJL;
        if (recommendWordMob != null) {
            str2 = recommendWordMob.getQueryId();
        } else {
            str2 = null;
        }
        ki4.LIZJ("query_id", str2);
        Word word2 = next.mWord;
        if (word2 != null) {
            str = word2.getId();
        }
        ki4.LIZJ("group_id", str);
        FMX.LJIIL("sug_input_click", ki4.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.SearchMusicBaseFragment
    public final void vl(String keyword) {
        KI0 state;
        o.LJIIIZ(keyword, "keyword");
        ChooseSearchMusicViewModel chooseSearchMusicViewModel = this.LJLILLLLZI;
        if (chooseSearchMusicViewModel != null && (state = chooseSearchMusicViewModel.getState()) != null && state.LJLJJI) {
            wl(keyword);
        }
    }

    public final void wl(String str) {
        KI0 state;
        ChooseSearchMusicViewModel chooseSearchMusicViewModel = this.LJLILLLLZI;
        if (chooseSearchMusicViewModel != null && (state = chooseSearchMusicViewModel.getState()) != null && 2 == state.LJLIL && !TextUtils.isEmpty(str)) {
            new Handler().postDelayed(new ARunnableS9S1100000_8(this, str, 0), 150L);
        }
    }

    @Override // X.KIQ
    public final void e2(int i, String str) {
        String LIZIZ = C3A5.LIZ.LIZIZ(this.LJLJJLL);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJIIIZ("log_pb", LIZIZ);
        c188727au.LJIIIZ("sug_keyword", this.LJLIL);
        c188727au.LJIIIZ("search_keyword", str);
        c188727au.LJIIIZ("search_type", "video_music");
        c188727au.LIZLLL(i, "order");
        FMX.LJIIL("search_sug", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.SearchMusicBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        NextLiveData<C50764Jw8<MusicSearchSugResponse>> nextLiveData;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            MusicSugViewModel musicSugViewModel = (MusicSugViewModel) ViewModelProviders.of(mo49getActivity).get(MusicSugViewModel.class);
            this.LJLJI = musicSugViewModel;
            if (musicSugViewModel != null && (nextLiveData = musicSugViewModel.LJLIL) != null) {
                nextLiveData.observe(mo49getActivity, this.LJLJLJ);
            }
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("key_word");
        } else {
            str = null;
        }
        this.LJLIL = str;
        ((RecyclerView) _$_findCachedViewById(R.id.i04)).setNestedScrollingEnabled(true);
        ((RecyclerView) _$_findCachedViewById(R.id.i04)).setItemAnimator(null);
        ((SYL) _$_findCachedViewById(R.id.i04)).LLLF.LJZL(SearchMusicSugCell.class, SearchMusicSugHistoryCell.class);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cg7, viewGroup, false);
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
}
