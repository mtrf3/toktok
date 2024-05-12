package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OfN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62465OfN implements InterfaceC62474OfW {
    @Override // X.InterfaceC62474OfW
    public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
        OQD.LIZIZ(baseSharePackage, context);
    }

    @Override // X.InterfaceC62474OfW
    public final void LJ(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        ScreenShotService.LJIIIZ().LIZIZ(false);
    }

    @Override // X.InterfaceC62474OfW
    public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC62486Ofi interfaceC62486Ofi) {
        OQD.LIZ(interfaceC62486Ofi, baseSharePackage, context);
    }

    @Override // X.InterfaceC62474OfW
    public final void LJFF(View view, C62387Oe7 sharePanelConfig, C5JV c5jv) {
        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
        ScreenShotService.LJIIIZ().LIZIZ(true);
    }

    @Override // X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC110854Wr
    public final Object LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV, InterfaceC67352kd interfaceC67352kd) {
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC62474OfW
    public final void LJI(InterfaceC62225ObV interfaceC62225ObV, boolean z, BaseSharePackage baseSharePackage, Context context) {
        OQD.LJ(interfaceC62225ObV, context);
    }
}
