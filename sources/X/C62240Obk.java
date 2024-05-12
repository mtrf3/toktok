package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.Obk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62240Obk implements InterfaceC62085OYf {
    public final InterfaceC62225ObV LIZ;

    public C62240Obk(InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        this.LIZ = channel;
    }

    @Override // X.InterfaceC62085OYf
    public final boolean LIZ(Context context, View view, AwemeSharePackage sharePackage, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        InterfaceC62225ObV LIZIZ = C62324Od6.LIZIZ("facebook_story", null);
        if (C62359Odf.LJ(sharePackage.LJIILLIIL(), this.LIZ, false) || LIZIZ == null || !LIZIZ.LIZLLL(context)) {
            if (C62340OdM.LJIILLIIL(sharePackage.LJIILLIIL())) {
                sharePackage.extras.putString("share_form", "url_form");
                return false;
            }
            return true;
        }
        return C62340OdM.LJIJJLI(context, sharePackage, this.LIZ.key(), new C62241Obl(sharePackage, this, context, view, LIZIZ, interfaceC88472Yns));
    }
}
