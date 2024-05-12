package X;

import fjb.a;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.IDqS8S0400000;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {291}, m = "invokeSuspend")
/* renamed from: X.2BN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BN extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C0Q0<Object, C0Q9>>, Object> {
    public C1JK LJLIL;
    public C34K LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ C07070Pn<Object, C0Q9> LJLJJI;
    public final /* synthetic */ Object LJLJJL;
    public final /* synthetic */ InterfaceC07130Pt<Object, C0Q9> LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ InterfaceC88472Yns<C07070Pn<Object, C0Q9>, C76800UCe> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2BN(C07070Pn<Object, C0Q9> c07070Pn, Object obj, InterfaceC07130Pt<Object, C0Q9> interfaceC07130Pt, long j, InterfaceC88472Yns<? super C07070Pn<Object, C0Q9>, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C2BN> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLJJI = c07070Pn;
        this.LJLJJL = obj;
        this.LJLJJLL = interfaceC07130Pt;
        this.LJLJL = j;
        this.LJLJLJ = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2BN(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C0Q0<Object, C0Q9>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C34K c34k;
        C1JK c1jk;
        EnumC07170Px enumC07170Px;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        try {
            if (i != 0) {
                if (i == 1) {
                    c34k = this.LJLILLLLZI;
                    c1jk = this.LJLIL;
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                C07070Pn<Object, C0Q9> c07070Pn = this.LJLJJI;
                C1JK<Object, C0Q9> c1jk2 = c07070Pn.LIZJ;
                V v = (V) c07070Pn.LIZ.LIZ().invoke(this.LJLJJL);
                c1jk2.getClass();
                o.LJIIIZ(v, "<set-?>");
                c1jk2.LJLJI = v;
                C07070Pn<Object, C0Q9> c07070Pn2 = this.LJLJJI;
                c07070Pn2.LJ.setValue(this.LJLJJLL.LJFF());
                this.LJLJJI.LIZLLL.setValue(Boolean.TRUE);
                C1JK<Object, C0Q9> c1jk3 = this.LJLJJI.LIZJ;
                C1JK c1jk4 = new C1JK(c1jk3.LJLIL, c1jk3.getValue(), C78946Uyc.LJIIIZ(c1jk3.LJLJI), c1jk3.LJLJJI, Long.MIN_VALUE, c1jk3.LJLJJL);
                c34k = new C34K();
                InterfaceC07130Pt<Object, C0Q9> interfaceC07130Pt = this.LJLJJLL;
                long j = this.LJLJL;
                IDqS8S0400000 iDqS8S0400000 = new IDqS8S0400000((C07070Pn) this.LJLJJI, (C07070Pn<Object, C0Q9>) c1jk4, (C1JK<Object, C0Q9>) this.LJLJLJ, (InterfaceC88472Yns<? super C07070Pn<Object, C0Q9>, C76800UCe>) c34k, (C34K) 0);
                this.LJLIL = c1jk4;
                this.LJLILLLLZI = c34k;
                this.LJLJI = 1;
                c1jk = c1jk4;
                if (C07090Pp.LIZ(c1jk4, interfaceC07130Pt, j, iDqS8S0400000, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            if (c34k.element) {
                enumC07170Px = EnumC07170Px.BoundReached;
            } else {
                enumC07170Px = EnumC07170Px.Finished;
            }
            C07070Pn<Object, C0Q9> c07070Pn3 = this.LJLJJI;
            C1JK<Object, C0Q9> c1jk5 = c07070Pn3.LIZJ;
            c1jk5.LJLJI.LIZLLL();
            c1jk5.LJLJJI = Long.MIN_VALUE;
            c07070Pn3.LIZLLL.setValue(Boolean.FALSE);
            return new C0Q0(c1jk, enumC07170Px);
        } catch (CancellationException e) {
            C07070Pn<Object, C0Q9> c07070Pn4 = this.LJLJJI;
            C1JK<Object, C0Q9> c1jk6 = c07070Pn4.LIZJ;
            c1jk6.LJLJI.LIZLLL();
            c1jk6.LJLJJI = Long.MIN_VALUE;
            c07070Pn4.LIZLLL.setValue(Boolean.FALSE);
            throw e;
        }
    }
}
