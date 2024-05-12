package X;

import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.T0h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73943T0h {
    public static volatile C73943T0h LIZIZ;
    public final AbstractC73851Syd<Object> LIZ = new C73893SzJ().LJJZ();

    public static C73943T0h LIZ() {
        if (LIZIZ == null) {
            synchronized (C73943T0h.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C73943T0h();
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZIZ(Object obj) {
        this.LIZ.onNext(obj);
    }

    public final C73454SsE LJ(Class cls) {
        return this.LIZ.LJJJI(cls).LJJJ(C73969T1h.LIZIZ());
    }

    public final <T> InterfaceC29856Bng<T> LIZJ(LifecycleOwner lifecycleOwner, Class<T> cls) {
        return (InterfaceC29856Bng) this.LIZ.LJJJI(cls).LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LJ(lifecycleOwner));
    }

    public final <T> InterfaceC29856Bng<T> LIZLLL(LifecycleOwner lifecycleOwner, Class<T> cls, InterfaceC73592SuS<T> interfaceC73592SuS) {
        return (InterfaceC29856Bng) this.LIZ.LJJJI(cls).LJJIFFI(interfaceC73592SuS).LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LJ(lifecycleOwner));
    }
}
