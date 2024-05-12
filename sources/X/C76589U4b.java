package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS58S0400000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U4b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76589U4b implements InterfaceC61107NyZ {
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ OSZ<Boolean, String[]> LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL = null;
    public final /* synthetic */ Activity LJ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C30868C9o.LIZLLL(R.string.suj, this.LJ);
        String LIZLLL = C74770TWc.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZJ.getSecond());
        LIZ.append(" onPermissionDenied");
        C32014ChO.LIZJ(LIZLLL, X1D.LIZIZ(LIZ), null);
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        for (C164906da c164906da : results) {
            if (!c164906da.LIZ()) {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZLLL;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                C30868C9o.LIZLLL(R.string.nek, this.LJ);
                String LIZLLL = C74770TWc.LIZLLL();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LIZJ.getSecond());
                LIZ.append(" onPermissionDenied");
                C32014ChO.LIZJ(LIZLLL, X1D.LIZIZ(LIZ), null);
                for (C164906da c164906da2 : results) {
                    EnumC61598OFm enumC61598OFm = c164906da2.LIZIZ;
                    if (enumC61598OFm == EnumC61598OFm.DENIED_PERMANENT || enumC61598OFm == EnumC61598OFm.THIS_OPERATION_NOT_PERMITTED) {
                        C74824TYe.LIZ.LJJJJL("refuse", this.LIZJ.getSecond(), true);
                        return;
                    }
                }
                return;
            }
        }
        InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = this.LIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(this.LIZIZ));
        }
        C74824TYe.LIZ.LJJJJL("allow", this.LIZJ.getSecond(), true);
    }

    public C76589U4b(AqS58S0400000_13 aqS58S0400000_13, int i, OSZ osz, Activity activity) {
        this.LIZ = aqS58S0400000_13;
        this.LIZIZ = i;
        this.LIZJ = osz;
        this.LJ = activity;
    }
}
