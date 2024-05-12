package X;

import X.InterfaceC2301691o;

/* loaded from: classes6.dex */
public abstract class BY9<T extends InterfaceC2301691o> {
    public T mView;

    public void detachView() {
        this.mView = null;
    }

    public void attachView(T t) {
        this.mView = t;
    }
}
