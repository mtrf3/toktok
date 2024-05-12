package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.searchcontent.GroupSearchContentUpdateEngine$startGroupDataSyncing$1", f = "GroupSearchContentUpdateEngine.kt", l = {223}, m = "invokeSuspend")
/* renamed from: X.3Pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83603Pw extends AbstractC65782Prm implements InterfaceC88471Ynr<C3Q5, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C83593Pv LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83603Pw(C83593Pv c83593Pv, InterfaceC67352kd<? super C83603Pw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c83593Pv;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C83603Pw c83603Pw = new C83603Pw(this.LJLJI, interfaceC67352kd);
        c83603Pw.LJLILLLLZI = obj;
        return c83603Pw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C3Q5 c3q5 = (C3Q5) this.LJLILLLLZI;
            this.LJLJI.LIZIZ.LJFF(c3q5.toString());
            C83593Pv c83593Pv = this.LJLJI;
            c83593Pv.LIZIZ.LIZIZ(c3q5.LIZIZ, c83593Pv.LJIIIZ);
            List<C63120Opw> list = c3q5.LIZIZ;
            InterfaceC88472Yns<C63120Opw, C3QL> interfaceC88472Yns = this.LJLJI.LJI;
            ArrayList arrayList = new ArrayList();
            Iterator<C63120Opw> it = list.iterator();
            while (it.hasNext()) {
                C3QL invoke = interfaceC88472Yns.invoke(it.next());
                if (invoke != null) {
                    arrayList.add(invoke);
                }
            }
            this.LJLJI.LIZIZ.LJI("", arrayList, C3Q7.LJLIL);
            int ordinal = c3q5.LIZ.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        this.LJLJI.LIZJ.LIZIZ(arrayList);
                    }
                } else {
                    C83593Pv c83593Pv2 = this.LJLJI;
                    this.LJLIL = 1;
                    if (c83593Pv2.LIZ(this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            } else {
                this.LJLJI.LIZJ.LIZJ(arrayList);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3Q5 c3q5, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3q5, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
