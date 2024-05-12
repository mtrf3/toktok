package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.viewmodel;

import X.C10K;
import X.C50764Jw8;
import X.C50890JyA;
import X.C50963JzL;
import Y.AgS125S0100000_8;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.repo.SearchMusicApi;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import yq4.a;

/* loaded from: classes9.dex */
public final class MusicTrendingViewModel extends ViewModel {
    public final NextLiveData<C50764Jw8<SuggestWordResponse>> LJLIL = new NextLiveData<>();

    public final void gv0() {
        Integer num;
        List<MusicSearchHistory> LIZLLL = C50890JyA.LJIIIZ().LIZLLL();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LIZLLL).iterator();
        while (it.hasNext()) {
            String str = ((MusicSearchHistory) it.next()).keyword;
            str.toString();
            arrayList.add(str);
        }
        String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), arrayList);
        SearchMusicApi.LIZ.getClass();
        SearchMusicApi searchMusicApi = C50963JzL.LIZIZ;
        if (a.LJFF().LJJJJI()) {
            num = 1;
        } else {
            num = null;
        }
        searchMusicApi.getTrendingWords(1, "music_create", json, "100011", num).LJ(new AgS125S0100000_8(this, 0), C10K.LJIIIIZZ, null);
    }
}
