package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.BaseRelationModel$recentLoader$1$1", f = "BaseRelationModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3LI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3LI extends AbstractC65782Prm implements InterfaceC88471Ynr<C3L4, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C82743Mo LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3LI(C82743Mo c82743Mo, InterfaceC67352kd<? super C3LI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c82743Mo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3LI c3li = new C3LI(this.LJLILLLLZI, interfaceC67352kd);
        c3li.LJLIL = obj;
        return c3li;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r1.LLIIIJ != false) goto L12;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.C141335gf.LIZJ(r7)
            java.lang.Object r2 = r6.LJLIL
            X.3L4 r2 = (X.C3L4) r2
            X.3Mo r1 = r6.LJLILLLLZI
            r1.getClass()
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            boolean r0 = r2 instanceof X.C3MY
            r5 = 0
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r1.LJLILLLLZI
            X.3R9 r0 = (X.C3R9) r0
            boolean r0 = r0.LJIIJ
            if (r0 != 0) goto L29
            r1 = r2
            X.3MY r1 = (X.C3MY) r1
            boolean r0 = r1.LLIIIL
            if (r0 != 0) goto L29
            boolean r0 = r1.LLIIIJ
            if (r0 != 0) goto L2e
        L29:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L2e:
            boolean r0 = r2 instanceof X.C3L3
            if (r0 == 0) goto L3d
            r0 = r2
            X.3L3 r0 = (X.C3L3) r0
            r1 = 1
            if (r0 == 0) goto L3d
            boolean r0 = r0.LLIIIL
            if (r0 != r1) goto L3d
            goto L29
        L3d:
            long r3 = r2.LJLJLJ
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L46
            goto L29
        L46:
            r5 = 1
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3LI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3L4 c3l4, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(c3l4, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
