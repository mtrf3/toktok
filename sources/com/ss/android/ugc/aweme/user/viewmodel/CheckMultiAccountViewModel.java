package com.ss.android.ugc.aweme.user.viewmodel;

import X.C47261Igj;
import X.RBW;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.util.List;

/* loaded from: classes5.dex */
public final class CheckMultiAccountViewModel extends ViewModel {
    public final MutableLiveData<List<SignificantUserInfo>> LJLIL;

    public CheckMultiAccountViewModel() {
        MutableLiveData<List<SignificantUserInfo>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.postValue(C47261Igj.LJJIJIIJI(RBW.LJIIJ(RBW.LJLLI.LIZJ()), new SignificantUserInfo("-1", null, null, null, null, null, 0L, 126, null)));
        this.LJLIL = mutableLiveData;
    }
}
