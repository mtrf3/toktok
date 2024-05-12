package X;

import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import android.telephony.TelephonyManager;

/* renamed from: X.Fg0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerThreadC39572Fg0 extends HandlerThread {
    public final /* synthetic */ Context LJLIL;

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        int i;
        try {
            C39571Ffz c39571Ffz = C39405FdJ.LJFF;
            Context context = this.LJLIL;
            c39571Ffz.getClass();
            C39405FdJ.LJ = new C39573Fg1();
            Object LLILL = C16880lQ.LLILL(context, "phone");
            if (LLILL != null) {
                TelephonyManager telephonyManager = (TelephonyManager) LLILL;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    i = 524353;
                } else if (i2 <= 23) {
                    i = 1;
                } else {
                    i = 65;
                }
                telephonyManager.listen(C39405FdJ.LJ, i);
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Throwable th) {
            InterfaceC39570Ffy interfaceC39570Ffy = C39569Ffx.LIZLLL;
            if (interfaceC39570Ffy != null) {
                interfaceC39570Ffy.LIZ("init", th);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC39572Fg0(Context context) {
        super("BPEACacheUpdateThread");
        this.LJLIL = context;
    }
}
