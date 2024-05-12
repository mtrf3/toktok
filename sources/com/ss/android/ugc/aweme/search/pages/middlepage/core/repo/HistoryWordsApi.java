package com.ss.android.ugc.aweme.search.pages.middlepage.core.repo;

import X.C10K;
import X.C221108m2;
import X.C53825LAn;
import X.C62822Ol8;
import X.E4T;
import X.InterfaceC195757mF;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.discover.model.suggest.TopHistoryWordsResponse;

/* loaded from: classes9.dex */
public final class HistoryWordsApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53825LAn.LJLIL);

    /* renamed from: com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.HistoryWordsApi$HistoryWordsApi, reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public interface InterfaceC0029HistoryWordsApi {
        @InterfaceC195757mF
        @E4T("/aweme/v1/search/top_history_words/")
        C10K<TopHistoryWordsResponse> getTopHistoryWords(@InterfaceC64987Pex("from_group_id") String str, @InterfaceC64987Pex("req_source") String str2, @InterfaceC64987Pex("need_top_history") Integer num, @InterfaceC64987Pex("history_list_v2") String str3, @InterfaceC64987Pex("top_history_words") String str4, @InterfaceC64987Pex("recent_del_history_words") String str5);
    }
}
