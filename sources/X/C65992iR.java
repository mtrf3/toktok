package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel$sendNoticeAckEvent$1", f = "TopNoticeViewModel.kt", l = {347}, m = "invokeSuspend")
/* renamed from: X.2iR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65992iR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SessionListTopNoticeViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65992iR(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, String str, String str2, int i, String str3, InterfaceC67352kd<? super C65992iR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = sessionListTopNoticeViewModel;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = i;
        this.LJLJJLL = str3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65992iR(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
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
            TikTokImApi tikTokImApi = this.LJLILLLLZI.LJLILLLLZI;
            String str = this.LJLJI;
            String str2 = this.LJLJJI;
            int i2 = this.LJLJJL;
            String str3 = this.LJLJJLL;
            this.LJLIL = 1;
            obj = C80753Ex.LIZ(tikTokImApi, str, str2, i2, str3, null, this, 16);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendNoticeAckService OnSuccess called with ");
        LIZ.append(((BaseResponse) obj).status_code);
        C34B.LJI("TopNoticeViewModel", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
