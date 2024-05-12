package com.bytedance.android.live.core.paging.viewmodel;

import X.AbstractC19190p9;
import X.BTJ;
import X.C06900Ow;
import X.C0TQ;
import X.C1MU;
import X.EnumC06890Ov;
import Y.IDObserverS225S0100000;
import Y.IDObserverS9S0101000;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.util.rxutils.RxViewModel;

/* loaded from: classes.dex */
public class PagingViewModel<T> extends RxViewModel {
    public C0TQ<T> LJLL;
    public final MutableLiveData<C06900Ow> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<C06900Ow> LJLJJL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJJLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJL = new MutableLiveData<>();
    public final MutableLiveData<Integer> LJLJLJ = new MutableLiveData<>();
    public final MutableLiveData<AbstractC19190p9<T>> LJLJLLL = new MutableLiveData<>();
    public final IDObserverS225S0100000 LJLLI = new IDObserverS225S0100000(this, 10);
    public final IDObserverS9S0101000 LJLLILLLL = new IDObserverS9S0101000(0, this, 7);
    public final IDObserverS225S0100000 LJLLJ = new IDObserverS225S0100000(this, 11);
    public final IDObserverS9S0101000 LJLLL = new IDObserverS9S0101000(0, this, 8);
    public final IDObserverS9S0101000 LJLLLL = new IDObserverS9S0101000(0, this, 9);
    public final IDObserverS9S0101000 LJLLLLLL = new IDObserverS9S0101000(0, this, 10);

    public boolean gv0() {
        C0TQ<T> c0tq;
        if ((this.LJLJJL.getValue() != null && this.LJLJJL.getValue().LIZ == EnumC06890Ov.RUNNING) || (c0tq = this.LJLL) == null) {
            return false;
        }
        ((C1MU) c0tq).LJ.onNext(BTJ.LIZJ);
        return true;
    }

    public void retry() {
        C0TQ<T> c0tq = this.LJLL;
        if (c0tq != null) {
            ((C1MU) c0tq).LJFF.onNext(BTJ.LIZJ);
        }
    }

    public final void hv0(C0TQ<T> c0tq) {
        C0TQ<T> c0tq2 = this.LJLL;
        if (c0tq2 != null) {
            ((C1MU) c0tq2).LIZIZ.removeObserver(this.LJLLI);
            ((C1MU) this.LJLL).LIZJ.removeObserver(this.LJLLILLLL);
            ((C1MU) this.LJLL).LIZ.removeObserver(this.LJLLJ);
            ((C1MU) this.LJLL).LIZLLL.removeObserver(this.LJLLL);
            ((C1MU) this.LJLL).LJIIIIZZ.removeObserver(this.LJLLLL);
            ((C1MU) this.LJLL).LJII.removeObserver(this.LJLLLLLL);
        }
        this.LJLL = c0tq;
        if (c0tq != null) {
            ((C1MU) c0tq).LIZIZ.observeForever(this.LJLLI);
            ((C1MU) this.LJLL).LIZJ.observeForever(this.LJLLILLLL);
            ((C1MU) this.LJLL).LIZ.observeForever(this.LJLLJ);
            ((C1MU) this.LJLL).LIZLLL.observeForever(this.LJLLL);
            ((C1MU) this.LJLL).LJIIIIZZ.observeForever(this.LJLLLL);
            ((C1MU) this.LJLL).LJII.observeForever(this.LJLLLLLL);
        }
    }
}
