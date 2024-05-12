package X;

import com.ss.android.ugc.aweme.qrcode.model.QRCodeInfo;

/* renamed from: X.OaX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62165OaX extends I4X implements C8BT {
    public final boolean LIZ() {
        Object obj = this.LJLILLLLZI;
        if (obj != null) {
            return ((C62159OaR) ((InterfaceC62173Oaf) obj)).LIZJ();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BT
    public final void onSuccess() {
        Object obj = this.LJLJI;
        if (obj != null) {
            Object obj2 = this.LJLILLLLZI;
            if (((AbstractC57537Mi5) ((InterfaceC62173Oaf) obj2)).mData == 0) {
                ((InterfaceC62168Oaa) ((I4Y) obj)).LJJIIJ(new Exception());
            } else {
                ((InterfaceC62168Oaa) ((I4Y) obj)).LJIIJ((QRCodeInfo) ((AbstractC57537Mi5) ((InterfaceC62173Oaf) obj2)).mData);
            }
        }
    }

    @Override // X.C8BT
    public final void onFailed(Exception exc) {
        Object obj = this.LJLJI;
        if (obj != null) {
            ((InterfaceC62168Oaa) ((I4Y) obj)).LJJIIJ(exc);
        }
    }

    public C62165OaX(C62159OaR c62159OaR, C62157OaP c62157OaP) {
        super(c62159OaR, c62157OaP);
        c62159OaR.addNotifyListener(this);
    }
}
