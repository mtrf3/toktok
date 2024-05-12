package Y;

import X.AbstractC91339Zt1;
import X.BinderC91098Zp8;
import X.C141335gf;
import X.C16880lQ;
import X.C3C5;
import X.C76800UCe;
import X.C91437Zub;
import android.app.Notification;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public class IDHandlerS27S0100000_29 extends Handler {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    public static final void handleMessage$0(IDHandlerS27S0100000_29 iDHandlerS27S0100000_29, Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        AbstractC91339Zt1 abstractC91339Zt1 = (AbstractC91339Zt1) iDHandlerS27S0100000_29.l0;
        if (i == abstractC91339Zt1.LJLL) {
            abstractC91339Zt1.LIZLLL();
        }
    }

    public static final void handleMessage$1(IDHandlerS27S0100000_29 iDHandlerS27S0100000_29, Message msg) {
        Object LIZ;
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i != -2) {
            if (i != -1) {
                return;
            }
            C91437Zub c91437Zub = (C91437Zub) iDHandlerS27S0100000_29.l0;
            if (c91437Zub.LJII) {
                Notification LIZLLL = c91437Zub.LJFF.LIZLLL(c91437Zub.LJI);
                if (LIZLLL == null) {
                    return;
                }
                try {
                    if (o.LJ(c91437Zub.LJI.LIZ, Boolean.TRUE)) {
                        BinderC91098Zp8 binderC91098Zp8 = c91437Zub.LJIIL;
                        if (binderC91098Zp8 != null) {
                            try {
                                C16880lQ.LLLJ(binderC91098Zp8.LJLIL, c91437Zub.LIZIZ.LJLIL, LIZLLL);
                                binderC91098Zp8.LJLILLLLZI = true;
                            } catch (Throwable unused) {
                            }
                        }
                    } else {
                        c91437Zub.LJ.notify(c91437Zub.LIZIZ.LJLIL, LIZLLL);
                    }
                    c91437Zub.LJIIIIZZ = true;
                    LIZ = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                C3C5.m10exceptionOrNullimpl(LIZ);
                return;
            }
            c91437Zub.LJ();
            return;
        }
        ((C91437Zub) iDHandlerS27S0100000_29.l0).LJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS27S0100000_29(Object obj, Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = obj;
    }
}
