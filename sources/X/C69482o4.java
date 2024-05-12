package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.AwemeFetchManager$getBatchAwemeCacheItem$3", f = "AwemeFetchManager.kt", l = {118}, m = "invokeSuspend")
/* renamed from: X.2o4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69482o4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ List<String> LJLJJI;
    public final /* synthetic */ List<String> LJLJJL;
    public final /* synthetic */ XKW LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69482o4(int i, List<String> list, List<String> list2, XKW xkw, InterfaceC67352kd<? super C69482o4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = i;
        this.LJLJJI = list;
        this.LJLJJL = list2;
        this.LJLJJLL = xkw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C69482o4 c69482o4 = new C69482o4(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c69482o4.LJLILLLLZI = obj;
        return c69482o4;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            if (this.LJLJI == 0) {
                List<String> list = this.LJLJJI;
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(XKX.LIZLLL(interfaceC70422pa, null, null, new C69492o5(it.next(), null), 3));
                }
                obj2 = arrayList.toArray(new InterfaceC79150V4o[0]);
            } else {
                obj2 = new InterfaceC79150V4o[0];
            }
            XKQ LIZLLL = XKX.LIZLLL(interfaceC70422pa, null, null, new C69472o3(this.LJLJJL, this.LJLJJLL, null), 3);
            QSQ qsq = new QSQ(2);
            qsq.LJ(obj2);
            qsq.LIZ(LIZLLL);
            InterfaceC79150V4o[] interfaceC79150V4oArr = (InterfaceC79150V4o[]) qsq.LJIIIZ(new InterfaceC79150V4o[qsq.LJFF()]);
            this.LJLIL = 1;
            if (T1W.LIZJ(interfaceC79150V4oArr, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
