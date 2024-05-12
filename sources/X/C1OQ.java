package X;

import androidx.lifecycle.MutableLiveData;

/* renamed from: X.1OQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1OQ implements C0VZ {
    public final MutableLiveData<C0VY> LIZJ = new MutableLiveData<>();
    public final C43731nd<C1NO> LIZLLL = new C43731nd<>();

    public C1OQ() {
        LIZ(C0VZ.LIZIZ);
    }

    public final void LIZ(C0VY c0vy) {
        this.LIZJ.postValue(c0vy);
        if (c0vy instanceof C1NO) {
            this.LIZLLL.LJIIIIZZ(c0vy);
        } else {
            if (!(c0vy instanceof C1NM)) {
                return;
            }
            this.LIZLLL.LJIIIZ(((C1NM) c0vy).LIZ);
        }
    }
}
