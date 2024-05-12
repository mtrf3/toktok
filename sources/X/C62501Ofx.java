package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler$handle$1", f = "BaseChannelShareHandler.kt", l = {59}, m = "invokeSuspend")
/* renamed from: X.Ofx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62501Ofx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ BaseChannelShareHandler LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ BaseSharePackage LJLJJL;
    public final /* synthetic */ InterfaceC62225ObV LJLJJLL;
    public final /* synthetic */ View LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62501Ofx(BaseChannelShareHandler baseChannelShareHandler, Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV, View view, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = baseChannelShareHandler;
        this.LJLJJI = context;
        this.LJLJJL = baseSharePackage;
        this.LJLJJLL = interfaceC62225ObV;
        this.LJLJL = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C62501Ofx c62501Ofx = new C62501Ofx(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, completion);
        c62501Ofx.LJLIL = obj;
        return c62501Ofx;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC62526OgM LJ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                LJ = (InterfaceC62526OgM) this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
            LJ = this.LJLJI.LJ(this.LJLJJI, this.LJLJJL, this.LJLJJLL);
            if (LJ != null) {
                LJ.LIZ(this.LJLJJI, this.LJLJJL, this.LJLJJLL);
            }
            C84661XKn LIZIZ = XKX.LIZIZ(interfaceC70422pa, null, null, new C62502Ofy(this, null), 3);
            this.LJLIL = LJ;
            this.LJLILLLLZI = 1;
            obj = LIZIZ.LJJIJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            BaseChannelShareHandler baseChannelShareHandler = this.LJLJI;
            InterfaceC62225ObV interfaceC62225ObV = this.LJLJJLL;
            Context context = this.LJLJJI;
            BaseSharePackage baseSharePackage = this.LJLJJL;
            baseChannelShareHandler.getClass();
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C62500Ofw(baseChannelShareHandler, LJ, interfaceC62225ObV, baseSharePackage, context, null), 3);
        } else if (LJ != null) {
            LJ.LIZIZ(this.LJLJJI, this.LJLJJL, this.LJLJJLL, new C35905E7h("pre share intercept", 1));
        }
        return C76800UCe.LIZ;
    }
}
