package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.Oc0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62256Oc0 implements InterfaceC62085OYf {
    public final InterfaceC62225ObV LIZ;

    public C62256Oc0(InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        this.LIZ = channel;
    }

    @Override // X.InterfaceC62085OYf
    public final boolean LIZ(Context context, View view, AwemeSharePackage sharePackage, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (C62359Odf.LJ(sharePackage.LJIILLIIL(), this.LIZ, false)) {
            if (C62340OdM.LJIILLIIL(sharePackage.LJIILLIIL())) {
                sharePackage.extras.putString("share_form", "url_form");
                return false;
            }
            return true;
        }
        if (C62359Odf.LJII(sharePackage.LJIILLIIL(), this.LIZ)) {
            return C62340OdM.LJIILJJIL(context, sharePackage, this.LIZ.key(), new C62260Oc4(context, view, this, sharePackage, interfaceC88472Yns));
        }
        return C62340OdM.LJIJJLI(context, sharePackage, this.LIZ.key(), new C62257Oc1(context, view, this, sharePackage, interfaceC88472Yns));
    }
}
