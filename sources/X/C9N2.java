package X;

import android.view.View;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV3;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV3$updateUserData$1", f = "I18nMyProfileFragmentV3.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9N2, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9N2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ I18nMyProfileFragmentV3 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ ProfileUser LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9N2(I18nMyProfileFragmentV3 i18nMyProfileFragmentV3, String str, ProfileUser profileUser, InterfaceC67352kd<? super C9N2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = i18nMyProfileFragmentV3;
        this.LJLILLLLZI = str;
        this.LJLJI = profileUser;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9N2(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        I18nMyProfileFragmentV3 i18nMyProfileFragmentV3 = this.LJLIL;
        String str = this.LJLILLLLZI;
        ProfileUser profileUser = this.LJLJI;
        View pageView = i18nMyProfileFragmentV3.LLI;
        o.LJIIIIZZ(pageView, "pageView");
        i18nMyProfileFragmentV3.km(str, profileUser, pageView);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
