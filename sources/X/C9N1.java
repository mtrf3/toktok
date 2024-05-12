package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV3;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV3$setAweme$1", f = "I18nMyProfileFragmentV3.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9N1, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9N1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ I18nMyProfileFragmentV3 LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9N1(I18nMyProfileFragmentV3 i18nMyProfileFragmentV3, Aweme aweme, InterfaceC67352kd<? super C9N1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = i18nMyProfileFragmentV3;
        this.LJLILLLLZI = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9N1(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ProfilePlatformViewModel em = this.LJLIL.em();
        Aweme aweme = this.LJLILLLLZI;
        em.getClass();
        em.setState(new AqS170S0100000_4(aweme, 1635));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
