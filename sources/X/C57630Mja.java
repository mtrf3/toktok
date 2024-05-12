package X;

import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel$loadMafUser$1$resp$1", f = "RecSwipeViewModel.kt", l = {346, 348}, m = "invokeSuspend")
/* renamed from: X.Mja, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57630Mja extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AbstractC57709Mkr<RecUser>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C57634Mje LJLILLLLZI;
    public final /* synthetic */ RecSwipeViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57630Mja(C57634Mje c57634Mje, RecSwipeViewModel recSwipeViewModel, InterfaceC67352kd<? super C57630Mja> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c57634Mje;
        this.LJLJI = recSwipeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57630Mja(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r7 == null) goto L15;
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
            int r0 = r6.LJLIL
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L10
            if (r0 == r2) goto L2a
            if (r0 != r4) goto L4e
            X.C141335gf.LIZJ(r7)
        Lf:
            return r7
        L10:
            X.C141335gf.LIZJ(r7)
            X.Mje r1 = r6.LJLILLLLZI
            if (r1 == 0) goto L2f
            com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel r0 = r6.LJLJI
            X.Ol8 r0 = r0.LJLLILLLL
            java.lang.Object r0 = r0.getValue()
            X.Mkp r0 = (X.InterfaceC57707Mkp) r0
            r6.LJLIL = r2
            java.lang.Object r7 = r0.LIZ(r1, r6)
            if (r7 != r5) goto L2d
            return r5
        L2a:
            X.C141335gf.LIZJ(r7)
        L2d:
            if (r7 != 0) goto Lf
        L2f:
            com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel r0 = r6.LJLJI
            X.Ol8 r0 = r0.LJLLILLLL
            java.lang.Object r3 = r0.getValue()
            X.Mkp r3 = (X.InterfaceC57707Mkp) r3
            X.Mje r2 = new X.Mje
            com.ss.android.ugc.aweme.relation.feed.RecUserBigCardConfig r0 = X.C57626MjW.LIZ()
            int r1 = r0.loadCount
            r0 = 7
            r2.<init>(r1, r0)
            r6.LJLIL = r4
            java.lang.Object r7 = r3.LIZ(r2, r6)
            if (r7 != r5) goto Lf
            return r5
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57630Mja.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super AbstractC57709Mkr<RecUser>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
