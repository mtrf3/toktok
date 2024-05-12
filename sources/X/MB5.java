package X;

import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes10.dex */
public final class MB5 implements CoroutineExceptionHandler {
    public final AnonymousClass315 LJLIL = CoroutineExceptionHandler.LJJJJIZL;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA context, Throwable exception) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(exception, "exception");
    }

    @Override // X.MBD
    public final InterfaceC48698J9i<CoroutineExceptionHandler> getKey() {
        return this.LJLIL;
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
