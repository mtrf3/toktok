package X;

import android.content.Context;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.ies.cutsame.prepare.ResizeMediaHelper$startResize$1", f = "ResizeMediaHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2kL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67172kL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C171576oL LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ List<C171726oa> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Float, C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C67172kL(C171576oL c171576oL, Context context, List<C171726oa> list, InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, InterfaceC67352kd<? super C67172kL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c171576oL;
        this.LJLILLLLZI = context;
        this.LJLJI = list;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = interfaceC65784Pro;
        this.LJLJJLL = interfaceC88472Yns2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67172kL(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZIZ(0, this.LJLILLLLZI, this.LJLJI, this.LJLJJL, this.LJLJJI, this.LJLJJLL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
