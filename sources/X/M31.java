package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M31 implements InterfaceC56171M2t {
    public C8DW LJLIL;

    @Override // X.InterfaceC56171M2t
    public final void LIZ(C56175M2x context) {
        o.LJIIIZ(context, "context");
        C8DW c8dw = this.LJLIL;
        if (c8dw != null) {
            c8dw.remove();
        }
    }

    @Override // X.InterfaceC56171M2t
    public final void LIZIZ(C56175M2x context) {
        o.LJIIIZ(context, "context");
        InterfaceC56168M2q interfaceC56168M2q = context.LIZ;
        if (interfaceC56168M2q != null) {
            interfaceC56168M2q.LJI(EnumC56169M2r.ARROW_EMPTY);
        }
    }

    @Override // X.InterfaceC56171M2t
    public final void LIZJ(C56175M2x context) {
        DiscoveryLandingMapVM discoveryLandingMapVM;
        C53748L7o c53748L7o;
        C191427fG c191427fG;
        Context LIZJ;
        o.LJIIIZ(context, "context");
        C8DU c8du = context.LIZIZ;
        if (c8du == null || (discoveryLandingMapVM = context.LIZJ) == null || (c53748L7o = discoveryLandingMapVM.LJLJI) == null || (c191427fG = c53748L7o.LIZ) == null) {
            return;
        }
        if (c191427fG.getLat() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && c191427fG.getLon() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return;
        }
        C8DW c8dw = this.LJLIL;
        if (c8dw != null) {
            c8dw.remove();
        }
        M3I m3i = new M3I();
        m3i.LIZ = new C191717fj(c191427fG.getLat(), c191427fG.getLon());
        m3i.LIZIZ = Double.valueOf(1700.0d);
        m3i.LJ = Float.valueOf(2.0f);
        m3i.LJFF = Float.valueOf(-1.0f);
        InterfaceC56168M2q interfaceC56168M2q = context.LIZ;
        if (interfaceC56168M2q != null && (LIZJ = interfaceC56168M2q.LIZJ()) != null) {
            Integer LJI = C79045V0n.LJI(R.attr.dd, LIZJ);
            if (LJI != null) {
                m3i.LIZJ = Integer.valueOf(LJI.intValue());
            }
            Integer LJI2 = C79045V0n.LJI(R.attr.cs, LIZJ);
            if (LJI2 != null) {
                m3i.LIZLLL = Integer.valueOf(LJI2.intValue());
            }
        }
        this.LJLIL = c8du.LJJJLIIL(m3i);
    }

    @Override // X.InterfaceC56171M2t
    public final void LIZLLL(C56175M2x context) {
        o.LJIIIZ(context, "context");
        C8DW c8dw = this.LJLIL;
        if (c8dw != null) {
            c8dw.remove();
        }
        this.LJLIL = null;
    }

    @Override // X.InterfaceC56171M2t
    public final void LJI(C56175M2x c56175M2x, ActivityC45651qj activityC45651qj) {
        M26 m26;
        M26 m262;
        DiscoveryLandingMapVM discoveryLandingMapVM = c56175M2x.LIZJ;
        if (discoveryLandingMapVM != null && discoveryLandingMapVM.LJLJJI) {
            ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
            boolean isInAppPrecise = iLocationBaseServiceForMT.isInAppPrecise();
            String str = null;
            if (iLocationBaseServiceForMT.isSystemPrecise(EF7.LIZIZ()) && !isInAppPrecise) {
                DiscoveryLandingMapVM discoveryLandingMapVM2 = c56175M2x.LIZJ;
                if (discoveryLandingMapVM2 != null && (m262 = discoveryLandingMapVM2.LJLIL) != null) {
                    str = m262.getPreviousPage();
                }
                C54578LbS.LIZ(iLocationBaseServiceForMT, "places_discover", str, activityC45651qj, null, M3D.LJFF, new AqS159S0100000_9(c56175M2x, 820), M3Q.LJLIL, M3R.LJLIL, null, 256);
                return;
            }
            TokenCert tokenCert = M3D.LJI;
            DiscoveryLandingMapVM discoveryLandingMapVM3 = c56175M2x.LIZJ;
            if (discoveryLandingMapVM3 != null && (m26 = discoveryLandingMapVM3.LJLIL) != null) {
                str = m26.getPreviousPage();
            }
            iLocationBaseServiceForMT.requestSystemConversionPopup("poi", "places_discovery", tokenCert, activityC45651qj, new C85258Xd8("places_discover", null, str, false, LiveCoverMinSizeSetting.DEFAULT), new M3E(c56175M2x), true, true);
            return;
        }
        c56175M2x.LJFF();
    }
}
