package Y;

import X.C42293Gin;
import X.C44630HfO;
import X.C45254HpS;
import X.C45928I0u;
import X.C76800UCe;
import X.HR5;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.app.PushCameraBlurActivity;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;

/* loaded from: classes8.dex */
public class IDCListenerS283S0100000_7 implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                return;
            case 1:
                onCancel$1(this, dialogInterface);
                return;
            case 2:
                onCancel$2(this, dialogInterface);
                return;
            case 3:
                onCancel$3(this, dialogInterface);
                return;
            case 4:
                onCancel$4(this, dialogInterface);
                return;
            case 5:
                onCancel$5(this, dialogInterface);
                return;
            case 6:
                onCancel$6(this, dialogInterface);
                return;
            case 7:
                onCancel$7(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDCListenerS283S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(IDCListenerS283S0100000_7 iDCListenerS283S0100000_7, DialogInterface dialogInterface) {
        ((PushCameraBlurActivity) iDCListenerS283S0100000_7.l0).finish();
    }

    public static final void onCancel$1(IDCListenerS283S0100000_7 iDCListenerS283S0100000_7, DialogInterface dialogInterface) {
        AObjectS127S0200000_7 aObjectS127S0200000_7 = ((HR5) iDCListenerS283S0100000_7.l0).LJLJLLL;
        if (aObjectS127S0200000_7 != null) {
            aObjectS127S0200000_7.invoke();
        }
    }

    public static final void onCancel$2(IDCListenerS283S0100000_7 iDCListenerS283S0100000_7, DialogInterface dialogInterface) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDCListenerS283S0100000_7.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onCancel$3(IDCListenerS283S0100000_7 iDCListenerS283S0100000_7, DialogInterface dialogInterface) {
        ((C45928I0u) iDCListenerS283S0100000_7.l0).LLJILLL = true;
    }

    public static final void onCancel$4(IDCListenerS283S0100000_7 iDCListenerS283S0100000_7, DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener cancelListener = ((CreativeLoadingDialogBuilder) iDCListenerS283S0100000_7.l0).getConfig().getCancelListener();
        if (cancelListener != null) {
            cancelListener.onCancel(dialogInterface);
        }
    }

    public static final void onCancel$5(IDCListenerS283S0100000_7 iDCListenerS283S0100000_7, DialogInterface dialogInterface) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C42293Gin) iDCListenerS283S0100000_7.l0).LIZJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onCancel$6(IDCListenerS283S0100000_7 iDCListenerS283S0100000_7, DialogInterface dialogInterface) {
        ((InterfaceC88472Yns) iDCListenerS283S0100000_7.l0).invoke(dialogInterface);
    }

    public static final void onCancel$7(IDCListenerS283S0100000_7 iDCListenerS283S0100000_7, DialogInterface dialogInterface) {
        InterfaceC65784Pro interfaceC65784Pro;
        C44630HfO c44630HfO = ((C45254HpS) iDCListenerS283S0100000_7.l0).LIZJ;
        if (c44630HfO != null && (interfaceC65784Pro = (InterfaceC65784Pro) c44630HfO.LIZ) != null) {
            interfaceC65784Pro.invoke();
        }
    }
}
