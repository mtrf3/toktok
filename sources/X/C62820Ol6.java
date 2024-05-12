package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.Ol6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62820Ol6<T> implements C5H3<T>, Serializable {
    public InterfaceC65784Pro<? extends T> LJLIL;
    public Object LJLILLLLZI;

    private final Object writeReplace() {
        return new C68332mD(getValue());
    }

    @Override // X.C5H3
    public T getValue() {
        if (this.LJLILLLLZI == C62821Ol7.LIZ) {
            InterfaceC65784Pro<? extends T> interfaceC65784Pro = this.LJLIL;
            o.LJI(interfaceC65784Pro);
            this.LJLILLLLZI = interfaceC65784Pro.invoke();
            this.LJLIL = null;
        }
        return (T) this.LJLILLLLZI;
    }

    @Override // X.C5H3
    public boolean isInitialized() {
        if (this.LJLILLLLZI != C62821Ol7.LIZ) {
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

    public C62820Ol6(InterfaceC65784Pro<? extends T> initializer) {
        o.LJIIIZ(initializer, "initializer");
        this.LJLIL = initializer;
        this.LJLILLLLZI = C62821Ol7.LIZ;
    }
}
