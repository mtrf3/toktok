package X;

import kotlinx.coroutines.CompletedExceptionally;

/* renamed from: X.TAn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74209TAn {
    public static final <U, T extends U> Object LIZ(RunnableC74208TAm<U, ? super T> runnableC74208TAm, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super T>, ? extends Object> interfaceC88471Ynr) {
        Object completedExceptionally;
        Object LJJLIIIIJ;
        runnableC74208TAm.LJJIII(new T2Q(C1JD.LJFF(runnableC74208TAm.LJLJI.getContext()).invokeOnTimeout(runnableC74208TAm.LJLJJI, runnableC74208TAm, runnableC74208TAm.LJLILLLLZI)));
        boolean z = false;
        try {
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false, 2, null);
        }
        if (interfaceC88471Ynr != null) {
            C65777Prh.LJ(2, interfaceC88471Ynr);
            completedExceptionally = interfaceC88471Ynr.invoke(runnableC74208TAm, runnableC74208TAm);
            EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
            if (completedExceptionally == enumC58928NAu || (LJJLIIIIJ = runnableC74208TAm.LJJLIIIIJ(completedExceptionally)) == C84667XKt.LIZIZ) {
                return enumC58928NAu;
            }
            if (LJJLIIIIJ instanceof CompletedExceptionally) {
                Throwable th2 = ((CompletedExceptionally) LJJLIIIIJ).cause;
                if (!(th2 instanceof C74185T9p) || ((C74185T9p) th2).coroutine != runnableC74208TAm) {
                    z = true;
                }
                if (!z) {
                    if (completedExceptionally instanceof CompletedExceptionally) {
                        throw ((CompletedExceptionally) completedExceptionally).cause;
                    }
                } else {
                    throw th2;
                }
            } else {
                completedExceptionally = C84667XKt.LIZ(LJJLIIIIJ);
            }
            return completedExceptionally;
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }

    public static final <T> Object LIZIZ(long j, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super T>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super T> interfaceC67352kd) {
        if (j > 0) {
            return LIZ(new RunnableC74208TAm(j, interfaceC67352kd), interfaceC88471Ynr);
        }
        throw new C74185T9p("Timed out immediately");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.TAm, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object LIZJ(long r8, X.InterfaceC88471Ynr<? super X.InterfaceC70422pa, ? super X.InterfaceC67352kd<? super T>, ? extends java.lang.Object> r10, X.InterfaceC67352kd<? super T> r11) {
        /*
            boolean r0 = r11 instanceof X.C37347ElD
            if (r0 == 0) goto L21
            r7 = r11
            X.ElD r7 = (X.C37347ElD) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r1 = r7.LJLJI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L35
            if (r0 != r4) goto L2d
            X.2mC r3 = r7.LJLILLLLZI
            goto L27
        L21:
            X.ElD r7 = new X.ElD
            r7.<init>(r11)
            goto L12
        L27:
            X.C141335gf.LIZJ(r1)     // Catch: X.C74185T9p -> L2b
            goto L58
        L2b:
            r2 = move-exception
            goto L5a
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C141335gf.LIZJ(r1)
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L3f
            return r5
        L3f:
            X.2mC r3 = new X.2mC
            r3.<init>()
            r7.LJLIL = r10     // Catch: X.C74185T9p -> L59
            r7.LJLILLLLZI = r3     // Catch: X.C74185T9p -> L59
            r7.LJLJJI = r4     // Catch: X.C74185T9p -> L59
            X.TAm r0 = new X.TAm     // Catch: X.C74185T9p -> L59
            r0.<init>(r8, r7)     // Catch: X.C74185T9p -> L59
            r3.element = r0     // Catch: X.C74185T9p -> L59
            java.lang.Object r1 = LIZ(r0, r10)     // Catch: X.C74185T9p -> L59
            if (r1 != r6) goto L58
            return r6
        L58:
            return r1
        L59:
            r2 = move-exception
        L5a:
            X.V4o r1 = r2.coroutine
            T r0 = r3.element
            if (r1 != r0) goto L61
            return r5
        L61:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74209TAn.LIZJ(long, X.Ynr, X.2kd):java.lang.Object");
    }
}
