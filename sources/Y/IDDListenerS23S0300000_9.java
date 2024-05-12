package Y;

import X.ActivityC45651qj;
import X.C2J7;
import X.C2U8;
import X.C55274Lmg;
import X.C55277Lmj;
import X.InterfaceC65784Pro;
import X.LRD;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.PerfMonitorServiceImpl;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDDListenerS23S0300000_9 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onDismiss$0(IDDListenerS23S0300000_9 iDDListenerS23S0300000_9, DialogInterface dialogInterface) {
        PerfMonitorServiceImpl.LIZ().LIZJ();
        ((DataCenter) iDDListenerS23S0300000_9.l0).jv0(Boolean.FALSE, "ENTER_DISLIKE_MODE");
        ActivityC45651qj mo49getActivity = ((Fragment) iDDListenerS23S0300000_9.l1).mo49getActivity();
        if (mo49getActivity != null && !mo49getActivity.isFinishing() && !mo49getActivity.isDestroyed()) {
            C55274Lmg c55274Lmg = new C55274Lmg(1, mo49getActivity.hashCode());
            if (o.LJ("report", ((C55277Lmj) iDDListenerS23S0300000_9.l2).LIZ.LJIIJJI())) {
                c55274Lmg.LJLJL = true;
            }
            C2U8.LIZ(c55274Lmg);
            LRD.LIZ(mo49getActivity).LJIIJ("long_press_panel", false, null);
        }
        C2U8.LIZ(new C2J7(false));
    }

    public static final void onDismiss$1(IDDListenerS23S0300000_9 iDDListenerS23S0300000_9, DialogInterface dialogInterface) {
        ((IMixFeedService) iDDListenerS23S0300000_9.l0).LJI(false);
        MixVideosDialog mixVideosDialog = (MixVideosDialog) iDDListenerS23S0300000_9.l1;
        mixVideosDialog.getClass();
        new IDDListenerS148S0100000_9(mixVideosDialog, 5).onDismiss(dialogInterface);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDDListenerS23S0300000_9.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public IDDListenerS23S0300000_9(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
