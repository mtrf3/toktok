package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.Obw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62252Obw implements InterfaceC62085OYf {
    public final InterfaceC62225ObV LIZ;
    public Aweme LIZIZ;

    public C62252Obw(InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        this.LIZ = channel;
    }

    @Override // X.InterfaceC62085OYf
    public final boolean LIZ(Context context, View view, AwemeSharePackage sharePackage, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        int LIZJ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        Aweme LJIILLIIL = sharePackage.LJIILLIIL();
        this.LIZIZ = LJIILLIIL;
        if (C62359Odf.LJ(LJIILLIIL, this.LIZ, false)) {
            if (C62340OdM.LJIILLIIL(LJIILLIIL)) {
                sharePackage.extras.putString("share_form", "url_form");
                return false;
            }
            return true;
        }
        if (C62359Odf.LJII(LJIILLIIL, this.LIZ)) {
            if (C62340OdM.LJIIJ(this.LIZ.key())) {
                C62340OdM.LJIJJ(context, view, sharePackage, this.LIZ, interfaceC88472Yns);
                return true;
            }
            return C62340OdM.LJIILJJIL(context, sharePackage, this.LIZ.key(), new C62254Oby(context, view, this, sharePackage, interfaceC88472Yns));
        }
        InterfaceC62225ObV channel = this.LIZ;
        o.LJIIIZ(channel, "channel");
        if (LJIILLIIL.getAwemeType() == 150) {
            LIZJ = C62359Odf.LIZIZ(channel.key());
        } else {
            LIZJ = C62359Odf.LIZJ(channel.key(), C62359Odf.LIZLLL());
        }
        if (LIZJ != 1 && LIZJ != 6) {
            Aweme LJIILLIIL2 = sharePackage.LJIILLIIL();
            String channelKey = this.LIZ.key();
            o.LJIIIZ(channelKey, "channelKey");
            ACLCommonShare LJII = C62340OdM.LJII(LJIILLIIL2, channelKey);
            if (LJII == null || C62340OdM.LJIILL(LJII)) {
                sharePackage.extras.putString("share_form", "url_form");
                return false;
            }
            return true;
        }
        if (C62340OdM.LJIIJ(this.LIZ.key())) {
            if (C78609UtB.LJJLIIIJ(context) != null) {
                C62233Obd.LJ(this.LIZIZ, this.LIZ, context, view, sharePackage, interfaceC88472Yns, false, C62359Odf.LIZJ(this.LIZ.key(), C62359Odf.LIZLLL()));
            }
            return true;
        }
        return C62340OdM.LJIJJLI(context, sharePackage, this.LIZ.key(), new C62253Obx(context, view, this, sharePackage, interfaceC88472Yns));
    }
}
