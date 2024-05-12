package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.groupchat.recommend.assem.RecommendUserListViewModel$onRefresh$2", f = "RecommendUserListViewModel.kt", l = {33}, m = "invokeSuspend")
/* renamed from: X.2iO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65962iO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C65962iO(InterfaceC67352kd<? super C65962iO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65962iO(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                this.LJLIL = 1;
                obj = ((TikTokImApi) C30U.LIZIZ.getValue()).inboxEntranceUpdate(2, 1, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C3C5.m7constructorimpl((BaseResponse) obj);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C65962iO(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
