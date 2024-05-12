package X;

import com.bytedance.android.live.slot.IIconSlot;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.live.slot.SlotsBottomSheetAdapter$showDeleteAlert$1$1$1", f = "SlotsBottomSheetAdapter.kt", l = {219}, m = "invokeSuspend")
/* renamed from: X.Cd4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31746Cd4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ArrayList<Boolean>>, Object> {
    public Object LJLIL;
    public InterfaceC31710CcU LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public int LJLJJLL;
    public final /* synthetic */ ArrayList<Boolean> LJLJL;
    public final /* synthetic */ C31743Cd1 LJLJLJ;
    public final /* synthetic */ InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31746Cd4(ArrayList<Boolean> arrayList, C31743Cd1 c31743Cd1, InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> interfaceC31710CcU, InterfaceC67352kd<? super C31746Cd4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJL = arrayList;
        this.LJLJLJ = c31743Cd1;
        this.LJLJLLL = interfaceC31710CcU;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C31746Cd4(this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0053 -> B:5:0x001c). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLJJLL
            r7 = 1
            if (r0 == 0) goto L56
            if (r0 != r7) goto L6a
            java.lang.Object r0 = r9.LJLJJL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r6 = r9.LJLJJI
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r5 = r9.LJLJI
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            X.CcU r4 = r9.LJLILLLLZI
            java.lang.Object r3 = r9.LJLIL
            X.C141335gf.LIZJ(r10)
        L1c:
            r0.add(r10)
        L1f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r2 = r6.next()
            X.CcU r2 = (X.InterfaceC31710CcU) r2
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r4)
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof X.InterfaceC31748Cd6
            if (r0 == 0) goto L1f
            X.Cd6 r2 = (X.InterfaceC31748Cd6) r2
            java.lang.String r1 = r4.LIZ()
            java.lang.String r0 = "slotWidget.bizType()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r9.LJLIL = r3
            r9.LJLILLLLZI = r4
            r9.LJLJI = r5
            r9.LJLJJI = r6
            r9.LJLJJL = r5
            r9.LJLJJLL = r7
            java.lang.Object r10 = r2.LJII(r9)
            if (r10 != r8) goto L53
            return r8
        L53:
            r0 = r5
            r5 = r0
            goto L1c
        L56:
            X.C141335gf.LIZJ(r10)
            java.util.ArrayList<java.lang.Boolean> r3 = r9.LJLJL
            X.Cd1 r0 = r9.LJLJLJ
            X.CcU<com.bytedance.android.live.slot.IIconSlot, com.bytedance.android.live.slot.IIconSlot$SlotViewModel, X.C4m> r4 = r9.LJLJLLL
            java.util.List<X.CcU<com.bytedance.android.live.slot.IIconSlot, com.bytedance.android.live.slot.IIconSlot$SlotViewModel, X.C4m>> r0 = r0.LJLJJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r6 = r0.iterator()
            r5 = r3
            goto L1f
        L69:
            return r3
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31746Cd4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super ArrayList<Boolean>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
