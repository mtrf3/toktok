package com.ss.android.ugc.aweme.filter.view.internal.main;

import X.C32I;
import X.C51029K0z;
import X.C73411SrX;
import X.C73674Svm;
import X.C73969T1h;
import X.EnumC82260WQe;
import X.InterfaceC65784Pro;
import X.InterfaceC74471TKp;
import X.InterfaceC82236WPg;
import Y.AfS64S0100000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FilterListViewStateViewModel extends HumbleViewModel implements InterfaceC74471TKp {
    public final MutableLiveData<Map<FilterBean, EnumC82260WQe>> LJLIL;
    public List<? extends FilterBean> LJLILLLLZI;
    public C73411SrX LJLJI;
    public final AfS64S0100000_12 LJLJJI;
    public final InterfaceC65784Pro<InterfaceC82236WPg> LJLJJL;

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C73411SrX c73411SrX = this.LJLJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLJI = null;
    }

    @Override // X.InterfaceC74471TKp
    public final MutableLiveData Fa0() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC74471TKp
    public final void no0(List<? extends FilterBean> list) {
        this.LJLILLLLZI = list;
        MutableLiveData<Map<FilterBean, EnumC82260WQe>> mutableLiveData = this.LJLIL;
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(next, this.LJLJJL.invoke().LJJIIZI(((FilterBean) next).getId()));
        }
        mutableLiveData.setValue(linkedHashMap);
        if ((!r8.isEmpty()) && !isDestroyed() && this.LJLJI == null) {
            this.LJLJI = (C73411SrX) this.LJLJJL.invoke().LJJJLIIL().LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(this.LJLJJI, C73674Svm.LIZLLL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FilterListViewStateViewModel(LifecycleOwner lifecycleOwner, InterfaceC65784Pro<? extends InterfaceC82236WPg> repository) {
        super(lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(repository, "repository");
        this.LJLJJL = repository;
        this.LJLIL = new MutableLiveData<>();
        this.LJLJJI = new AfS64S0100000_12(this, 26);
    }
}
