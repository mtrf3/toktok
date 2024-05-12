package X;

import com.ss.android.ugc.aweme.account.eventtracking.ClientSmsVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;

/* loaded from: classes16.dex */
public final class Y4V<T> implements InterfaceC64592gB {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ InterfaceC69056R8i LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public Y4V(boolean z, InterfaceC69056R8i interfaceC69056R8i, int i) {
        this.LJLIL = z;
        this.LJLILLLLZI = interfaceC69056R8i;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        boolean z;
        String str;
        C69022R7a c69022R7a = (C69022R7a) obj;
        if (c69022R7a.LJFF == null) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJLIL) {
            str = "whatsapp";
        } else {
            str = "sms_verification";
        }
        C68972R5c.LJIIIZ(z, str, this.LJLILLLLZI.q9(), c69022R7a.LJFF, null);
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(this.LJLILLLLZI.q9().LJJLIIIJJI());
        clientSmsVerificationResultEvent.LJII(this.LJLILLLLZI.q9().LJJLIIIJLLLLLLLZ());
        clientSmsVerificationResultEvent.LJIIIZ(Y4W.SUCCESS.getValue());
        clientSmsVerificationResultEvent.LJIIJ(this.LJLJI);
        clientSmsVerificationResultEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJFF();
    }
}
