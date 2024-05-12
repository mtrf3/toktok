package X;

import com.bytedance.ugc.effectcreator.main.MainFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$getProjectSize$2$1", f = "MainFragment.kt", l = {251}, m = "invokeSuspend")
/* renamed from: X.aoh, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94915aoh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C72242sW LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C94920aom LJLJI;
    public final /* synthetic */ C72242sW LJLJJI;
    public final /* synthetic */ C68322mC LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94915aoh(C94920aom c94920aom, C72242sW c72242sW, C68322mC c68322mC, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c94920aom;
        this.LJLJJI = c72242sW;
        this.LJLJJL = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94915aoh(this.LJLJI, this.LJLJJI, this.LJLJJL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C72242sW c72242sW;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                c72242sW = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            c72242sW = this.LJLJJI;
            MainFragment mainFragment = this.LJLJI.LJLJI;
            String str = (String) this.LJLJJL.element;
            this.LJLIL = c72242sW;
            this.LJLILLLLZI = 1;
            mainFragment.getClass();
            obj = XKX.LJI(C78613UtF.LIZJ, new C94914aog(str, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        c72242sW.element = ((Number) obj).longValue();
        return C76800UCe.LIZ;
    }
}
