package X;

import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;

/* loaded from: classes11.dex */
public final class N5L implements InterfaceC59990NgY {
    public final /* synthetic */ NZQ LIZ;

    public N5L(NZQ nzq) {
        this.LIZ = nzq;
    }

    @Override // X.InterfaceC59990NgY
    public final void LIZ(C60002Ngk c60002Ngk) {
        AdWebStatBusiness webStatBusiness = this.LIZ.getWebStatBusiness();
        if (webStatBusiness != null) {
            int i = (int) (c60002Ngk.LJIIIIZZ * 100);
            NK2 nk2 = webStatBusiness.LJFF;
            if (nk2 == null) {
                return;
            }
            nk2.LIZ(i);
        }
    }
}
