package com.ss.android.ugc.aweme.filter.view.internal.main;

import X.C73411SrX;
import X.C73674Svm;
import X.C73969T1h;
import X.InterfaceC65784Pro;
import X.InterfaceC74472TKq;
import X.InterfaceC82236WPg;
import X.InterfaceC82245WPp;
import X.InterfaceC88472Yns;
import X.TMC;
import X.WM7;
import Y.AfS64S0100000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public class FilterListViewSelectionViewModel extends HumbleViewModel implements InterfaceC74472TKq {
    public final MutableLiveData<FilterBean> LJLIL;
    public FilterBean LJLILLLLZI;
    public C73411SrX LJLJI;
    public final ArrayList<InterfaceC88472Yns<FilterBean, Boolean>> LJLJJI;
    public final InterfaceC65784Pro<InterfaceC82236WPg> LJLJJL;
    public final InterfaceC82245WPp LJLJJLL;

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

    @Override // X.InterfaceC74472TKq
    public final MutableLiveData Vr0() {
        return this.LJLIL;
    }

    public final void gv0(FilterBean filterBean) {
        InterfaceC82245WPp interfaceC82245WPp;
        this.LJLILLLLZI = null;
        this.LJLIL.setValue(filterBean);
        if (filterBean != null && (interfaceC82245WPp = this.LJLJJLL) != null) {
            interfaceC82245WPp.LIZIZ(filterBean, null);
        }
    }

    @Override // X.InterfaceC74472TKq
    public final void sw(FilterBean filterBean) {
        if (filterBean == null) {
            gv0(null);
        } else if (TMC.LJJIII(filterBean, this.LJLJJL.invoke())) {
            gv0(filterBean);
        } else {
            this.LJLILLLLZI = filterBean;
            ArrayList<InterfaceC88472Yns<FilterBean, Boolean>> arrayList = this.LJLJJI;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator<InterfaceC88472Yns<FilterBean, Boolean>> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().invoke(filterBean).booleanValue()) {
                        break;
                    }
                }
            }
            this.LJLJJL.invoke().LJIJJ(filterBean);
        }
        if (this.LJLILLLLZI != null && !isDestroyed() && this.LJLJI == null) {
            this.LJLJI = (C73411SrX) this.LJLJJL.invoke().LJJJLIIL().LJ(1000L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS64S0100000_12(this, LiveTryModeCountDownThresholdSetting.DEFAULT), C73674Svm.LIZLLL);
        }
    }

    public FilterListViewSelectionViewModel(WM7 wm7, InterfaceC65784Pro interfaceC65784Pro, InterfaceC82245WPp interfaceC82245WPp) {
        super(wm7);
        this.LJLJJL = interfaceC65784Pro;
        this.LJLJJLL = interfaceC82245WPp;
        this.LJLIL = new MutableLiveData<>();
        this.LJLJJI = new ArrayList<>();
    }
}
