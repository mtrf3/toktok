package X;

import kotlin.jvm.internal.AqS153S0100000_3;

/* renamed from: X.7za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C204027za<T> implements C5H3<T> {
    public final InterfaceC65784Pro<C5H3<T>> LJLIL;
    public C5H3<? extends T> LJLILLLLZI;

    @Override // X.C5H3
    public final T getValue() {
        T value;
        C5H3<? extends T> c5h3 = this.LJLILLLLZI;
        if (c5h3 == null || (value = c5h3.getValue()) == null) {
            C5H3<T> invoke = this.LJLIL.invoke();
            this.LJLILLLLZI = invoke;
            return invoke.getValue();
        }
        return value;
    }

    @Override // X.C5H3
    public final boolean isInitialized() {
        C5H3<? extends T> c5h3 = this.LJLILLLLZI;
        if (c5h3 != null) {
            return c5h3.isInitialized();
        }
        return false;
    }

    public C204027za(AqS153S0100000_3 aqS153S0100000_3, boolean z) {
        this.LJLIL = aqS153S0100000_3;
        if (!z) {
            this.LJLILLLLZI = (C5H3) aqS153S0100000_3.invoke();
        }
    }
}
