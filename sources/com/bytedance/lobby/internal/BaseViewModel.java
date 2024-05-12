package com.bytedance.lobby.internal;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

/* loaded from: classes12.dex */
public abstract class BaseViewModel<T> extends AndroidViewModel {
    public final MutableLiveData<T> LJLIL;

    public BaseViewModel(Application application) {
        super(application);
        this.LJLIL = new MutableLiveData<>();
    }
}
