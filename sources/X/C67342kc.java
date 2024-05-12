package X;

import fjb.a;
import java.util.concurrent.CancellationException;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.util.RequestKt$retry$2$onClick$1$1", f = "Request.kt", l = {65}, m = "invokeSuspend")
/* renamed from: X.2kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67342kc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public XJL LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ XJL<Object> LJLJI;
    public final /* synthetic */ InterfaceC88473Ynt<Long, Boolean, InterfaceC67352kd<Object>, Object> LJLJJI;
    public final /* synthetic */ C73305Spp LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<Exception, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C67342kc(XJL<Object> xjl, InterfaceC88473Ynt<? super Long, ? super Boolean, ? super InterfaceC67352kd<Object>, ? extends Object> interfaceC88473Ynt, C73305Spp c73305Spp, InterfaceC88472Yns<? super Exception, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C67342kc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = xjl;
        this.LJLJJI = interfaceC88473Ynt;
        this.LJLJJL = c73305Spp;
        this.LJLJJLL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67342kc(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        XJL<Object> xjl;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
            if (i != 0) {
                if (i == 1) {
                    xjl = this.LJLIL;
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                xjl = this.LJLJI;
                InterfaceC88473Ynt<Long, Boolean, InterfaceC67352kd<Object>, Object> interfaceC88473Ynt = this.LJLJJI;
                Long l = new Long(System.currentTimeMillis());
                Boolean bool = Boolean.TRUE;
                this.LJLIL = xjl;
                this.LJLILLLLZI = 1;
                obj = interfaceC88473Ynt.invoke(l, bool, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C3C5.m7constructorimpl(obj);
            xjl.resumeWith(obj);
        } catch (CancellationException unused) {
        } catch (Exception e) {
            this.LJLJJL.setVisibility(0);
            InterfaceC88472Yns<Exception, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(e);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
