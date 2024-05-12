package X;

import com.ss.android.ugc.aweme.im.message.template.card.BotAnswerCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.botanswercard.BotAnswerCardItemComponent;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.botanswercard.TakoAnswerCardReceiveViewHolder$onBind$1", f = "TakoAnswerCardReceiveViewHolder.kt", l = {179}, m = "invokeSuspend")
/* renamed from: X.2or, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69972or extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69972or(C109544Rq c109544Rq, InterfaceC67352kd<? super C69972or> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c109544Rq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69972or(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List<BotAnswerCardItemComponent> list;
        Object obj3 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C84973Vd c84973Vd = C84973Vd.LIZ;
            C109544Rq c109544Rq = this.LJLILLLLZI;
            this.LJLIL = 1;
            c84973Vd.getClass();
            if (c109544Rq.getMsgType() != 1807) {
                obj2 = C76800UCe.LIZ;
            } else {
                BotAnswerCardTemplate botAnswerCardTemplate = (BotAnswerCardTemplate) C1DJ.LJIILL(c109544Rq);
                if (botAnswerCardTemplate != null && (list = botAnswerCardTemplate.recommendItems) != null) {
                    ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                    Iterator<BotAnswerCardItemComponent> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(it.next().itemId));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((String) next).length() > 0) {
                            arrayList2.add(next);
                        }
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("queryBotAweme aweme ids: ");
                    LIZ.append(arrayList2);
                    C34B.LIZJ("AwemeCoverManager", X1D.LIZIZ(LIZ));
                    obj2 = XKX.LJI(C78613UtF.LIZJ, new C69862og(arrayList2, null), this);
                    if (obj2 != EnumC58928NAu.COROUTINE_SUSPENDED) {
                        obj2 = C76800UCe.LIZ;
                    }
                } else {
                    obj2 = C76800UCe.LIZ;
                }
            }
            if (obj2 == obj3) {
                return obj3;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
