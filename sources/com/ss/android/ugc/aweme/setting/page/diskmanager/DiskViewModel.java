package com.ss.android.ugc.aweme.setting.page.diskmanager;

import X.ARN;
import X.C76800UCe;
import X.C94603nU;
import X.InterfaceC37286EkE;
import X.InterfaceC88472Yns;
import X.OSZ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class DiskViewModel extends ViewModel {
    public final MutableLiveData<Boolean> LJLIL;
    public final MutableLiveData<Integer> LJLILLLLZI;
    public final MutableLiveData<OSZ<Integer, InterfaceC88472Yns<ARN, C76800UCe>>> LJLJI;
    public final MutableLiveData<C94603nU> LJLJJI;
    public final List<InterfaceC37286EkE> LJLJJL;

    public DiskViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.FALSE);
        this.LJLIL = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(0);
        this.LJLILLLLZI = mutableLiveData2;
        this.LJLJI = new MutableLiveData<>();
        MutableLiveData<C94603nU> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(new C94603nU(0));
        this.LJLJJI = mutableLiveData3;
        this.LJLJJL = new ArrayList();
    }
}
