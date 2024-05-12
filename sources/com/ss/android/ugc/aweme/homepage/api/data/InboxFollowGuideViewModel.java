package com.ss.android.ugc.aweme.homepage.api.data;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes10.dex */
public final class InboxFollowGuideViewModel extends ViewModel {
    public static final /* synthetic */ int LJLJJI = 0;
    public final MutableLiveData<Boolean> LJLIL;
    public final MutableLiveData<Boolean> LJLILLLLZI;
    public final MutableLiveData<Boolean> LJLJI;

    public InboxFollowGuideViewModel() {
        Boolean bool = Boolean.FALSE;
        this.LJLIL = new MutableLiveData<>(bool);
        this.LJLILLLLZI = new MutableLiveData<>(bool);
        this.LJLJI = new MutableLiveData<>(bool);
    }
}
