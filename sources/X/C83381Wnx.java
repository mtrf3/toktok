package X;

import androidx.lifecycle.MutableLiveData;

/* renamed from: X.Wnx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83381Wnx {
    public int LIZ;
    public final MutableLiveData<Boolean> LIZIZ;
    public final MutableLiveData LIZJ;

    public final synchronized boolean LIZ() {
        boolean z;
        if (this.LIZ != 0) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public final synchronized void LIZIZ() {
        int i = this.LIZ;
        if (i > 0) {
            this.LIZ = i - 1;
        }
        if (LIZ()) {
            this.LIZIZ.postValue(Boolean.TRUE);
        }
    }

    public C83381Wnx() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.TRUE);
        this.LIZIZ = mutableLiveData;
        this.LIZJ = mutableLiveData;
    }
}
