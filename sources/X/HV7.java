package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS105S0300000_1;
import kotlin.jvm.internal.AqS45S1000000_7;
import kotlin.jvm.internal.AqS4S2300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HV7 implements InterfaceC61107NyZ {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LIZIZ;
    public final /* synthetic */ Activity LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        for (C164906da c164906da : results) {
            int i = HV8.LIZ[c164906da.LIZIZ.ordinal()];
            if (i == 2 || i == 3) {
                Activity activity = this.LIZJ;
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZLLL;
                InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LIZIZ;
                C26227ARb c26227ARb = new C26227ARb(activity);
                ActivityC45651qj activityC45651qj = (ActivityC45651qj) activity;
                c26227ARb.LJFF(activityC45651qj.getString(R.string.rtg));
                c26227ARb.LIZIZ(activityC45651qj.getString(R.string.rtf));
                c26227ARb.LJII = true;
                UC0.LIZJ(c26227ARb, new AqS105S0300000_1(activity, (Activity) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 3));
                new AutoDismissPermissionDialog(activityC45651qj, c26227ARb).LIZ();
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LIZ;
                if (interfaceC65784Pro2 != null) {
                    interfaceC65784Pro2.invoke();
                    return;
                }
                return;
            }
        }
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns2 = this.LIZIZ;
        if (interfaceC88472Yns2 != null) {
            interfaceC88472Yns2.invoke(Boolean.TRUE);
        }
    }

    public HV7(AqS45S1000000_7 aqS45S1000000_7, AqS4S2300000_7 aqS4S2300000_7, HV6 hv6, Activity activity, AqS45S1000000_7 aqS45S1000000_72) {
        this.LIZ = aqS45S1000000_7;
        this.LIZIZ = aqS4S2300000_7;
        this.LIZJ = activity;
        this.LIZLLL = aqS45S1000000_72;
    }
}
