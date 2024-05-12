package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1h0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39621h0 extends QZV {
    public InterfaceC39651h3<?> LIZ;

    public C39621h0(InterfaceC39651h3<?> element) {
        o.LJIIIZ(element, "element");
        this.LIZ = element;
    }

    @Override // X.QZV
    public final boolean LJIIIIZZ(C00C<?> key) {
        o.LJIIIZ(key, "key");
        if (key == this.LIZ.getKey()) {
            return true;
        }
        return false;
    }

    @Override // X.QZV
    public final Object LJIIJ(C17R key) {
        o.LJIIIZ(key, "key");
        if (key == this.LIZ.getKey()) {
            return this.LIZ.getValue();
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }
}
