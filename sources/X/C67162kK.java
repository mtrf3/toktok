package X;

import android.content.Context;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.ies.cutsame.prepare.ReverseVideoHelper$startReverse$1", f = "ReverseVideoHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2kK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67162kK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<C171726oa> LJLIL;
    public final /* synthetic */ C171566oK LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<Float, C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C67162kK(List<C171726oa> list, C171566oK c171566oK, Context context, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C67162kK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = c171566oK;
        this.LJLJI = context;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = interfaceC88472Yns2;
        this.LJLJJLL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67162kK(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (!this.LJLIL.isEmpty()) {
            this.LJLILLLLZI.LIZ(0, this.LJLJI, this.LJLIL, this.LJLJJLL, this.LJLJJI, this.LJLJJL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
