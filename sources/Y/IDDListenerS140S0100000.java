package Y;

import X.AnonymousClass143;
import X.C0TM;
import X.C276616s;
import X.C38921fs;
import X.C41341jm;
import X.C41351jn;
import X.C73521StJ;
import X.InterfaceC74834TYo;
import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes.dex */
public class IDDListenerS140S0100000 implements DialogInterface.OnDismissListener {
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
            case 2:
                onDismiss$2(this, dialogInterface);
                return;
            case 3:
                onDismiss$3(this, dialogInterface);
                return;
            case 4:
                onDismiss$4(this, dialogInterface);
                return;
            case 5:
                onDismiss$5(this, dialogInterface);
                return;
            case 6:
                onDismiss$6(this, dialogInterface);
                return;
            case 7:
                onDismiss$7(this, dialogInterface);
                return;
            case 8:
                onDismiss$8(this, dialogInterface);
                return;
            case 9:
                onDismiss$9(this, dialogInterface);
                return;
            case 10:
                onDismiss$10(this, dialogInterface);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onDismiss$11(this, dialogInterface);
                return;
            case 12:
                onDismiss$12(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDDListenerS140S0100000(int i) {
        this.$t = i;
        this.l0 = null;
    }

    public IDDListenerS140S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(IDDListenerS140S0100000 iDDListenerS140S0100000, DialogInterface dialogInterface) {
        DialogFragment dialogFragment = (DialogFragment) iDDListenerS140S0100000.l0;
        Dialog dialog = dialogFragment.mDialog;
        if (dialog != null) {
            dialogFragment.onDismiss(dialog);
        }
    }

    public static final void onDismiss$1(IDDListenerS140S0100000 iDDListenerS140S0100000, DialogInterface dialogInterface) {
        ((C73521StJ) iDDListenerS140S0100000.l0).onSuccess(Boolean.TRUE);
    }

    public static final void onDismiss$10(IDDListenerS140S0100000 iDDListenerS140S0100000, DialogInterface dialogInterface) {
        ((C38921fs) iDDListenerS140S0100000.l0).LIZJ.LIZIZ().Vi0(true);
    }

    public static final void onDismiss$11(IDDListenerS140S0100000 iDDListenerS140S0100000, DialogInterface dialogInterface) {
        ((C38921fs) iDDListenerS140S0100000.l0).LIZJ.LIZIZ().Vi0(true);
    }

    public static final void onDismiss$12(IDDListenerS140S0100000 iDDListenerS140S0100000, DialogInterface dialogInterface) {
        C276616s c276616s = (C276616s) iDDListenerS140S0100000.l0;
        c276616s.LJ = false;
        c276616s.LIZIZ.LIZIZ().Vi0(true);
    }

    public static final void onDismiss$2(IDDListenerS140S0100000 iDDListenerS140S0100000, DialogInterface dialogInterface) {
        ((InterfaceC74834TYo) iDDListenerS140S0100000.l0).Vi0(false);
    }

    public static final void onDismiss$3(IDDListenerS140S0100000 iDDListenerS140S0100000, DialogInterface dialogInterface) {
        ((C41341jm) iDDListenerS140S0100000.l0).LJIIJ().Vi0(true);
    }

    public static final void onDismiss$4(IDDListenerS140S0100000 iDDListenerS140S0100000, DialogInterface dialogInterface) {
        ((C41341jm) iDDListenerS140S0100000.l0).LJIIJ().Vi0(true);
    }

    public static final void onDismiss$5(IDDListenerS140S0100000 iDDListenerS140S0100000, DialogInterface dialogInterface) {
        ((C41351jn) iDDListenerS140S0100000.l0).LJIIJ().Vi0(true);
    }

    public static final void onDismiss$6(IDDListenerS140S0100000 iDDListenerS140S0100000, DialogInterface dialogInterface) {
        ((C41351jn) iDDListenerS140S0100000.l0).LJIIJ().Vi0(true);
    }

    public static final void onDismiss$7(IDDListenerS140S0100000 iDDListenerS140S0100000, DialogInterface dialogInterface) {
        Runnable runnable = (Runnable) iDDListenerS140S0100000.l0;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void onDismiss$8(IDDListenerS140S0100000 iDDListenerS140S0100000, DialogInterface dialogInterface) {
        C0TM c0tm = (C0TM) iDDListenerS140S0100000.l0;
        c0tm.LJ = false;
        c0tm.LIZ().Vi0(true);
    }

    public static final void onDismiss$9(IDDListenerS140S0100000 iDDListenerS140S0100000, DialogInterface dialogInterface) {
        AnonymousClass143 anonymousClass143 = (AnonymousClass143) iDDListenerS140S0100000.l0;
        anonymousClass143.LJI = false;
        anonymousClass143.LIZJ.LIZIZ().Vi0(true);
    }
}
