package X;

import Y.AfS22S0400000_10;
import android.content.Context;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Oea, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62416Oea implements InterfaceC62544Oge {
    public final InterfaceC62225ObV LIZ;

    public C62416Oea(InterfaceC62225ObV interfaceC62225ObV) {
        this.LIZ = interfaceC62225ObV;
    }

    @Override // X.InterfaceC62544Oge
    public final void LIZ(Context context, String str, C62463OfL c62463OfL, AqS114S0300000_10 aqS114S0300000_10) {
        o.LJIIIZ(context, "context");
        String shareUrl = c62463OfL.LJLJJI.getShareInfo().getShareUrl();
        o.LJIIIIZZ(shareUrl, "aweme.shareInfo.shareUrl");
        OYF.LIZLLL(this.LIZ, shareUrl, "aweme").LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIILLIIL(new AfS22S0400000_10(this, context, c62463OfL, aqS114S0300000_10, 1));
    }
}
