package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.27C, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27C implements InterfaceC39641h2, InterfaceC39651h3<C27C>, InterfaceC25720zg {
    public final C25730zh LJLIL;
    public final InterfaceC25720zg LJLILLLLZI;
    public final ParcelableSnapshotMutableState LJLJI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.InterfaceC39651h3
    public final C27C getValue() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C27C LJFF() {
        return (C27C) this.LJLJI.getValue();
    }

    public final InterfaceC70422pa LJ() {
        InterfaceC70422pa interfaceC70422pa;
        C27C LJFF = LJFF();
        if ((LJFF != null && (interfaceC70422pa = LJFF.LJ()) != null) || (interfaceC70422pa = this.LJLIL.LIZIZ) != null) {
            return interfaceC70422pa;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // X.InterfaceC39651h3
    public final C17R<C27C> getKey() {
        return C25750zj.LIZ;
    }

    @Override // X.InterfaceC39641h2
    public final void LLJI(C00E scope) {
        o.LJIIIZ(scope, "scope");
        this.LJLJI.setValue(scope.LJII(C25750zj.LIZ));
        this.LJLIL.LIZJ = LJFF();
    }

    public C27C(InterfaceC25720zg connection, C25730zh c25730zh) {
        o.LJIIIZ(connection, "connection");
        this.LJLIL = c25730zh;
        this.LJLILLLLZI = connection;
        c25730zh.LIZ = new IDqS420S0100000(this, 180);
        this.LJLJI = C78966Uyw.LJJJIL(null);
    }

    @Override // X.InterfaceC25720zg
    public final long LIZIZ(int i, long j) {
        long j2;
        C27C LJFF = LJFF();
        if (LJFF != null) {
            j2 = LJFF.LIZIZ(i, j);
        } else {
            j2 = C10370av.LIZIZ;
        }
        return C10370av.LJI(j2, this.LJLILLLLZI.LIZIZ(i, C10370av.LJFF(j, j2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // X.InterfaceC25720zg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(long r10, X.InterfaceC67352kd<? super X.C23560wC> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C27B
            if (r0 == 0) goto L6e
            r7 = r12
            X.27B r7 = (X.C27B) r7
            int r2 = r7.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r7.LJLJJL = r2
        L12:
            java.lang.Object r2 = r7.LJLJI
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJL
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 == r1) goto L4f
            if (r0 != r6) goto L74
            long r3 = r7.LJLILLLLZI
            X.C141335gf.LIZJ(r2)
        L25:
            X.0wC r2 = (X.C23560wC) r2
            long r0 = r2.LIZ
            long r1 = X.C23560wC.LJ(r3, r0)
            X.0wC r0 = new X.0wC
            r0.<init>(r1)
            return r0
        L33:
            X.C141335gf.LIZJ(r2)
            X.27C r0 = r9.LJFF()
            if (r0 == 0) goto L4b
            r7.LJLIL = r9
            r7.LJLILLLLZI = r10
            r7.LJLJJL = r1
            java.lang.Object r2 = r0.LIZLLL(r10, r7)
            if (r2 != r8) goto L49
            return r8
        L49:
            r0 = r9
            goto L56
        L4b:
            long r3 = X.C23560wC.LIZIZ
            r0 = r9
            goto L5a
        L4f:
            long r10 = r7.LJLILLLLZI
            X.27C r0 = r7.LJLIL
            X.C141335gf.LIZJ(r2)
        L56:
            X.0wC r2 = (X.C23560wC) r2
            long r3 = r2.LIZ
        L5a:
            X.0zg r5 = r0.LJLILLLLZI
            long r1 = X.C23560wC.LIZLLL(r10, r3)
            r0 = 0
            r7.LJLIL = r0
            r7.LJLILLLLZI = r3
            r7.LJLJJL = r6
            java.lang.Object r2 = r5.LIZLLL(r1, r7)
            if (r2 != r8) goto L25
            return r8
        L6e:
            X.27B r7 = new X.27B
            r7.<init>(r9, r12)
            goto L12
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27C.LIZLLL(long, X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // X.InterfaceC25720zg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r12, long r14, X.InterfaceC67352kd<? super X.C23560wC> r16) {
        /*
            r11 = this;
            r8 = r14
            r3 = r16
            r6 = r12
            boolean r0 = r3 instanceof X.C27A
            if (r0 == 0) goto L79
            r10 = r3
            X.27A r10 = (X.C27A) r10
            int r2 = r10.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L79
            int r2 = r2 - r1
            r10.LJLJJLL = r2
        L16:
            java.lang.Object r5 = r10.LJLJJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r10.LJLJJLL
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L37
            if (r1 == r0) goto L4d
            if (r1 != r2) goto L7f
            long r0 = r10.LJLILLLLZI
            X.C141335gf.LIZJ(r5)
        L29:
            X.0wC r5 = (X.C23560wC) r5
            long r2 = r5.LIZ
        L2d:
            long r1 = X.C23560wC.LJ(r0, r2)
            X.0wC r0 = new X.0wC
            r0.<init>(r1)
            return r0
        L37:
            X.C141335gf.LIZJ(r5)
            X.0zg r5 = r11.LJLILLLLZI
            r10.LJLIL = r11
            r10.LJLILLLLZI = r6
            r10.LJLJI = r8
            r10.LJLJJLL = r0
            java.lang.Object r5 = r5.LIZ(r6, r8, r10)
            if (r5 != r3) goto L4b
            return r3
        L4b:
            r4 = r11
            goto L56
        L4d:
            long r8 = r10.LJLJI
            long r6 = r10.LJLILLLLZI
            X.27C r4 = r10.LJLIL
            X.C141335gf.LIZJ(r5)
        L56:
            X.0wC r5 = (X.C23560wC) r5
            long r0 = r5.LIZ
            X.27C r5 = r4.LJFF()
            if (r5 == 0) goto L76
            long r6 = X.C23560wC.LJ(r6, r0)
            long r8 = X.C23560wC.LIZLLL(r8, r0)
            r4 = 0
            r10.LJLIL = r4
            r10.LJLILLLLZI = r0
            r10.LJLJJLL = r2
            java.lang.Object r5 = r5.LIZ(r6, r8, r10)
            if (r5 != r3) goto L29
            return r3
        L76:
            long r2 = X.C23560wC.LIZIZ
            goto L2d
        L79:
            X.27A r10 = new X.27A
            r10.<init>(r11, r3)
            goto L16
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27C.LIZ(long, long, X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC25720zg
    public final long LIZJ(int i, long j, long j2) {
        long j3;
        long LIZJ = this.LJLILLLLZI.LIZJ(i, j, j2);
        C27C LJFF = LJFF();
        if (LJFF != null) {
            j3 = LJFF.LIZJ(i, C10370av.LJI(j, LIZJ), C10370av.LJFF(j2, LIZJ));
        } else {
            j3 = C10370av.LIZIZ;
        }
        return C10370av.LJI(LIZJ, j3);
    }
}
