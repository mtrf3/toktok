package X;

import kotlin.jvm.internal.IDqS420S0100000;

/* renamed from: X.0zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25730zh {
    public InterfaceC65784Pro<? extends InterfaceC70422pa> LIZ = new IDqS420S0100000(this, 179);
    public InterfaceC70422pa LIZIZ;
    public C27C LIZJ;

    public final InterfaceC70422pa LIZLLL() {
        InterfaceC70422pa invoke = this.LIZ.invoke();
        if (invoke != null) {
            return invoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(long r6, X.InterfaceC67352kd<? super X.C23560wC> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.AnonymousClass279
            if (r0 == 0) goto L3d
            r4 = r8
            X.279 r4 = (X.AnonymousClass279) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L43
            X.C141335gf.LIZJ(r3)
        L20:
            X.0wC r3 = (X.C23560wC) r3
            long r1 = r3.LIZ
        L24:
            X.0wC r0 = new X.0wC
            r0.<init>(r1)
            return r0
        L2a:
            X.C141335gf.LIZJ(r3)
            X.27C r0 = r5.LIZJ
            if (r0 == 0) goto L3a
            r4.LJLJI = r1
            java.lang.Object r3 = r0.LIZLLL(r6, r4)
            if (r3 != r2) goto L20
            return r2
        L3a:
            long r1 = X.C23560wC.LIZIZ
            goto L24
        L3d:
            X.279 r4 = new X.279
            r4.<init>(r5, r8)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25730zh.LIZJ(long, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r10, long r12, X.InterfaceC67352kd<? super X.C23560wC> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof X.AnonymousClass278
            if (r0 == 0) goto L3f
            r8 = r14
            X.278 r8 = (X.AnonymousClass278) r8
            int r2 = r8.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r8.LJLJI = r2
        L12:
            java.lang.Object r3 = r8.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r8.LJLJI
            r0 = 1
            if (r1 == 0) goto L2a
            if (r1 != r0) goto L45
            X.C141335gf.LIZJ(r3)
        L20:
            X.0wC r3 = (X.C23560wC) r3
            long r1 = r3.LIZ
        L24:
            X.0wC r0 = new X.0wC
            r0.<init>(r1)
            return r0
        L2a:
            X.C141335gf.LIZJ(r3)
            X.27C r3 = r9.LIZJ
            if (r3 == 0) goto L3c
            r8.LJLJI = r0
            r4 = r10
            r6 = r12
            java.lang.Object r3 = r3.LIZ(r4, r6, r8)
            if (r3 != r2) goto L20
            return r2
        L3c:
            long r1 = X.C23560wC.LIZIZ
            goto L24
        L3f:
            X.278 r8 = new X.278
            r8.<init>(r9, r14)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25730zh.LIZ(long, long, X.2kd):java.lang.Object");
    }

    public final long LIZIZ(int i, long j, long j2) {
        C27C c27c = this.LIZJ;
        if (c27c != null) {
            return c27c.LIZJ(i, j, j2);
        }
        return C10370av.LIZIZ;
    }
}
