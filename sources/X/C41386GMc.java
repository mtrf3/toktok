package X;

import Y.AObserverS60S0101000_5;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;

/* renamed from: X.GMc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41386GMc {
    public final String LIZ;
    public final LifecycleOwner LIZIZ;

    public final void LIZ(BOC boc) {
        String str = this.LIZ;
        final MutableLiveData mutableLiveData = new MutableLiveData();
        C60903NvH.LJIIJJI().getChallengeService().LIZ(str, new InterfaceC15040iS() { // from class: X.HZq
            @Override // X.InterfaceC15040iS
            public final void accept(Object obj) {
                MutableLiveData.this.setValue(C74413TIj.LIZLLL(EnumC74323TEx.SUCCESS, obj));
            }
        });
        mutableLiveData.observe(this.LIZIZ, new AObserverS60S0101000_5(1, boc, 2));
    }

    public C41386GMc(LifecycleOwner lifecycleOwner, String str) {
        this.LIZIZ = lifecycleOwner;
        this.LIZ = str;
    }
}
