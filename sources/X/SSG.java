package X;

import com.ss.android.ugc.aweme.aigc.IAIGCAvatarService;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarViewModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarViewModel$downloadSelectedAvatars$downloadImageExplicitly$1$1$onSaveFinished$1$1", f = "ProfileAigcAvatarViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class SSG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ProfileAigcAvatarViewModel LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ C76732zl LJLJJL;
    public final /* synthetic */ C76732zl LJLJJLL;
    public final /* synthetic */ List<String> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSG(ProfileAigcAvatarViewModel profileAigcAvatarViewModel, ActivityC45651qj activityC45651qj, String str, String str2, C76732zl c76732zl, C76732zl c76732zl2, List<String> list, InterfaceC67352kd<? super SSG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = profileAigcAvatarViewModel;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = c76732zl;
        this.LJLJJLL = c76732zl2;
        this.LJLJL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new SSG(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        IAIGCAvatarService iAIGCAvatarService = (IAIGCAvatarService) this.LJLIL.LJLJI.getValue();
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        List LJJIJ = C47261Igj.LJJIJ(this.LJLJI);
        C76732zl c76732zl = this.LJLJJL;
        ProfileAigcAvatarViewModel profileAigcAvatarViewModel = this.LJLIL;
        C76732zl c76732zl2 = this.LJLJJLL;
        iAIGCAvatarService.LJIIJJI(activityC45651qj, new C72116SSa(profileAigcAvatarViewModel, this.LJLJJI, this.LJLJL, c76732zl, c76732zl2), LJJIJ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
