package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.ext.AdapterLoader$loadMore$1", f = "AdapterCompat.kt", l = {149}, m = "invokeSuspend")
/* renamed from: X.Mq0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58028Mq0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C58029Mq1<T> LJLJJI;
    public final /* synthetic */ T LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58028Mq0(C58029Mq1<T> c58029Mq1, T t, InterfaceC67352kd<? super C58028Mq0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c58029Mq1;
        this.LJLJJL = t;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C58028Mq0 c58028Mq0 = new C58028Mq0(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c58028Mq0.LJLJI = obj;
        return c58028Mq0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L18;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLILLLLZI
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto La
            goto L5e
        La:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L12:
            X.C141335gf.LIZJ(r7)
            java.lang.Object r0 = r6.LJLJI
            X.Mq1<T> r4 = r6.LJLJJI     // Catch: java.lang.Throwable -> L76
            T r2 = r6.LJLJJL     // Catch: java.lang.Throwable -> L76
            r6.LJLJI = r0     // Catch: java.lang.Throwable -> L76
            r6.LJLIL = r2     // Catch: java.lang.Throwable -> L76
            r6.LJLILLLLZI = r1     // Catch: java.lang.Throwable -> L76
            X.XKS r3 = new X.XKS     // Catch: java.lang.Throwable -> L76
            X.2kd r0 = X.C78555UsJ.LJJII(r6)     // Catch: java.lang.Throwable -> L76
            r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> L76
            r3.LJIIL()     // Catch: java.lang.Throwable -> L76
            r4.LJLJJI = r3     // Catch: java.lang.Throwable -> L76
            if (r2 != 0) goto L33
            T r2 = r4.LJLJJL     // Catch: java.lang.Throwable -> L76
        L33:
            r1 = 0
            if (r2 == 0) goto L41
            com.bytedance.ies.powerlist.page.config.PowerPageSource<T> r0 = r4.LJLJI     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L70
            r0.onLoadMore(r3, r2)     // Catch: java.lang.Throwable -> L76
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L57
        L41:
            X.A2F r2 = X.A2G.LIZ     // Catch: java.lang.Throwable -> L76
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "cursor is null!"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L76
            r2.getClass()     // Catch: java.lang.Throwable -> L76
            X.A2I r0 = X.A2F.LIZJ(r1)     // Catch: java.lang.Throwable -> L76
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L76
            r3.resumeWith(r0)     // Catch: java.lang.Throwable -> L76
        L57:
            java.lang.Object r7 = r3.LJIIJJI()     // Catch: java.lang.Throwable -> L76
            if (r7 != r5) goto L61
            return r5
        L5e:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Throwable -> L76
        L61:
            X.A2G r7 = (X.A2G) r7     // Catch: java.lang.Throwable -> L76
            boolean r0 = r7 instanceof X.A2V     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L83
            X.Mq1<T> r1 = r6.LJLJJI     // Catch: java.lang.Throwable -> L76
            X.A2V r7 = (X.A2V) r7     // Catch: java.lang.Throwable -> L76
            T r0 = r7.LIZJ     // Catch: java.lang.Throwable -> L76
            r1.LJLJJL = r0     // Catch: java.lang.Throwable -> L76
            goto L83
        L70:
            java.lang.String r0 = "pageSource"
            kotlin.jvm.internal.o.LJIJI(r0)     // Catch: java.lang.Throwable -> L76
            throw r1     // Catch: java.lang.Throwable -> L76
        L76:
            r2 = move-exception
            X.AYY r0 = X.AYY.LIZ
            r0.getClass()
            java.lang.String r1 = "AdapterLoader"
            java.lang.String r0 = "adapter loader loadMore error"
            X.AYY.LIZ(r1, r0, r2)
        L83:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58028Mq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
