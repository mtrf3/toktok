package X;

import Y.AObserverS65S0200000_1;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import fjb.a;
import kotlin.jvm.internal.AqS148S0200000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.searchcontent.UserSearchContentUpdateEngine$_relationObserverFlow$1", f = "UserSearchContentUpdateEngine.kt", l = {102}, m = "invokeSuspend")
/* renamed from: X.3Ph, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83453Ph extends AbstractC65782Prm implements InterfaceC88471Ynr<C3CK<? super C3PT>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ EventLiveData<RelationStatus> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, Boolean> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C83453Ph(EventLiveData<RelationStatus> eventLiveData, InterfaceC88472Yns<? super Integer, Boolean> interfaceC88472Yns, InterfaceC67352kd<? super C83453Ph> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = eventLiveData;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C83453Ph c83453Ph = new C83453Ph(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c83453Ph.LJLILLLLZI = obj;
        return c83453Ph;
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
            C3CK c3ck = (C3CK) this.LJLILLLLZI;
            AObserverS65S0200000_1 aObserverS65S0200000_1 = new AObserverS65S0200000_1(this.LJLJJI, c3ck, 9);
            this.LJLJI.observeForever(aObserverS65S0200000_1);
            AqS148S0200000_1 aqS148S0200000_1 = new AqS148S0200000_1(this.LJLJI, aObserverS65S0200000_1, 23);
            this.LJLIL = 1;
            if (C3T0.LIZ(c3ck, aqS148S0200000_1, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3CK<? super C3PT> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3ck, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
