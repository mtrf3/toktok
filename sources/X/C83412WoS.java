package X;

import android.os.Handler;
import android.os.Message;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.WoS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83412WoS implements Handler.Callback {
    public static final C83412WoS LJLIL = new C83412WoS();
    public static final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C83411WoR.LJLIL);
    public static final C62822Ol8 LJLJI = C221108m2.LIZIZ(C83415WoV.LJLIL);
    public static final ORV<C64391POx> LJLJJI = new ORV<>();

    public static void LIZ(boolean z) {
        C64391POx c64391POx = new C64391POx("Conversation End", System.currentTimeMillis(), Q7L.LIZJ("successful: ", z));
        Message obtain = Message.obtain();
        obtain.what = EnumC83414WoU.END.getWhat();
        obtain.obj = c64391POx;
        ((Handler) LJLJI.getValue()).sendMessage(obtain);
    }

    public static void LIZLLL(String str) {
        C64391POx c64391POx = new C64391POx(str, System.currentTimeMillis(), i0.LJFF("Start execute: ", str));
        Message obtain = Message.obtain();
        obtain.what = EnumC83414WoU.ACTION_EXECUTE.getWhat();
        obtain.obj = c64391POx;
        ((Handler) LJLJI.getValue()).sendMessage(obtain);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message p0) {
        o.LJIIIZ(p0, "p0");
        Object obj = p0.obj;
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.actionai.monitor.MonitorMsg");
        C64391POx c64391POx = (C64391POx) obj;
        int i = p0.what;
        if (i == EnumC83414WoU.START.getWhat()) {
            ORV<C64391POx> orv = LJLJJI;
            orv.clear();
            orv.addLast(c64391POx);
            return true;
        }
        if (i == EnumC83414WoU.ACTION_EXECUTE.getWhat() || i == EnumC83414WoU.ACTION_CALLBACK.getWhat()) {
            ORV<C64391POx> orv2 = LJLJJI;
            LIZJ(orv2.LJIILJJIL(), c64391POx);
            orv2.addLast(c64391POx);
            return true;
        }
        if (i != EnumC83414WoU.END.getWhat()) {
            return false;
        }
        ORV<C64391POx> orv3 = LJLJJI;
        LIZJ(orv3.LJIILJJIL(), c64391POx);
        LIZJ(orv3.LJIIIIZZ(), c64391POx);
        orv3.clear();
        return true;
    }

    public static void LIZIZ(String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Execute complete: ");
        LIZ.append(str);
        LIZ.append(" successful: ");
        LIZ.append(z);
        C64391POx c64391POx = new C64391POx(str, currentTimeMillis, X1D.LIZIZ(LIZ));
        Message obtain = Message.obtain();
        obtain.what = EnumC83414WoU.ACTION_CALLBACK.getWhat();
        obtain.obj = c64391POx;
        ((Handler) LJLJI.getValue()).sendMessage(obtain);
    }

    public static final void LIZJ(C64391POx c64391POx, C64391POx c64391POx2) {
        String str;
        long j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActionAIMonitor ");
        if (c64391POx != null) {
            str = c64391POx.LIZ;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" ===> ");
        LIZ.append(c64391POx2.LIZ);
        LIZ.append(" cost: ");
        long j2 = c64391POx2.LIZIZ;
        if (c64391POx != null) {
            j = c64391POx.LIZIZ;
        } else {
            j = 0;
        }
        LIZ.append(j2 - j);
        X1D.LIZIZ(LIZ);
    }
}
