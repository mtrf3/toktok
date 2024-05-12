package X;

/* renamed from: X.1ZP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZP implements InterfaceC25720zg {
    public final /* synthetic */ C21470sp<Object> LJLIL;

    public C1ZP(C21470sp<Object> c21470sp) {
        this.LJLIL = c21470sp;
    }

    @Override // X.InterfaceC25720zg
    public final long LIZIZ(int i, long j) {
        float LJ = C10370av.LJ(j);
        if (LJ < 0.0f && i == 1) {
            return C78923UyF.LIZ(0.0f, this.LJLIL.LJFF(LJ));
        }
        return C10370av.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC25720zg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(long r8, X.InterfaceC67352kd<? super X.C23560wC> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C528225m
            if (r0 == 0) goto L64
            r5 = r10
            X.25m r5 = (X.C528225m) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r1 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r6 = 1
            if (r0 == 0) goto L28
            if (r0 != r6) goto L6a
            long r8 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            X.0wC r0 = new X.0wC
            r0.<init>(r8)
            return r0
        L28:
            X.C141335gf.LIZJ(r1)
            float r1 = X.C23560wC.LIZIZ(r8)
            float r0 = X.C23560wC.LIZJ(r8)
            long r0 = X.C78923UyF.LIZ(r1, r0)
            float r3 = X.C10370av.LJ(r0)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L61
            X.0sp<java.lang.Object> r0 = r7.LJLIL
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r0.LJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r2 = r0.floatValue()
            X.0sp<java.lang.Object> r1 = r7.LJLIL
            float r0 = r1.LJIIJ
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L61
            r5.LJLIL = r8
            r5.LJLJJI = r6
            java.lang.Object r0 = r1.LJI(r3, r5)
            if (r0 != r4) goto L22
            return r4
        L61:
            long r8 = X.C23560wC.LIZIZ
            goto L22
        L64:
            X.25m r5 = new X.25m
            r5.<init>(r7, r10)
            goto L12
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ZP.LIZLLL(long, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC25720zg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r7, long r9, X.InterfaceC67352kd<? super X.C23560wC> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof X.C528125l
            if (r0 == 0) goto L48
            r5 = r11
            X.25l r5 = (X.C528125l) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r1 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 != r3) goto L4e
            long r9 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            X.0wC r0 = new X.0wC
            r0.<init>(r9)
            return r0
        L28:
            X.C141335gf.LIZJ(r1)
            X.0sp<java.lang.Object> r2 = r6.LJLIL
            float r1 = X.C23560wC.LIZIZ(r9)
            float r0 = X.C23560wC.LIZJ(r9)
            long r0 = X.C78923UyF.LIZ(r1, r0)
            float r0 = X.C10370av.LJ(r0)
            r5.LJLIL = r9
            r5.LJLJJI = r3
            java.lang.Object r0 = r2.LJI(r0, r5)
            if (r0 != r4) goto L22
            return r4
        L48:
            X.25l r5 = new X.25l
            r5.<init>(r6, r11)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ZP.LIZ(long, long, X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC25720zg
    public final long LIZJ(int i, long j, long j2) {
        if (i == 1) {
            return C78923UyF.LIZ(0.0f, this.LJLIL.LJFF(C10370av.LJ(j2)));
        }
        return C10370av.LIZIZ;
    }
}
