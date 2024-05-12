package Y;

import X.C188727au;
import X.C4LD;
import X.FMX;
import X.HWR;
import X.JJ4;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;

/* loaded from: classes8.dex */
public class IDgS348S0100000_7 implements JJ4 {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void LIZIZ$0(IDgS348S0100000_7 iDgS348S0100000_7) {
    }

    public static final /* synthetic */ void LIZIZ$1(IDgS348S0100000_7 iDgS348S0100000_7) {
    }

    @Override // X.JJ4
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                return;
            case 1:
                LIZ$1(this);
                return;
            default:
                return;
        }
    }

    @Override // X.JJ4
    public final /* synthetic */ void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                return;
            case 1:
                LIZIZ$1(this);
                return;
            default:
                return;
        }
    }

    public static final void LIZ$0(IDgS348S0100000_7 iDgS348S0100000_7) {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) iDgS348S0100000_7.l0;
        scanQRCodeActivityV2.getClass();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", "qr_code");
        FMX.LJIIL("scan_page_click", c188727au.LIZ);
        C4LD.LIZ.LJFF(scanQRCodeActivityV2, null, null, null);
    }

    public static final void LIZ$1(IDgS348S0100000_7 iDgS348S0100000_7) {
        ((HWR) iDgS348S0100000_7.l0).LIZLLL();
    }

    public IDgS348S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
