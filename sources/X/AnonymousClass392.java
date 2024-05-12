package X;

import com.ss.android.ugc.aweme.relation.model.RecUser;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ujb.s;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.source.MafUserPagingSource$saveToStorage$1", f = "MafUserPagingSource.kt", l = {184}, m = "invokeSuspend")
/* renamed from: X.392, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass392 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<RecUser> LJLILLLLZI;
    public final /* synthetic */ C57963Mox LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass392(List<RecUser> list, C57963Mox c57963Mox, InterfaceC67352kd<? super AnonymousClass392> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = c57963Mox;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass392(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            List<RecUser> list = this.LJLILLLLZI;
            ArrayList arrayList = new ArrayList();
            for (RecUser recUser : list) {
                String LIZ = C57581Min.LIZ(recUser);
                if (LIZ != null && s.LJJJLZIJ(LIZ, "1-", false)) {
                    arrayList.add(recUser);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(C57964Moy.LJII((RecUser) it.next()));
            }
            AnonymousClass390 LIZJ = this.LJLJI.LIZJ.LIZJ();
            C38T c38t = C38T.MAF;
            this.LJLIL = 1;
            if (LIZJ.LIZ(c38t, arrayList2, this) == enumC58928NAu) {
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
