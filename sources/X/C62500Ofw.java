package X;

import android.content.Context;
import com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler$executeShare$1", f = "BaseChannelShareHandler.kt", l = {121}, m = "invokeSuspend")
/* renamed from: X.Ofw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62500Ofw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BaseChannelShareHandler LJLILLLLZI;
    public final /* synthetic */ InterfaceC62526OgM LJLJI;
    public final /* synthetic */ InterfaceC62225ObV LJLJJI;
    public final /* synthetic */ BaseSharePackage LJLJJL;
    public final /* synthetic */ Context LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62500Ofw(BaseChannelShareHandler baseChannelShareHandler, InterfaceC62526OgM interfaceC62526OgM, InterfaceC62225ObV interfaceC62225ObV, BaseSharePackage baseSharePackage, Context context, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = baseChannelShareHandler;
        this.LJLJI = interfaceC62526OgM;
        this.LJLJJI = interfaceC62225ObV;
        this.LJLJJL = baseSharePackage;
        this.LJLJJLL = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C62500Ofw(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
                C62499Ofv c62499Ofv = new C62499Ofv(this, null);
                this.LJLIL = 1;
                if (T2R.LJJIFFI(c62499Ofv, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception e) {
            InterfaceC62526OgM interfaceC62526OgM = this.LJLJI;
            if (interfaceC62526OgM != null) {
                interfaceC62526OgM.LIZIZ(this.LJLJJLL, this.LJLJJL, this.LJLJJI, new C35905E7h(String.valueOf(e.getMessage()), 1));
            }
        }
        return C76800UCe.LIZ;
    }
}
