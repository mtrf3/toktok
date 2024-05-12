package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.state.base.OperationalStateAgent$motaRequest$2$2$1", f = "OperationalStateAgent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class XGI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ XGX<D> LJLIL;
    public final /* synthetic */ XGD<S> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<String, Throwable, C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<String, Boolean, C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public XGI(XGX<D> xgx, XGD<S> xgd, String str, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe> interfaceC88471Ynr2, InterfaceC67352kd<? super XGI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = xgx;
        this.LJLILLLLZI = xgd;
        this.LJLJI = str;
        this.LJLJJI = interfaceC88471Ynr;
        this.LJLJJL = interfaceC88471Ynr2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new XGI(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Object obj2 = this.LJLIL;
        if (obj2 instanceof XGT) {
            this.LJLILLLLZI.LJLILLLLZI.LIZLLL(this.LJLJI);
            InterfaceC88471Ynr<String, Throwable, C76800UCe> interfaceC88471Ynr = this.LJLJJI;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(this.LJLJI, ((XGT) this.LJLIL).LJFF);
            }
        } else if (obj2 instanceof XGW) {
            Object LJ = this.LJLILLLLZI.LJ(this.LJLJI);
            if (C78977Uz7.LJJJJI(this.LJLIL.LIZJ) == EnumC78982UzC.Optimistic) {
                XGD<S> xgd = this.LJLILLLLZI;
                this.LJLILLLLZI.LJLILLLLZI.LIZIZ(xgd.LJIILL(LJ), this.LJLJI);
                InterfaceC88471Ynr<String, Boolean, C76800UCe> interfaceC88471Ynr2 = this.LJLJJL;
                if (interfaceC88471Ynr2 != null) {
                    interfaceC88471Ynr2.invoke(this.LJLJI, Boolean.TRUE);
                }
            } else {
                this.LJLILLLLZI.LJLILLLLZI.LIZJ(LJ, this.LJLJI);
                InterfaceC88471Ynr<String, Boolean, C76800UCe> interfaceC88471Ynr3 = this.LJLJJL;
                if (interfaceC88471Ynr3 != null) {
                    interfaceC88471Ynr3.invoke(this.LJLJI, Boolean.FALSE);
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
