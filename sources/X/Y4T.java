package X;

import com.ss.android.ugc.aweme.account.eventtracking.ClientSmsVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y4T<T> implements InterfaceC64592gB {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ InterfaceC69056R8i LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public Y4T(AqS161S0100000_11 aqS161S0100000_11, boolean z, boolean z2, InterfaceC69056R8i interfaceC69056R8i, int i) {
        this.LJLIL = aqS161S0100000_11;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = interfaceC69056R8i;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        if ((this.LJLILLLLZI || C62783OkV.LIZ()) && c69084R9k.getErrorCode() == 1011) {
            return;
        }
        C68986R5q.LIZ.LJ(c69084R9k.getErrorCode(), c69084R9k.getDetailErrorMsg(), false);
        boolean z = this.LJLILLLLZI;
        int errorCode = c69084R9k.getErrorCode();
        if (this.LJLJI) {
            str = "whatsapp";
        } else {
            str = "sms_verification";
        }
        C68972R5c.LJFF(z, errorCode, str, this.LJLJJI.q9(), null);
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(this.LJLJJI.q9().LJJLIIIJJI());
        clientSmsVerificationResultEvent.LJII(this.LJLJJI.q9().LJJLIIIJLLLLLLLZ());
        clientSmsVerificationResultEvent.LJIIIZ(Y4W.FAILURE.getValue());
        clientSmsVerificationResultEvent.LJIIJ(this.LJLJJL);
        clientSmsVerificationResultEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJFF();
    }
}
