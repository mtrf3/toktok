package X;

import android.app.Activity;
import android.view.View;
import android.webkit.WebBackForwardList;

/* loaded from: classes11.dex */
public interface NZC extends InterfaceC59488NWi {
    void LIZIZ(Activity activity);

    void LIZJ(Activity activity);

    void LIZLLL(Activity activity);

    <T extends InterfaceC26281ATd> T LJI(Class<T> cls);

    void LJIIIIZZ();

    boolean canGoBack();

    boolean canGoForward();

    String getCurrentUrl();

    C59866NeY getMonitorSession();

    NZV getViewStatusRegistry();

    WebBackForwardList getWebBackForwardList();

    boolean goBack();

    boolean goForward();

    void onCreate(Activity activity);

    void setCrossPlatformActivityContainer(InterfaceC59561NZd interfaceC59561NZd);

    void setFullScreen(NZO nzo);

    void setWebScrollListener(InterfaceC59637Nar interfaceC59637Nar);

    void setWebViewTouchListener(View.OnTouchListener onTouchListener);
}
