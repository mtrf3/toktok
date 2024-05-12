package X;

import android.content.Context;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.controller.AutoMsgFetchNode$tryUpdateIntercept$1", f = "AutoMsgFetchNode.kt", l = {116}, m = "invokeSuspend")
/* renamed from: X.2p2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70082p2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C70172pB LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C70392pX LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70082p2(C70392pX c70392pX, Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C70082p2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c70392pX;
        this.LJLJJL = context;
        this.LJLJJLL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C70082p2 c70082p2 = new C70082p2(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c70082p2.LJLJI = obj;
        return c70082p2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        C70172pB c70172pB;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                c70172pB = this.LJLIL;
                interfaceC70422pa = (InterfaceC70422pa) this.LJLJI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLJI;
            c70172pB = this.LJLJJI.LJIIJJI;
            if (c70172pB != null) {
                Context context = this.LJLJJL;
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJLL;
                this.LJLJI = interfaceC70422pa;
                this.LJLIL = c70172pB;
                this.LJLILLLLZI = 1;
                c70172pB.LJFF.setValue(new C70292pN(context, interfaceC65784Pro));
                if (C76800UCe.LIZ == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        XKX.LIZLLL(interfaceC70422pa, null, null, new C70072p1(c70172pB, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
