package X;

import Y.ARunnableS7S0110000_1;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListAssem$submitNewMessageList$1", f = "MessageListAssem.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.42f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1029342f extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ MessageListAssem LJLIL;
    public final /* synthetic */ AbstractC89473fD LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1029342f(MessageListAssem messageListAssem, AbstractC89473fD abstractC89473fD, InterfaceC67352kd<? super C1029342f> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = messageListAssem;
        this.LJLILLLLZI = abstractC89473fD;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1029342f(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<? extends C109544Rq> list;
        InterfaceC99713vj interfaceC99713vj;
        List<C109544Rq> LJ;
        List<? extends C109544Rq> list2;
        InterfaceC99713vj interfaceC99713vj2;
        List<C109544Rq> LJ2;
        C141335gf.LIZJ(obj);
        C3Y6 c3y6 = new C3Y6(0);
        C84683Ua c84683Ua = C84683Ua.LJFF;
        c84683Ua.LIZIZ(c3y6, true);
        C92183ja c92183ja = this.LJLIL.x3().LJZL;
        if (this.LJLIL.F3().isTakoChat$im_base_release()) {
            if ((this.LJLILLLLZI instanceof C89463fC) && c92183ja.LIZIZ()) {
                this.LJLIL.LLF = true;
            }
            if (c92183ja.LIZIZ() && !(this.LJLILLLLZI instanceof C91563ia)) {
                return C76800UCe.LIZ;
            }
            AbstractC1038245q x3 = this.LJLIL.x3();
            AbstractC89473fD event = this.LJLILLLLZI;
            x3.getClass();
            o.LJIIIZ(event, "event");
            Iterator<InterfaceC1029942l> it = x3.LJLJJI.iterator();
            while (it.hasNext()) {
                it.next().Ah(event);
            }
            ChatRoomViewModel v3 = this.LJLIL.v3();
            if (v3 != null && (interfaceC99713vj2 = v3.LJLL) != null && (LJ2 = interfaceC99713vj2.LJ()) != null) {
                list2 = C109434Rf.LJIILLIIL(LJ2);
            } else {
                list2 = C61878OQg.INSTANCE;
            }
            this.LJLIL.x3().submitList(this.LJLIL.C3().invoke(list2));
            return C76800UCe.LIZ;
        }
        if ((this.LJLILLLLZI instanceof C89463fC) && c92183ja.LIZIZ()) {
            this.LJLIL.LLF = true;
            return C76800UCe.LIZ;
        }
        ChatRoomViewModel v32 = this.LJLIL.v3();
        if (v32 != null && (interfaceC99713vj = v32.LJLL) != null && (LJ = interfaceC99713vj.LJ()) != null) {
            list = C109434Rf.LJIILLIIL(LJ);
        } else {
            list = C61878OQg.INSTANCE;
        }
        this.LJLIL.x3().submitList(this.LJLIL.C3().invoke(list), new ARunnableS7S0110000_1(this.LJLIL, C1029542h.LIZ(this.LJLILLLLZI, list, c92183ja.LIZIZ(), new AqS167S0100000_1(this.LJLIL, 446), new C1029642i(this.LJLIL.x3())), 4));
        c84683Ua.LIZ(c3y6, C46B.LIZLLL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
