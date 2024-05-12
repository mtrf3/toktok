package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.U4c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76590U4c implements InterfaceC61107NyZ {
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ OSZ<Boolean, String[]> LIZLLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJ;
    public final /* synthetic */ Activity LJFF;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C30868C9o.LIZLLL(R.string.suj, this.LJFF);
        String LJI = C74769TWb.LJI(426);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZLLL.getSecond());
        LIZ.append(" onPermissionDenied");
        C32014ChO.LIZJ(LJI, X1D.LIZIZ(LIZ), null);
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        for (C164906da c164906da : results) {
            if (!c164906da.LIZ()) {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJ;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                C30868C9o.LIZLLL(R.string.suj, this.LJFF);
                String LJI = C74769TWb.LJI(406);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LIZLLL.getSecond());
                LIZ.append(" onPermissionDenied");
                C32014ChO.LIZJ(LJI, X1D.LIZIZ(LIZ), null);
                for (C164906da c164906da2 : results) {
                    EnumC61598OFm enumC61598OFm = c164906da2.LIZIZ;
                    if (enumC61598OFm == EnumC61598OFm.DENIED_PERMANENT || enumC61598OFm == EnumC61598OFm.THIS_OPERATION_NOT_PERMITTED) {
                        C74824TYe.LIZ.LJJJJL("refuse", this.LIZLLL.getSecond(), this.LIZJ);
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
        C74824TYe.LIZ.LJJJJL("allow", this.LIZLLL.getSecond(), this.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C76590U4c(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, int i, boolean z, OSZ<Boolean, String[]> osz, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Activity activity) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = osz;
        this.LJ = interfaceC65784Pro;
        this.LJFF = activity;
    }
}
