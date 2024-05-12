package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1b6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35961b6<T> extends C0OB {
    public T LIZJ;

    @Override // X.C0OB
    public final C0OB LIZIZ() {
        return new C35961b6(this.LIZJ);
    }

    public C35961b6(T t) {
        this.LIZJ = t;
    }

    @Override // X.C0OB
    public final void LIZ(C0OB value) {
        o.LJIIIZ(value, "value");
        this.LIZJ = ((C35961b6) value).LIZJ;
    }
}
