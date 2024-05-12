package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OYe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62084OYe implements InterfaceC62085OYf {
    public final InterfaceC62225ObV LIZ;

    public C62084OYe(InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        this.LIZ = channel;
    }

    @Override // X.InterfaceC62085OYf
    public final boolean LIZ(Context context, View view, AwemeSharePackage sharePackage, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        this.LIZ.LJIIJ(new OYP("", "", ""), context, null);
        interfaceC88472Yns.invoke(Boolean.TRUE);
        return true;
    }
}
