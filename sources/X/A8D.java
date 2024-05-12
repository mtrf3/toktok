package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.wallet.model.IapProductGetResult;

/* loaded from: classes5.dex */
public final class A8D implements InterfaceC77772Ufg {
    public final /* synthetic */ MutableLiveData<A8H> LJLIL;

    @Override // X.InterfaceC77772Ufg
    public final void LJIJ() {
    }

    @Override // X.InterfaceC77772Ufg
    public final void LJII() {
        this.LJLIL.postValue(A8K.LIZ);
    }

    public A8D(MutableLiveData<A8H> mutableLiveData) {
        this.LJLIL = mutableLiveData;
    }

    @Override // X.InterfaceC77772Ufg
    public final void LJIIJ(IapProductGetResult iapProductGetResult) {
        this.LJLIL.postValue(A8L.LIZ);
    }

    @Override // X.InterfaceC77772Ufg
    public final void LJIILIIL(IapProductGetResult iapProductGetResult) {
        this.LJLIL.postValue(new A8C(iapProductGetResult.data));
    }
}
