package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OeZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C62415OeZ implements InterfaceC62474OfW {
    @Override // X.InterfaceC110854Wr
    public void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC62474OfW
    public void LIZIZ(Context context, BaseSharePackage sharePackage, InterfaceC62486Ofi action) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC62474OfW
    public void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC62474OfW
    public void LJ(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC62474OfW
    public void LJI(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC62474OfW
    public void LJFF(View view, C62387Oe7 sharePanelConfig, C5JV c5jv) {
        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
        OQD.LIZLLL(view, sharePanelConfig, c5jv);
    }

    @Override // X.InterfaceC110854Wr
    public Object LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV, InterfaceC67352kd interfaceC67352kd) {
        return C76800UCe.LIZ;
    }
}
