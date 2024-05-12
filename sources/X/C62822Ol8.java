package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.Ol8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62822Ol8<T> implements C5H3<T>, Serializable {
    public InterfaceC65784Pro<? extends T> LJLIL;
    public volatile Object LJLILLLLZI;
    public final Object LJLJI;

    private final Object writeReplace() {
        return new C68332mD(getValue());
    }

    @Override // X.C5H3
    public final T getValue() {
        T t;
        T t2 = (T) this.LJLILLLLZI;
        C62821Ol7 c62821Ol7 = C62821Ol7.LIZ;
        if (t2 != c62821Ol7) {
            return t2;
        }
        synchronized (this.LJLJI) {
            t = (T) this.LJLILLLLZI;
            if (t == c62821Ol7) {
                InterfaceC65784Pro<? extends T> interfaceC65784Pro = this.LJLIL;
                o.LJI(interfaceC65784Pro);
                t = interfaceC65784Pro.invoke();
                this.LJLILLLLZI = t;
                this.LJLIL = null;
            }
        }
        return t;
    }

    @Override // X.C5H3
    public final boolean isInitialized() {
        if (this.LJLILLLLZI != C62821Ol7.LIZ) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public C62822Ol8(InterfaceC65784Pro initializer) {
        o.LJIIIZ(initializer, "initializer");
        this.LJLIL = initializer;
        this.LJLILLLLZI = C62821Ol7.LIZ;
        this.LJLJI = this;
    }
}
