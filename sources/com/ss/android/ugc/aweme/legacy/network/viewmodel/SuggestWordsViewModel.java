package com.ss.android.ugc.aweme.legacy.network.viewmodel;

import X.AbstractC73672Svk;
import X.C16880lQ;
import X.C221108m2;
import X.C33808DOq;
import X.C51627KNz;
import X.C62822Ol8;
import X.C73454SsE;
import X.C73969T1h;
import X.KO0;
import X.KO1;
import X.MJS;
import X.T16;
import Y.IDhS101S0100000_8;
import android.os.Looper;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.legacy.network.api.SuggestWordsApi;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes9.dex */
public final class SuggestWordsViewModel extends ViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(KO0.LJLIL);
    public C51627KNz LJLILLLLZI;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C51627KNz c51627KNz = this.LJLILLLLZI;
        if (c51627KNz != null) {
            if (!c51627KNz.isDisposed()) {
                c51627KNz.dispose();
            }
            this.LJLILLLLZI = null;
        }
    }

    public final void gv0(KO1 param, MJS mjs) {
        AbstractC73672Svk<SuggestWordResponse> fetchSuggestWords;
        o.LJIIIZ(param, "param");
        if (a.LJIIIZ().LIZJ()) {
            return;
        }
        C51627KNz c51627KNz = this.LJLILLLLZI;
        if (c51627KNz != null) {
            if (!c51627KNz.isDisposed()) {
                c51627KNz.dispose();
            }
            this.LJLILLLLZI = null;
        }
        AtomicBoolean atomicBoolean = SuggestWordsApi.LIZIZ;
        if (!atomicBoolean.get() && o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ()) && C33808DOq.LIZ()) {
            fetchSuggestWords = AbstractC73672Svk.LJJIJIL(1).LJJIII(new IDhS101S0100000_8(param, 1), false);
            o.LJIIIIZZ(fetchSuggestWords, "param: Param): Observabl…      }\n                }");
        } else {
            Object value = SuggestWordsApi.LIZ.getValue();
            o.LJIIIIZZ(value, "<get-S_API>(...)");
            SuggestWordsApi.SuggestApi suggestApi = (SuggestWordsApi.SuggestApi) value;
            String str = param.LIZ;
            String LJJIFFI = CommonFeedApiService.LIZ().LJJIFFI();
            if (LJJIFFI == null || LJJIFFI.length() == 0) {
                LJJIFFI = "";
            }
            fetchSuggestWords = suggestApi.fetchSuggestWords(str, LJJIFFI, param.LIZIZ, SearchServiceImpl.LLLZI().LLLLIIIILLL(), param.LIZJ);
            atomicBoolean.set(true);
        }
        o.LJIIIZ(fetchSuggestWords, "<this>");
        C73454SsE LJJJ = fetchSuggestWords.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
        C51627KNz c51627KNz2 = new C51627KNz(new AqS139S0200000_8(mjs, this, 25), new AqS139S0200000_8(mjs, this, 26));
        this.LJLILLLLZI = c51627KNz2;
        LJJJ.LIZ(c51627KNz2);
    }
}
