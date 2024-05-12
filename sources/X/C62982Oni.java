package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupAction;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Oni, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62982Oni implements InterfaceC82923WgZ {
    public final /* synthetic */ PNSDeviceConsentServiceImpl LIZ;

    public C62982Oni(PNSDeviceConsentServiceImpl pNSDeviceConsentServiceImpl) {
        this.LIZ = pNSDeviceConsentServiceImpl;
    }

    @Override // X.InterfaceC82923WgZ
    public final void LIZJ(java.util.Map<String, String> extra) {
        o.LJIIIZ(extra, "extra");
        PNSDeviceConsentServiceImpl pNSDeviceConsentServiceImpl = this.LIZ;
        Iterator<InterfaceC62981Onh> it = pNSDeviceConsentServiceImpl.LJFF.iterator();
        while (it.hasNext()) {
            it.next().LIZ(pNSDeviceConsentServiceImpl.LJII);
        }
    }

    @Override // X.InterfaceC82923WgZ
    public final void LJ(java.util.Map<String, String> extra) {
        o.LJIIIZ(extra, "extra");
        PopupManager.LIZJ(G3O.class);
        this.LIZ.LJI = false;
    }

    @Override // X.InterfaceC82923WgZ
    public final void LIZ(UniversalPopupAction universalPopupAction, java.util.Map<String, String> map) {
        if (universalPopupAction.getApprove()) {
            this.LIZ.LJFF();
        }
    }

    @Override // X.InterfaceC82923WgZ
    public final void LIZIZ(String customizedAction, java.util.Map<String, String> map) {
        ICompliancePolicyService LJII;
        o.LJIIIZ(customizedAction, "customizedAction");
        if (AGI.LIZ() && (LJII = a.LJII()) != null) {
            LJII.LIZIZ(new O0X(AGJ.CONSENT_BOX_ROW.getValue(), customizedAction, true, true, 4), new C62983Onj());
        }
    }

    @Override // X.InterfaceC82923WgZ
    public final void LIZLLL(Boolean bool, String link) {
        o.LJIIIZ(link, "link");
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), link);
        if (o.LJ(bool, Boolean.TRUE) && !o.LJ(UriProtector.getQueryParameter(UriProtector.parse(link), "use_spark"), "1")) {
            buildRoute.withParam("use_webview_title", true);
        }
        buildRoute.open();
    }
}
