package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUgcButtonVM;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUgcButtonVM$doCollect$2$response$1", f = "MusicDspUGCVM.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
/* renamed from: X.ZxL, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91607ZxL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super BaseResponse>, Object> {
    public int LJLIL;
    public final /* synthetic */ MusicDspUgcButtonVM LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91607ZxL(MusicDspUgcButtonVM musicDspUgcButtonVM, String str, String str2, InterfaceC67352kd<? super C91607ZxL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = musicDspUgcButtonVM;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C91607ZxL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C73454SsE LJLJJLL = ((InterfaceC91478ZvG) this.LJLILLLLZI.LJLL.getValue().getOperator()).LJLJJLL(this.LJLJI, this.LJLJJI);
            this.LJLIL = 1;
            obj = C77318UWc.LIZIZ(LJLJJLL, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
