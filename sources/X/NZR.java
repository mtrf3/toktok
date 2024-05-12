package X;

import android.graphics.Paint;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public interface NZR {
    void addJavascriptInterfaceOut(Object obj, String str);

    void addOnSingleWebViewStatus(NZX nzx);

    void addOnWebChromeStatus(InterfaceC59820Ndo interfaceC59820Ndo);

    boolean canGoBack();

    boolean canGoForward();

    void clearHistory();

    void contextDestroy();

    void contextPause();

    void contextResume();

    void controlGeolocationPermissions(boolean z);

    WebBackForwardList copyBackForwardList();

    void destroy();

    void destroyPassBackWebInfoBusiness();

    void evaluateJavascript(String str, ValueCallback<String> valueCallback);

    Boolean getAdditionalReportParams();

    String getBackUrl();

    Boolean getBusinessEnablePopup();

    boolean getCanScrollVertically();

    Boolean getCanTouch();

    boolean getControlGeolocationPermissions();

    InterfaceC59561NZd getCrossPlatformActivityContainer();

    InterfaceC59561NZd getCrossPlatformActivityContainerInChrome();

    DownloadListener getDownloadListener();

    boolean getEnableScrollControl();

    String getForwardUrl();

    boolean getJavaScriptEnabled();

    String getJavascriptInterfaceName();

    Object getJavascriptInterfaceObject();

    int getLayerType();

    int getLoadingProgress();

    boolean getMediaPlaybackRequiresUserGesture();

    C59866NeY getMonitorSession();

    int getOverScrollMode();

    int getSettingsTextZoom();

    InterfaceC88471Ynr<WebView, String, Boolean> getShouldOverrideInterceptor();

    InterfaceC59575NZr getShouldOverrideUrlLoadingListener();

    List<NZX> getSingleWebViewStatusListeners();

    String getTitle();

    InterfaceC88472Yns<String, C76800UCe> getTitleCallbck();

    View.OnTouchListener getTouchListener();

    String getUrl();

    String getUserAgentString();

    View getView();

    InterfaceC59820Ndo getWebChromeStatus();

    ArrayList<InterfaceC59637Nar> getWebScrollListener();

    void goBack();

    void goForward();

    void injectAdPerfJs(String str);

    void loadUrl(String str);

    void loadUrl(String str, java.util.Map<String, String> map);

    void onPause();

    void onReceivedTitle(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns);

    void onResume();

    void prefetchH5(String str);

    void reload();

    void removeOnSingleWebViewStatus(NZX nzx);

    void sendEventToWebView(String str, JSONObject jSONObject);

    void setAdditionalReportParams(boolean z);

    void setBusinessEnablePopup(boolean z);

    void setCanScrollVertically(boolean z);

    void setCanTouch(boolean z);

    void setCrossPlatformActivityContainer(InterfaceC59561NZd interfaceC59561NZd);

    void setCrossPlatformActivityContainerInChrome(InterfaceC59561NZd interfaceC59561NZd);

    void setDownloadListener(DownloadListener downloadListener);

    void setEnableScrollControl(boolean z);

    void setJavaScriptEnabled(boolean z);

    void setLayerType(int i, Paint paint);

    void setLoadNoCache();

    void setMediaPlaybackRequiresUserGesture(boolean z);

    void setMonitorSession(C59866NeY c59866NeY);

    void setOverScrollMode(int i);

    void setSettingsTextZoom(int i);

    void setShouldOverrideInterceptor(InterfaceC88471Ynr<? super WebView, ? super String, Boolean> interfaceC88471Ynr);

    void setSingleWebViewStatusListeners(List<NZX> list);

    void setTouchListener(View.OnTouchListener onTouchListener);

    void setUserAgentString(String str);

    void setWebScrollListener(InterfaceC59637Nar interfaceC59637Nar);

    void setWebScrollListeners(ArrayList<InterfaceC59637Nar> arrayList);

    void setWebViewChangeListener(InterfaceC59568NZk interfaceC59568NZk);

    void stopLoading();

    void transparentBackground();
}
