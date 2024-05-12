package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.qrcode.QRCodeFragment;
import o53.IDdS476S0100000_10;

/* renamed from: X.OaO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC62156OaO extends LinearLayout implements InterfaceC62168Oaa {
    public C62165OaX LJLIL;
    public C62846OlW LJLILLLLZI;
    public InterfaceC62154OaM LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public IDdS476S0100000_10 LJLJJLL;

    public abstract void setData(String str);

    public abstract void setQRCodeCardSubtitleColor(int i);

    public abstract void setQRCodeCardTitleColor(int i);

    public final void LIZ() {
        DialogC25756A8y dialogC25756A8y;
        InterfaceC62154OaM interfaceC62154OaM = this.LJLJI;
        if (interfaceC62154OaM != null) {
            C62153OaL c62153OaL = (C62153OaL) interfaceC62154OaM;
            QRCodeFragment qRCodeFragment = c62153OaL.LIZ;
            if (qRCodeFragment.LJLLL || (dialogC25756A8y = qRCodeFragment.LJLL) == null || !dialogC25756A8y.isShowing()) {
                return;
            }
            c62153OaL.LIZ.LJLL.dismiss();
        }
    }

    public C62159OaR LIZIZ() {
        return new C62159OaR();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C62165OaX c62165OaX = this.LJLIL;
        InterfaceC62173Oaf interfaceC62173Oaf = (InterfaceC62173Oaf) c62165OaX.LJLILLLLZI;
        if (interfaceC62173Oaf != null) {
            interfaceC62173Oaf.onDestroy();
        }
        c62165OaX.LJLILLLLZI = null;
        c62165OaX.LJLJI = null;
        this.LJLJI = null;
    }

    public AbstractC62156OaO(Context context) {
        super(context, null, 0);
    }

    public static String LIZLLL(UrlModel urlModel) {
        if (urlModel != null && urlModel.getUrlList() != null && !urlModel.getUrlList().isEmpty()) {
            return (String) ListProtector.get(urlModel.getUrlList(), 0);
        }
        return "";
    }

    public void setData(C62162OaU c62162OaU) {
        setData(c62162OaU.objectId);
    }

    public void setOnBindQrCodeListener(InterfaceC62154OaM interfaceC62154OaM) {
        this.LJLJI = interfaceC62154OaM;
    }
}
