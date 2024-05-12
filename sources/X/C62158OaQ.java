package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.qrcode.model.QRCodeInfo;

/* renamed from: X.OaQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62158OaQ implements InterfaceC78763Uvf {
    public final /* synthetic */ QRCodeInfo LIZ;
    public final /* synthetic */ AbstractC62156OaO LIZIZ;

    @Override // X.InterfaceC78763Uvf
    public final void onSuccess() {
        C62846OlW c62846OlW = this.LIZIZ.LJLILLLLZI;
        C81705W4v LIZJ = W5I.LIZJ();
        AbstractC62156OaO abstractC62156OaO = this.LIZIZ;
        UrlModel urlModel = this.LIZ.qrcodeUrl;
        abstractC62156OaO.getClass();
        LIZJ.LJI(UriProtector.parse(AbstractC62156OaO.LIZLLL(urlModel)));
        LIZJ.LJIIL = this.LIZIZ.LJLILLLLZI.getController();
        LIZJ.LJII = this.LIZIZ.LJLJJLL;
        c62846OlW.setController(LIZJ.LIZ());
        InterfaceC62154OaM interfaceC62154OaM = this.LIZIZ.LJLJI;
        if (interfaceC62154OaM != null) {
            C62153OaL c62153OaL = (C62153OaL) interfaceC62154OaM;
            C62160OaS c62160OaS = new C62160OaS();
            c62160OaS.LJIILJJIL = c62153OaL.LIZ.LJLJJI.enterFrom;
            c62160OaS.LJIILL = "shaped";
            c62160OaS.LJIILIIL();
            c62153OaL.LIZ.vl();
        }
        C62165OaX c62165OaX = this.LIZIZ.LJLIL;
        String LIZLLL = AbstractC62156OaO.LIZLLL(this.LIZ.qrcodeUrl);
        InterfaceC62173Oaf interfaceC62173Oaf = (InterfaceC62173Oaf) c62165OaX.LJLILLLLZI;
        if (interfaceC62173Oaf != null) {
            ((C62159OaR) interfaceC62173Oaf).LIZLLL(LIZLLL);
        }
    }

    @Override // X.InterfaceC78763Uvf
    public final void onFailure(Exception exc) {
        this.LIZIZ.LIZ();
    }

    public C62158OaQ(AbstractC62156OaO abstractC62156OaO, QRCodeInfo qRCodeInfo) {
        this.LIZIZ = abstractC62156OaO;
        this.LIZ = qRCodeInfo;
    }
}
