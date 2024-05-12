package X;

import androidx.lifecycle.MutableLiveData;

/* renamed from: X.6uc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175466uc {
    public InterfaceC92693kP LIZ;
    public MutableLiveData<C175436uZ> LIZIZ;
    public boolean LIZJ;

    public final void LIZ(C175436uZ c175436uZ) {
        InterfaceC92693kP interfaceC92693kP = this.LIZ;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        MutableLiveData<C175436uZ> mutableLiveData = this.LIZIZ;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(c175436uZ);
        }
        this.LIZJ = false;
        this.LIZ = null;
        this.LIZIZ = null;
    }
}
