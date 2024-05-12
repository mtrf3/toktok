package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel;

import X.A2G;
import X.AbstractC73638SvC;
import X.AbstractC73946T0k;
import X.C221108m2;
import X.C3UR;
import X.C4VT;
import X.C61878OQg;
import X.C62822Ol8;
import X.C73467SsR;
import X.C73495Sst;
import X.C73542Ste;
import X.C76800UCe;
import X.C86993bD;
import X.InterfaceC106434Fr;
import X.InterfaceC106444Fs;
import X.InterfaceC67352kd;
import Y.AfS53S0100000_1;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.GiphyAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.model.GiphyDataBean;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.model.GiphyGifsResponse;
import java.util.List;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiphyViewModel extends ViewModel {
    public final InterfaceC106444Fs LJLIL;
    public final GiphyAnalytics LJLILLLLZI;
    public final InterfaceC106434Fr LJLJI;
    public final AbstractC73946T0k LJLJJI;
    public final MutableLiveData<Boolean> LJLJJL;
    public final MutableLiveData<Integer> LJLJJLL;
    public final MutableLiveData<Boolean> LJLJL;
    public final MutableLiveData<Throwable> LJLJLJ;
    public final MutableLiveData<List<GiphyDataBean>> LJLJLLL;
    public final MutableLiveData<C76800UCe> LJLL;
    public C73495Sst LJLLI;
    public Long LJLLILLLL;
    public AbstractC73638SvC<GiphyGifsResponse> LJLLJ;
    public C3UR LJLLL;
    public final C62822Ol8 LJLLLL;
    public final boolean LJLLLLLL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C73495Sst c73495Sst = this.LJLLI;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
    }

    public final void gv0(int i, InterfaceC67352kd interfaceC67352kd, boolean z) {
        if (z) {
            C73495Sst c73495Sst = this.LJLLI;
            if (c73495Sst != null) {
                c73495Sst.dispose();
            }
            this.LJLJJLL.postValue(0);
            this.LJLJL.postValue(Boolean.TRUE);
            this.LJLJLLL.postValue(C61878OQg.INSTANCE);
        }
        this.LJLLJ = this.LJLIL.LIZ(i);
        C73495Sst c73495Sst2 = this.LJLLI;
        if (c73495Sst2 != null && !c73495Sst2.isDisposed()) {
            return;
        }
        this.LJLLI = C73542Ste.LIZLLL(this.LJLLJ.LJJIIJ(this.LJLJJI).LJIIL(new AfS53S0100000_1(this, 76)), new C86993bD(this, SystemClock.elapsedRealtime(), interfaceC67352kd), new AqS132S0200000_1(this, (GiphyViewModel) interfaceC67352kd, (InterfaceC67352kd<? super A2G<Integer>>) 85));
    }

    public GiphyViewModel(InterfaceC106444Fs repo, GiphyAnalytics analytics, InterfaceC106434Fr delegate, AbstractC73946T0k io2) {
        o.LJIIIZ(repo, "repo");
        o.LJIIIZ(analytics, "analytics");
        o.LJIIIZ(delegate, "delegate");
        o.LJIIIZ(io2, "io");
        this.LJLIL = repo;
        this.LJLILLLLZI = analytics;
        this.LJLJI = delegate;
        this.LJLJJI = io2;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LJLJJL = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJJLL = mutableLiveData2;
        this.LJLJL = new MutableLiveData<>();
        this.LJLJLJ = new MutableLiveData<>();
        MutableLiveData<List<GiphyDataBean>> mutableLiveData3 = new MutableLiveData<>();
        this.LJLJLLL = mutableLiveData3;
        this.LJLL = new MutableLiveData<>();
        C73467SsR c73467SsR = C73467SsR.LJLIL;
        o.LJIIIIZZ(c73467SsR, "never()");
        this.LJLLJ = c73467SsR;
        this.LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 100));
        this.LJLLLLLL = C4VT.LIZIZ();
        mutableLiveData.setValue(Boolean.FALSE);
        mutableLiveData2.setValue(0);
        mutableLiveData3.setValue(C61878OQg.INSTANCE);
    }
}
