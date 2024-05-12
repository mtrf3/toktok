package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.U4d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76591U4d implements InterfaceC61107NyZ {
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ Activity LIZLLL;
    public final /* synthetic */ OSZ<Boolean, String> LJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJFF;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJI;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        for (C164906da c164906da : results) {
            int i = C76593U4f.LIZ[c164906da.LIZIZ.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    boolean LIZJ = C76944UHs.LIZJ(this.LIZLLL, this.LJ.getSecond());
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(c164906da.LIZ);
                    LIZ.append(" onPermissionDenied,showRationaleNextTime =");
                    LIZ.append(LIZJ);
                    C0NB.LJ("GameLinkPermissionManager", X1D.LIZIZ(LIZ));
                    if (!LIZJ) {
                        C73118Smo c73118Smo = new C73118Smo();
                        Activity activity = this.LIZLLL;
                        OSZ<Boolean, String> osz = this.LJ;
                        c73118Smo.LIZ(activity, new C76592U4e(activity, osz, this.LIZJ, this.LJI, this.LJFF), new String[]{osz.getSecond()});
                    } else {
                        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJFF;
                        if (interfaceC65784Pro != null) {
                            interfaceC65784Pro.invoke();
                        }
                    }
                }
            } else {
                this.LIZ.invoke(Integer.valueOf(this.LIZIZ));
                TWL.LIZ.LJIILJJIL("allow", new String[]{c164906da.LIZ}, this.LIZJ);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C76591U4d(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, int i, boolean z, Activity activity, OSZ<Boolean, String> osz, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = activity;
        this.LJ = osz;
        this.LJFF = interfaceC65784Pro;
        this.LJI = interfaceC65784Pro2;
    }
}
