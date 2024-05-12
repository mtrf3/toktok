package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WpL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83467WpL<I, O> implements InterfaceC83472WpQ {
    public final InterfaceC83472WpQ<I, O> LJLIL;

    @Override // X.InterfaceC83472WpQ
    public final String LIZIZ() {
        return this.LJLIL.LIZIZ();
    }

    public C83467WpL(InterfaceC83472WpQ<I, O> interfaceC83472WpQ) {
        this.LJLIL = interfaceC83472WpQ;
    }

    public final <R> C83467WpL<I, R> LIZJ(InterfaceC83472WpQ<O, R> action) {
        o.LJIIIZ(action, "action");
        return new C83467WpL<>(new C83468WpM(this, action));
    }

    public final <R> C83467WpL<I, R> LIZLLL(InterfaceC83472WpQ<C3C5<C83429Woj<O>>, R> action) {
        o.LJIIIZ(action, "action");
        return new C83467WpL<>(new C83469WpN(this, action));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC83472WpQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.bytedance.ies.actionai.jni.ExecutionContext r6, com.bytedance.ies.actionai.jni.ActionExecuteCallback r7, I r8, X.InterfaceC67352kd<? super X.C3C5<X.C83429Woj<O>>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C83466WpK
            if (r0 == 0) goto L35
            r4 = r9
            X.WpK r4 = (X.C83466WpK) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L3b
            X.C141335gf.LIZJ(r3)
            X.3C5 r3 = (X.C3C5) r3
            java.lang.Object r0 = r3.m15unboximpl()
        L26:
            return r0
        L27:
            X.C141335gf.LIZJ(r3)
            X.WpQ<I, O> r0 = r5.LJLIL
            r4.LJLJI = r1
            java.lang.Object r0 = r0.LIZ(r6, r7, r8, r4)
            if (r0 != r2) goto L26
            return r2
        L35:
            X.WpK r4 = new X.WpK
            r4.<init>(r5, r9)
            goto L12
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83467WpL.LIZ(com.bytedance.ies.actionai.jni.ExecutionContext, com.bytedance.ies.actionai.jni.ActionExecuteCallback, java.lang.Object, X.2kd):java.lang.Object");
    }
}
