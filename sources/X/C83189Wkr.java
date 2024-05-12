package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySourceHelper$doUpdatePanelComposerData$1$2$1", f = "BeautySourceHelper.kt", l = {26}, m = "invokeSuspend")
/* renamed from: X.Wkr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83189Wkr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C83188Wkq LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83189Wkr(C83188Wkq c83188Wkq, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c83188Wkq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C83189Wkr c83189Wkr = new C83189Wkr(this.LJLJI, completion);
        c83189Wkr.LJLIL = obj;
        return c83189Wkr;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            obj2 = this.LJLIL;
            this.LJLIL = obj2;
            this.LJLILLLLZI = 1;
            if (C1JD.LIZJ(1000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        synchronized (obj2) {
            for (ComposerBeauty composerBeauty : C1DH.LJIIL(this.LJLJI.LJLILLLLZI.M7())) {
                composerBeauty.setEnable(true);
                C1DH.LIZLLL(composerBeauty, new C83190Wks(this.LJLJI.LJLILLLLZI.E7()), this.LJLJI.LJLJJL);
            }
            this.LJLJI.LJLJJLL.Y7();
        }
        return C76800UCe.LIZ;
    }
}
