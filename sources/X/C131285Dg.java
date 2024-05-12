package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.frame.VideoFrameCache$1", f = "VideoFrameCache.kt", l = {69}, m = "invokeSuspend")
/* renamed from: X.5Dg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131285Dg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC131465Dy LJLIL;
    public InterfaceC169716lL LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ C131235Db LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131285Dg(C131235Db c131235Db, InterfaceC67352kd<? super C131285Dg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c131235Db;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C131285Dg(this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0036 -> B:5:0x0010). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r4 = 1
            if (r0 == 0) goto L3d
            if (r0 != r4) goto L5f
            X.6lL r3 = r6.LJLILLLLZI
            X.5Dy r2 = r6.LJLIL
            X.C141335gf.LIZJ(r7)
        L10:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto L5c
            java.lang.Object r1 = r3.next()
            X.5Dy r1 = (X.InterfaceC131465Dy) r1
            boolean r0 = r1 instanceof X.C131355Dn
            if (r0 == 0) goto L38
        L22:
            X.5Db r0 = r6.LJLJJI
            X.XK4 r0 = r0.LJLLI
            r0.LJIILLIIL(r1)
        L29:
            r6.LJLIL = r1
            r6.LJLILLLLZI = r3
            r6.LJLJI = r4
            java.lang.Object r7 = r3.LIZ(r6)
            if (r7 != r5) goto L36
            return r5
        L36:
            r2 = r1
            goto L10
        L38:
            boolean r0 = r1 instanceof X.C131405Ds
            if (r0 == 0) goto L4d
            goto L22
        L3d:
            X.C141335gf.LIZJ(r7)
            X.5Db r0 = r6.LJLJJI
            X.XK4 r0 = r0.LJLL
            r0.getClass()
            X.XK6 r3 = new X.XK6
            r3.<init>(r0)
            goto L58
        L4d:
            boolean r0 = r1 instanceof X.C131375Dp
            if (r0 == 0) goto L5a
            X.5Dp r1 = (X.C131375Dp) r1
            X.HLn<X.5Dy> r0 = r1.LIZ
            r0.LJ(r2)
        L58:
            r1 = 0
            goto L29
        L5a:
            r1 = r2
            goto L29
        L5c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131285Dg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
