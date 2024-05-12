package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.bot.frame.autocut.AutoCutFrameExtractManager$getFrameZipTos$2", f = "AutoCutFrameExtractManager.kt", l = {51, 56}, m = "invokeSuspend")
/* renamed from: X.2vm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74262vm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C74282vo LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74262vm(C74282vo c74282vo, String str, InterfaceC67352kd<? super C74262vm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c74282vo;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C74262vm c74262vm = new C74262vm(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c74262vm.LJLILLLLZI = obj;
        return c74262vm;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLIL
            java.lang.String r8 = ""
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L16
            if (r0 == r3) goto L7d
            if (r0 != r5) goto L75
            X.C141335gf.LIZJ(r10)
        L11:
            if (r10 != 0) goto L14
        L13:
            return r8
        L14:
            r8 = r10
            goto L13
        L16:
            X.C141335gf.LIZJ(r10)
            java.lang.Object r7 = r9.LJLILLLLZI
            X.2pa r7 = (X.InterfaceC70422pa) r7
            X.2vo r0 = r9.LJLJI
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LIZLLL
            java.lang.String r0 = r9.LJLJJI
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L2c
            return r0
        L2c:
            X.2vo r0 = r9.LJLJI
            X.XKn r2 = r0.LIZJ
            if (r2 != 0) goto L33
            return r8
        L33:
            java.lang.String r1 = r0.LJFF
            java.lang.String r0 = r9.LJLJJI
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L4c
            boolean r0 = r2.isActive()
            if (r0 == 0) goto L4c
            r9.LJLIL = r3
            java.lang.Object r10 = r2.LJJIJ(r9)
            if (r10 != r6) goto L80
            return r6
        L4c:
            X.2vo r4 = r9.LJLJI
            java.lang.String r3 = r9.LJLJJI
            X.XKn r0 = r4.LIZJ
            r2 = 0
            if (r0 == 0) goto L58
            r0.LIZIZ(r2)
        L58:
            X.UtN r1 = X.C36636EZk.LIZ
            X.2vn r0 = new X.2vn
            r0.<init>(r4, r3, r2)
            X.XKn r0 = X.XKX.LIZIZ(r7, r1, r2, r0, r5)
            r4.LIZJ = r0
            X.2vo r0 = r9.LJLJI
            X.XKn r0 = r0.LIZJ
            if (r0 == 0) goto L13
            r9.LJLIL = r5
            java.lang.Object r10 = r0.LJJIJ(r9)
            if (r10 != r6) goto L11
            return r6
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7d:
            X.C141335gf.LIZJ(r10)
        L80:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74262vm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
