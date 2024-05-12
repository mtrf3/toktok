package X;

/* renamed from: X.1Mr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31811Mr implements InterfaceC25720zg {
    public final /* synthetic */ InterfaceC24760y8<C0UL> LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public C31811Mr(InterfaceC35811ar interfaceC35811ar, boolean z) {
        this.LJLIL = interfaceC35811ar;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC25720zg
    public final long LIZIZ(int i, long j) {
        if (i == 2) {
            this.LJLIL.getValue().LJI.setValue(Boolean.TRUE);
        }
        return C10370av.LIZIZ;
    }

    @Override // X.InterfaceC25720zg
    public final Object LIZLLL(long j, InterfaceC67352kd interfaceC67352kd) {
        return new C23560wC(C23560wC.LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC25720zg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r6, long r8, X.InterfaceC67352kd<? super X.C23560wC> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof X.C49551x1
            if (r0 == 0) goto L63
            r3 = r10
            X.1x1 r3 = (X.C49551x1) r3
            int r2 = r3.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r3.LJLJJL = r2
        L12:
            java.lang.Object r4 = r3.LJLJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJL
            r1 = 1
            if (r0 == 0) goto L41
            if (r0 != r1) goto L69
            long r8 = r3.LJLILLLLZI
            X.1Mr r3 = r3.LJLIL
            X.C141335gf.LIZJ(r4)
        L24:
            X.0wC r4 = (X.C23560wC) r4
            long r0 = r4.LIZ
            long r0 = X.C23560wC.LIZLLL(r8, r0)
        L2c:
            X.0wC r2 = new X.0wC
            r2.<init>(r0)
            X.0y8<X.0UL> r0 = r3.LJLIL
            java.lang.Object r0 = r0.getValue()
            X.0UL r0 = (X.C0UL) r0
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r0.LJI
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.setValue(r0)
            return r2
        L41:
            X.C141335gf.LIZJ(r4)
            boolean r0 = r5.LJLILLLLZI
            if (r0 == 0) goto L5f
            X.0y8<X.0UL> r0 = r5.LJLIL
            java.lang.Object r0 = r0.getValue()
            X.0UL r0 = (X.C0UL) r0
            r3.LJLIL = r5
            r3.LJLILLLLZI = r8
            r3.LJLJJL = r1
            java.lang.Object r4 = r0.LIZIZ(r8, r3)
            if (r4 != r2) goto L5d
            return r2
        L5d:
            r3 = r5
            goto L24
        L5f:
            long r0 = X.C23560wC.LIZIZ
            r3 = r5
            goto L2c
        L63:
            X.1x1 r3 = new X.1x1
            r3.<init>(r5, r10)
            goto L12
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31811Mr.LIZ(long, long, X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC25720zg
    public final long LIZJ(int i, long j, long j2) {
        if (this.LJLILLLLZI) {
            return this.LJLIL.getValue().LIZLLL(j2);
        }
        return C10370av.LIZIZ;
    }
}
