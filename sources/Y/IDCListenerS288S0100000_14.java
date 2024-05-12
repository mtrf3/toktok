package Y;

import X.C79501VIb;
import X.InterfaceC82969WhJ;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;

/* loaded from: classes15.dex */
public class IDCListenerS288S0100000_14 implements DialogInterface.OnCancelListener {
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
            default:
                return;
        }
    }

    public IDCListenerS288S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(IDCListenerS288S0100000_14 iDCListenerS288S0100000_14, DialogInterface dialogInterface) {
        ((CutMusicPanel) iDCListenerS288S0100000_14.l0).vl();
    }

    public static final void onCancel$1(IDCListenerS288S0100000_14 iDCListenerS288S0100000_14, DialogInterface dialogInterface) {
        InterfaceC82969WhJ interfaceC82969WhJ = (InterfaceC82969WhJ) iDCListenerS288S0100000_14.l0;
        C79501VIb c79501VIb = new C79501VIb();
        c79501VIb.LIZ = "mask";
        interfaceC82969WhJ.LIZ(c79501VIb, "");
    }
}
