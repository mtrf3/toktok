package com.ss.android.ugc.aweme.pipfeed.components.single;

import X.C77357UXp;
import X.E4Y;
import X.JE6;
import X.JE7;
import X.OSZ;
import X.X1D;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ControlOverlayViewModel extends ViewModel {
    public JE6 LJLIL;
    public JE7 LJLILLLLZI;
    public final MutableLiveData<E4Y> LJLJI;
    public final MutableLiveData<E4Y> LJLJJI;
    public final MutableLiveData<E4Y> LJLJJL;
    public final MutableLiveData<E4Y> LJLJJLL;
    public final ControlOverlayViewModel$isPlaying$1 LJLJL;
    public final MutableLiveData<Float> LJLJLJ;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LJLIL = null;
        this.LJLILLLLZI = null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.pipfeed.components.single.ControlOverlayViewModel$isPlaying$1] */
    public ControlOverlayViewModel() {
        E4Y e4y = E4Y.VISIBLE;
        this.LJLJI = new MutableLiveData<>(e4y);
        this.LJLJJI = new MutableLiveData<>(e4y);
        this.LJLJJL = new MutableLiveData<>(e4y);
        this.LJLJJLL = new MutableLiveData<>(E4Y.GONE);
        this.LJLJL = new MutableLiveData<Boolean>() { // from class: com.ss.android.ugc.aweme.pipfeed.components.single.ControlOverlayViewModel$isPlaying$1
            {
                Boolean bool = Boolean.TRUE;
            }

            @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
            public void setValue(Boolean bool) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("isPlaying set to ");
                LIZ.append(bool);
                LIZ.append(" by ");
                LIZ.append(C77357UXp.LJIIIZ(new OSZ(4, 5)));
                String log = X1D.LIZIZ(LIZ);
                o.LJIIIZ(log, "log");
                super.setValue((ControlOverlayViewModel$isPlaying$1) bool);
            }
        };
        this.LJLJLJ = new MutableLiveData<>(Float.valueOf(0.0f));
    }
}
