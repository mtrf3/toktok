package X;

import android.os.SystemClock;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ucw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77602Ucw implements InterfaceC32356Cmu {
    public final /* synthetic */ C77603Ucx LIZ;
    public final /* synthetic */ long LIZIZ;

    @Override // X.InterfaceC32356Cmu
    public final void LIZ(long j) {
        boolean z;
        C73943T0h.LIZ().LIZIZ(new C77446UaQ(Boolean.TRUE, (int) (j - this.LIZ.LJLJL)));
        C78609UtB.LJJJJZI("ttlive_update_wallet_info_order", new HashMap());
        C77603Ucx c77603Ucx = this.LIZ;
        long uptimeMillis = SystemClock.uptimeMillis() - this.LIZIZ;
        if (this.LIZ.LJLJL != j) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        c77603Ucx.getClass();
        C77603Ucx.LJIIIIZZ(true, uptimeMillis, valueOf, null);
    }

    @Override // X.InterfaceC32356Cmu
    public final void LIZIZ(Throwable e) {
        int i;
        o.LJIIIZ(e, "e");
        if (e instanceof C276516r) {
            i = ((C276516r) e).getErrorCode();
        } else {
            i = 61;
        }
        C77603Ucx c77603Ucx = this.LIZ;
        long uptimeMillis = SystemClock.uptimeMillis() - this.LIZIZ;
        String th = e.toString();
        c77603Ucx.getClass();
        C77603Ucx.LJIIIIZZ(false, uptimeMillis, null, th);
        C78609UtB.LJJJLIIL(i, -1, "ttlive_update_wallet_info_order", "update wallet info fail");
    }

    public C77602Ucw(C77603Ucx c77603Ucx, long j) {
        this.LIZ = c77603Ucx;
        this.LIZIZ = j;
    }
}
