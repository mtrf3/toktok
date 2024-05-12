package X;

import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$sendRequest$1$handleEffectFetchResponseSuccess$1$2$2", f = "BeautySource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.WkH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83153WkH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C68322mC LJLIL;
    public final /* synthetic */ C83147WkB LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83153WkH(C68322mC c68322mC, InterfaceC67352kd interfaceC67352kd, C83147WkB c83147WkB) {
        super(2, interfaceC67352kd);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c83147WkB;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C83153WkH(this.LJLIL, completion, this.LJLILLLLZI);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C83146WkA c83146WkA = this.LJLILLLLZI.LJLJI.LIZ;
        c83146WkA.LJJ = false;
        c83146WkA.LJIILLIIL((List) this.LJLIL.element);
        C83175Wkd.LIZIZ("LJT sendRequest: set categories to allData");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LJT sendRequest: allData size is ");
        LIZ.append(this.LJLILLLLZI.LJLJI.LIZ.LJJII.size());
        C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ));
        C82514WZy.LIZIZ(0, this.LJLILLLLZI.LJLJI.LIZIZ, "success");
        InterfaceC83127Wjr interfaceC83127Wjr = this.LJLILLLLZI.LJLJI.LIZJ;
        if (interfaceC83127Wjr != null) {
            interfaceC83127Wjr.onSuccess((List) this.LJLIL.element);
            return C76800UCe.LIZ;
        }
        return null;
    }
}
