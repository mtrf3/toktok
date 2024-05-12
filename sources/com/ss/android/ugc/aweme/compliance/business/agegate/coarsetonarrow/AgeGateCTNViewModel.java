package com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow;

import X.C16880lQ;
import X.T2A;
import Y.ARunnableS16S0101000_12;
import android.os.Handler;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.Date;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AgeGateCTNViewModel extends ViewModel {
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public final MutableLiveData<String> LJLIL = new MutableLiveData<>();
    public final MutableLiveData<Integer> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<Date> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJJI = new MutableLiveData<>(Boolean.FALSE);
    public int LJLJJL = -1;
    public int LJLJJLL = -1;
    public int LJLJL = -1;
    public T2A LJLLJ = T2A.RANGE1;
    public final Handler LJLLL = new Handler(C16880lQ.LLJJJJ());

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLLL.removeCallbacksAndMessages(null);
    }

    public final void gv0(int i) {
        this.LJLLL.postDelayed(new ARunnableS16S0101000_12(this, i, 0), 300L);
    }

    public final void hv0(T2A t2a) {
        o.LJIIIZ(t2a, "<set-?>");
        this.LJLLJ = t2a;
    }
}
