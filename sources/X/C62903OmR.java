package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVApi;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVCheckResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.compliance.business.fbv.FBVService$checkFBVStatus$2", f = "FBVService.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48, LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48}, m = "invokeSuspend")
/* renamed from: X.OmR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62903OmR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super FBVCheckResponse>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C62904OmS LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62903OmR(C62904OmS c62904OmS, InterfaceC67352kd<? super C62903OmR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c62904OmS;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C62903OmR c62903OmR = new C62903OmR(this.LJLJI, interfaceC67352kd);
        c62903OmR.LJLILLLLZI = obj;
        return c62903OmR;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC64672gJ interfaceC64672gJ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC64672gJ = (InterfaceC64672gJ) this.LJLILLLLZI;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            interfaceC64672gJ = (InterfaceC64672gJ) this.LJLILLLLZI;
            H7B.LIZIZ("FBVService", "checkFBVStatus api call is performed");
            FBVApi fBVApi = this.LJLJI.LIZ;
            this.LJLILLLLZI = interfaceC64672gJ;
            this.LJLIL = 1;
            obj = fBVApi.consentAcceptance("effect_fbv_policy_US_IL", this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI = null;
        this.LJLIL = 2;
        if (interfaceC64672gJ.emit(obj, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super FBVCheckResponse> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
