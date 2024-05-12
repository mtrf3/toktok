package X;

import com.ss.android.ugc.aweme.aigc.AIGCAvatarServiceImpl;
import com.ss.android.ugc.aweme.aigc.AIGCStyle;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcStyleViewModel;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS172S0100000_6;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.aigc.ProfileAigcStyleViewModel$onPrepared$1$1", f = "ProfileAigcStyleViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EDA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ProfileAigcStyleViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EDA(ProfileAigcStyleViewModel profileAigcStyleViewModel, InterfaceC67352kd<? super EDA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = profileAigcStyleViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EDA(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.setState(new AqS172S0100000_6(AIGCAvatarServiceImpl.LJIILL().getAIGCStyles(), (List<AIGCStyle>) 24));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
