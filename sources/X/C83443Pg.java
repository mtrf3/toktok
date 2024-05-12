package X;

import com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.searchcontent.UserSearchContentUpdateEngine$fullUpdate$overallCost$1$1", f = "UserSearchContentUpdateEngine.kt", l = {155}, m = "invokeSuspend")
/* renamed from: X.3Pg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83443Pg extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super List<? extends IMUserBaseInfo>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C83483Pk LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83443Pg(C83483Pk c83483Pk, InterfaceC67352kd<? super C83443Pg> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = c83483Pk;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C83443Pg(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super List<? extends IMUserBaseInfo>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            InterfaceC88472Yns<InterfaceC67352kd<? super List<IMUserBaseInfo>>, Object> interfaceC88472Yns = this.LJLILLLLZI.LJ;
            this.LJLIL = 1;
            obj = interfaceC88472Yns.invoke(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
