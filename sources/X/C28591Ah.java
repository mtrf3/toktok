package X;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

/* renamed from: X.1Ah, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28591Ah implements Observer, InterfaceC024007o<LiveData<?>> {
    public final C024107p<LiveData<?>> LJLIL;
    public LifecycleOwner LJLILLLLZI;

    @Override // X.InterfaceC024007o
    public final void LIZ(MutableLiveData mutableLiveData) {
        LifecycleOwner lifecycleOwner = this.LJLILLLLZI;
        if (lifecycleOwner != null) {
            mutableLiveData.observe(lifecycleOwner, this);
        }
    }

    @Override // X.InterfaceC024007o
    public final void LIZIZ(LiveData<?> liveData) {
        liveData.removeObserver(this);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        C024107p<LiveData<?>> c024107p = this.LJLIL;
        ViewDataBinding viewDataBinding = (ViewDataBinding) c024107p.get();
        if (viewDataBinding == null) {
            c024107p.LIZ();
            return;
        }
        C024107p<LiveData<?>> c024107p2 = this.LJLIL;
        int i = c024107p2.LIZIZ;
        LiveData<?> liveData = c024107p2.LIZJ;
        if (viewDataBinding.LJLLL || !viewDataBinding.LJIIJJI(i, 0, liveData)) {
            return;
        }
        viewDataBinding.LJIILIIL();
    }

    @Override // X.InterfaceC024007o
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        LiveData<?> liveData = this.LJLIL.LIZJ;
        if (liveData != null) {
            if (this.LJLILLLLZI != null) {
                liveData.removeObserver(this);
            }
            if (lifecycleOwner != null) {
                liveData.observe(lifecycleOwner, this);
            }
        }
        this.LJLILLLLZI = lifecycleOwner;
    }

    public C28591Ah(ViewDataBinding viewDataBinding, int i) {
        this.LJLIL = new C024107p<>(viewDataBinding, i, this);
    }
}
