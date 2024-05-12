package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.relation.auth.api.AuthApiService;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;
import com.ss.android.ugc.aweme.relation.auth.model.EmailUploadResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.email.EmailUploadHandler$upload$2", f = "EmailUploadHandler.kt", l = {70}, m = "invokeSuspend")
/* renamed from: X.UTc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77240UTc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ IAuthApi.IdentityBody LJLILLLLZI;
    public final /* synthetic */ OAE LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77240UTc(IAuthApi.IdentityBody identityBody, OAE oae, InterfaceC67352kd<? super C77240UTc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = identityBody;
        this.LJLJI = oae;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C77240UTc(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = false;
        boolean z2 = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                AuthApiService authApiService = AuthApiService.LIZIZ;
                IAuthApi.IdentityBody identityBody = this.LJLILLLLZI;
                TwoStepAuthApi.LIZ.getClass();
                AbstractC73638SvC<EmailUploadResponse> uploadHashIdentityInfo = authApiService.uploadHashIdentityInfo(identityBody, TwoStepAuthApi.LIZJ("/passport/identity/set_identity_info/"), this.LJLJI.LIZ);
                this.LJLIL = 1;
                obj = C77318UWc.LIZ(uploadHashIdentityInfo, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            EmailUploadResponse emailUploadResponse = (EmailUploadResponse) obj;
            emailUploadResponse.checkValid();
            if (emailUploadResponse.status_code != 0) {
                z2 = false;
            }
            if (z2) {
                LA5.LIZJ.storeLong("last_email_upload_time", System.currentTimeMillis());
            }
            z = z2;
        } catch (Exception unused) {
            C221018lt.LIZ("EmailUploadHandler", "fail to upload hashed email");
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
