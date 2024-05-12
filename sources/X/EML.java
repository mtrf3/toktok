package X;

/* loaded from: classes7.dex */
public final class EML extends EMJ {
    public final C37065Egf LIZJ;
    public final C37327Ekt LIZLLL;
    public final EMO LJ;
    public final C36284ELw LJFF;

    @Override // X.EMJ
    public final boolean LIZ() {
        if (super.LIZ() && !AV1.LJIIL()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.EMJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC67352kd<? super X.C9U5> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.EMG
            if (r0 == 0) goto La8
            r4 = r14
            X.EMG r4 = (X.EMG) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La8
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r7 = r4.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r6 = 1
            if (r0 == 0) goto L32
            if (r0 != r6) goto Laf
            X.EML r3 = r4.LJLIL
            X.C141335gf.LIZJ(r7)
        L22:
            com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse r7 = (com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse) r7
            X.Egf r2 = r3.LIZJ
            kotlin.jvm.internal.AqS153S0200000_6 r1 = new kotlin.jvm.internal.AqS153S0200000_6
            r0 = 17
            r1.<init>(r7, r3, r0)
            java.lang.Object r0 = r2.LJI(r1)
            return r0
        L32:
            X.C141335gf.LIZJ(r7)
            X.Egf r1 = r13.LIZJ
            X.Eks r0 = new X.Eks
            r0.<init>(r13)
            java.util.List r3 = r1.LJIIJJI(r0)
            boolean r0 = r3.isEmpty()
            r7 = 62
            r8 = 0
            if (r0 == 0) goto L58
            r0 = 200(0xc8, float:2.8E-43)
            X.C73802v2.LIZIZ(r0, r8, r7)
            X.9U5 r7 = new X.9U5
            r11 = 7
            r9 = r8
            r10 = r8
            r12 = r8
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        L58:
            X.Egf r2 = r13.LIZJ
            kotlin.jvm.internal.AqS153S0200000_6 r1 = new kotlin.jvm.internal.AqS153S0200000_6
            r0 = 18
            r1.<init>(r13, r3, r0)
            java.lang.Object r3 = r2.LJII(r1)
            java.util.List r3 = (java.util.List) r3
            X.Egf r1 = r13.LIZJ
            int r0 = r3.size()
            r1.LJJIJIIJI = r0
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L84
            r0 = 300(0x12c, float:4.2E-43)
            X.C73802v2.LIZIZ(r0, r8, r7)
            X.9U5 r7 = new X.9U5
            r11 = 7
            r9 = r8
            r10 = r8
            r12 = r8
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        L84:
            X.Egf r2 = r13.LIZJ
            kotlin.jvm.internal.AqS156S0100000_6 r1 = new kotlin.jvm.internal.AqS156S0100000_6
            r0 = 108(0x6c, float:1.51E-43)
            r1.<init>(r3, r0)
            java.lang.Object r2 = r2.LJIIIZ(r1)
            java.util.Map r2 = (java.util.Map) r2
            r4.LJLIL = r13
            r4.LJLJJI = r6
            X.Egf r1 = r13.LIZJ
            X.ELl r0 = new X.ELl
            r0.<init>(r13, r2, r8)
            java.lang.Object r7 = r1.LJIIL(r0, r4)
            if (r7 != r5) goto La5
            return r5
        La5:
            r3 = r13
            goto L22
        La8:
            X.EMG r4 = new X.EMG
            r4.<init>(r13, r14)
            goto L12
        Laf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EML.LIZJ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EML(X.EnumC58085Mqv r7, X.C36284ELw r8, int r9) {
        /*
            r6 = this;
            r0 = r9 & 2
            r5 = 0
            if (r0 == 0) goto L62
            X.XIA r4 = X.C78613UtF.LIZJ
        L7:
            r0 = r9 & 4
            if (r0 == 0) goto L60
            X.Egf r3 = new X.Egf
            X.EMQ r0 = X.EMQ.AUTHORIZATION
            r3.<init>(r7, r0)
        L12:
            r0 = r9 & 8
            if (r0 == 0) goto L5e
            X.Ekt r2 = new X.Ekt
            X.Ekv r0 = new X.Ekv
            r0.<init>(r7)
            r2.<init>(r3, r0)
        L20:
            r0 = r9 & 16
            if (r0 == 0) goto L29
            X.EMO r5 = new X.EMO
            r5.<init>(r3)
        L29:
            r0 = r9 & 32
            if (r0 == 0) goto L34
            X.ELw r8 = new X.ELw
            r1 = 0
            r0 = 6
            r8.<init>(r7, r1, r0)
        L34:
            java.lang.String r0 = "scene"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "ioDispatcher"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "monitor"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "transformer"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "uploader"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            r6.<init>(r3, r4)
            r6.LIZJ = r3
            r6.LIZLLL = r2
            r6.LJ = r5
            r6.LJFF = r8
            return
        L5e:
            r2 = r5
            goto L20
        L60:
            r3 = r5
            goto L12
        L62:
            r4 = r5
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EML.<init>(X.Mqv, X.ELw, int):void");
    }
}
