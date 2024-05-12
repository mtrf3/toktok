package Y;

import X.C30168Bsi;
import X.C7N;
import X.CB0;
import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* loaded from: classes6.dex */
public class IDCListenerS281S0100000_5 implements DialogInterface.OnCancelListener {
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
            default:
                return;
        }
    }

    public IDCListenerS281S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(IDCListenerS281S0100000_5 iDCListenerS281S0100000_5, DialogInterface dialogInterface) {
        Integer num = (Integer) iDCListenerS281S0100000_5.l0;
        if (num != null && num.intValue() == 4) {
            C7N.LJIIIIZZ().logBoostCardLiveEndClick(2);
        }
        CB0.LIZ();
    }

    public static final void onCancel$1(IDCListenerS281S0100000_5 iDCListenerS281S0100000_5, DialogInterface dialogInterface) {
        Integer num = (Integer) iDCListenerS281S0100000_5.l0;
        if (num == null || num.intValue() != 4) {
            return;
        }
        C7N.LJIIIIZZ().logBoostCardLiveEndClick(2);
    }

    public static final void onCancel$2(IDCListenerS281S0100000_5 iDCListenerS281S0100000_5, DialogInterface dialogInterface) {
        Integer num = (Integer) iDCListenerS281S0100000_5.l0;
        if (num != null && num.intValue() == 4) {
            C7N.LJIIIIZZ().logBoostCardLiveEndClick(2);
        }
        CB0.LIZ();
    }

    public static final void onCancel$3(IDCListenerS281S0100000_5 iDCListenerS281S0100000_5, DialogInterface dialogInterface) {
        C30168Bsi c30168Bsi = (C30168Bsi) iDCListenerS281S0100000_5.l0;
        if (c30168Bsi.LJLJLLL != LiveMode.SCREEN_RECORD) {
            return;
        }
        c30168Bsi.LJ();
    }

    public static final void onCancel$4(IDCListenerS281S0100000_5 iDCListenerS281S0100000_5, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        Runnable runnable = (Runnable) iDCListenerS281S0100000_5.l0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
