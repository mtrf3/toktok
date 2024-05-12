package X;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Message;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public abstract class OM2 extends AbstractC60536NpM<OM1> implements InterfaceC60409NnJ {
    public boolean LIZIZ() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "canGoBack");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LIZIZ();
        }
        return getExtendable().LJIILIIL();
    }

    public boolean LIZLLL() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "canGoForward");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LIZLLL();
        }
        return getExtendable().LJIILL();
    }

    public final WebMessagePort[] LJ() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "createWebMessageChannel");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJ();
        }
        return getExtendable().LJIILLIIL();
    }

    public void LJFF() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "destroy");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJFF();
        } else {
            getExtendable().LJIIZILJ();
        }
    }

    public final SslCertificate LJIILIIL() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "getCertificate");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJIILIIL();
        }
        return getExtendable().LJJIFFI();
    }

    public final WebSettings LJIILL() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "getSettings");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJIILL();
        }
        return getExtendable().LJJIII();
    }

    public final WebChromeClient LJIILLIIL() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "getWebChromeClient");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJIILLIIL();
        }
        return getExtendable().LJJIIJ();
    }

    public final WebViewClient LJIIZILJ() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "getWebViewClient");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJIIZILJ();
        }
        return getExtendable().LJJIIJZLJL();
    }

    public final WebViewRenderProcess LJIJ() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "getWebViewRenderProcess");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJIJ();
        }
        return getExtendable().LJJIIZ();
    }

    public final WebViewRenderProcessClient LJIJI() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "getWebViewRenderProcessClient");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJIJI();
        }
        return getExtendable().LJJIIZI();
    }

    public void LJIJJ() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "goBack");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJIJJ();
        } else {
            getExtendable().LJJIJ();
        }
    }

    public void LJIL() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "goForward");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJIL();
        } else {
            getExtendable().LJJIJIIJIL();
        }
    }

    public final void LJJIII() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onAttachedToWindow");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJIII();
        } else {
            getExtendable().LJJIZ();
        }
    }

    public final boolean LJJIIJ() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onCheckIsTextEditor");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJIIJ();
        }
        return getExtendable().LJJJ();
    }

    public final void LJJIJIIJI() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onFinishTemporaryDetach");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJIJIIJI();
        } else {
            getExtendable().LJJJJIZL();
        }
    }

    public final void LJJJJJL() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onStartTemporaryDetach");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJJJJL();
        } else {
            getExtendable().LJJLIIIJILLIZJL();
        }
    }

    public void LJJLI() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "reload");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJLI();
        } else {
            getExtendable().LJJZ();
        }
    }

    public final void LJJZZIII() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "stopLoading");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJZZIII();
        } else {
            getExtendable().LJLL();
        }
    }

    public final boolean LJLI() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "zoomIn");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJLI();
        }
        return getExtendable().LJLLILLLL();
    }

    public final boolean LJLIIIL() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "zoomOut");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJLIIIL();
        }
        return getExtendable().LJLLJ();
    }

    public final void onPause() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onPause");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).onPause();
        } else {
            getExtendable().LJJJLZIJ();
        }
    }

    public final void onResume() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onResume");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).onResume();
        } else {
            getExtendable().LJJLI();
        }
    }

    public final boolean LIZJ(int i) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "canGoBackOrForward");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LIZJ(i);
        }
        return getExtendable().LJIILJJIL(i);
    }

    public final void LJI(Canvas canvas) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "dispatchDraw");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJI(canvas);
        } else {
            getExtendable().LJIJ(canvas);
        }
    }

    public final boolean LJII(KeyEvent keyEvent) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "dispatchKeyEvent");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJII(keyEvent);
        }
        return getExtendable().LJIJI(keyEvent);
    }

    public final boolean LJIIIIZZ(MotionEvent motionEvent) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "dispatchTouchEvent");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJIIIIZZ(motionEvent);
        }
        return getExtendable().LJIJJ(motionEvent);
    }

    public final void LJIIIZ(Message message) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "documentHasImages");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJIIIZ(message);
        } else {
            getExtendable().LJIJJLI(message);
        }
    }

    public final void LJIIJ(Canvas canvas) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "draw");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJIIJ(canvas);
        } else {
            getExtendable().LJIL(canvas);
        }
    }

    public final void LJIJJLI(int i) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "goBackOrForward");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJIJJLI(i);
        } else {
            getExtendable().LJJIJIIJI(i);
        }
    }

    public void LJJIFFI(String str) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "loadUrl");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJIFFI(str);
        } else {
            getExtendable().LJJIJLIJ(str);
        }
    }

    public final void LJJIIJZLJL(Configuration configuration) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onConfigurationChanged");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJIIJZLJL(configuration);
        } else {
            getExtendable().LJJJI(configuration);
        }
    }

    public final InputConnection LJJIIZ(EditorInfo editorInfo) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onCreateInputConnection");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJIIZ(editorInfo);
        }
        return getExtendable().LJJJIL(editorInfo);
    }

    public final boolean LJJIIZI(DragEvent dragEvent) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onDragEvent");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJIIZI(dragEvent);
        }
        return getExtendable().LJJJJ(dragEvent);
    }

    public final void LJJIJ(Canvas canvas) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onDraw");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJIJ(canvas);
        } else {
            getExtendable().LJJJJI(canvas);
        }
    }

    public final boolean LJJIJIL(MotionEvent motionEvent) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onGenericMotionEvent");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJIJIL(motionEvent);
        }
        return getExtendable().LJJJJJL(motionEvent);
    }

    public final boolean LJJIJL(MotionEvent motionEvent) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onHoverEvent");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJIJL(motionEvent);
        }
        return getExtendable().LJJJJL(motionEvent);
    }

    public final boolean LJJIJLIJ(MotionEvent motionEvent) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onInterceptTouchEvent");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJIJLIJ(motionEvent);
        }
        return getExtendable().LJJJJLI(motionEvent);
    }

    public final void LJJJJI(ViewStructure viewStructure) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onProvideVirtualStructure");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJJJI(viewStructure);
        } else {
            getExtendable().LJJL(viewStructure);
        }
    }

    public boolean LJJJJL(MotionEvent motionEvent) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onTouchEvent");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJJJL(motionEvent);
        }
        return getExtendable().LJJLIIIJJI(motionEvent);
    }

    public final boolean LJJJJLI(MotionEvent motionEvent) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onTrackballEvent");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJJJLI(motionEvent);
        }
        return getExtendable().LJJLIIIJJIZ(motionEvent);
    }

    public final void LJJJJZ(boolean z) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onWindowFocusChanged");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJJJZ(z);
        } else {
            getExtendable().LJJLIIIJLJLI(z);
        }
    }

    public final void LJJJJZI(int i) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onWindowVisibilityChanged");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJJJZI(i);
        } else {
            getExtendable().LJJLIIIJLLLLLLLZ(i);
        }
    }

    public final boolean LJJJLL(boolean z) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "pageDown");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJJLL(z);
        }
        return getExtendable().LJJLIL(z);
    }

    public final boolean LJJJLZIJ(boolean z) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "pageUp");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJJLZIJ(z);
        }
        return getExtendable().LJJLJ(z);
    }

    public final void LJJLIIIIJ(String str) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "removeJavascriptInterface");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJLIIIIJ(str);
        } else {
            getExtendable().LJJZZI(str);
        }
    }

    public final WebBackForwardList LJJLIIIJILLIZJL(Bundle bundle) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "restoreState");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJLIIIJILLIZJL(bundle);
        }
        return getExtendable().LJL(bundle);
    }

    public final WebBackForwardList LJJLIIIJJIZ(Bundle bundle) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "saveState");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJLIIIJJIZ(bundle);
        }
        return getExtendable().LJLIIIL(bundle);
    }

    public final void LJJLIIIJL(String str) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "saveWebArchive");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJLIIIJL(str);
        } else {
            getExtendable().LJLIIL(str);
        }
    }

    public final void LJJLIIIJLLLLLLLZ(SslCertificate sslCertificate) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "setCertificate");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJLIIIJLLLLLLLZ(sslCertificate);
        } else {
            getExtendable().LJLILLLLZI(sslCertificate);
        }
    }

    public final void LJJLIIJ(DownloadListener downloadListener) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "setDownloadListener");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJLIIJ(downloadListener);
        } else {
            getExtendable().LJLJI(downloadListener);
        }
    }

    public final void LJJLIL(WebView.FindListener findListener) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "setFindListener");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJLIL(findListener);
        } else {
            getExtendable().LJLJJI(findListener);
        }
    }

    public final void LJJLJLI(WebChromeClient webChromeClient) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "setWebChromeClient");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJLJLI(webChromeClient);
        } else {
            getExtendable().LJLJJLL(webChromeClient);
        }
    }

    public void LJJLL(WebViewClient webViewClient) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "setWebViewClient");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJLL(C78688UuS.LJJIZ(webViewClient));
        } else {
            getExtendable().LJLJL(webViewClient);
        }
    }

    public final void LJJZ(WebViewRenderProcessClient webViewRenderProcessClient) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "setWebViewRenderProcessClient");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJZ(webViewRenderProcessClient);
        } else {
            getExtendable().LJLJLJ(webViewRenderProcessClient);
        }
    }

    public final void LJL(float f) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "zoomBy");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJL(f);
        } else {
            getExtendable().LJLLI(f);
        }
    }

    public final void LIZ(Object obj, String str) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "addJavascriptInterface");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LIZ(obj, str);
        } else {
            getExtendable().LJIIL(obj, str);
        }
    }

    public final void LJIIJJI(String str, ValueCallback<String> valueCallback) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "evaluateJavascript");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJIIJJI(str, valueCallback);
        } else {
            getExtendable().LJJ(valueCallback, str);
        }
    }

    public final void LJIIL(int i, int i2) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "flingScroll");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJIIL(i, i2);
        } else {
            getExtendable().LJJI(i, i2);
        }
    }

    public final String[] LJIILJJIL(String str, String str2) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "getHttpAuthUsernamePassword");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJIILJJIL(str, str2);
        }
        return getExtendable().LJJII(str, str2);
    }

    public void LJJII(String str, java.util.Map<String, String> map) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "loadUrl");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJII(str, map);
        } else {
            getExtendable().LJJIL(str, map);
        }
    }

    public final boolean LJJIL(int i, KeyEvent keyEvent) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onKeyDown");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJIL(i, keyEvent);
        }
        return getExtendable().LJJJJLL(i, keyEvent);
    }

    public final boolean LJJJ(int i, KeyEvent keyEvent) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onKeyUp");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJJ(i, keyEvent);
        }
        return getExtendable().LJJJJZI(i, keyEvent);
    }

    public final void LJJJI(int i, int i2) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onMeasure");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJJI(i, i2);
        } else {
            getExtendable().LJJJLIIL(i, i2);
        }
    }

    public final void LJJJJ(ViewStructure viewStructure, int i) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onProvideAutofillVirtualStructure");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJJJ(viewStructure, i);
        } else {
            getExtendable().LJJJZ(viewStructure, i);
        }
    }

    public final void LJJJJLL(View view, int i) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onVisibilityChanged");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJJJLL(view, i);
        } else {
            getExtendable().LJJLIIIJL(i, view);
        }
    }

    public final void LJJJZ(String str, byte[] bArr) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "postUrl");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJJZ(str, bArr);
        } else {
            getExtendable().LJJLJLI(str, bArr);
        }
    }

    public final void LJJL(WebMessage webMessage, android.net.Uri uri) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "postWebMessage");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJL(webMessage, uri);
        } else {
            getExtendable().LJJLL(webMessage, uri);
        }
    }

    public final boolean LJJLIIIJ(int i, Rect rect) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "requestFocus");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJLIIIJ(i, rect);
        }
        return getExtendable().LJJZZIII(i, rect);
    }

    public final void LJJZZI(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "setWebViewRenderProcessClient");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJZZI(executor, webViewRenderProcessClient);
        } else {
            getExtendable().LJLJLLL(executor, webViewRenderProcessClient);
        }
    }

    public final void LJJ(String str, String str2, String str3) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "loadData");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJ(str, str2, str3);
        } else {
            getExtendable().LJJIJIL(str, str2, str3);
        }
    }

    public final void LJJIJIIJIL(boolean z, int i, Rect rect) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onFocusChanged");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJIJIIJIL(z, i, rect);
        } else {
            getExtendable().LJJJJJ(z, i, rect);
        }
    }

    public final boolean LJJIZ(int i, int i2, KeyEvent keyEvent) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onKeyMultiple");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJIZ(i, i2, keyEvent);
        }
        return getExtendable().LJJJJZ(i, i2, keyEvent);
    }

    public final void LJJLIIIJJI(String str, String str2, String str3) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "savePassword");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJLIIIJJI(str, str2, str3);
        } else {
            getExtendable().LJLI(str, str2, str3);
        }
    }

    public final void LJJLIIIJLJLI(String str, boolean z, ValueCallback<String> valueCallback) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "saveWebArchive");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJLIIIJLJLI(str, z, valueCallback);
        } else {
            getExtendable().LJLIL(str, z, valueCallback);
        }
    }

    public void LJJJIL(int i, int i2, boolean z, boolean z2) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onOverScrolled");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJJIL(i, i2, z, z2);
        } else {
            getExtendable().LJJJLL(i, i2, z, z2);
        }
    }

    public void LJJJJIZL(int i, int i2, int i3, int i4) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onScrollChanged");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJJJIZL(i, i2, i3, i4);
        } else {
            getExtendable().LJJLIIIIJ(i, i2, i3, i4);
        }
    }

    public final void LJJJJJ(int i, int i2, int i3, int i4) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onSizeChanged");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJJJJ(i, i2, i3, i4);
        } else {
            getExtendable().LJJLIIIJ(i, i2, i3, i4);
        }
    }

    public final void LJJLJ(String str, String str2, String str3, String str4) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "setHttpAuthUsernamePassword");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJLJ(str, str2, str3, str4);
        } else {
            getExtendable().LJLJJL(str, str2, str3, str4);
        }
    }

    public final void LJJI(String str, String str2, String str3, String str4, String str5) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "loadDataWithBaseURL");
        if (LIZ instanceof OM2) {
            ((OM2) LIZ).LJJI(str, str2, str3, str4, str5);
        } else {
            getExtendable().LJJIJL(str, str2, str3, str4, str5);
        }
    }

    public final boolean LJJJLIIL(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "overScrollBy");
        if (LIZ instanceof OM2) {
            return ((OM2) LIZ).LJJJLIIL(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
        return getExtendable().LJJLIIJ(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
