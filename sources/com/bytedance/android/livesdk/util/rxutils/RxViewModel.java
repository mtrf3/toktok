package com.bytedance.android.livesdk.util.rxutils;

import X.C73318Sq2;
import X.C73849Syb;
import X.EnumC29270BeE;
import android.util.Pair;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class RxViewModel extends ViewModel {
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public final C73849Syb<EnumC29270BeE> LJLILLLLZI = new C73849Syb<>();
    public final List<Pair<LiveData, Observer>> LJLJI = new ArrayList();

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.LJLIL.LIZLLL();
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((LiveData) pair.first).removeObserver((Observer) pair.second);
        }
        ((ArrayList) this.LJLJI).clear();
        this.LJLILLLLZI.onNext(EnumC29270BeE.DESTROY);
    }
}
