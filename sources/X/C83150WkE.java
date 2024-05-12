package X;

import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$initComposerNodes$2", f = "BeautySource.kt", l = {265}, m = "invokeSuspend")
/* renamed from: X.WkE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83150WkE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C83146WkA LJLJI;
    public final /* synthetic */ ArrayList LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83150WkE(C83146WkA c83146WkA, ArrayList arrayList, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c83146WkA;
        this.LJLJJI = arrayList;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C83150WkE c83150WkE = new C83150WkE(this.LJLJI, this.LJLJJI, completion);
        c83150WkE.LJLIL = obj;
        return c83150WkE;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C84661XKn LIZIZ = XKX.LIZIZ((InterfaceC70422pa) this.LJLIL, C78613UtF.LIZJ, null, new C83107WjX(this, null), 2);
            this.LJLILLLLZI = 1;
            obj = LIZIZ.LJJIJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C1DJ.LJJII(this.LJLJI, new C83174Wkc((C81017Vqv) obj));
        this.LJLJI.P7();
        this.LJLJI.Y7();
        return C76800UCe.LIZ;
    }
}
