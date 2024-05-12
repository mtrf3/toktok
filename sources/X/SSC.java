package X;

import com.ss.android.ugc.aweme.aigc.IAIGCAvatarService;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarViewModel$handleDiscard$1", f = "ProfileAigcAvatarViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class SSC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ProfileAigcAvatarViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSC(ProfileAigcAvatarViewModel profileAigcAvatarViewModel, InterfaceC67352kd<? super SSC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = profileAigcAvatarViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new SSC(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            IAIGCAvatarService aigcAvatarService = (IAIGCAvatarService) this.LJLIL.LJLJI.getValue();
            o.LJIIIIZZ(aigcAvatarService, "aigcAvatarService");
            aigcAvatarService.LJIIL(EnumC244439iZ.SOCIAL, null);
        } catch (Exception e) {
            C221018lt.LJ(e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
