package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.controller.AutoMsgFetchNode$handleAutoMessage$1", f = "AutoMsgFetchNode.kt", l = {136}, m = "invokeSuspend")
/* renamed from: X.2p7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70132p7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C70392pX LJLILLLLZI;
    public final /* synthetic */ List<C109544Rq> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C70132p7(C70392pX c70392pX, List<? extends C109544Rq> list, InterfaceC67352kd<? super C70132p7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c70392pX;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70132p7(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C76800UCe c76800UCe;
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
            C70172pB c70172pB = this.LJLILLLLZI.LJIIJJI;
            if (c70172pB != null) {
                List<C109544Rq> list = this.LJLJI;
                this.LJLIL = 1;
                ArrayList arrayList = new ArrayList();
                for (C109544Rq c109544Rq : list) {
                    if (o.LJ(String.valueOf(c109544Rq.getSender()), c70172pB.LIZJ)) {
                        arrayList.add(c109544Rq);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        C109544Rq c109544Rq2 = (C109544Rq) obj2;
                        String LIZ = C93793mB.LIZ(c109544Rq2);
                        if (LIZ != null && o.LJ(LIZ, c70172pB.LIZIZ) && o.LJ(String.valueOf(c109544Rq2.getSender()), c70172pB.LIZJ)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                C109544Rq c109544Rq3 = (C109544Rq) obj2;
                if (c109544Rq3 == null) {
                    c76800UCe = C76800UCe.LIZ;
                } else {
                    c70172pB.LJ.setValue(new C70142p8(c109544Rq3));
                    c76800UCe = C76800UCe.LIZ;
                }
                if (c76800UCe == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
