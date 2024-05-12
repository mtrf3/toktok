package com.ss.android.ugc.aweme.filter.view.internal.filterbox;

import X.C73495Sst;
import X.C73969T1h;
import X.C81287VvH;
import X.C81288VvI;
import X.EnumC81318Vvm;
import X.InterfaceC81323Vvr;
import X.InterfaceC81327Vvv;
import X.InterfaceC81328Vvw;
import X.OSZ;
import X.T16;
import X.WP0;
import Y.AfS66S0100000_14;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class FilterBoxViewModel extends HumbleViewModel implements InterfaceC81323Vvr {
    public final MutableLiveData<OSZ<EnumC81318Vvm, C81288VvI>> LJLIL;
    public C73495Sst LJLILLLLZI;
    public InterfaceC81327Vvv LJLJI;
    public final InterfaceC81328Vvw LJLJJI;

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC81323Vvr
    public final void g6() {
        InterfaceC81327Vvv interfaceC81327Vvv = this.LJLJI;
        if (interfaceC81327Vvv != null) {
            interfaceC81327Vvv.g6();
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C73495Sst c73495Sst = this.LJLILLLLZI;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
        this.LJLILLLLZI = null;
    }

    @Override // X.InterfaceC81323Vvr
    public final void refreshData() {
        C73495Sst c73495Sst = this.LJLILLLLZI;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        if (!isDestroyed()) {
            this.LJLIL.setValue(new OSZ<>(EnumC81318Vvm.LOADING, null));
            this.LJLILLLLZI = (C73495Sst) this.LJLJJI.edit().LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS66S0100000_14(this, 13), new AfS66S0100000_14(this, 14));
        }
    }

    @Override // X.InterfaceC81323Vvr
    public final void p10(C81287VvH filterBoxMeta) {
        o.LJIIIZ(filterBoxMeta, "filterBoxMeta");
        InterfaceC81327Vvv interfaceC81327Vvv = this.LJLJI;
        if (interfaceC81327Vvv != null) {
            interfaceC81327Vvv.j6(filterBoxMeta);
        }
    }

    @Override // X.InterfaceC81323Vvr
    public final void w60(C81287VvH filterBoxMeta) {
        o.LJIIIZ(filterBoxMeta, "filterBoxMeta");
        InterfaceC81327Vvv interfaceC81327Vvv = this.LJLJI;
        if (interfaceC81327Vvv != null) {
            interfaceC81327Vvv.h6(filterBoxMeta);
        }
    }

    public FilterBoxViewModel(WP0 wp0, InterfaceC81328Vvw interfaceC81328Vvw) {
        super(wp0);
        this.LJLJJI = interfaceC81328Vvw;
        this.LJLIL = new MutableLiveData<>();
    }
}
