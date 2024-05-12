package X;

import Y.AfS1S0211000_13;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import com.ss.android.ugc.aweme.ufr.contact.ContactUFR;

/* loaded from: classes14.dex */
public final class UP5<T> implements InterfaceC86003Zc {
    public final /* synthetic */ ContactUFR LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;

    public UP5(ContactUFR contactUFR, boolean z, boolean z2, int i) {
        this.LJLIL = contactUFR;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C77150UPq> interfaceC73573Su9) {
        ContactUFR contactUFR = this.LJLIL;
        FriendApi.LIZ.getClass();
        C73454SsE LJJJ = C57126MbS.LIZ().syncSocialRelationStatusInRx(1, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), UTK.LIZIZ.LIZLLL(EnumC77147UPn.EMAIL).LIZIZ()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
        boolean z = this.LJLILLLLZI;
        ContactUFR contactUFR2 = this.LJLIL;
        int i = this.LJLJJI;
        C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        contactUFR.LJLJLJ = (C73411SrX) LJJJ.LJJJLIIL(new AfS1S0211000_13(z, contactUFR2, i, c73433Srt, 1), new AfS1S0211000_13(z, contactUFR2, i, c73433Srt, 2));
    }
}
