package X;

import com.bytedance.mota.storage.motacache.IMotaCache;
import fjb.a;
import java.util.List;

/* JADX WARN: Incorrect field signature: TD; */
/* JADX WARN: Incorrect field signature: TM; */
@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.state.base.OperationalStateAgent$motaRequest$2", f = "OperationalStateAgent.kt", l = {141}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class XGF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ XGE LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC199277rv LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<C57355Mf9<D>, C57355Mf9<D>> LJLJJL;
    public final /* synthetic */ InterfaceC88473Ynt<String, InterfaceC199277rv, Boolean, List<IMotaCache>> LJLJJLL;
    public final /* synthetic */ XGD<S> LJLJL;
    public final /* synthetic */ InterfaceC88471Ynr<String, Throwable, C76800UCe> LJLJLJ;
    public final /* synthetic */ InterfaceC88471Ynr<String, Boolean, C76800UCe> LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TM;Ljava/lang/String;TD;LX/Yns<-LX/Mf9<TD;>;LX/Mf9<TD;>;>;LX/Ynt<-Ljava/lang/String;-LX/7rv;-Ljava/lang/Boolean;+Ljava/util/List<+Lcom/bytedance/mota/storage/motacache/IMotaCache;>;>;LX/XGD<TS;>;LX/Ynr<-Ljava/lang/String;-Ljava/lang/Throwable;LX/UCe;>;LX/Ynr<-Ljava/lang/String;-Ljava/lang/Boolean;LX/UCe;>;LX/2kd<-LX/XGF;>;)V */
    public XGF(XGE xge, String str, InterfaceC199277rv interfaceC199277rv, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88473Ynt interfaceC88473Ynt, XGD xgd, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr interfaceC88471Ynr2, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = xge;
        this.LJLJI = str;
        this.LJLJJI = interfaceC199277rv;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = interfaceC88473Ynt;
        this.LJLJL = xgd;
        this.LJLJLJ = interfaceC88471Ynr;
        this.LJLJLLL = interfaceC88471Ynr2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new XGF(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
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
            XGR LIZ = XGJ.LIZ().LIZ(this.LJLILLLLZI);
            LIZ.LIZ(new XH4(new XHQ(this.LJLJI)));
            InterfaceC199277rv interfaceC199277rv = this.LJLJJI;
            InterfaceC88472Yns<C57355Mf9<D>, C57355Mf9<D>> interfaceC88472Yns = this.LJLJJL;
            InterfaceC88473Ynt<String, InterfaceC199277rv, Boolean, List<IMotaCache>> interfaceC88473Ynt = this.LJLJJLL;
            String str = this.LJLJI;
            if (interfaceC199277rv != null) {
                LIZ.LIZ(new C84568XGy(interfaceC199277rv));
            }
            if (interfaceC88472Yns != 0) {
                LIZ.LIZ(new C84566XGw(new XGG(interfaceC88472Yns)));
            }
            if (C52535Kjb.LIZIZ()) {
                LIZ.LIZ(new C84567XGx(new XGB(interfaceC88473Ynt, str)));
            }
            V1Z LJJJJLL = V1M.LJJJJLL(LIZ.LIZIZ(), 2);
            XGH xgh = new XGH(this.LJLJL, this.LJLJI, this.LJLJLJ, this.LJLJLLL);
            this.LJLIL = 1;
            if (LJJJJLL.collect(xgh, this) == enumC58928NAu) {
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
