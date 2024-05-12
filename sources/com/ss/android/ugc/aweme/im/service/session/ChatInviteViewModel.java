package com.ss.android.ugc.aweme.im.service.session;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes2.dex */
public abstract class ChatInviteViewModel extends ViewModel {
    public final MutableLiveData<Integer> LJLIL;
    public final MutableLiveData LJLILLLLZI;

    public abstract void gv0(String str);

    public ChatInviteViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(-1);
        this.LJLIL = mutableLiveData;
        this.LJLILLLLZI = mutableLiveData;
    }
}
