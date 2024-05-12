package com.ss.android.ugc.aweme.creatortools.creatorplus;

import X.A83;
import X.A84;
import X.AbstractC36908Ee8;
import X.AbstractC73672Svk;
import X.C221108m2;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73536StY;
import X.C73969T1h;
import X.T16;
import Y.AfS56S0100000_4;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CreatorPlusViewModel extends ViewModel {
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(A84.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(A83.LJLIL);

    public final void gv0() {
        AbstractC73672Svk<CreatorPlusFeaturesResponse> abstractC73672Svk;
        try {
            abstractC73672Svk = CreatorPlusApi.LIZ.getValue().getCreatorPlusFeatures();
        } catch (ExecutionException e) {
            AbstractC36908Ee8.getCompatibleException(e);
            abstractC73672Svk = C73536StY.LJLIL;
            o.LJIIIIZZ(abstractC73672Svk, "empty()");
        }
        this.LJLIL.LIZ(abstractC73672Svk.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, 7), new AfS56S0100000_4(this, 8)));
    }

    public final MutableLiveData<CreatorPlusFeaturesResponse> hv0() {
        return (MutableLiveData) this.LJLILLLLZI.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLIL.dispose();
    }
}
