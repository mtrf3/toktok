package com.ss.android.ugc.aweme.legacy.network.api;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C53824LAm;
import X.C62822Ol8;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class SuggestWordsApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53824LAm.LJLIL);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    /* loaded from: classes9.dex */
    public interface SuggestApi {
        @E4Q("/aweme/v1/suggest/guide/")
        AbstractC73672Svk<SuggestWordResponse> fetchSuggestWords(@InterfaceC64989Pez("business_id") String str, @InterfaceC64989Pez("from_group_id") String str2, @InterfaceC64989Pez("pd") String str3, @InterfaceC64989Pez("history_list") String str4, @InterfaceC64989Pez("is_debug") String str5);
    }
}
