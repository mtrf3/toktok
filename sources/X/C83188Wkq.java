package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySourceHelper$doUpdatePanelComposerData$1$2", f = "BeautySourceHelper.kt", l = {24}, m = "invokeSuspend")
/* renamed from: X.Wkq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83188Wkq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC83142Wk6 LJLILLLLZI;
    public final /* synthetic */ C68148Qoq LJLJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr LJLJJL;
    public final /* synthetic */ InterfaceC83142Wk6 LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83188Wkq(InterfaceC83142Wk6 interfaceC83142Wk6, InterfaceC67352kd interfaceC67352kd, C68148Qoq c68148Qoq, InterfaceC70422pa interfaceC70422pa, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC83142Wk6 interfaceC83142Wk62) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC83142Wk6;
        this.LJLJI = c68148Qoq;
        this.LJLJJI = interfaceC70422pa;
        this.LJLJJL = interfaceC88471Ynr;
        this.LJLJJLL = interfaceC83142Wk62;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C83188Wkq(this.LJLILLLLZI, completion, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
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
            XIA xia = C78613UtF.LIZJ;
            C83189Wkr c83189Wkr = new C83189Wkr(this, null);
            this.LJLIL = 1;
            if (XKX.LJI(xia, c83189Wkr, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
