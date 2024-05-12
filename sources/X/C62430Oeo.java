package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.Oeo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62430Oeo extends C62415OeZ {
    public final /* synthetic */ InterfaceC62573Oh7 LIZ;
    public final /* synthetic */ C62385Oe5 LIZIZ;

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LJ(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
    }

    public C62430Oeo(InterfaceC62573Oh7 interfaceC62573Oh7, C62385Oe5 c62385Oe5) {
        this.LIZ = interfaceC62573Oh7;
        this.LIZIZ = c62385Oe5;
    }

    @Override // X.C62415OeZ, X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        this.LIZIZ.LJIIJ(channel, z, baseSharePackage, context);
    }

    @Override // X.C62415OeZ, X.InterfaceC110854Wr
    public final Object LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV, InterfaceC67352kd interfaceC67352kd) {
        C4P8 LJ;
        InterfaceC62573Oh7 interfaceC62573Oh7 = this.LIZ;
        if (interfaceC62573Oh7 != null && (LJ = interfaceC62573Oh7.LJ()) != null) {
            LJ.Vd(new C62553Ogn());
        }
        return C76800UCe.LIZ;
    }
}
