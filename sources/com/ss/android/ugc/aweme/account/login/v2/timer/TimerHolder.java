package com.ss.android.ugc.aweme.account.login.v2.timer;

import X.C69135RBj;
import android.app.Application;
import android.util.SparseArray;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MediatorLiveData;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TimerHolder extends AndroidViewModel {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final MediatorLiveData<SparseArray<Map<String, C69135RBj>>> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerHolder(Application app) {
        super(app);
        o.LJIIIZ(app, "app");
        this.LJLIL = new MediatorLiveData<>();
    }
}
