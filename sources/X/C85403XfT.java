package X;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.List;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS177S0200000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XfT, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85403XfT extends AbstractC85410Xfa {
    public final List<String> LJLJJL = C47261Igj.LJJIJIL("//obj/tiktok-teko-internal-sg/tiktok/fe/live/tiktok_fe_address_map_pia/index.html", "//obj/tiktok-teko-source-sg/tiktok/fe/live/tiktok_fe_address_map_pia/index.html");
    public final List<String> LJLJJLL = C47261Igj.LJJIJIL("https://lf16-gecko-source.tiktokcdn.com");

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        View view;
        View view2;
        WebView webView;
        String url;
        TokenCert cert;
        Activity activity;
        ActivityC45651qj activityC45651qj;
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Boolean needInAppNotReduced;
        Boolean needSystemNotReducedBySelfBuiltPopup;
        Boolean needSystemNotReduced;
        InterfaceC85409XfZ interfaceC85409XfZ = (InterfaceC85409XfZ) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            view = interfaceC38263Ezz.getView();
        } else {
            view = null;
        }
        if (view instanceof WebView) {
            InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
            if (interfaceC38263Ezz2 != null) {
                view2 = interfaceC38263Ezz2.getView();
            } else {
                view2 = null;
            }
            if (!(view2 instanceof WebView) || (webView = (WebView) view2) == null || (url = webView.getUrl()) == null) {
                C31626Cb8.LIZ(c37356ElM, 0, "RequestLocationPermission get wrong url", 4);
                return;
            }
            android.net.Uri parse = UriProtector.parse(url);
            o.LJIIIIZZ(parse, "Uri.parse(this)");
            String path = parse.getPath();
            String host = parse.getHost();
            List<String> list = this.LJLJJLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("https://");
            LIZ.append(host);
            if (!list.contains(X1D.LIZIZ(LIZ)) || !ORZ.LJLJJI(path, this.LJLJJL)) {
                C31626Cb8.LIZ(c37356ElM, 0, "RequestLocationPermission get wrong path", 4);
                return;
            }
            if (((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSupportedPreciseGps()) {
                cert = TokenCert.Companion.with("bpea-ecom_fe_address_request_coarse_locate_for_not_reduced");
            } else {
                cert = TokenCert.Companion.with("bpea-ecom_fe_address_request_coarse_locate");
            }
            InterfaceC38263Ezz interfaceC38263Ezz3 = this.LJLIL;
            if (interfaceC38263Ezz3 != null) {
                activity = interfaceC38263Ezz3.LIZLLL();
            } else {
                activity = null;
            }
            if (activity instanceof ActivityC45651qj) {
                activityC45651qj = (ActivityC45651qj) activity;
            } else {
                activityC45651qj = null;
            }
            String str4 = "";
            if (activityC45651qj == null) {
                C31626Cb8.LIZ(c37356ElM, 0, "", 4);
                return;
            }
            InterfaceC85412Xfc trackParams = interfaceC85409XfZ.getTrackParams();
            if (trackParams == null || (str = trackParams.getEnterFrom()) == null) {
                str = "";
            }
            InterfaceC85412Xfc trackParams2 = interfaceC85409XfZ.getTrackParams();
            if (trackParams2 == null || (str2 = trackParams2.getEnterMethod()) == null) {
                str2 = "";
            }
            InterfaceC85412Xfc trackParams3 = interfaceC85409XfZ.getTrackParams();
            if (trackParams3 == null || (str3 = trackParams3.getPreviousPage()) == null) {
                str3 = "";
            }
            InterfaceC85413Xfd authorizationParams = interfaceC85409XfZ.getAuthorizationParams();
            if (authorizationParams != null && (needSystemNotReduced = authorizationParams.getNeedSystemNotReduced()) != null) {
                z = needSystemNotReduced.booleanValue();
            } else {
                z = false;
            }
            InterfaceC85413Xfd authorizationParams2 = interfaceC85409XfZ.getAuthorizationParams();
            if (authorizationParams2 != null && (needSystemNotReducedBySelfBuiltPopup = authorizationParams2.getNeedSystemNotReducedBySelfBuiltPopup()) != null) {
                z2 = needSystemNotReducedBySelfBuiltPopup.booleanValue();
            } else {
                z2 = false;
            }
            InterfaceC85413Xfd authorizationParams3 = interfaceC85409XfZ.getAuthorizationParams();
            if (authorizationParams3 != null && (needInAppNotReduced = authorizationParams3.getNeedInAppNotReduced()) != null) {
                z3 = needInAppNotReduced.booleanValue();
            } else {
                z3 = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            Boolean valueOf2 = Boolean.valueOf(z2);
            Boolean valueOf3 = Boolean.valueOf(z3);
            C85258Xd8 c85258Xd8 = new C85258Xd8(str, str2, str3, false, false, valueOf, valueOf2, valueOf3);
            C56179M3b c56179M3b = C56179M3b.LIZ;
            String business = interfaceC85409XfZ.getBusiness();
            String scene = interfaceC85409XfZ.getScene();
            AqS177S0200000_15 aqS177S0200000_15 = new AqS177S0200000_15(this, c37356ElM, 4);
            AqS146S0200000_15 aqS146S0200000_15 = new AqS146S0200000_15(this, c37356ElM, 61);
            AqS177S0200000_15 aqS177S0200000_152 = new AqS177S0200000_15(this, c37356ElM, 5);
            o.LJIIIZ(business, "business");
            o.LJIIIZ(scene, "scene");
            o.LJIIIZ(cert, "cert");
            OHI.LIZ.getClass();
            boolean LJ = OHI.LJ(activityC45651qj, "android.permission.ACCESS_COARSE_LOCATION");
            ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
            if (!LJ) {
                c56179M3b.LJIJI(business, scene, cert, activityC45651qj, c85258Xd8, new C85402XfS(aqS146S0200000_15, iLocationBaseServiceForMT, activityC45651qj, aqS177S0200000_15, aqS177S0200000_152), null);
                return;
            }
            if (iLocationBaseServiceForMT.isSupportedPreciseGps()) {
                Boolean bool = Boolean.TRUE;
                if (o.LJ(valueOf, bool)) {
                    if (!iLocationBaseServiceForMT.isSystemPrecise(activityC45651qj)) {
                        C85401XfR c85401XfR = new C85401XfR(iLocationBaseServiceForMT, aqS177S0200000_15);
                        if (valueOf2 != null) {
                            z4 = valueOf2.booleanValue();
                        } else {
                            z4 = false;
                        }
                        iLocationBaseServiceForMT.requestSystemConversionPopup(business, scene, cert, activityC45651qj, c85258Xd8, c85401XfR, z4, true);
                        return;
                    }
                    if (!iLocationBaseServiceForMT.isInAppPrecise() && o.LJ(valueOf3, bool)) {
                        String str5 = c85258Xd8.LIZ;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str6 = c85258Xd8.LIZIZ;
                        if (str6 != null) {
                            str4 = str6;
                        }
                        C54578LbS.LIZ(iLocationBaseServiceForMT, str5, null, activityC45651qj, null, cert, new AqS158S0100000_8(aqS177S0200000_15, 592), new AqS158S0100000_8(aqS177S0200000_15, 593), new AqS158S0100000_8(aqS177S0200000_15, 594), str4, 2);
                        return;
                    }
                    aqS177S0200000_15.invoke(bool, Boolean.valueOf(iLocationBaseServiceForMT.isInAppPrecise()));
                    return;
                }
            }
            aqS177S0200000_15.invoke(Boolean.valueOf(iLocationBaseServiceForMT.isSystemPrecise(activityC45651qj)), Boolean.valueOf(iLocationBaseServiceForMT.isInAppPrecise()));
            return;
        }
        C31626Cb8.LIZ(c37356ElM, 0, "RequestLocationPermission get wrong view", 4);
    }
}
