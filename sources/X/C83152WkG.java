package X;

import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$1", f = "BeautySource.kt", l = {174}, m = "invokeSuspend")
/* renamed from: X.WkG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83152WkG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C83146WkA LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83152WkG(C83146WkA c83146WkA, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c83146WkA;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C83152WkG(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
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
            C84661XKn LIZIZ = XKX.LIZIZ(C780334l.LJLIL, C78613UtF.LIZJ, null, new C83151WkF(this, null), 2);
            this.LJLIL = 1;
            obj = LIZIZ.LJJIJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        List<BeautyCategory> list = (List) obj;
        if (list != null) {
            this.LJLILLLLZI.LJIILLIIL(list);
            this.LJLILLLLZI.LJJ = false;
        } else {
            this.LJLILLLLZI.LJIILL();
        }
        return C76800UCe.LIZ;
    }
}
