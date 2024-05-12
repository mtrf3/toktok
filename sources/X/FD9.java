package X;

import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.ss.android.ugc.aweme.ecommerce.core.settings.EcomGeckoFrontUpdateModel;
import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.router.EcomGeckoUpdateInterceptor$updateGecko$1$1", f = "EcomGeckoUpdateInterceptor.kt", l = {260}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class FD9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EcomGeckoFrontUpdateModel LJLILLLLZI;
    public final /* synthetic */ java.util.Set<String> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ File LJLJJL;
    public final /* synthetic */ C61520OCm LJLJJLL;
    public final /* synthetic */ OptionCheckUpdateParams LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FD9(EcomGeckoFrontUpdateModel ecomGeckoFrontUpdateModel, java.util.Set<String> set, String str, File file, C61520OCm c61520OCm, OptionCheckUpdateParams optionCheckUpdateParams, InterfaceC67352kd<? super FD9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = ecomGeckoFrontUpdateModel;
        this.LJLJI = set;
        this.LJLJJI = str;
        this.LJLJJL = file;
        this.LJLJJLL = c61520OCm;
        this.LJLJL = optionCheckUpdateParams;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new FD9(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
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
            long delay = this.LJLILLLLZI.getDelay();
            this.LJLIL = 1;
            if (C1JD.LIZJ(delay, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        java.util.Set<String> set = this.LJLJI;
        String str = this.LJLJJI;
        C61520OCm c61520OCm = this.LJLJJLL;
        OptionCheckUpdateParams optionCheckUpdateParams = this.LJLJL;
        for (String str2 : set) {
            if (C61511OCd.LJIIIZ(str, str2)) {
                C70657RoD.LJIIIZ(str, str2);
            } else {
                c61520OCm.LIZ(null, C51029K0z.LJJIIZI(new OSZ(str, C47261Igj.LJJIJ(new CheckRequestBodyModel.TargetChannel(str2)))), optionCheckUpdateParams);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
