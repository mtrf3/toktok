package X;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.settings.PopupBlockList;
import ujb.s;

/* renamed from: X.Dzl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C35701Dzl extends WebChromeClient {
    public boolean LIZ = true;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C35699Dzj.LJLIL);

    public final boolean LIZ(String str) {
        int i;
        boolean z;
        String[] strArr;
        if (str == null) {
            return false;
        }
        if (this.LIZIZ.getValue() == null) {
            return this.LIZ;
        }
        PopupBlockList popupBlockList = (PopupBlockList) this.LIZIZ.getValue();
        if (popupBlockList != null) {
            i = popupBlockList.dimensional;
        } else {
            i = 1;
        }
        PopupBlockList popupBlockList2 = (PopupBlockList) this.LIZIZ.getValue();
        if (popupBlockList2 != null && (strArr = popupBlockList2.keywordList) != null) {
            for (String str2 : strArr) {
                if (s.LJJJLZIJ(str, str2, false)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!this.LIZ || i == 0 || i != 1 || z) {
            return false;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (LIZ(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.cancel();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (LIZ(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.confirm();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (LIZ(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.cancel();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (LIZ(str)) {
            return false;
        }
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
        }
        return true;
    }
}
