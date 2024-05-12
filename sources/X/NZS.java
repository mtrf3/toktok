package X;

import android.text.TextUtils;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NZS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(NZR nzr, NZR to) {
        o.LJIIIZ(to, "to");
        Boolean businessEnablePopup = nzr.getBusinessEnablePopup();
        if (businessEnablePopup != null) {
            to.setBusinessEnablePopup(businessEnablePopup.booleanValue());
        }
        View.OnTouchListener touchListener = nzr.getTouchListener();
        if (touchListener != null) {
            to.setTouchListener(touchListener);
        }
        List<NZX> singleWebViewStatusListeners = nzr.getSingleWebViewStatusListeners();
        if (singleWebViewStatusListeners != null) {
            to.setSingleWebViewStatusListeners(singleWebViewStatusListeners);
        }
        InterfaceC59820Ndo webChromeStatus = nzr.getWebChromeStatus();
        if (webChromeStatus != null) {
            to.addOnWebChromeStatus(webChromeStatus);
        }
        Boolean additionalReportParams = nzr.getAdditionalReportParams();
        if (additionalReportParams != null) {
            to.setAdditionalReportParams(additionalReportParams.booleanValue());
        }
        InterfaceC59561NZd crossPlatformActivityContainer = nzr.getCrossPlatformActivityContainer();
        if (crossPlatformActivityContainer != null) {
            to.setCrossPlatformActivityContainer(crossPlatformActivityContainer);
        }
        to.controlGeolocationPermissions(nzr.getControlGeolocationPermissions());
        InterfaceC88471Ynr<WebView, String, Boolean> shouldOverrideInterceptor = nzr.getShouldOverrideInterceptor();
        if (shouldOverrideInterceptor != null) {
            to.setShouldOverrideInterceptor(shouldOverrideInterceptor);
        }
        nzr.getShouldOverrideUrlLoadingListener();
        to.setEnableScrollControl(nzr.getEnableScrollControl());
        nzr.setCanScrollVertically(nzr.getCanScrollVertically());
        ArrayList<InterfaceC59637Nar> webScrollListener = nzr.getWebScrollListener();
        if (webScrollListener != null) {
            to.setWebScrollListeners(webScrollListener);
        }
        to.setOverScrollMode(nzr.getOverScrollMode());
        to.setUserAgentString(nzr.getUserAgentString());
        DownloadListener downloadListener = nzr.getDownloadListener();
        if (downloadListener != null) {
            to.setDownloadListener(downloadListener);
        }
        to.setSettingsTextZoom(nzr.getSettingsTextZoom());
        to.setLayerType(nzr.getLayerType(), null);
        to.setMediaPlaybackRequiresUserGesture(nzr.getMediaPlaybackRequiresUserGesture());
        Boolean canTouch = nzr.getCanTouch();
        if (canTouch != null) {
            to.setCanTouch(canTouch.booleanValue());
        }
        to.setJavaScriptEnabled(nzr.getJavaScriptEnabled());
        String javascriptInterfaceName = nzr.getJavascriptInterfaceName();
        Object javascriptInterfaceObject = nzr.getJavascriptInterfaceObject();
        if (!TextUtils.isEmpty(javascriptInterfaceName) && javascriptInterfaceObject != null) {
            o.LJI(javascriptInterfaceName);
            to.addJavascriptInterfaceOut(javascriptInterfaceObject, javascriptInterfaceName);
        }
        C59866NeY monitorSession = nzr.getMonitorSession();
        if (monitorSession != null) {
            to.setMonitorSession(monitorSession);
        }
        InterfaceC88472Yns<String, C76800UCe> titleCallbck = nzr.getTitleCallbck();
        if (titleCallbck != null) {
            to.onReceivedTitle(titleCallbck);
        }
        InterfaceC59561NZd crossPlatformActivityContainerInChrome = nzr.getCrossPlatformActivityContainerInChrome();
        if (crossPlatformActivityContainerInChrome != null) {
            to.setCrossPlatformActivityContainerInChrome(crossPlatformActivityContainerInChrome);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r5 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = 0
            if (r7 == 0) goto L4a
            if (r8 == 0) goto L4a
        L6:
            X.FFL r1 = X.FFL.LJIIIZ()
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.utils.WebviewThirdIsolationSettings$WebviewThirdIsolationModel> r0 = com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.utils.WebviewThirdIsolationSettings.WebviewThirdIsolationModel.class
            com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.utils.WebviewThirdIsolationSettings$WebviewThirdIsolationModel r5 = com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.utils.WebviewThirdIsolationSettings.LIZ
            r1.getClass()
            r4 = 1
            java.lang.String r3 = "webview_third_isolation"
            r2 = 31744(0x7c00, float:4.4483E-41)
            java.lang.Object r0 = X.FFL.LJIJ(r4, r3, r2, r0, r5)
            com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.utils.WebviewThirdIsolationSettings$WebviewThirdIsolationModel r0 = (com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.utils.WebviewThirdIsolationSettings.WebviewThirdIsolationModel) r0
            if (r0 != 0) goto L1f
            r0 = r5
        L1f:
            boolean r0 = r0.enabled
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService r0 = yq4.a.LJFF()
            boolean r0 = r0.LIZLLL(r7)
            if (r0 != r4) goto L4a
            X.FFL r1 = X.FFL.LJIIIZ()
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.utils.WebviewThirdIsolationSettings$WebviewThirdIsolationModel> r0 = com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.utils.WebviewThirdIsolationSettings.WebviewThirdIsolationModel.class
            r1.getClass()
            java.lang.Object r0 = X.FFL.LJIJ(r4, r3, r2, r0, r5)
            com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.utils.WebviewThirdIsolationSettings$WebviewThirdIsolationModel r0 = (com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.utils.WebviewThirdIsolationSettings.WebviewThirdIsolationModel) r0
            if (r0 != 0) goto L4d
            if (r5 == 0) goto L4b
        L40:
            java.util.List<java.lang.String> r0 = r5.cids
            if (r0 == 0) goto L4b
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L4b
        L4a:
            return r6
        L4b:
            r6 = 1
            goto L4a
        L4d:
            r5 = r0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NZS.LIZJ(java.lang.String, java.lang.String):boolean");
    }

    public static boolean LIZIZ(InterfaceC59561NZd interfaceC59561NZd, String url, InterfaceC59568NZk interfaceC59568NZk, boolean z, java.util.Map map, Boolean bool, boolean z2) {
        C59314NPq crossPlatformParams;
        C59273NOb c59273NOb;
        boolean z3;
        C59308NPk c59308NPk;
        o.LJIIIZ(url, "url");
        if (interfaceC59561NZd != null && (crossPlatformParams = interfaceC59561NZd.getCrossPlatformParams()) != null && (c59273NOb = crossPlatformParams.LIZIZ) != null) {
            if (c59273NOb.LIZ == 0) {
                return false;
            }
            C59314NPq crossPlatformParams2 = interfaceC59561NZd.getCrossPlatformParams();
            if (crossPlatformParams2 != null && (c59308NPk = crossPlatformParams2.LIZ) != null) {
                z3 = c59308NPk.LJIIZILJ;
            } else {
                z3 = true;
            }
            if (z != (!LIZJ(url, String.valueOf(r1)))) {
                if (interfaceC59568NZk != null) {
                    interfaceC59568NZk.LIZ(url, z3, map, bool, z2);
                }
                return true;
            }
        }
        return false;
    }
}
