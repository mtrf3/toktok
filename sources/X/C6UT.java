package X;

import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.addyours.RecordAddYoursStickerComponent$onCreate$1$6$1$1", f = "RecordAddYoursStickerComponent.kt", l = {248}, m = "invokeSuspend")
/* renamed from: X.6UT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C6QO LJLILLLLZI;
    public final /* synthetic */ C6UY LJLJI;
    public final /* synthetic */ C6UV LJLJJI;
    public final /* synthetic */ C6QO LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6UT(C6QO c6qo, C6UY c6uy, C6UV c6uv, C6QO c6qo2, InterfaceC67352kd<? super C6UT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c6qo;
        this.LJLJI = c6uy;
        this.LJLJJI = c6uv;
        this.LJLJJL = c6qo2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C6UT(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String string;
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
            C6QO c6qo = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (c6qo.LJIJJLI(false, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        int LIZLLL = C226388uY.LIZLLL();
        if (LIZLLL == C6UU.ADD_YOURS.getValue()) {
            string = C78688UuS.LJJIII(this.LJLJI).getString(R.string.bcn);
        } else if (LIZLLL == C6UU.POST_YOURS.getValue()) {
            string = C78688UuS.LJJIII(this.LJLJI).getString(R.string.bco);
        } else {
            string = C78688UuS.LJJIII(this.LJLJI).getString(R.string.bcn);
        }
        o.LJIIIIZZ(string, "when (AddYoursUtils.getT…                        }");
        this.LJLJJI.cP(true, string, this.LJLJJL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
