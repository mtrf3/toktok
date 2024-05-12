package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.qrcode.model.QRCodeInfo;

/* renamed from: X.Oao, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62182Oao extends AbstractC85293Wj {
    public final /* synthetic */ C62180Oam LJLIL;
    public final /* synthetic */ QRCodeInfo LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        C62180Oam c62180Oam = this.LJLIL;
        if ((c62180Oam instanceof ImageView) && c62180Oam != null) {
            c62180Oam.setImageBitmap(bitmap);
        }
        this.LJLIL.LIZIZ();
        this.LJLIL.LJLILLLLZI = true;
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        C221018lt.LIZ("QRCodeSquareView", "Failed to load qrcode bitmap cache");
        C62180Oam c62180Oam = this.LJLIL;
        QRCodeInfo qRCodeInfo = this.LJLILLLLZI;
        c62180Oam.getClass();
        C78765Uvh.LJIILL(qRCodeInfo.qrcodeUrl, new C62181Oan(c62180Oam));
    }

    public C62182Oao(C62180Oam c62180Oam, QRCodeInfo qRCodeInfo) {
        this.LJLIL = c62180Oam;
        this.LJLILLLLZI = qRCodeInfo;
    }
}
