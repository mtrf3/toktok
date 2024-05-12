package X;

import fjb.a;
import java.util.Iterator;
import java.util.LinkedList;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.result.SendGiftFailureInterceptorBizHandler$handleCoinsInsufficient$1", f = "SendGiftFailureInterceptorBizHandler.kt", l = {541}, m = "invokeSuspend")
/* renamed from: X.CuF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32811CuF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C32802Cu6 LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ C32816CuK LJLJJI;
    public final /* synthetic */ C32802Cu6 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32811CuF(C32816CuK c32816CuK, C32802Cu6 c32802Cu6, InterfaceC67352kd<? super C32811CuF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c32816CuK;
        this.LJLJJL = c32802Cu6;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32811CuF(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C32802Cu6 c32802Cu6;
        Iterator<UVP> it;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        if (i != 0) {
            if (i == 1) {
                it = (Iterator) this.LJLILLLLZI;
                c32802Cu6 = this.LJLIL;
                try {
                    C141335gf.LIZJ(obj);
                } catch (Exception e) {
                    C0NB.LJI(c32802Cu6.LIZLLL, e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            LinkedList<UVP> linkedList = this.LJLJJI.LIZ;
            c32802Cu6 = this.LJLJJL;
            it = linkedList.iterator();
        }
        while (it.hasNext()) {
            UVP next = it.next();
            try {
                XLM xlm = next.LJII;
                UV6 uv6 = new UV6(next.LIZ, UVH.PRE_REQUEST_CHECK_FAIL, C88561YpJ.LIZ);
                this.LJLIL = c32802Cu6;
                this.LJLILLLLZI = it;
                this.LJLJI = 1;
                xlm.setValue(uv6);
            } catch (Exception e2) {
                C0NB.LJI(c32802Cu6.LIZLLL, e2);
            }
            if (C76800UCe.LIZ == enumC58928NAu) {
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
