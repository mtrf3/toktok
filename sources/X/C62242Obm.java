package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Obm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62242Obm implements InterfaceC62085OYf {
    public final InterfaceC62225ObV LIZ;

    public C62242Obm(InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        this.LIZ = channel;
    }

    @Override // X.InterfaceC62085OYf
    public final boolean LIZ(Context context, View view, AwemeSharePackage sharePackage, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (C62359Odf.LJII(sharePackage.LJIILLIIL(), this.LIZ)) {
            C62340OdM.LJIJJ(context, view, sharePackage, this.LIZ, interfaceC88472Yns);
            return true;
        }
        C62340OdM.LJIIZILJ(sharePackage, this.LIZ.key(), context, view, new AqS114S0300000_10(this, (C62242Obm) context, (Context) interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 20), new AqS160S0100000_10(interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 514));
        sharePackage.extras.putString("share_form", "video_form");
        return true;
    }
}
