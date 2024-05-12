package X;

import Y.AfS19S1100000_4;
import Y.AfS53S0200000_4;
import android.content.DialogInterface;
import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AQK implements DialogInterface.OnDismissListener {
    public final /* synthetic */ M78 LJLIL;
    public final /* synthetic */ AQB LJLILLLLZI;
    public final /* synthetic */ C54082LKk LJLJI;
    public final /* synthetic */ C91883j6 LJLJJI;

    public AQK(M78 m78, AQB aqb, C54082LKk c54082LKk, C91883j6 c91883j6) {
        this.LJLIL = m78;
        this.LJLILLLLZI = aqb;
        this.LJLJI = c54082LKk;
        this.LJLJJI = c91883j6;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        String str;
        this.LJLIL.LIZ();
        C26343AVn.LIZJ = false;
        AQB aqb = this.LJLILLLLZI;
        C54082LKk c54082LKk = this.LJLJI;
        o.LJIIIIZZ(dialog, "dialog");
        C91883j6 c91883j6 = this.LJLJJI;
        aqb.getClass();
        AST LJIIIIZZ = ASQ.LJIIIIZZ(dialog);
        if (o.LJ(LJIIIIZZ, ASY.LIZ)) {
            str = "close";
        } else if (LJIIIIZZ instanceof ASU) {
            str = "save";
        } else {
            str = "leave_page";
        }
        if (((CompoundButton) c91883j6.LIZ()).isChecked()) {
            InterfaceC101453yX LJFF = PrivacyServiceImpl.LJIIIIZZ().LJFF();
            if (LJFF != null) {
                C78999UzT.LJFF(LJFF.LIZLLL(1).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new AfS19S1100000_4(aqb, str, 2), new AfS53S0200000_4(aqb, c54082LKk, 16), AQL.LIZ), IV8.LIZ);
                return;
            }
            return;
        }
        AQB.LJIIIZ(0, str);
        AQB.LJIIIIZZ(0, 1, 0);
    }
}
