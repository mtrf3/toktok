package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler$handle$1$preHandleShareJob$1", f = "BaseChannelShareHandler.kt", l = {57}, m = "invokeSuspend")
/* renamed from: X.Ofy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62502Ofy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C62501Ofx LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62502Ofy(C62501Ofx c62501Ofx, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c62501Ofx;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C62502Ofy(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            C62501Ofx c62501Ofx = this.LJLILLLLZI;
            BaseChannelShareHandler baseChannelShareHandler = c62501Ofx.LJLJI;
            Context context = c62501Ofx.LJLJJI;
            BaseSharePackage baseSharePackage = c62501Ofx.LJLJJL;
            InterfaceC62225ObV interfaceC62225ObV = c62501Ofx.LJLJJLL;
            View view = c62501Ofx.LJLJL;
            this.LJLIL = 1;
            obj = baseChannelShareHandler.LJIIJ(context, baseSharePackage, interfaceC62225ObV, view, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
