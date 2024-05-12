package X;

import android.os.SystemClock;

/* renamed from: X.Uvb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78759Uvb extends AbstractC32664Crs<C81392Vwy<W5A>> {
    public final /* synthetic */ InterfaceC88473Ynt<Long, Boolean, String, C76800UCe> LIZ;
    public final /* synthetic */ long LIZIZ;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        String str;
        if (w4w != null) {
            InterfaceC88473Ynt<Long, Boolean, String, C76800UCe> interfaceC88473Ynt = this.LIZ;
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.LIZIZ);
            Boolean bool = Boolean.FALSE;
            Throwable LJFF = w4w.LJFF();
            if (LJFF != null) {
                str = LJFF.getMessage();
            } else {
                str = null;
            }
            interfaceC88473Ynt.invoke(valueOf, bool, str);
        }
    }

    @Override // X.AbstractC32664Crs
    public final void LJFF(W4W<C81392Vwy<W5A>> w4w) {
        C81392Vwy<W5A> result;
        if (w4w != null) {
            InterfaceC88473Ynt<Long, Boolean, String, C76800UCe> interfaceC88473Ynt = this.LIZ;
            long j = this.LIZIZ;
            if (w4w.LIZIZ() && (result = w4w.getResult()) != null) {
                try {
                    if (result.LJI() != null) {
                        interfaceC88473Ynt.invoke(Long.valueOf(SystemClock.elapsedRealtime() - j), Boolean.TRUE, null);
                    }
                } finally {
                    C81392Vwy.LJ(result);
                }
            }
        }
    }

    public C78759Uvb(C78757UvZ c78757UvZ, long j) {
        this.LIZ = c78757UvZ;
        this.LIZIZ = j;
    }
}
