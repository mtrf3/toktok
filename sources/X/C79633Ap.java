package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.activitystatus.data.MUFActivityStatusModel$rebindMUFAS$newMUFASBundleList$1", f = "MUFActivityStatusModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Ap, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79633Ap extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends C79683Au>>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ List<C79683Au> LJLILLLLZI;
    public final /* synthetic */ List<IMUser> LJLJI;
    public final /* synthetic */ List<C79683Au> LJLJJI;
    public final /* synthetic */ C79613An LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C79633Ap(List<C79683Au> list, List<? extends IMUser> list2, List<C79683Au> list3, C79613An c79613An, InterfaceC67352kd<? super C79633Ap> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = list2;
        this.LJLJJI = list3;
        this.LJLJJL = c79613An;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C79633Ap c79633Ap = new C79633Ap(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c79633Ap.LJLIL = obj;
        return c79633Ap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        r3 = r6.LIZ;
        r2 = r9.getUid();
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "user.uid");
        r3 = X.C3B3.LIZ(r3, r2, X.C3BA.INBOX, null, 10);
        r0 = r9.getUid();
        kotlin.jvm.internal.o.LJIIIIZZ(r0, "user.uid");
        r8 = new X.C79683Au(com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0), r3, r6.LJIIIIZZ);
        r8.LIZIZ.observeForever(r8.LIZLLL);
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.C141335gf.LIZJ(r13)
            java.util.List<X.3Au> r0 = r12.LJLILLLLZI
            java.util.Iterator r2 = r0.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r2.next()
            X.3Au r0 = (X.C79683Au) r0
            androidx.lifecycle.LiveData<com.ss.android.ugc.aweme.im.service.model.ActivityStatus> r1 = r0.LIZIZ
            Y.AObserverS69S0100000_1 r0 = r0.LIZLLL
            r1.removeObserver(r0)
            goto L9
        L1d:
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = r12.LJLJI
            java.util.List<X.3Au> r7 = r12.LJLJJI
            X.3An r6 = r12.LJLJJL
            java.util.ArrayList r5 = new java.util.ArrayList
            r4 = 10
            int r0 = X.C32I.LJJL(r1, r4)
            r5.<init>(r0)
            java.util.Iterator r11 = r1.iterator()
        L32:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r9 = r11.next()
            com.ss.android.ugc.aweme.im.service.model.IMUser r9 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r9
            java.util.Iterator r2 = r7.iterator()
        L42:
            boolean r0 = r2.hasNext()
            r10 = 0
            if (r0 == 0) goto L62
            java.lang.Object r8 = r2.next()
            r0 = r8
            X.3Au r0 = (X.C79683Au) r0
            long r0 = r0.LIZ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r9.getUid()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L42
            if (r8 != 0) goto L8c
        L62:
            X.3B2 r3 = r6.LIZ
            java.lang.String r2 = r9.getUid()
            java.lang.String r1 = "user.uid"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r1)
            X.3BA r0 = X.C3BA.INBOX
            androidx.lifecycle.LiveData r3 = X.C3B3.LIZ(r3, r2, r0, r10, r4)
            X.3Au r8 = new X.3Au
            java.lang.String r0 = r9.getUid()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r1)
            long r1 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
            X.3Aj r0 = r6.LJIIIIZZ
            r8.<init>(r1, r3, r0)
            androidx.lifecycle.LiveData<com.ss.android.ugc.aweme.im.service.model.ActivityStatus> r1 = r8.LIZIZ
            Y.AObserverS69S0100000_1 r0 = r8.LIZLLL
            r1.observeForever(r0)
        L8c:
            r5.add(r8)
            goto L32
        L90:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79633Ap.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends C79683Au>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
