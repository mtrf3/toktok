package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol;
import kotlin.jvm.internal.o;

/* renamed from: X.Oe4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62384Oe4 implements InterfaceC62474OfW {
    public final /* synthetic */ SharePanelLogicProtocol LIZ;
    public final /* synthetic */ SheetActionProtocol LIZIZ;
    public final /* synthetic */ ShareChannelProtocol LIZJ;

    @Override // X.InterfaceC62474OfW
    public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
        OQD.LIZIZ(baseSharePackage, context);
    }

    @Override // X.InterfaceC62474OfW
    public final void LJ(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        InterfaceC62474OfW A0 = this.LIZ.A0();
        if (A0 != null) {
            A0.LJ(context, sharePackage);
        }
    }

    public C62384Oe4(SharePanelLogicProtocol sharePanelLogicProtocol, SheetActionProtocol sheetActionProtocol, ShareChannelProtocol shareChannelProtocol) {
        this.LIZ = sharePanelLogicProtocol;
        this.LIZIZ = sheetActionProtocol;
        this.LIZJ = shareChannelProtocol;
    }

    @Override // X.InterfaceC62474OfW
    public final void LIZIZ(Context context, BaseSharePackage sharePackage, InterfaceC62486Ofi action) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        InterfaceC62383Oe3 s1 = this.LIZIZ.s1();
        if (s1 != null) {
            s1.LIZIZ(context, sharePackage, action);
        }
    }

    @Override // X.InterfaceC62474OfW
    public final void LJFF(View view, C62387Oe7 sharePanelConfig, C5JV c5jv) {
        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
        InterfaceC62474OfW A0 = this.LIZ.A0();
        if (A0 != null) {
            A0.LJFF(view, sharePanelConfig, c5jv);
        }
    }

    @Override // X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        InterfaceC62382Oe2 P1 = this.LIZJ.P1();
        if (P1 != null) {
            P1.LIZ(channel, z, baseSharePackage, context);
        }
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
