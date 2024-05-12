package X;

import fjb.a;
import kotlin.jvm.internal.o;

/* renamed from: X.3CS, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3CS extends a {
    public final MBA _context;
    public transient InterfaceC67352kd<Object> intercepted;

    @Override // fjb.a, X.InterfaceC67352kd
    public MBA getContext() {
        MBA mba = this._context;
        o.LJI(mba);
        return mba;
    }

    public final InterfaceC67352kd<Object> intercepted() {
        InterfaceC67352kd<Object> interfaceC67352kd = this.intercepted;
        if (interfaceC67352kd == null) {
            C3CQ c3cq = (C3CQ) getContext().get(C3CQ.LJJIJLIJ);
            if (c3cq == null || (interfaceC67352kd = c3cq.interceptContinuation(this)) == null) {
                interfaceC67352kd = this;
            }
            this.intercepted = interfaceC67352kd;
        }
        return interfaceC67352kd;
    }

    @Override // fjb.a
    public void releaseIntercepted() {
        InterfaceC67352kd<?> interfaceC67352kd = this.intercepted;
        if (interfaceC67352kd != null && interfaceC67352kd != this) {
            MBD mbd = getContext().get(C3CQ.LJJIJLIJ);
            o.LJI(mbd);
            ((C3CQ) mbd).releaseInterceptedContinuation(interfaceC67352kd);
        }
        this.intercepted = new InterfaceC67352kd<Object>() { // from class: X.3CT
            public final String toString() {
                return "This continuation is already complete";
            }

            @Override // X.InterfaceC67352kd
            public final MBA getContext() {
                "This continuation is already complete".toString();
                throw new IllegalStateException("This continuation is already complete");
            }

            @Override // X.InterfaceC67352kd
            public final void resumeWith(Object obj) {
                "This continuation is already complete".toString();
                throw new IllegalStateException("This continuation is already complete");
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3CS(X.InterfaceC67352kd<java.lang.Object> r2) {
        /*
            r1 = this;
            if (r2 == 0) goto La
            X.MBA r0 = r2.getContext()
        L6:
            r1.<init>(r2, r0)
            return
        La:
            r0 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3CS.<init>(X.2kd):void");
    }

    public C3CS(InterfaceC67352kd<Object> interfaceC67352kd, MBA mba) {
        super(interfaceC67352kd);
        this._context = mba;
    }
}
