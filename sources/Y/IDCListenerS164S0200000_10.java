package Y;

import X.ActivityC45651qj;
import X.C188727au;
import X.C62387Oe7;
import X.C84913XUf;
import X.FMX;
import X.InterfaceC62474OfW;
import X.KNV;
import X.OOL;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes11.dex */
public class IDCListenerS164S0200000_10 implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return;
        }
    }

    public static final void onCancel$0(IDCListenerS164S0200000_10 iDCListenerS164S0200000_10, DialogInterface dialogInterface) {
        C84913XUf c84913XUf = ((MusicShootAssem) iDCListenerS164S0200000_10.l0).LLIFFJFJJ;
        if (c84913XUf != null) {
            c84913XUf.LIZ(((MusicModel) iDCListenerS164S0200000_10.l1).getMusicId());
        }
    }

    public static final void onCancel$1(IDCListenerS164S0200000_10 iDCListenerS164S0200000_10, DialogInterface dialogInterface) {
        String str;
        OOL ool = (OOL) iDCListenerS164S0200000_10.l0;
        String str2 = ool.LJLL;
        boolean z = ool.LJLLILLLL;
        C188727au LIZLLL = KNV.LIZLLL(str2, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str2);
        if (z) {
            str = "click";
        } else {
            str = "other";
        }
        LIZLLL.LJIIIZ("enter_method", str);
        FMX.LJIIL("exit_avatar_intro", LIZLLL.LIZ);
        DialogInterface.OnCancelListener onCancelListener = (DialogInterface.OnCancelListener) iDCListenerS164S0200000_10.l1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public static final void onCancel$2(IDCListenerS164S0200000_10 iDCListenerS164S0200000_10, DialogInterface dialogInterface) {
        C62387Oe7 c62387Oe7 = (C62387Oe7) iDCListenerS164S0200000_10.l0;
        InterfaceC62474OfW interfaceC62474OfW = c62387Oe7.LJIILIIL;
        if (interfaceC62474OfW != null) {
            interfaceC62474OfW.LIZLLL((ActivityC45651qj) iDCListenerS164S0200000_10.l1, c62387Oe7.LJIIJ);
        }
    }

    public IDCListenerS164S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
