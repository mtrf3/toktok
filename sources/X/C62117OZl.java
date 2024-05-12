package X;

import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;

/* renamed from: X.OZl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62117OZl implements JJ4 {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C62114OZi LIZJ;

    @Override // X.JJ4
    public final void LIZ() {
        this.LIZJ.LIZJ(this.LIZ, this.LIZIZ);
    }

    @Override // X.JJ4
    public final void LIZIZ() {
        ((ScanQRCodeActivityV2) this.LIZJ.LIZIZ).LLFZ();
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) this.LIZJ.LIZIZ;
        scanQRCodeActivityV2.LJLZ = false;
        IQRCodeScanner iQRCodeScanner = scanQRCodeActivityV2.LJLJLLL;
        if (iQRCodeScanner != null) {
            ((C62114OZi) scanQRCodeActivityV2.LJLL).LJIIJ.LJFF();
            iQRCodeScanner.enableCameraScan(true, 65536L);
        }
    }

    public C62117OZl(C62114OZi c62114OZi, String str, String str2) {
        this.LIZJ = c62114OZi;
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
