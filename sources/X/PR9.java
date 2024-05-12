package X;

import Y.ARunnableS47S0100000_11;
import Y.IDHandlerS23S0100000_11;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PR9 implements LUY, InterfaceC64434PQo {
    public final Looper LIZ;
    public long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public C46625IRp LJ;
    public IDHandlerS23S0100000_11 LJFF;
    public boolean LJI;
    public String LJII;
    public String LJIIIIZZ;
    public final ARunnableS47S0100000_11 LJIIIZ;
    public PR6 LJIIJ;

    public PR9(Looper looper) {
        o.LJIIIZ(looper, "looper");
        this.LIZ = looper;
        this.LIZIZ = 60000L;
        this.LIZJ = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
        this.LIZLLL = 120000L;
        this.LJII = "";
        this.LJIIIIZZ = "";
        this.LJIIIZ = new ARunnableS47S0100000_11(this, 128);
    }

    @Override // X.InterfaceC64434PQo
    public final void LIZ(boolean z) {
        if (!this.LJI && z) {
            IDHandlerS23S0100000_11 iDHandlerS23S0100000_11 = this.LJFF;
            if (iDHandlerS23S0100000_11 != null) {
                iDHandlerS23S0100000_11.sendEmptyMessage(82);
            } else {
                o.LJIJI("powerHandler");
                throw null;
            }
        }
        if (this.LJI && !z) {
            IDHandlerS23S0100000_11 iDHandlerS23S0100000_112 = this.LJFF;
            if (iDHandlerS23S0100000_112 != null) {
                iDHandlerS23S0100000_112.sendEmptyMessage(81);
            } else {
                o.LJIJI("powerHandler");
                throw null;
            }
        }
        this.LJI = z;
    }

    @Override // X.LUY
    public final void LIZIZ(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        if (C84763XOl.LJIIJJI) {
            str2 = "background";
            str = "unknown";
        }
        if (o.LJ(str, this.LJII) && o.LJ(str2, this.LJIIIIZZ)) {
            return;
        }
        this.LJII = str;
        this.LJIIIIZZ = str2;
        IDHandlerS23S0100000_11 iDHandlerS23S0100000_11 = this.LJFF;
        if (iDHandlerS23S0100000_11 != null) {
            iDHandlerS23S0100000_11.sendEmptyMessage(81);
        } else {
            o.LJIJI("powerHandler");
            throw null;
        }
    }
}
