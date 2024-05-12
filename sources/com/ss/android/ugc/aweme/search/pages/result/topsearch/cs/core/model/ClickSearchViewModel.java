package com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model;

import X.C10K;
import X.C16880lQ;
import X.C1DH;
import X.C221108m2;
import X.C36636EZk;
import X.C49069JNp;
import X.C50293JoX;
import X.C50764Jw8;
import X.C62822Ol8;
import X.C68182ly;
import X.C74422w2;
import X.C7MY;
import X.IM1;
import X.JO9;
import X.JP4;
import X.JP9;
import X.JPB;
import X.JPC;
import X.JPD;
import X.JPE;
import X.JPF;
import X.JWC;
import X.X1D;
import X.XKX;
import Y.ARunnableS20S0200000_1;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.SuggestWordsApi;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchResponse;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchWord;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes9.dex */
public final class ClickSearchViewModel extends ViewModel {
    public WeakReference<Fragment> LJLIL;
    public JP9 LJLJJL;
    public boolean LJLJL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(JPD.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(JPC.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(JPE.LJLIL);
    public Integer LJLJJLL = -1;

    public final NextLiveData<C49069JNp> hv0() {
        return (NextLiveData) this.LJLJI.getValue();
    }

    public final NextLiveData<JP4> iv0() {
        return (NextLiveData) this.LJLILLLLZI.getValue();
    }

    public final void reset() {
        iv0().setValue(new JP4(0));
        hv0().setValue(null);
    }

    public final void jv0(Observer<JP4> observer) {
        Fragment fragment;
        o.LJIIIZ(observer, "observer");
        WeakReference<Fragment> weakReference = this.LJLIL;
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            if (JWC.LIZ.enablePostValue) {
                C68182ly.LIZJ(iv0(), fragment, observer);
            } else {
                C68182ly.LIZIZ(iv0(), fragment, observer);
            }
        }
    }

    public final void kv0(int i) {
        C49069JNp value = hv0().getValue();
        if (value != null && value.LJLIL == i) {
            hv0().setValue(new C49069JNp(i, IM1.FINISHED));
        }
    }

    public final void lv0(Integer num) {
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            ((LiveData) this.LJLJJI.getValue()).setValue(num);
        } else if (JWC.LIZ.enablePostValue) {
            C1DH.LJJIJIIJI(new ARunnableS20S0200000_1(this, num, 21));
        } else {
            XKX.LJ(C36636EZk.LIZ, new C74422w2(this, num, null));
        }
    }

    public final void gv0(int i, int i2, Aweme aweme, String query) {
        int i3;
        Integer num;
        Integer valueOf;
        ClickSearchResponse clickSearchResponse;
        List<ClickSearchWord> list;
        C50764Jw8<ClickSearchResponse> c50764Jw8;
        ClickSearchResponse clickSearchResponse2;
        List<ClickSearchWord> list2;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(query, "query");
        hv0().setValue(new C49069JNp(i, IM1.DATA_FETCHING));
        String aid = aweme.getAid();
        JP4 value = iv0().getValue();
        if (value != null && (c50764Jw8 = value.LIZLLL) != null && (clickSearchResponse2 = c50764Jw8.LIZIZ) != null && (list2 = clickSearchResponse2.wordsList) != null) {
            i3 = list2.size();
        } else {
            i3 = 0;
        }
        Integer num2 = null;
        if (value != null && i3 > 0 && value.LIZ == i && o.LJ(value.LIZIZ, aid)) {
            StringBuilder LJ = C7MY.LJ("Data exists for Aweme #", i, ", (size=");
            C50764Jw8<ClickSearchResponse> c50764Jw82 = value.LIZLLL;
            if (c50764Jw82 != null && (clickSearchResponse = c50764Jw82.LIZIZ) != null && (list = clickSearchResponse.wordsList) != null) {
                num2 = Integer.valueOf(list.size());
            }
            LJ.append(num2);
            LJ.append(')');
            X1D.LIZIZ(LJ);
            o.LJIIIIZZ(aid, "aid");
            new JO9(i, this, aid, query, value.LIZLLL, false).invoke(hv0().getValue());
            return;
        }
        JPF jpf = new JPF();
        jpf.LIZJ = query;
        jpf.LIZLLL = aid;
        if (a.LJFF().LJJJJI()) {
            num = 1;
        } else {
            num = null;
        }
        jpf.LJIIIZ = num;
        if (i2 == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i2);
        }
        jpf.LJIIJ = valueOf;
        Object value2 = SuggestWordsApi.LIZ.getValue();
        o.LJIIIIZZ(value2, "<get-S_API>(...)");
        ((SuggestWordsApi.SuggestApi) value2).fetchClickSearchData(jpf.LIZJ, jpf.LIZLLL, C50293JoX.LJFF(), jpf.LJIIIZ, jpf.LJIIJ).LJ(new JPB(i, this, aid, query), C10K.LJIIIIZZ, null);
    }
}
