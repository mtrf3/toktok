package X;

import kotlin.jvm.internal.AqS153S0100000_3;

/* renamed from: X.7nP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196477nP<T> implements C5H3<T> {
    public final InterfaceC65784Pro<T> LJLIL;
    public T LJLILLLLZI;

    @Override // X.C5H3
    public final T getValue() {
        T t = this.LJLILLLLZI;
        if (t == null) {
            T invoke = this.LJLIL.invoke();
            this.LJLILLLLZI = invoke;
            return invoke;
        }
        return t;
    }

    @Override // X.C5H3
    public final boolean isInitialized() {
        if (this.LJLILLLLZI != null) {
            return true;
        }
        return false;
    }

    public C196477nP(AqS153S0100000_3 aqS153S0100000_3) {
        this.LJLIL = aqS153S0100000_3;
    }
}
