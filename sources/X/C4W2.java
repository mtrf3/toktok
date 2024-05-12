package X;

import fjb.a;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ies.im.core.client.StrangerListModelImpl$cacheStrangerAndNotify$1", f = "StrangerListModelImpl.kt", l = {172}, m = "invokeSuspend")
/* renamed from: X.4W2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4W2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<C63120Opw> LJLILLLLZI;
    public final /* synthetic */ C4W3 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4W2(C4W3 c4w3, List list, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = c4w3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4W2(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                List<C63120Opw> list = this.LJLILLLLZI;
                C4W3 c4w3 = this.LJLJI;
                for (C63120Opw c63120Opw : list) {
                    ConcurrentHashMap<String, C63120Opw> LJIILJJIL = c4w3.LJIILJJIL();
                    String conversationId = c63120Opw.getConversationId();
                    o.LJIIIIZZ(conversationId, "it.conversationId");
                    LJIILJJIL.put(conversationId, c63120Opw);
                }
                C4W3 c4w32 = this.LJLJI;
                Collection<C63120Opw> values = c4w32.LJIILJJIL().values();
                o.LJIIIIZZ(values, "strangerConversationMap.values");
                List LLILII = ORZ.LLILII((Comparator) this.LJLJI.LJLIL.getValue(), c4w32.LJIIL(ORZ.LLJI(values)));
                C4W3 c4w33 = this.LJLJI;
                AbstractC78621UtN abstractC78621UtN = c4w33.LJLJLLL;
                C4W1 c4w1 = new C4W1(c4w33, LLILII, null);
                this.LJLIL = 1;
                if (XKX.LJI(abstractC78621UtN, c4w1, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception e) {
            C63322OtC.LJ("StrangerListModelImpl", e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
