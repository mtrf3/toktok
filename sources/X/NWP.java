package X;

import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NWP implements InterfaceC59574NZq {
    public final /* synthetic */ InterfaceC60761Nsz LIZ;
    public final /* synthetic */ NUM LIZIZ;
    public final /* synthetic */ C59222NMc LIZJ;

    @Override // X.InterfaceC59574NZq
    public final void LIZ() {
        String str;
        Object obj = this.LIZ;
        if (!(obj instanceof WebKitView)) {
            return;
        }
        WebBackForwardList copyBackForwardList = ((WebView) obj).copyBackForwardList();
        o.LJIIIIZZ(copyBackForwardList, "view.copyBackForwardList()");
        int currentIndex = copyBackForwardList.getCurrentIndex();
        if (currentIndex <= 0) {
            str = "";
        } else {
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(currentIndex - 1);
            if (itemAtIndex != null) {
                str = itemAtIndex.getUrl();
            } else {
                str = null;
            }
        }
        NUM num = this.LIZIZ;
        if (num != null) {
            num.LIZLLL(((WebKitView) this.LIZ).canGoBack(), str, this.LIZJ);
        }
        if (((WebKitView) this.LIZ).canGoBack()) {
            ((WebKitView) this.LIZ).goBack();
        }
    }

    @Override // X.InterfaceC59574NZq
    public final void LIZIZ() {
        String str;
        Object obj = this.LIZ;
        if (!(obj instanceof WebKitView)) {
            return;
        }
        WebBackForwardList copyBackForwardList = ((WebView) obj).copyBackForwardList();
        o.LJIIIIZZ(copyBackForwardList, "view.copyBackForwardList()");
        int currentIndex = copyBackForwardList.getCurrentIndex();
        if (currentIndex == copyBackForwardList.getSize() - 1) {
            str = "";
        } else {
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(currentIndex + 1);
            if (itemAtIndex != null) {
                str = itemAtIndex.getUrl();
            } else {
                str = null;
            }
        }
        NUM num = this.LIZIZ;
        if (num != null) {
            num.LIZJ(((OM1) this.LIZ).canGoForward(), str, this.LIZJ);
        }
        if (((OM1) this.LIZ).canGoForward()) {
            ((OM1) this.LIZ).goForward();
        }
    }

    public NWP(InterfaceC60761Nsz interfaceC60761Nsz, NUM num, C59222NMc c59222NMc) {
        this.LIZ = interfaceC60761Nsz;
        this.LIZIZ = num;
        this.LIZJ = c59222NMc;
    }
}
