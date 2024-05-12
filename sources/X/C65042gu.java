package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.api.DMSocPubStatusApi;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.model.DMSocPubStatus;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.model.DMStoryStatusResponse;
import fjb.a;
import java.util.Collection;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.repo.DMSocPubStatusRepositoryImpl$requestInIOThread$1", f = "DMSocPubStatusRepository.kt", l = {37}, m = "invokeSuspend")
/* renamed from: X.2gu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65042gu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC65052gv<List<DMSocPubStatus>> LJLILLLLZI;
    public final /* synthetic */ List<String> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65042gu(InterfaceC65052gv<List<DMSocPubStatus>> interfaceC65052gv, List<String> list, InterfaceC67352kd<? super C65042gu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC65052gv;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65042gu(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
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
                List<String> list = this.LJLJI;
                DMSocPubStatusApi.LIZ.getClass();
                DMSocPubStatusApi dMSocPubStatusApi = C30L.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('[');
                LIZ2.append(ORZ.LLD(list, ",", null, null, null, 62));
                LIZ2.append(']');
                String LIZIZ = X1D.LIZIZ(LIZ2);
                this.LJLIL = 1;
                obj = dMSocPubStatusApi.getStatus(LIZIZ, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = (DMStoryStatusResponse) obj;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        DMStoryStatusResponse dMStoryStatusResponse = (DMStoryStatusResponse) LIZ;
        if (((C73578SuE) this.LJLILLLLZI).isDisposed()) {
            return C76800UCe.LIZ;
        }
        if (dMStoryStatusResponse != null) {
            InterfaceC65052gv<List<DMSocPubStatus>> interfaceC65052gv = this.LJLILLLLZI;
            Collection collection = dMStoryStatusResponse.statusList;
            if (collection == null) {
                collection = C61878OQg.INSTANCE;
            }
            ((C73578SuE) interfaceC65052gv).onSuccess(collection);
        } else {
            ((C73578SuE) this.LJLILLLLZI).onSuccess(C61878OQg.INSTANCE);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
