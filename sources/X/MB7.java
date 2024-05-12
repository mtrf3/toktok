package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MB7 implements MBD, InterfaceC48698J9i<MB7> {
    public static final MB7 LJLIL = new MB7();

    @Override // X.MBD
    public final InterfaceC48698J9i<?> getKey() {
        return this;
    }

    @Override // X.MBD, X.MBA
    public final <E extends MBD> E get(InterfaceC48698J9i<E> interfaceC48698J9i) {
        return (E) MBC.LIZ(this, interfaceC48698J9i);
    }

    @Override // X.MBA
    public final MBA minusKey(InterfaceC48698J9i<?> interfaceC48698J9i) {
        return MBC.LIZIZ(this, interfaceC48698J9i);
    }

    @Override // X.MBA
    public final MBA plus(MBA context) {
        o.LJIIIZ(context, "context");
        return MBE.LIZ(this, context);
    }

    @Override // X.MBA
    public final <R> R fold(R r, InterfaceC88471Ynr<? super R, ? super MBD, ? extends R> operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(r, this);
    }
}
