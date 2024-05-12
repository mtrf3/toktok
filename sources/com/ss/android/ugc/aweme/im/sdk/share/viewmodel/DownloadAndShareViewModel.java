package com.ss.android.ugc.aweme.im.sdk.share.viewmodel;

import X.C108724Om;
import X.C3WF;
import X.C3WG;
import X.C48841JEv;
import X.C61878OQg;
import X.C62387Oe7;
import X.C64962gm;
import X.C80893Fl;
import X.EnumC84123Rw;
import X.EnumC84133Rx;
import X.InterfaceC83893Qz;
import X.ORS;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import djb.IDaS20S0000000_1;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class DownloadAndShareViewModel extends ViewModel implements GenericLifecycleObserver, InterfaceC83893Qz {
    public final MutableLiveData<C62387Oe7> LJLIL;
    public final MutableLiveData<Boolean> LJLILLLLZI;
    public final MutableLiveData<Boolean> LJLJI;
    public final MutableLiveData<List<IMContact>> LJLJJI;
    public final MutableLiveData<IMContact> LJLJJL;
    public final MutableLiveData LJLJJLL;
    public final C64962gm LJLJL;
    public final SharePanelViewModel LJLJLJ;

    @Override // X.InterfaceC83893Qz
    public final void Ql(int i, int i2, boolean z) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC83893Qz
    public final void sz(long j, boolean z, int i, boolean z2, int i2) {
    }

    @Override // X.InterfaceC83893Qz
    public final void xN(Throwable e, List list) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(e, "e");
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C48841JEv.LIZJ(this.LJLJL, null);
        MutableLiveData<Boolean> mutableLiveData = this.LJLILLLLZI;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LJLJI.setValue(bool);
    }

    public DownloadAndShareViewModel(SharePackage sharePackage) {
        boolean z;
        o.LJIIIZ(sharePackage, "sharePackage");
        this.LJLIL = new MutableLiveData<>();
        Boolean bool = Boolean.FALSE;
        this.LJLILLLLZI = new MutableLiveData<>(bool);
        this.LJLJI = new MutableLiveData<>(bool);
        this.LJLJJI = new MutableLiveData<>();
        MutableLiveData<IMContact> mutableLiveData = new MutableLiveData<>(null);
        this.LJLJJL = mutableLiveData;
        this.LJLJJLL = mutableLiveData;
        this.LJLJL = C48841JEv.LIZ(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 10));
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        EnumC84123Rw enumC84123Rw = EnumC84123Rw.DOWNLOAD;
        int LIZ = C80893Fl.LIZ();
        C3WF.LIZ.getClass();
        EnumC84133Rx LIZ2 = C3WF.LIZ();
        if (C3WF.LIZ() != EnumC84133Rx.RECENT_SHARED) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJLJ = C3WG.LIZ(sharePackage, this, c61878OQg, enumC84123Rw, LIZ, LIZ2, true, z, false, false, null, null, 15872);
    }

    @Override // X.InterfaceC83893Qz
    public final void ks(List<? extends IMContact> list) {
        o.LJIIIZ(list, "list");
        this.LJLJJI.setValue(list);
    }

    @Override // X.InterfaceC83893Qz
    public final void nG(IMContact iMContact) {
        this.LJLJJL.setValue(iMContact);
    }

    @Override // X.InterfaceC83893Qz
    public final boolean HY(IMContact contact, boolean z) {
        o.LJIIIZ(contact, "contact");
        if (contact instanceof C108724Om) {
            this.LJLJI.setValue(Boolean.TRUE);
            return false;
        }
        return false;
    }

    public final void gv0(C62387Oe7 c62387Oe7, Context context) {
        if (c62387Oe7.LJFF) {
            ORS.LJJLIL(new AqS167S0100000_1(context, 180), c62387Oe7.LIZ);
        }
        this.LJLIL.setValue(c62387Oe7);
    }
}
