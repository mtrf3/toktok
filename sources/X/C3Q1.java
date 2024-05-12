package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.searchcontent.GroupSearchContentUpdateEngine$fullUpdate$overallCost$1$2", f = "GroupSearchContentUpdateEngine.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Q1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Q1 extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super List<? extends C3QL>>, Object> {
    public final /* synthetic */ List<C63120Opw> LJLIL;
    public final /* synthetic */ C83593Pv LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3Q1(List<? extends C63120Opw> list, C83593Pv c83593Pv, InterfaceC67352kd<? super C3Q1> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = c83593Pv;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3Q1(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super List<? extends C3QL>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<C63120Opw> list = this.LJLIL;
        InterfaceC88472Yns<C63120Opw, C3QL> interfaceC88472Yns = this.LJLILLLLZI.LJI;
        ArrayList arrayList = new ArrayList();
        Iterator<C63120Opw> it = list.iterator();
        while (it.hasNext()) {
            C3QL invoke = interfaceC88472Yns.invoke(it.next());
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }
}
