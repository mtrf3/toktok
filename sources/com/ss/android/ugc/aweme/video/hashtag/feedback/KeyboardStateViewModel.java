package com.ss.android.ugc.aweme.video.hashtag.feedback;

import X.C16880lQ;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class KeyboardStateViewModel extends ViewModel {
    public final MutableLiveData<Boolean> LJLIL;
    public final MutableLiveData<Boolean> LJLILLLLZI;
    public boolean LJLJI;

    public KeyboardStateViewModel() {
        Boolean bool = Boolean.FALSE;
        this.LJLIL = new MutableLiveData<>(bool);
        this.LJLILLLLZI = new MutableLiveData<>(bool);
    }

    public final void runOnUiThread(Runnable runnable) {
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            runnable.run();
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(runnable);
        }
    }
}
