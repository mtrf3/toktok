package Y;

import X.ActivityC45651qj;
import X.C188727au;
import X.C279017q;
import X.C54929Lh7;
import X.C54930Lh8;
import X.C55433LpF;
import X.C62905OmT;
import X.FMX;
import X.HG3;
import X.InterfaceC54150LNa;
import X.InterfaceC55058LjC;
import X.J9P;
import X.KUN;
import X.RBX;
import X.TAV;
import X.X1D;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDCListenerS51S0200000_9 implements DialogInterface.OnClickListener {
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

    public IDCListenerS51S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onClick$0(IDCListenerS51S0200000_9 iDCListenerS51S0200000_9, DialogInterface dialogInterface, int i) {
        Activity activity = (Activity) iDCListenerS51S0200000_9.l0;
        if (activity != null && (activity instanceof InterfaceC55058LjC)) {
            J9P.LIZIZ(activity, "recall_popup", "click", null, null);
            C55433LpF.LIZJ("confirm");
        }
    }

    public static final void onClick$1(IDCListenerS51S0200000_9 iDCListenerS51S0200000_9, DialogInterface dialogInterface, int i) {
        ComponentCallbacks2 componentCallbacks2 = (Activity) iDCListenerS51S0200000_9.l0;
        if (componentCallbacks2 != null && (componentCallbacks2 instanceof InterfaceC55058LjC)) {
            InterfaceC54150LNa mainHelper = ((InterfaceC55058LjC) componentCallbacks2).getMainHelper();
            if (mainHelper != null) {
                mainHelper.LIZJ();
            }
            C55433LpF.LIZJ("cancel");
        }
    }

    public static final void onClick$2(IDCListenerS51S0200000_9 iDCListenerS51S0200000_9, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (((LiveWallPaperPreviewActivity) iDCListenerS51S0200000_9.l1).getResources().getString(R.string.efd).equals(((TAV) iDCListenerS51S0200000_9.l0).LJLJI.get(i))) {
            C62905OmT c62905OmT = new C62905OmT((LiveWallPaperPreviewActivity) iDCListenerS51S0200000_9.l1);
            c62905OmT.LIZJ = ((LiveWallPaperPreviewActivity) iDCListenerS51S0200000_9.l1).getResources().getString(R.string.efp);
            c62905OmT.LJIIL(new IDCListenerS159S0100000_5(iDCListenerS51S0200000_9, 20), ((LiveWallPaperPreviewActivity) iDCListenerS51S0200000_9.l1).getResources().getString(R.string.dsg), false);
            c62905OmT.LJIIIZ(null, ((LiveWallPaperPreviewActivity) iDCListenerS51S0200000_9.l1).getResources().getString(R.string.cg_), false);
            C279017q.LIZLLL(c62905OmT);
        }
    }

    public static final void onClick$3(IDCListenerS51S0200000_9 iDCListenerS51S0200000_9, DialogInterface dialogInterface, int i) {
        C54929Lh7.LIZIZ((ActivityC45651qj) iDCListenerS51S0200000_9.l0, "popup_warning");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "dialog");
        c188727au.LJIIIZ("enter_from", ((C54930Lh8) iDCListenerS51S0200000_9.l1).LJLILLLLZI);
        FMX.LJIIL("enter_violation_record", c188727au.LIZ);
        String userId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(userId, "userId");
        KUN kun = C54929Lh7.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("has_click_warning_dialog_");
        LIZ.append(userId);
        kun.LJI(X1D.LIZIZ(LIZ), true);
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
