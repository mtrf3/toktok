package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.ContentInViewModifier$onSizeChanged$1", f = "ContentInViewModifier.kt", l = {195}, m = "invokeSuspend")
/* renamed from: X.2Cn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54652Cn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C49561x2 LJLJI;
    public final /* synthetic */ C10390ax LJLJJI;
    public final /* synthetic */ C10390ax LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54652Cn(C49561x2 c49561x2, C10390ax c10390ax, C10390ax c10390ax2, InterfaceC67352kd<? super C54652Cn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c49561x2;
        this.LJLJJI = c10390ax;
        this.LJLJJL = c10390ax2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C54652Cn c54652Cn = new C54652Cn(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c54652Cn.LJLILLLLZI = obj;
        return c54652Cn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.V4o, X.XKQ, kotlinx.coroutines.JobSupport, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLIL
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L1a
            if (r0 != r6) goto L12
            java.lang.Object r3 = r8.LJLILLLLZI
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Throwable -> L10
            goto L40
        L10:
            r2 = move-exception
            goto L56
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C141335gf.LIZJ(r9)
            java.lang.Object r5 = r8.LJLILLLLZI
            X.2pa r5 = (X.InterfaceC70422pa) r5
            X.2Cm r3 = new X.2Cm
            X.1x2 r2 = r8.LJLJI
            X.0ax r1 = r8.LJLJJI
            X.0ax r0 = r8.LJLJJL
            r3.<init>(r2, r1, r0, r4)
            r0 = 3
            X.XKQ r3 = X.XKX.LIZLLL(r5, r4, r4, r3, r0)
            X.1x2 r0 = r8.LJLJI
            r0.LJLL = r3
            r8.LJLILLLLZI = r3     // Catch: java.lang.Throwable -> L55
            r8.LJLIL = r6     // Catch: java.lang.Throwable -> L55
            java.lang.Object r0 = r3.LJJJJ(r8)     // Catch: java.lang.Throwable -> L55
            if (r0 != r7) goto L40
            goto L54
        L40:
            X.1x2 r1 = r8.LJLJI
            X.V4o r0 = r1.LJLL
            if (r0 != r3) goto L51
            r1.LJLJLJ = r4
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r1.LJLJLLL
            r0.setValue(r4)
            X.1x2 r0 = r8.LJLJI
            r0.LJLL = r4
        L51:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L54:
            return r7
        L55:
            r2 = move-exception
        L56:
            X.1x2 r1 = r8.LJLJI
            X.V4o r0 = r1.LJLL
            if (r0 != r3) goto L67
            r1.LJLJLJ = r4
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r1.LJLJLLL
            r0.setValue(r4)
            X.1x2 r0 = r8.LJLJI
            r0.LJLL = r4
        L67:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54652Cn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
