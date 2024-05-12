package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSmsVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;

/* loaded from: classes16.dex */
public final class Y4U<T> implements InterfaceC64592gB {
    public final /* synthetic */ InterfaceC69056R8i LJLIL;
    public final /* synthetic */ Fragment LJLILLLLZI;
    public final /* synthetic */ EnumC69113RAn LJLJI;

    public Y4U(InterfaceC69056R8i interfaceC69056R8i, Fragment fragment, EnumC69113RAn enumC69113RAn) {
        this.LJLIL = interfaceC69056R8i;
        this.LJLILLLLZI = fragment;
        this.LJLJI = enumC69113RAn;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        C1JD.LJJ(0, this.LJLIL.q9().LJJLIIIJJI(), "change_bind_phone_click", "phone", this.LJLIL.Hg());
        String LJJLIIIJJI = this.LJLIL.q9().LJJLIIIJJI();
        String LJJLIIIJLLLLLLLZ = this.LJLIL.q9().LJJLIIIJLLLLLLLZ();
        Bundle arguments = this.LJLILLLLZI.getArguments();
        if (arguments != null) {
            str = arguments.getString("page");
        } else {
            str = null;
        }
        C1JD.LJJI("phone_bind_status", LJJLIIIJJI, LJJLIIIJLLLLLLLZ, str, "verified_old_phone");
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(this.LJLIL.q9().LJJLIIIJJI());
        clientSmsVerificationResultEvent.LJII(this.LJLIL.q9().LJJLIIIJLLLLLLLZ());
        clientSmsVerificationResultEvent.LJIIIZ(Y4W.SUCCESS.getValue());
        clientSmsVerificationResultEvent.LJIIJ(C69093R9t.LJIJ(this.LJLJI));
        clientSmsVerificationResultEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJFF();
    }
}
