package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;
import kotlin.jvm.internal.AqS168S0100000_2;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.checkpoint.CheckPointServiceImpl$saveCheckPointInternal$1", f = "CheckPointServiceImpl.kt", l = {202}, m = "invokeSuspend")
/* renamed from: X.5tF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149135tF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<C142535ib, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C149135tF(VideoPublishEditModel videoPublishEditModel, InterfaceC88472Yns<? super C142535ib, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C149135tF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C149135tF(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            H78.LJI("CheckPointServiceImpl begin save CheckPoint");
            InterfaceC41392GMi LJFF = C60903NvH.LJIIJJI().LJJJI().LJFF();
            C41021G8b c41021G8b = new C41021G8b(this.LJLILLLLZI, new GLI("CheckPointServiceImpl", 4));
            AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(this.LJLILLLLZI, 649);
            this.LJLIL = 1;
            obj = LJFF.LIZIZ(c41021G8b, aqS168S0100000_2, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        InterfaceC88472Yns<C142535ib, C76800UCe> interfaceC88472Yns = this.LJLJI;
        if (interfaceC88472Yns != 0) {
            interfaceC88472Yns.invoke(obj);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
