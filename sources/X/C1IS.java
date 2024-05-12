package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1IS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IS<T> extends C0OB {
    public InterfaceC44221oQ<? extends T> LIZJ;
    public int LIZLLL;

    @Override // X.C0OB
    public final C0OB LIZIZ() {
        return new C1IS(this.LIZJ);
    }

    public C1IS(InterfaceC44221oQ<? extends T> list) {
        o.LJIIIZ(list, "list");
        this.LIZJ = list;
    }

    @Override // X.C0OB
    public final void LIZ(C0OB value) {
        o.LJIIIZ(value, "value");
        synchronized (C0OG.LIZ) {
            this.LIZJ = ((C1IS) value).LIZJ;
            this.LIZLLL = ((C1IS) value).LIZLLL;
        }
    }

    public final void LIZJ(InterfaceC44221oQ<? extends T> interfaceC44221oQ) {
        o.LJIIIZ(interfaceC44221oQ, "<set-?>");
        this.LIZJ = interfaceC44221oQ;
    }
}
