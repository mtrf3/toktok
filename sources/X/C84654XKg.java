package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.XKg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84654XKg<T> implements InterfaceC67352kd<T>, XLE {
    public static final AtomicReferenceFieldUpdater<C84654XKg<?>, Object> LJLILLLLZI = AtomicReferenceFieldUpdater.newUpdater(C84654XKg.class, Object.class, "result");
    public final InterfaceC67352kd<T> LJLIL;
    public volatile Object result;

    public final Object LIZ() {
        Object obj = this.result;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.UNDECIDED;
        if (obj == enumC58928NAu) {
            AtomicReferenceFieldUpdater<C84654XKg<?>, Object> atomicReferenceFieldUpdater = LJLILLLLZI;
            EnumC58928NAu enumC58928NAu2 = EnumC58928NAu.COROUTINE_SUSPENDED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC58928NAu, enumC58928NAu2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC58928NAu) {
                    obj = this.result;
                }
            }
            return EnumC58928NAu.COROUTINE_SUSPENDED;
        }
        if (obj == EnumC58928NAu.RESUMED) {
            return EnumC58928NAu.COROUTINE_SUSPENDED;
        }
        if (!(obj instanceof C3C4)) {
            return obj;
        }
        throw ((C3C4) obj).exception;
    }

    @Override // X.XLE
    public final XLE getCallerFrame() {
        InterfaceC67352kd<T> interfaceC67352kd = this.LJLIL;
        if (interfaceC67352kd instanceof XLE) {
            return (XLE) interfaceC67352kd;
        }
        return null;
    }

    @Override // X.InterfaceC67352kd
    public final MBA getContext() {
        return this.LJLIL.getContext();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SafeContinuation for ");
        LIZ.append(this.LJLIL);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C84654XKg(InterfaceC67352kd<? super T> interfaceC67352kd) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.UNDECIDED;
        this.LJLIL = interfaceC67352kd;
        this.result = enumC58928NAu;
    }

    @Override // X.InterfaceC67352kd
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC58928NAu enumC58928NAu = EnumC58928NAu.UNDECIDED;
            if (obj2 == enumC58928NAu) {
                AtomicReferenceFieldUpdater<C84654XKg<?>, Object> atomicReferenceFieldUpdater = LJLILLLLZI;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC58928NAu, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC58928NAu) {
                        break;
                    }
                }
                return;
            }
            EnumC58928NAu enumC58928NAu2 = EnumC58928NAu.COROUTINE_SUSPENDED;
            if (obj2 == enumC58928NAu2) {
                AtomicReferenceFieldUpdater<C84654XKg<?>, Object> atomicReferenceFieldUpdater2 = LJLILLLLZI;
                EnumC58928NAu enumC58928NAu3 = EnumC58928NAu.RESUMED;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC58928NAu2, enumC58928NAu3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != enumC58928NAu2) {
                        break;
                    }
                }
                this.LJLIL.resumeWith(obj);
                return;
            }
            throw new IllegalStateException("Already resumed");
        }
    }

    public C84654XKg(EnumC58928NAu enumC58928NAu, InterfaceC67352kd interfaceC67352kd) {
        this.LJLIL = interfaceC67352kd;
        this.result = enumC58928NAu;
    }
}
