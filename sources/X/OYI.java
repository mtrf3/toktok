package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OYI extends AbstractC62515OgB {
    public final /* synthetic */ OVZ LJLJI;

    @Override // X.AbstractC62515OgB
    public final void LIZ(InterfaceC62225ObV channel, View view) {
        boolean z;
        o.LJIIIZ(channel, "channel");
        OVZ ovz = this.LJLJI;
        if (!ovz.LJLL.LJIIJ.LIZIZ(ovz.LJLJLLL, channel)) {
            z = channel.LJIIJ(this.LJLJI.LJLL.LJIIJ.LJIIJJI(channel), this.LJLJI.LJLJLLL, null);
        } else {
            z = true;
        }
        OVZ ovz2 = this.LJLJI;
        C62387Oe7 c62387Oe7 = ovz2.LJLL;
        InterfaceC62474OfW interfaceC62474OfW = c62387Oe7.LJIILIIL;
        if (interfaceC62474OfW != null) {
            interfaceC62474OfW.LIZ(channel, z, c62387Oe7.LJIIJ, ovz2.LJLJLLL);
        }
        if (!channel.LJIILJJIL()) {
            this.LJLJI.dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OYI(OVZ ovz, Activity activity, BaseSharePackage baseSharePackage) {
        super(activity, baseSharePackage);
        this.LJLJI = ovz;
    }
}
