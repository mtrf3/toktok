package X;

import Y.IDComparatorS30S0000000_2;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResults;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftFileRestoreHandlers$restore$2", f = "IDraftFileRestoreHandler.kt", l = {127}, m = "invokeSuspend")
/* renamed from: X.6jh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168696jh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super DraftFileRestoreResults>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C6ZN LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C168696jh(C6ZN c6zn, InterfaceC67352kd<? super C168696jh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c6zn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C168696jh c168696jh = new C168696jh(this.LJLJJI, interfaceC67352kd);
        c168696jh.LJLJI = obj;
        return c168696jh;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                currentTimeMillis = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLJI;
            currentTimeMillis = System.currentTimeMillis();
            C76732zl c76732zl = new C76732zl();
            c76732zl.element = 10;
            int size = 80 / this.LJLJJI.LIZIZ.size();
            C6ZN c6zn = this.LJLJJI;
            List<InterfaceC168706ji> list = c6zn.LIZIZ;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<InterfaceC168706ji> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(XKX.LIZIZ(interfaceC70422pa, null, null, new C168686jg(it.next(), c76732zl, size, c6zn, null), 3));
            }
            this.LJLIL = currentTimeMillis;
            this.LJLILLLLZI = 1;
            obj = T1W.LIZ(arrayList, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((Iterable) obj).iterator();
        while (it2.hasNext()) {
            ORS.LJJLIIIJILLIZJL((Iterable) it2.next(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!((DraftFileRestoreResult) next).isSuc()) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (((DraftFileRestoreResult) next2).getBlockCreative()) {
                arrayList5.add(next2);
            }
        }
        arrayList4.addAll(ORZ.LLILII(new IDComparatorS30S0000000_2(40), arrayList5));
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            Object next3 = it5.next();
            if (!((DraftFileRestoreResult) next3).getBlockCreative()) {
                arrayList7.add(next3);
            }
        }
        arrayList6.addAll(ORZ.LLILII(new IDComparatorS30S0000000_2(41), arrayList7));
        return new DraftFileRestoreResults(System.currentTimeMillis() - currentTimeMillis, arrayList4, arrayList6);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super DraftFileRestoreResults> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
