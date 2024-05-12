package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
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
public class OM1 extends C60640Nr2 {
    public final boolean LJIILIIL() {
        return super.canGoBack();
    }

    public final boolean LJIILL() {
        return super.canGoForward();
    }

    public final WebMessagePort[] LJIILLIIL() {
        return super.createWebMessageChannel();
    }

    public final SslCertificate LJJIFFI() {
        return super.getCertificate();
    }

    public final WebSettings LJJIII() {
        return super.getSettings();
    }

    public final WebChromeClient LJJIIJ() {
        return super.getWebChromeClient();
    }

    public final WebViewClient LJJIIJZLJL() {
        return super.getWebViewClient();
    }

    public final WebViewRenderProcess LJJIIZ() {
        return super.getWebViewRenderProcess();
    }

    public final WebViewRenderProcessClient LJJIIZI() {
        return super.getWebViewRenderProcessClient();
    }

    public final boolean LJJJ() {
        return super.onCheckIsTextEditor();
    }

    public final boolean LJLLILLLL() {
        return super.zoomIn();
    }

    public final boolean LJLLJ() {
        return super.zoomOut();
    }

    @Override // android.webkit.WebView
    public boolean canGoBack() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "canGoBack");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LIZIZ2 = ((OM2) LIZIZ).LIZIZ();
            c60335Nm7.get().LIZ();
            return LIZIZ2;
        }
        return super.canGoBack();
    }

    @Override // android.webkit.WebView
    public boolean canGoForward() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "canGoForward");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LIZLLL = ((OM2) LIZIZ).LIZLLL();
            c60335Nm7.get().LIZ();
            return LIZLLL;
        }
        return super.canGoForward();
    }

    @Override // X.C60640Nr2, android.webkit.WebView
    public final WebMessagePort[] createWebMessageChannel() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "createWebMessageChannel");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            WebMessagePort[] LJ = ((OM2) LIZIZ).LJ();
            c60335Nm7.get().LIZ();
            return LJ;
        }
        return super.createWebMessageChannel();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "destroy");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJFF();
            c60335Nm7.get().LIZ();
            return;
        }
        super.destroy();
    }

    @Override // android.webkit.WebView
    public SslCertificate getCertificate() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "getCertificate");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            SslCertificate LJIILIIL = ((OM2) LIZIZ).LJIILIIL();
            c60335Nm7.get().LIZ();
            return LJIILIIL;
        }
        return super.getCertificate();
    }

    @Override // android.webkit.WebView
    public WebSettings getSettings() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "getSettings");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            WebSettings LJIILL = ((OM2) LIZIZ).LJIILL();
            c60335Nm7.get().LIZ();
            return LJIILL;
        }
        return super.getSettings();
    }

    @Override // X.C60640Nr2, android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "getWebChromeClient");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            WebChromeClient LJIILLIIL = ((OM2) LIZIZ).LJIILLIIL();
            c60335Nm7.get().LIZ();
            return LJIILLIIL;
        }
        return super.getWebChromeClient();
    }

    @Override // X.C60640Nr2, android.webkit.WebView
    public WebViewClient getWebViewClient() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "getWebViewClient");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            WebViewClient LJIIZILJ = ((OM2) LIZIZ).LJIIZILJ();
            c60335Nm7.get().LIZ();
            return LJIIZILJ;
        }
        return super.getWebViewClient();
    }

    @Override // X.C60640Nr2, android.webkit.WebView
    public WebViewRenderProcess getWebViewRenderProcess() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "getWebViewRenderProcess");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            WebViewRenderProcess LJIJ = ((OM2) LIZIZ).LJIJ();
            c60335Nm7.get().LIZ();
            return LJIJ;
        }
        return super.getWebViewRenderProcess();
    }

    @Override // X.C60640Nr2, android.webkit.WebView
    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "getWebViewRenderProcessClient");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            WebViewRenderProcessClient LJIJI = ((OM2) LIZIZ).LJIJI();
            c60335Nm7.get().LIZ();
            return LJIJI;
        }
        return super.getWebViewRenderProcessClient();
    }

    @Override // android.webkit.WebView
    public void goBack() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "goBack");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJIJJ();
            c60335Nm7.get().LIZ();
            return;
        }
        super.goBack();
    }

    @Override // android.webkit.WebView
    public void goForward() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "goForward");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJIL();
            c60335Nm7.get().LIZ();
            return;
        }
        super.goForward();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onAttachedToWindow");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJIII();
            c60335Nm7.get().LIZ();
            return;
        }
        super.onAttachedToWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onCheckIsTextEditor() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onCheckIsTextEditor");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJJIIJ = ((OM2) LIZIZ).LJJIIJ();
            c60335Nm7.get().LIZ();
            return LJJIIJ;
        }
        return super.onCheckIsTextEditor();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onFinishTemporaryDetach() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onFinishTemporaryDetach");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJIJIIJI();
            c60335Nm7.get().LIZ();
            return;
        }
        super.onFinishTemporaryDetach();
    }

    @Override // android.webkit.WebView
    public void onPause() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onPause");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).onPause();
            c60335Nm7.get().LIZ();
            return;
        }
        super.onPause();
    }

    @Override // android.webkit.WebView
    public void onResume() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onResume");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).onResume();
            c60335Nm7.get().LIZ();
            return;
        }
        super.onResume();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onStartTemporaryDetach() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onStartTemporaryDetach");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJJJJL();
            c60335Nm7.get().LIZ();
            return;
        }
        super.onStartTemporaryDetach();
    }

    @Override // android.webkit.WebView
    public void reload() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "reload");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJLI();
            c60335Nm7.get().LIZ();
            return;
        }
        super.reload();
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "stopLoading");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJZZIII();
            c60335Nm7.get().LIZ();
            return;
        }
        super.stopLoading();
    }

    @Override // android.webkit.WebView
    public final boolean zoomIn() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "zoomIn");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJLI = ((OM2) LIZIZ).LJLI();
            c60335Nm7.get().LIZ();
            return LJLI;
        }
        return super.zoomIn();
    }

    @Override // android.webkit.WebView
    public final boolean zoomOut() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "zoomOut");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJLIIIL = ((OM2) LIZIZ).LJLIIIL();
            c60335Nm7.get().LIZ();
            return LJLIIIL;
        }
        return super.zoomOut();
    }

    public final void LJIIZILJ() {
        super.destroy();
    }

    public final void LJJIJ() {
        super.goBack();
    }

    public final void LJJIJIIJIL() {
        super.goForward();
    }

    public final void LJJIZ() {
        super.onAttachedToWindow();
    }

    public final void LJJJJIZL() {
        super.onFinishTemporaryDetach();
    }

    public final void LJJJLZIJ() {
        super.onPause();
    }

    public final void LJJLI() {
        super.onResume();
    }

    public final void LJJLIIIJILLIZJL() {
        super.onStartTemporaryDetach();
    }

    public final void LJJZ() {
        super.reload();
    }

    public final void LJLL() {
        super.stopLoading();
    }

    public OM1(Context context) {
        super(context);
    }

    public final boolean LJIILJJIL(int i) {
        return super.canGoBackOrForward(i);
    }

    public final void LJIJ(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean LJIJI(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean LJIJJ(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void LJIJJLI(Message message) {
        super.documentHasImages(message);
    }

    public final void LJIL(Canvas canvas) {
        super.draw(canvas);
    }

    public final void LJJIJIIJI(int i) {
        super.goBackOrForward(i);
    }

    public final void LJJIJLIJ(String str) {
        super.loadUrl(str);
    }

    public final void LJJJI(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final InputConnection LJJJIL(EditorInfo editorInfo) {
        return super.onCreateInputConnection(editorInfo);
    }

    public final boolean LJJJJ(DragEvent dragEvent) {
        return super.onDragEvent(dragEvent);
    }

    public final void LJJJJI(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final boolean LJJJJJL(MotionEvent motionEvent) {
        return super.onGenericMotionEvent(motionEvent);
    }

    public final boolean LJJJJL(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public final boolean LJJJJLI(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void LJJL(ViewStructure viewStructure) {
        super.onProvideVirtualStructure(viewStructure);
    }

    public final boolean LJJLIIIJJI(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final boolean LJJLIIIJJIZ(MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    public final void LJJLIIIJLJLI(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public final void LJJLIIIJLLLLLLLZ(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public final boolean LJJLIL(boolean z) {
        return super.pageDown(z);
    }

    public final boolean LJJLJ(boolean z) {
        return super.pageUp(z);
    }

    public final void LJJZZI(String str) {
        super.removeJavascriptInterface(str);
    }

    public final WebBackForwardList LJL(Bundle bundle) {
        return super.restoreState(bundle);
    }

    public final WebBackForwardList LJLIIIL(Bundle bundle) {
        return super.saveState(bundle);
    }

    public final void LJLIIL(String str) {
        super.saveWebArchive(str);
    }

    public final void LJLILLLLZI(SslCertificate sslCertificate) {
        super.setCertificate(sslCertificate);
    }

    public final void LJLJI(DownloadListener downloadListener) {
        super.setDownloadListener(downloadListener);
    }

    public final void LJLJJI(WebView.FindListener findListener) {
        super.setFindListener(findListener);
    }

    public final void LJLJJLL(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
    }

    public final void LJLJL(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
    }

    public final void LJLJLJ(WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(webViewRenderProcessClient);
    }

    public final void LJLLI(float f) {
        super.zoomBy(f);
    }

    @Override // android.webkit.WebView
    public boolean canGoBackOrForward(int i) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "canGoBackOrForward");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LIZJ = ((OM2) LIZIZ).LIZJ(i);
            c60335Nm7.get().LIZ();
            return LIZJ;
        }
        return super.canGoBackOrForward(i);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "dispatchDraw");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJI(canvas);
            c60335Nm7.get().LIZ();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "dispatchKeyEvent");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJII = ((OM2) LIZIZ).LJII(keyEvent);
            c60335Nm7.get().LIZ();
            return LJII;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "dispatchTouchEvent");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJIIIIZZ = ((OM2) LIZIZ).LJIIIIZZ(motionEvent);
            c60335Nm7.get().LIZ();
            return LJIIIIZZ;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView
    public final void documentHasImages(Message message) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "documentHasImages");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJIIIZ(message);
            c60335Nm7.get().LIZ();
            return;
        }
        super.documentHasImages(message);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "draw");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJIIJ(canvas);
            c60335Nm7.get().LIZ();
            return;
        }
        super.draw(canvas);
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "goBackOrForward");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJIJJLI(i);
            c60335Nm7.get().LIZ();
            return;
        }
        super.goBackOrForward(i);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "loadUrl");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJIFFI(str);
            c60335Nm7.get().LIZ();
            return;
        }
        super.loadUrl(str);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onConfigurationChanged");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJIIJZLJL(configuration);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.webkit.WebView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onCreateInputConnection");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            InputConnection LJJIIZ = ((OM2) LIZIZ).LJJIIZ(editorInfo);
            c60335Nm7.get().LIZ();
            return LJJIIZ;
        }
        return super.onCreateInputConnection(editorInfo);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onDragEvent");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJJIIZI = ((OM2) LIZIZ).LJJIIZI(dragEvent);
            c60335Nm7.get().LIZ();
            return LJJIIZI;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onDraw");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJIJ(canvas);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onGenericMotionEvent");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJJIJIL = ((OM2) LIZIZ).LJJIJIL(motionEvent);
            c60335Nm7.get().LIZ();
            return LJJIJIL;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onHoverEvent");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJJIJL = ((OM2) LIZIZ).LJJIJL(motionEvent);
            c60335Nm7.get().LIZ();
            return LJJIJL;
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onInterceptTouchEvent");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJJIJLIJ = ((OM2) LIZIZ).LJJIJLIJ(motionEvent);
            c60335Nm7.get().LIZ();
            return LJJIJLIJ;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C60640Nr2, android.webkit.WebView, android.view.View
    public final void onProvideVirtualStructure(ViewStructure viewStructure) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onProvideVirtualStructure");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJJJI(viewStructure);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onProvideVirtualStructure(viewStructure);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onTouchEvent");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJJJJL = ((OM2) LIZIZ).LJJJJL(motionEvent);
            c60335Nm7.get().LIZ();
            return LJJJJL;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onTrackballEvent");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJJJJLI = ((OM2) LIZIZ).LJJJJLI(motionEvent);
            c60335Nm7.get().LIZ();
            return LJJJJLI;
        }
        return super.onTrackballEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onWindowFocusChanged");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJJJZ(z);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onWindowVisibilityChanged");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJJJZI(i);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.webkit.WebView
    public final boolean pageDown(boolean z) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "pageDown");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJJJLL = ((OM2) LIZIZ).LJJJLL(z);
            c60335Nm7.get().LIZ();
            return LJJJLL;
        }
        return super.pageDown(z);
    }

    @Override // android.webkit.WebView
    public final boolean pageUp(boolean z) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "pageUp");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJJJLZIJ = ((OM2) LIZIZ).LJJJLZIJ(z);
            c60335Nm7.get().LIZ();
            return LJJJLZIJ;
        }
        return super.pageUp(z);
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(String str) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "removeJavascriptInterface");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJLIIIIJ(str);
            c60335Nm7.get().LIZ();
            return;
        }
        super.removeJavascriptInterface(str);
    }

    @Override // android.webkit.WebView
    public final WebBackForwardList restoreState(Bundle bundle) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "restoreState");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            WebBackForwardList LJJLIIIJILLIZJL = ((OM2) LIZIZ).LJJLIIIJILLIZJL(bundle);
            c60335Nm7.get().LIZ();
            return LJJLIIIJILLIZJL;
        }
        return super.restoreState(bundle);
    }

    @Override // android.webkit.WebView
    public final WebBackForwardList saveState(Bundle bundle) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "saveState");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            WebBackForwardList LJJLIIIJJIZ = ((OM2) LIZIZ).LJJLIIIJJIZ(bundle);
            c60335Nm7.get().LIZ();
            return LJJLIIIJJIZ;
        }
        return super.saveState(bundle);
    }

    @Override // android.webkit.WebView
    public final void saveWebArchive(String str) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "saveWebArchive");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJLIIIJL(str);
            c60335Nm7.get().LIZ();
            return;
        }
        super.saveWebArchive(str);
    }

    @Override // android.webkit.WebView
    public void setCertificate(SslCertificate sslCertificate) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "setCertificate");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJLIIIJLLLLLLLZ(sslCertificate);
            c60335Nm7.get().LIZ();
            return;
        }
        super.setCertificate(sslCertificate);
    }

    @Override // android.webkit.WebView
    public void setDownloadListener(DownloadListener downloadListener) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "setDownloadListener");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJLIIJ(downloadListener);
            c60335Nm7.get().LIZ();
            return;
        }
        super.setDownloadListener(downloadListener);
    }

    @Override // android.webkit.WebView
    public void setFindListener(WebView.FindListener findListener) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "setFindListener");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJLIL(findListener);
            c60335Nm7.get().LIZ();
            return;
        }
        super.setFindListener(findListener);
    }

    @Override // X.C60640Nr2, android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "setWebChromeClient");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJLJLI(webChromeClient);
            c60335Nm7.get().LIZ();
            return;
        }
        super.setWebChromeClient(webChromeClient);
    }

    @Override // X.C60640Nr2, android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "setWebViewClient");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJLL(C78688UuS.LJJIZ(webViewClient));
            c60335Nm7.get().LIZ();
            return;
        }
        super.setWebViewClient(webViewClient);
    }

    @Override // X.C60640Nr2, android.webkit.WebView
    public void setWebViewRenderProcessClient(WebViewRenderProcessClient webViewRenderProcessClient) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "setWebViewRenderProcessClient");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJZ(webViewRenderProcessClient);
            c60335Nm7.get().LIZ();
            return;
        }
        super.setWebViewRenderProcessClient(webViewRenderProcessClient);
    }

    @Override // X.C60640Nr2, android.webkit.WebView
    public final void zoomBy(float f) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "zoomBy");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJL(f);
            c60335Nm7.get().LIZ();
            return;
        }
        super.zoomBy(f);
    }

    public final void LJIIL(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    public final void LJJ(ValueCallback valueCallback, String str) {
        super.evaluateJavascript(str, valueCallback);
    }

    public final void LJJI(int i, int i2) {
        super.flingScroll(i, i2);
    }

    public final String[] LJJII(String str, String str2) {
        return super.getHttpAuthUsernamePassword(str, str2);
    }

    public final void LJJIL(String str, java.util.Map<String, String> map) {
        super.loadUrl(str, map);
    }

    public final boolean LJJJJLL(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean LJJJJZI(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public final void LJJJLIIL(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void LJJJZ(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
    }

    public final void LJJLIIIJL(int i, View view) {
        super.onVisibilityChanged(view, i);
    }

    public final void LJJLJLI(String str, byte[] bArr) {
        super.postUrl(str, bArr);
    }

    public final void LJJLL(WebMessage webMessage, android.net.Uri uri) {
        super.postWebMessage(webMessage, uri);
    }

    public final boolean LJJZZIII(int i, Rect rect) {
        return super.requestFocus(i, rect);
    }

    public final void LJLJLLL(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
    }

    @Override // android.webkit.WebView
    public final void addJavascriptInterface(Object obj, String str) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "addJavascriptInterface");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LIZ(obj, str);
            c60335Nm7.get().LIZ();
            return;
        }
        super.addJavascriptInterface(obj, str);
    }

    @Override // android.webkit.WebView
    public final void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "evaluateJavascript");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJIIJJI(str, valueCallback);
            c60335Nm7.get().LIZ();
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // android.webkit.WebView
    public final void flingScroll(int i, int i2) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "flingScroll");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJIIL(i, i2);
            c60335Nm7.get().LIZ();
            return;
        }
        super.flingScroll(i, i2);
    }

    @Override // android.webkit.WebView
    public final String[] getHttpAuthUsernamePassword(String str, String str2) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "getHttpAuthUsernamePassword");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            String[] LJIILJJIL = ((OM2) LIZIZ).LJIILJJIL(str, str2);
            c60335Nm7.get().LIZ();
            return LJIILJJIL;
        }
        return super.getHttpAuthUsernamePassword(str, str2);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, java.util.Map<String, String> map) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "loadUrl");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJII(str, map);
            c60335Nm7.get().LIZ();
            return;
        }
        super.loadUrl(str, map);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onKeyDown");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJJIL = ((OM2) LIZIZ).LJJIL(i, keyEvent);
            c60335Nm7.get().LIZ();
            return LJJIL;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onKeyUp");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJJJ = ((OM2) LIZIZ).LJJJ(i, keyEvent);
            c60335Nm7.get().LIZ();
            return LJJJ;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onMeasure");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJJI(i, i2);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // X.C60640Nr2, android.webkit.WebView, android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onProvideAutofillVirtualStructure");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJJJ(viewStructure, i);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onProvideAutofillVirtualStructure(viewStructure, i);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onVisibilityChanged");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJJJLL(view, i);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onVisibilityChanged(view, i);
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "postUrl");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJJZ(str, bArr);
            c60335Nm7.get().LIZ();
            return;
        }
        super.postUrl(str, bArr);
    }

    @Override // X.C60640Nr2, android.webkit.WebView
    public final void postWebMessage(WebMessage webMessage, android.net.Uri uri) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "postWebMessage");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJL(webMessage, uri);
            c60335Nm7.get().LIZ();
            return;
        }
        super.postWebMessage(webMessage, uri);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "requestFocus");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJJLIIIJ = ((OM2) LIZIZ).LJJLIIIJ(i, rect);
            c60335Nm7.get().LIZ();
            return LJJLIIIJ;
        }
        return super.requestFocus(i, rect);
    }

    @Override // X.C60640Nr2, android.webkit.WebView
    public final void setWebViewRenderProcessClient(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "setWebViewRenderProcessClient");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJZZI(executor, webViewRenderProcessClient);
            c60335Nm7.get().LIZ();
            return;
        }
        super.setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
    }

    public OM1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void LJJIJIL(String str, String str2, String str3) {
        super.loadData(str, str2, str3);
    }

    public final void LJJJJJ(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    public final boolean LJJJJZ(int i, int i2, KeyEvent keyEvent) {
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    public final void LJLI(String str, String str2, String str3) {
        super.savePassword(str, str2, str3);
    }

    public final void LJLIL(String str, boolean z, ValueCallback<String> valueCallback) {
        super.saveWebArchive(str, z, valueCallback);
    }

    @Override // android.webkit.WebView
    public void loadData(String str, String str2, String str3) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "loadData");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJ(str, str2, str3);
            c60335Nm7.get().LIZ();
            return;
        }
        super.loadData(str, str2, str3);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onFocusChanged");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJIJIIJIL(z, i, rect);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onKeyMultiple");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJJIZ = ((OM2) LIZIZ).LJJIZ(i, i2, keyEvent);
            c60335Nm7.get().LIZ();
            return LJJIZ;
        }
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    @Override // android.webkit.WebView
    public final void savePassword(String str, String str2, String str3) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "savePassword");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJLIIIJJI(str, str2, str3);
            c60335Nm7.get().LIZ();
            return;
        }
        super.savePassword(str, str2, str3);
    }

    @Override // android.webkit.WebView
    public final void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "saveWebArchive");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJLIIIJLJLI(str, z, valueCallback);
            c60335Nm7.get().LIZ();
            return;
        }
        super.saveWebArchive(str, z, valueCallback);
    }

    public final void LJJJLL(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
    }

    public final void LJJLIIIIJ(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    public final void LJJLIIIJ(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public final void LJLJJL(String str, String str2, String str3, String str4) {
        super.setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onOverScrolled");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJJIL(i, i2, z, z2);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onScrollChanged");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJJJIZL(i, i2, i3, i4);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onSizeChanged");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJJJJ(i, i2, i3, i4);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.webkit.WebView
    public final void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "setHttpAuthUsernamePassword");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJLJ(str, str2, str3, str4);
            c60335Nm7.get().LIZ();
            return;
        }
        super.setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    public final void LJJIJL(String str, String str2, String str3, String str4, String str5) {
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "loadDataWithBaseURL");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((OM2) LIZIZ).LJJI(str, str2, str3, str4, str5);
            c60335Nm7.get().LIZ();
            return;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final boolean LJJLIIJ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "overScrollBy");
        if (LIZIZ instanceof OM2) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJJJLIIL = ((OM2) LIZIZ).LJJJLIIL(i, i2, i3, i4, i5, i6, i7, i8, z);
            c60335Nm7.get().LIZ();
            return LJJJLIIL;
        }
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
