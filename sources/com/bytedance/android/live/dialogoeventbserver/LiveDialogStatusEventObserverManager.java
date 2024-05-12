package com.bytedance.android.live.dialogoeventbserver;

import X.C006900z;
import X.C0MB;
import X.C29602Bja;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveDialogStatusEventObserverManager extends ViewModel {
    public static final /* synthetic */ int LJLJJI = 0;
    public final LifecycleOwner LJLIL;
    public final C0MB<C29602Bja> LJLILLLLZI;
    public final MutableLiveData<C006900z> LJLJI;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLILLLLZI.LIZIZ();
    }

    public LiveDialogStatusEventObserverManager(Fragment lifecycleOwner, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = new C0MB<>();
        this.LJLJI = new MutableLiveData<>();
        dataChannel.lv0(lifecycleOwner, LiveDialogStatusChannel.class, new IDqS416S0100000(this, 0));
    }
}
