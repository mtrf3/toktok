package X;

import kotlin.jvm.internal.o;

/* renamed from: X.200, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass200 implements InterfaceC39651h3<InterfaceC13080fI>, InterfaceC39641h2, InterfaceC13080fI {
    public static final C32471Pf LJLJJI = new InterfaceC13070fH() { // from class: X.1Pf
        @Override // X.InterfaceC13070fH
        public final void LIZ() {
        }
    };
    public final C32541Pm LJLIL;
    public final C10200ae LJLILLLLZI;
    public InterfaceC13080fI LJLJI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.InterfaceC39651h3
    public final InterfaceC13080fI getValue() {
        return this;
    }

    @Override // X.InterfaceC13080fI
    public final InterfaceC13070fH LIZ() {
        InterfaceC13070fH LIZ;
        final C10200ae c10200ae = this.LJLILLLLZI;
        if (c10200ae.LIZ.LJIIJJI()) {
            return new InterfaceC13070fH(c10200ae) { // from class: X.1Pg
                public final InterfaceC13070fH LIZ;
                public final C10190ad LIZIZ;
                public final /* synthetic */ C10200ae LIZLLL;

                @Override // X.InterfaceC13070fH
                public final void LIZ() {
                    C10200ae c10200ae2 = this.LIZLLL;
                    C10190ad interval = this.LIZIZ;
                    c10200ae2.getClass();
                    o.LJIIIZ(interval, "interval");
                    c10200ae2.LIZ.LJIIL(interval);
                    InterfaceC13070fH interfaceC13070fH = this.LIZ;
                    if (interfaceC13070fH != null) {
                        interfaceC13070fH.LIZ();
                    }
                    AnonymousClass160 anonymousClass160 = (AnonymousClass160) AnonymousClass200.this.LJLIL.LJIIJ.getValue();
                    if (anonymousClass160 != null) {
                        anonymousClass160.LJ();
                    }
                }

                {
                    InterfaceC13070fH interfaceC13070fH;
                    this.LIZLLL = c10200ae;
                    InterfaceC13080fI interfaceC13080fI = AnonymousClass200.this.LJLJI;
                    if (interfaceC13080fI != null) {
                        interfaceC13070fH = interfaceC13080fI.LIZ();
                    } else {
                        interfaceC13070fH = null;
                    }
                    this.LIZ = interfaceC13070fH;
                    C10190ad c10190ad = new C10190ad(c10200ae.LIZIZ(), c10200ae.LIZ());
                    c10200ae.LIZ.LIZLLL(c10190ad);
                    this.LIZIZ = c10190ad;
                }
            };
        }
        InterfaceC13080fI interfaceC13080fI = this.LJLJI;
        if (interfaceC13080fI != null && (LIZ = interfaceC13080fI.LIZ()) != null) {
            return LIZ;
        }
        return LJLJJI;
    }

    @Override // X.InterfaceC39651h3
    public final C17R<InterfaceC13080fI> getKey() {
        return C13100fK.LIZ;
    }

    @Override // X.InterfaceC39641h2
    public final void LLJI(C00E scope) {
        o.LJIIIZ(scope, "scope");
        this.LJLJI = (InterfaceC13080fI) scope.LJII(C13100fK.LIZ);
    }

    public AnonymousClass200(C32541Pm state, C10200ae c10200ae) {
        o.LJIIIZ(state, "state");
        this.LJLIL = state;
        this.LJLILLLLZI = c10200ae;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
