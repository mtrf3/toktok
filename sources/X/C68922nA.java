package X;

import com.ss.android.ugc.aweme.services.now.model.CreativeNowDraft;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.external.CreativeNowDraftService$getNowDraftListAsync$1", f = "CreativeNowDraftService.kt", l = {69}, m = "invokeSuspend")
/* renamed from: X.2nA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68922nA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C41368GLk LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<List<CreativeNowDraft>, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C68922nA(C41368GLk c41368GLk, InterfaceC88472Yns<? super List<CreativeNowDraft>, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C68922nA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c41368GLk;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68922nA(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            List<CreativeNowDraft> nowDraftList = this.LJLILLLLZI.getNowDraftList();
            XIF xif = EXX.LIZ;
            C68912n9 c68912n9 = new C68912n9(this.LJLJI, nowDraftList, null);
            this.LJLIL = 1;
            if (XKX.LJI(xif, c68912n9, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
