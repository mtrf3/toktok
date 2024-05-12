package kotlin;

import X.C5H3;
import X.C62821Ol7;
import X.C68332mD;
import X.InterfaceC65784Pro;
import X.XLU;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class SafePublicationLazyImpl<T> implements C5H3<T>, Serializable {
    public static final XLU Companion = new XLU();
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> valueUpdater = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    public volatile Object _value;

    /* renamed from: final, reason: not valid java name */
    public final Object f35final;
    public volatile InterfaceC65784Pro<? extends T> initializer;

    private final Object writeReplace() {
        return new C68332mD(getValue());
    }

    @Override // X.C5H3
    public T getValue() {
        T t = (T) this._value;
        C62821Ol7 c62821Ol7 = C62821Ol7.LIZ;
        if (t != c62821Ol7) {
            return t;
        }
        InterfaceC65784Pro<? extends T> interfaceC65784Pro = this.initializer;
        if (interfaceC65784Pro != null) {
            T invoke = interfaceC65784Pro.invoke();
            AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> atomicReferenceFieldUpdater = valueUpdater;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c62821Ol7, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c62821Ol7) {
                }
            }
            this.initializer = null;
            return invoke;
        }
        return (T) this._value;
    }

    @Override // X.C5H3
    public boolean isInitialized() {
        if (this._value != C62821Ol7.LIZ) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public SafePublicationLazyImpl(InterfaceC65784Pro<? extends T> initializer) {
        o.LJIIIZ(initializer, "initializer");
        this.initializer = initializer;
        C62821Ol7 c62821Ol7 = C62821Ol7.LIZ;
        this._value = c62821Ol7;
        this.f35final = c62821Ol7;
    }
}
