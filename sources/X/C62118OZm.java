package X;

import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;

/* renamed from: X.OZm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62118OZm implements JJ4 {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C62114OZi LIZIZ;

    @Override // X.JJ4
    public final void LIZ() {
        this.LIZIZ.LIZLLL(this.LIZ);
    }

    @Override // X.JJ4
    public final void LIZIZ() {
        ((ScanQRCodeActivityV2) this.LIZIZ.LIZIZ).LLFZ();
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) this.LIZIZ.LIZIZ;
        scanQRCodeActivityV2.LJLZ = false;
        IQRCodeScanner iQRCodeScanner = scanQRCodeActivityV2.LJLJLLL;
        if (iQRCodeScanner != null) {
            ((C62114OZi) scanQRCodeActivityV2.LJLL).LJIIJ.LJFF();
            iQRCodeScanner.enableCameraScan(true, 65536L);
        }
    }

    public C62118OZm(C62114OZi c62114OZi, String str) {
        this.LIZIZ = c62114OZi;
        this.LIZ = str;
    }
}
