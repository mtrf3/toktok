package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer$notifyMsgListObservers$2", f = "SingleInboxMessageReceiveBuffer.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.OuF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63387OuF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<C63403OuV> LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C63420Oum LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63387OuF(List<C63403OuV> list, boolean z, C63420Oum c63420Oum, InterfaceC67352kd<? super C63387OuF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = z;
        this.LJLJI = c63420Oum;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63387OuF(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (r1 != null) goto L12;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.C141335gf.LIZJ(r9)
            java.util.List<X.OuV> r0 = r8.LJLIL
            boolean r0 = r0.isEmpty()
            java.lang.String r7 = "SingleInboxMessageReceiveBuffer"
            r6 = 0
            if (r0 == 0) goto L26
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "notifyMsgListObservers empty, isNew "
            r1.append(r0)
            boolean r0 = r8.LJLILLLLZI
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C63322OtC.LJI(r7, r0, r6)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            X.Oum r1 = r8.LJLJI
            java.util.List<X.OuV> r0 = r8.LJLIL
            r1.getClass()
            java.util.Iterator r3 = r0.iterator()
        L31:
            boolean r0 = r3.hasNext()
            r2 = 3
            if (r0 == 0) goto L68
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.OuV r0 = (X.C63403OuV) r0
            int r0 = r0.LJLILLLLZI
            if (r0 != r2) goto L31
            if (r1 == 0) goto L68
        L45:
            java.util.List<X.OuV> r1 = r8.LJLIL
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r0 = X.C32I.LJJL(r1, r4)
            r3.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L56:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r1.next()
            X.OuV r0 = (X.C63403OuV) r0
            X.4Rq r0 = r0.LJLIL
            r3.add(r0)
            goto L56
        L68:
            r2 = 0
            goto L45
        L6a:
            java.lang.StringBuilder r5 = X.X1D.LIZ()
            java.lang.String r0 = "notifyMsgListObservers, messageList "
            r5.append(r0)
            java.util.List<X.OuV> r1 = r8.LJLIL
            java.lang.String r0 = " isNew "
            X.DIL.LIZIZ(r1, r5, r0)
            boolean r0 = r8.LJLILLLLZI
            r5.append(r0)
            java.lang.String r0 = " msgSource "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r5)
            X.C63322OtC.LJI(r7, r0, r6)
            boolean r0 = r8.LJLILLLLZI
            if (r0 == 0) goto Lc3
            X.Oum r0 = r8.LJLJI
            X.Oup r0 = r0.LJ
            X.Osz r1 = r0.LIZLLL()
            X.4Id r0 = new X.4Id
            r0.<init>()
            r1.LJFF(r3, r2, r0)
        La2:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = X.C32I.LJJL(r3, r4)
            r2.<init>(r0)
            java.util.Iterator r1 = r3.iterator()
        Laf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld7
            java.lang.Object r0 = r1.next()
            X.4Rq r0 = (X.C109544Rq) r0
            java.lang.String r0 = r0.getConversationId()
            r2.add(r0)
            goto Laf
        Lc3:
            X.Oum r0 = r8.LJLJI
            X.Oup r0 = r0.LJ
            X.Osz r1 = r0.LIZLLL()
            r1.getClass()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.LJIIL(r0, r2, r3)
            goto La2
        Ld7:
            java.util.Set r0 = X.ORZ.LLJJ(r2)
            X.Oum r4 = r8.LJLJI
            java.util.Iterator r3 = r0.iterator()
        Le1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L102
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            X.Oup r0 = r4.LJ
            X.4fk r0 = r0.LJIIIZ()
            X.Opw r2 = r0.LJIIIZ(r1)
            X.Oup r0 = r4.LJ
            X.4fk r1 = r0.LJIIIZ()
            r0 = 2
            r1.LJIJI(r0, r2)
            goto Le1
        L102:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63387OuF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
