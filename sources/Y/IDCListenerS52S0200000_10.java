package Y;

import X.C16880lQ;
import X.C40211FqJ;
import X.C62906OmU;
import X.C62907OmV;
import X.C86184Xs4;
import X.EnumC26325AUv;
import X.X1D;
import android.content.DialogInterface;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;

/* loaded from: classes11.dex */
public class IDCListenerS52S0200000_10 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            case 2:
                onClick$2(this, dialogInterface, i);
                return;
            case 3:
                onClick$3(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS52S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onClick$0(IDCListenerS52S0200000_10 iDCListenerS52S0200000_10, DialogInterface dialogInterface, int i) {
        if (!((C62907OmV) iDCListenerS52S0200000_10.l0).LIZIZ) {
            dialogInterface.dismiss();
        }
        DialogInterface.OnClickListener onClickListener = ((C62907OmV) iDCListenerS52S0200000_10.l0).LIZJ;
        if (onClickListener != null) {
            onClickListener.onClick((C62906OmU) iDCListenerS52S0200000_10.l1, i);
        }
    }

    public static final void onClick$1(IDCListenerS52S0200000_10 iDCListenerS52S0200000_10, DialogInterface dialogInterface, int i) {
        if (!((C62907OmV) iDCListenerS52S0200000_10.l0).LIZIZ) {
            dialogInterface.dismiss();
        }
        DialogInterface.OnClickListener onClickListener = ((C62907OmV) iDCListenerS52S0200000_10.l0).LIZJ;
        if (onClickListener != null) {
            onClickListener.onClick((C62906OmU) iDCListenerS52S0200000_10.l1, i);
        }
    }

    public static final void onClick$2(IDCListenerS52S0200000_10 iDCListenerS52S0200000_10, DialogInterface dialogInterface, int i) {
        if (!((C62907OmV) iDCListenerS52S0200000_10.l0).LIZIZ) {
            dialogInterface.dismiss();
        }
        DialogInterface.OnClickListener onClickListener = ((C62907OmV) iDCListenerS52S0200000_10.l0).LIZJ;
        if (onClickListener != null) {
            onClickListener.onClick((C62906OmU) iDCListenerS52S0200000_10.l1, i);
        }
    }

    public static final void onClick$3(IDCListenerS52S0200000_10 iDCListenerS52S0200000_10, DialogInterface dialogInterface, int i) {
        int i2;
        C86184Xs4 c86184Xs4 = (C86184Xs4) iDCListenerS52S0200000_10.l0;
        EnumC26325AUv enumC26325AUv = (EnumC26325AUv) iDCListenerS52S0200000_10.l1;
        c86184Xs4.getClass();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("package:");
            LIZ.append(c86184Xs4.LIZJ.getPackageName());
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(X1D.LIZIZ(LIZ)));
            intent.addFlags(268435456);
            if (enumC26325AUv == EnumC26325AUv.UPLOAD_PHOTO) {
                c86184Xs4.LJIILJJIL = true;
                i2 = 20001;
            } else {
                c86184Xs4.LJIILIIL = true;
                i2 = 20002;
            }
            C16880lQ.LJFF(c86184Xs4.LIZJ, i2, intent);
        } catch (Exception unused) {
            C40211FqJ.LIZIZ(c86184Xs4.LIZJ);
        }
    }
}
