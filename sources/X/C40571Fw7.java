package X;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.Fw7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40571Fw7 {
    public static final C13T LIZJ = new C13T("SplitInstallService");
    public static final Intent LIZLLL = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    public final String LIZ;
    public final C67585Qfl<InterfaceC40576FwC> LIZIZ;

    public static <T> C40561Fvx LIZ() {
        LIZJ.LIZJ("onError(%d)", 6, new Object[]{-14});
        C35481DwD c35481DwD = new C35481DwD(-14);
        C40561Fvx c40561Fvx = new C40561Fvx();
        synchronized (c40561Fvx.LIZ) {
            if (!c40561Fvx.LIZJ) {
                c40561Fvx.LIZJ = true;
                c40561Fvx.LJ = c35481DwD;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        c40561Fvx.LIZIZ.LIZ(c40561Fvx);
        return c40561Fvx;
    }

    public C40571Fw7(Context context) {
        this.LIZ = context.getPackageName();
        if (C39776FjI.LIZ(context)) {
            Context LLLLL = C16880lQ.LLLLL(context);
            this.LIZIZ = new C67585Qfl<>(LLLLL == null ? context : LLLLL, LIZJ, "SplitInstallService", LIZLLL, new InterfaceC40572Fw8() { // from class: X.FwD
                @Override // X.InterfaceC40572Fw8
                public final Object LIZ(IBinder iBinder) {
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
                    if (queryLocalInterface instanceof InterfaceC40576FwC) {
                        return queryLocalInterface;
                    }
                    return new C40581FwH(iBinder);
                }
            });
        }
    }
}
