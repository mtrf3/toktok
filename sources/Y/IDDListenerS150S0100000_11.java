package Y;

import X.C68517Qun;
import X.DialogC68993R5x;
import X.QNF;
import android.content.DialogInterface;
import com.bytedance.bdturing.verify.RiskControlService;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;

/* loaded from: classes12.dex */
public class IDDListenerS150S0100000_11 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDDListenerS150S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(IDDListenerS150S0100000_11 iDDListenerS150S0100000_11, DialogInterface dialogInterface) {
        RiskControlService riskControlService = ((QNF) ((ARunnableS47S0100000_11) iDDListenerS150S0100000_11.l0).l0).LIZ;
        if (dialogInterface == riskControlService.mDialogShowing) {
            riskControlService.mDialogShowing = null;
        }
    }

    public static final void onDismiss$1(IDDListenerS150S0100000_11 iDDListenerS150S0100000_11, DialogInterface dialogInterface) {
        if (((DialogC68993R5x) iDDListenerS150S0100000_11.l0).LJLLJ) {
            C68517Qun.LIZ.LJIIL(new BaseLoginMethod(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
        }
    }
}
