package X;

import Y.IDeS363S0100000_42;
import Y.IDfS134S0100000_42;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo;
import com.ss.android.ugc.aweme.music.app.auth.setting.page.MusicAuthPlatformsSettingPage;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.setting.page.MusicAuthPlatformsSettingPage$loadDspPlatformList$1", f = "MusicAuthPlatformsSettingPage.kt", l = {480}, m = "invokeSuspend")
/* renamed from: X.an2, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94812an2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MusicAuthPlatformsSettingPage LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94812an2(MusicAuthPlatformsSettingPage musicAuthPlatformsSettingPage, InterfaceC67352kd<? super C94812an2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = musicAuthPlatformsSettingPage;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94812an2(this.LJLILLLLZI, interfaceC67352kd);
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
            InterfaceC65462ha<List<TT2DSPPlatformInfo>> LJI = C94302aeo.LJLIL.LJI();
            IDfS134S0100000_42 iDfS134S0100000_42 = new IDfS134S0100000_42(this.LJLILLLLZI, 2);
            this.LJLIL = 1;
            if (((IDeS363S0100000_42) LJI).collect(iDfS134S0100000_42, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
