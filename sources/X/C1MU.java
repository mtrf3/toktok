package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

/* renamed from: X.1MU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1MU<CacheKey, T> implements C0TQ<Object> {
    public final LiveData<AbstractC19190p9<Object>> LIZ;
    public final MutableLiveData<C06900Ow> LIZIZ;
    public final MutableLiveData<C06900Ow> LIZJ;
    public final MutableLiveData<Boolean> LIZLLL;
    public final C73893SzJ<Object> LJ;
    public final C73893SzJ<Object> LJFF;
    public final C73893SzJ<Object> LJI;
    public final MutableLiveData<Integer> LJII;
    public final MutableLiveData<Boolean> LJIIIIZZ;
    public final InterfaceC006200s<CacheKey, T> LJIIIZ;
    public final CacheKey LJIIJ;

    public C1MU(C0YD<CacheKey, T> c0yd, LiveData<AbstractC19190p9<T>> liveData) {
        this.LIZIZ = c0yd.LIZ;
        this.LIZJ = c0yd.LIZIZ;
        this.LJIIIIZZ = c0yd.LIZJ;
        this.LJ = c0yd.LJ;
        this.LJFF = c0yd.LJFF;
        this.LJI = c0yd.LJI;
        this.LIZ = liveData;
        this.LIZLLL = c0yd.LIZLLL;
        this.LJII = c0yd.LJIIIZ;
        this.LJIIJ = c0yd.LJIIJJI;
        this.LJIIIZ = c0yd.LJIIL;
    }
}
