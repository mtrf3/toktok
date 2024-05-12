package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.Ucu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77600Ucu implements InterfaceC32356Cmu {
    public final /* synthetic */ C77583Ucd LIZ;
    public final /* synthetic */ long LIZIZ;

    @Override // X.InterfaceC32356Cmu
    public final void LIZ(long j) {
        boolean z;
        C73943T0h.LIZ().LIZIZ(new C77446UaQ(Boolean.TRUE, (int) (j - this.LIZ.LJIIJJI)));
        C77630UdO.LIZJ();
        long uptimeMillis = SystemClock.uptimeMillis() - this.LIZIZ;
        if (this.LIZ.LJIIJJI != j) {
            z = true;
        } else {
            z = false;
        }
        C77624UdI.LJII(true, uptimeMillis, Boolean.valueOf(z), null);
    }

    @Override // X.InterfaceC32356Cmu
    public final void LIZIZ(Throwable e) {
        o.LJIIIZ(e, "e");
        C77624UdI.LJII(false, SystemClock.uptimeMillis() - this.LIZIZ, null, e.toString());
    }

    public C77600Ucu(C77583Ucd c77583Ucd, long j) {
        this.LIZ = c77583Ucd;
        this.LIZIZ = j;
    }
}
