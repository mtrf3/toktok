package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.AmazonAccessTokenResponse;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$refreshAccessTokenAsync$flow$2$1", f = "AddToMusicDspAuthUtil.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.anu, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94866anu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ XGX<C94486ahm> LJLIL;
    public final /* synthetic */ DspPlatform LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94866anu(XGX<C94486ahm> xgx, DspPlatform dspPlatform, Activity activity, InterfaceC67352kd<? super C94866anu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = xgx;
        this.LJLILLLLZI = dspPlatform;
        this.LJLJI = activity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94866anu(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        String str2;
        C141335gf.LIZJ(obj);
        XGX<C94486ahm> xgx = this.LJLIL;
        if (xgx instanceof XGW) {
            D d = ((XGW) xgx).LJ;
            AmazonAccessTokenResponse amazonAccessTokenResponse = ((C94486ahm) d).LIZ;
            String str3 = "";
            if (amazonAccessTokenResponse == null || (str = amazonAccessTokenResponse.accessToken) == null) {
                str = "";
            }
            AmazonAccessTokenResponse amazonAccessTokenResponse2 = ((C94486ahm) d).LIZ;
            if (amazonAccessTokenResponse2 != null && (str2 = amazonAccessTokenResponse2.refreshToken) != null) {
                str3 = str2;
            }
            C93922aYg.LJIIJ(this.LJLILLLLZI);
            C93922aYg.LJIIJJI(str, this.LJLILLLLZI);
            if (C78685UuP.LJJJZ(str3)) {
                C93922aYg.LJIIL(str3, this.LJLILLLLZI);
            }
            z = true;
        } else {
            if (xgx instanceof XGT) {
                C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
                c26045AKb.LJIIIIZZ(R.string.dtj);
                c26045AKb.LJIIJ();
            } else {
                C26045AKb c26045AKb2 = new C26045AKb(this.LJLJI);
                c26045AKb2.LJIIIIZZ(R.string.dtj);
                c26045AKb2.LJIIJ();
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}