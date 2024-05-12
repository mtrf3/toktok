package X;

import Y.ACallableS81S0101000_10;
import Y.AgS127S0100000_10;
import android.content.Context;
import com.ss.android.ugc.aweme.qrcode.QRCodeFragment;
import java.io.File;

/* renamed from: X.OaN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62155OaN extends C62157OaP {
    public static final /* synthetic */ int LJLLL = 0;

    @Override // X.AbstractC62156OaO
    public final C62159OaR LIZIZ() {
        return new C62161OaT();
    }

    public C62155OaN(Context context) {
        super(context);
    }

    @Override // X.C62157OaP, X.InterfaceC62168Oaa
    public final void LJJIIJ(Exception exc) {
        if (!this.LJLJJI) {
            super.LJJIIJ(exc);
        }
    }

    @Override // X.C62157OaP, X.AbstractC62156OaO
    public void setData(C62162OaU c62162OaU) {
        File file;
        super.setData(c62162OaU);
        if (this.LJLIL.LIZ()) {
            this.LJLJJI = true;
            InterfaceC62173Oaf interfaceC62173Oaf = (InterfaceC62173Oaf) this.LJLIL.LJLILLLLZI;
            if (interfaceC62173Oaf != null) {
                file = ((C62159OaR) interfaceC62173Oaf).LIZ();
            } else {
                file = null;
            }
            android.net.Uri fromFile = android.net.Uri.fromFile(file);
            W5I.LIZ().LIZIZ(fromFile);
            C62846OlW c62846OlW = this.LJLILLLLZI;
            C81705W4v LIZJ = W5I.LIZJ();
            LIZJ.LJI(fromFile);
            LIZJ.LJIIL = this.LJLILLLLZI.getController();
            LIZJ.LJII = this.LJLJJLL;
            c62846OlW.setController(LIZJ.LIZ());
            InterfaceC62154OaM interfaceC62154OaM = this.LJLJI;
            if (interfaceC62154OaM != null) {
                QRCodeFragment qRCodeFragment = ((C62153OaL) interfaceC62154OaM).LIZ;
                qRCodeFragment.LJLLL = true;
                qRCodeFragment.vl();
            }
            C10K.LIZJ(new ACallableS81S0101000_10(1, this, 0)).LJ(new AgS127S0100000_10(this, 1), C10K.LJIIIIZZ, null);
        }
    }
}
