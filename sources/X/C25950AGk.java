package X;

import android.webkit.WebView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.AGk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25950AGk {
    public static final /* synthetic */ int LIZ = 0;

    public static OSZ LIZ(WebView webView) {
        String str;
        boolean z;
        Object tag = webView.getTag(R.id.nhx);
        if (tag instanceof String) {
            str = (String) tag;
        } else {
            str = null;
        }
        webView.setTag(R.id.nhx, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(true ^ z);
        if (str == null) {
            str = "";
        }
        return new OSZ(valueOf, str);
    }
}
