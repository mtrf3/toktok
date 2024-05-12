package com.bytedance.android.live.toolbar;

import X.C30268BuK;
import X.EnumC30255Bu7;
import X.OSZ;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TBViewModel extends ViewModel {
    public final MutableLiveData<Drawable> LJLIL = new MutableLiveData<>();
    public final MutableLiveData<String> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<String> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<OSZ<Double, Double>> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<Drawable> LJLJJL = new MutableLiveData<>();
    public final MutableLiveData<Float> LJLJJLL = new MutableLiveData<>();
    public final MutableLiveData<C30268BuK> LJLJL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJLJ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJLLL = new MutableLiveData<>();
    public final MutableLiveData<EnumC30255Bu7> LJLL = new MutableLiveData<>();
    public final MutableLiveData<String> LJLLI = new MutableLiveData<>();
    public final MutableLiveData<Drawable> LJLLILLLL = new MutableLiveData<>();

    public final void gv0(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL.removeObservers(lifecycleOwner);
        this.LJLILLLLZI.removeObservers(lifecycleOwner);
        this.LJLJI.removeObservers(lifecycleOwner);
        this.LJLJJI.removeObservers(lifecycleOwner);
        this.LJLJJL.removeObservers(lifecycleOwner);
        this.LJLJJLL.removeObservers(lifecycleOwner);
        this.LJLJL.removeObservers(lifecycleOwner);
        this.LJLJLJ.removeObservers(lifecycleOwner);
        this.LJLJLLL.removeObservers(lifecycleOwner);
        this.LJLL.removeObservers(lifecycleOwner);
        this.LJLLI.removeObservers(lifecycleOwner);
        this.LJLLILLLL.removeObservers(lifecycleOwner);
    }

    public final void hv0(boolean z, boolean z2) {
        this.LJLJL.setValue(new C30268BuK(z, z2));
    }
}
