package X;

import Y.AfS1S0211000_13;
import com.ss.android.ugc.aweme.friends.api.FriendApi;

/* loaded from: classes14.dex */
public final class UPE<T> implements InterfaceC86003Zc {
    public final /* synthetic */ UPG LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;

    public UPE(UPG upg, boolean z, boolean z2, int i) {
        this.LJLIL = upg;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C77150UPq> interfaceC73573Su9) {
        UPG upg = this.LJLIL;
        FriendApi.LIZ.getClass();
        C73454SsE LJJJ = C57126MbS.LIZ().syncSocialRelationStatusInRx(2, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
        boolean z = this.LJLILLLLZI;
        UPG upg2 = this.LJLIL;
        int i = this.LJLJJI;
        C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        upg.LJLLILLLL = (C73411SrX) LJJJ.LJJJLIIL(new AfS1S0211000_13(z, upg2, i, c73433Srt, 3), new AfS1S0211000_13(z, upg2, i, c73433Srt, 4));
    }
}
