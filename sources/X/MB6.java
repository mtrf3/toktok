package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class MB6 implements MBD {
    public final InterfaceC48698J9i<?> key;

    @Override // X.MBD
    public InterfaceC48698J9i<?> getKey() {
        return this.key;
    }

    public MB6(InterfaceC48698J9i<?> key) {
        o.LJIIIZ(key, "key");
        this.key = key;
    }

    @Override // X.MBD, X.MBA
    public <E extends MBD> E get(InterfaceC48698J9i<E> interfaceC48698J9i) {
        return (E) MBC.LIZ(this, interfaceC48698J9i);
    }

    @Override // X.MBA
    public MBA minusKey(InterfaceC48698J9i<?> interfaceC48698J9i) {
        return MBC.LIZIZ(this, interfaceC48698J9i);
    }

    @Override // X.MBA
    public MBA plus(MBA context) {
        o.LJIIIZ(context, "context");
        return MBE.LIZ(this, context);
    }

    @Override // X.MBA
    public <R> R fold(R r, InterfaceC88471Ynr<? super R, ? super MBD, ? extends R> operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(r, this);
    }
}
