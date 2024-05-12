package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS56S0400000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.ObN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62217ObN implements InterfaceC62085OYf {
    public static final /* synthetic */ int LIZIZ = 0;
    public final InterfaceC62225ObV LIZ;

    public C62217ObN(InterfaceC62225ObV channel) {
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
        C62340OdM.LJIIZILJ(sharePackage, this.LIZ.key(), context, view, new AqS56S0400000_10(context, (Context) sharePackage, (AwemeSharePackage) this, (C62217ObN) interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 12), new AqS160S0100000_10(interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 509));
        sharePackage.extras.putString("share_form", "video_form");
        return true;
    }
}
