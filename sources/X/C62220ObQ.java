package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.ObQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62220ObQ implements InterfaceC62085OYf {
    public final InterfaceC62225ObV LIZ;

    public C62220ObQ(InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        this.LIZ = channel;
    }

    @Override // X.InterfaceC62085OYf
    public final boolean LIZ(Context context, View view, AwemeSharePackage sharePackage, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (C62340OdM.LJIILLIIL(sharePackage.LJIILLIIL())) {
            this.LIZ.LJIIJ(new OYP("", "", ""), context, interfaceC62573Oh7);
            interfaceC88472Yns.invoke(Boolean.TRUE);
            return true;
        }
        return true;
    }
}
