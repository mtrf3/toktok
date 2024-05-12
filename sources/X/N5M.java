package X;

import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.ss.android.ugc.aweme.log.AdLynxEventLoger;
import kotlin.jvm.internal.AqS34S0001000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N5M implements InterfaceC59990NgY {
    public final /* synthetic */ NVO LIZ;

    public N5M(NVO nvo) {
        this.LIZ = nvo;
    }

    @Override // X.InterfaceC59990NgY
    public final void LIZ(C60002Ngk c60002Ngk) {
        C59297NOz c59297NOz;
        NOV nov;
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LIZ.LJLIL.LIZ(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            int i = (int) (c60002Ngk.LJIIIIZZ * 100);
            NOY LIZ = adLynxStatBusiness.LIZ();
            if (LIZ == null || (c59297NOz = LIZ.LJJLIIJ) == null || !o.LJ(c59297NOz.getValue(), Boolean.TRUE) || !adLynxStatBusiness.LIZIZ || adLynxStatBusiness.LIZJ || i < 50 || (nov = adLynxStatBusiness.LIZ.LIZJ) == null) {
                return;
            }
            AdLynxEventLoger adLynxEventLoger = new AdLynxEventLoger(new Object[]{nov});
            C58687N1n.LIZ.getClass();
            adLynxEventLoger.LIZJ(C58687N1n.LIZIZ, String.valueOf(nov.LIZLLL()), nov.LJFF(), null, new AqS34S0001000_10(i, 3));
            adLynxStatBusiness.LJIIIZ = System.currentTimeMillis();
            adLynxStatBusiness.LIZJ = true;
        }
    }
}
