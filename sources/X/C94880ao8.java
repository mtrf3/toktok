package X;

import Y.IDfS15S0300000_42;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.spotify.sdk.android.auth.AuthorizationResponse;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$onActivityResultFromSpotifyAuth$6$1", f = "AddToMusicDspAuthUtil.kt", l = {2983}, m = "invokeSuspend")
/* renamed from: X.ao8, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94880ao8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AuthorizationResponse LJLILLLLZI;
    public final /* synthetic */ Fragment LJLJI;
    public final /* synthetic */ Activity LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94880ao8(AuthorizationResponse authorizationResponse, Fragment fragment, Activity activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C94880ao8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = authorizationResponse;
        this.LJLJI = fragment;
        this.LJLJJI = activity;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94880ao8(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            InterfaceC94324afA operator = C94302aeo.LJIIJ().getOperator();
            int value = DspPlatform.SPOTIFY.getValue();
            String str = C87639YaR.LIZ().spotifyClientId;
            String str2 = this.LJLILLLLZI.mCode;
            o.LJIIIIZZ(str2, "response.code");
            InterfaceC65462ha LJJIJLIJ = operator.LJJIJLIJ(value, str, str2);
            IDfS15S0300000_42 iDfS15S0300000_42 = new IDfS15S0300000_42(this.LJLJI, this.LJLJJI, this.LJLJJL, 4);
            this.LJLIL = 1;
            if (LJJIJLIJ.collect(iDfS15S0300000_42, this) == enumC58928NAu) {
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
