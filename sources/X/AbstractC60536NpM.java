package X;

import X.InterfaceC37737ErV;

/* renamed from: X.NpM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC60536NpM<T extends InterfaceC37737ErV> {
    public T mExtendable;
    public InterfaceC37736ErU mExtendableContext;

    public abstract AbstractC60629Nqr getExtension();

    public T getExtendable() {
        if (this.mExtendable == null) {
            this.mExtendable = (T) getExtension().LIZ();
        }
        return this.mExtendable;
    }

    public InterfaceC37736ErU getExtendableContext() {
        if (this.mExtendableContext == null) {
            this.mExtendableContext = getExtension().LJLIL;
        }
        return this.mExtendableContext;
    }
}
