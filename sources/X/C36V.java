package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController$callApi$2$2", f = "BlockUserController.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.36V, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36V extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C784636c LJLIL;
    public final /* synthetic */ Exception LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36V(C784636c c784636c, Exception exc, InterfaceC67352kd<? super C36V> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c784636c;
        this.LJLILLLLZI = exc;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36V(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        MG5 mg5;
        C141335gf.LIZJ(obj);
        C784636c c784636c = this.LJLIL;
        Exception exc = this.LJLILLLLZI;
        c784636c.LJLJJL.invoke(c784636c.LJLILLLLZI);
        if (exc instanceof C38333F2r) {
            if (((C38306F1q) exc).getErrorCode() == 3002038) {
                C26227ARb c26227ARb = new C26227ARb(c784636c.LJLIL);
                c26227ARb.LIZ(R.string.p4s);
                UC0.LIZJ(c26227ARb, new AqS167S0100000_1(c784636c, 341));
                C26231ARf LJI = c26227ARb.LJI();
                c784636c.LJLJLJ = LJI;
                LJI.LIZLLL();
            } else {
                c784636c.LJFF(-1);
            }
        } else {
            Activity activity = c784636c.LJLIL;
            String str = c784636c.LJLJI;
            if (o.LJ(str, "chat_detail")) {
                mg5 = MG5.CHAT_DETAILS;
            } else if (o.LJ(str, "chat_list_page")) {
                mg5 = MG5.CHAT_LIST;
            } else {
                mg5 = MG5.CHAT;
            }
            C85163Vw.LIZLLL(activity, null, mg5, 2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
