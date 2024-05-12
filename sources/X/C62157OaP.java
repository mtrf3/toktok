package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.qrcode.model.QRCodeInfo;
import com.zhiliaoapp.musically.R;
import o53.IDdS476S0100000_10;

/* renamed from: X.OaP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C62157OaP extends AbstractC62156OaO {
    public Context LJLJL;
    public TextView LJLJLJ;
    public TextView LJLJLLL;
    public TextView LJLL;
    public View LJLLI;
    public ImageView LJLLILLLL;
    public QRCodeInfo LJLLJ;

    @Override // X.AbstractC62156OaO
    public void setData(String str) {
    }

    @Override // X.AbstractC62156OaO
    public void setQRCodeCardSubtitleColor(int i) {
    }

    @Override // X.AbstractC62156OaO
    public void setQRCodeCardTitleColor(int i) {
    }

    public QRCodeInfo getQrCodeInfo() {
        return this.LJLLJ;
    }

    public C62157OaP(Context context) {
        super(context);
        this.LJLIL = new C62165OaX(LIZIZ(), this);
        this.LJLJJLL = new IDdS476S0100000_10(this, 6);
        this.LJLJL = context;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dte, this, true);
        this.LJLLI = findViewById(R.id.iik);
        this.LJLLILLLL = (ImageView) findViewById(R.id.b5n);
        this.LJLILLLLZI = (C62846OlW) findViewById(R.id.iih);
        this.LJLJLJ = (TextView) findViewById(R.id.title);
        this.LJLJLLL = (TextView) findViewById(R.id.desc);
        this.LJLL = (TextView) findViewById(R.id.icy);
        findViewById(R.id.g_c);
    }

    @Override // X.InterfaceC62168Oaa
    public final void LJIIJ(QRCodeInfo qRCodeInfo) {
        InterfaceC62173Oaf interfaceC62173Oaf;
        this.LJLLJ = qRCodeInfo;
        if (qRCodeInfo != null) {
            String LIZLLL = AbstractC62156OaO.LIZLLL(qRCodeInfo.qrcodeUrl);
            if (C78765Uvh.LJIILIIL(UriProtector.parse(LIZLLL))) {
                C62846OlW c62846OlW = this.LJLILLLLZI;
                C81705W4v LIZJ = W5I.LIZJ();
                LIZJ.LJI(UriProtector.parse(LIZLLL));
                LIZJ.LJIIL = this.LJLILLLLZI.getController();
                LIZJ.LJII = this.LJLJJLL;
                c62846OlW.setController(LIZJ.LIZ());
                if (!this.LJLIL.LIZ() && (interfaceC62173Oaf = (InterfaceC62173Oaf) this.LJLIL.LJLILLLLZI) != null) {
                    ((C62159OaR) interfaceC62173Oaf).LIZLLL(LIZLLL);
                }
                InterfaceC62154OaM interfaceC62154OaM = this.LJLJI;
                if (interfaceC62154OaM != null) {
                    C62153OaL c62153OaL = (C62153OaL) interfaceC62154OaM;
                    C62160OaS c62160OaS = new C62160OaS();
                    c62160OaS.LJIILJJIL = c62153OaL.LIZ.LJLJJI.enterFrom;
                    c62160OaS.LJIILL = "shaped";
                    c62160OaS.LJIILIIL();
                    c62153OaL.LIZ.vl();
                    return;
                }
                return;
            }
            C78765Uvh.LJIILL(qRCodeInfo.qrcodeUrl, new C62158OaQ(this, qRCodeInfo));
        }
    }

    public void LJJIIJ(Exception exc) {
        C1A7.LJIJJ(this.LJLJL, exc);
        LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        if (r0 != 23) goto L34;
     */
    @Override // X.AbstractC62156OaO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setData(X.C62162OaU r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62157OaP.setData(X.OaU):void");
    }
}
